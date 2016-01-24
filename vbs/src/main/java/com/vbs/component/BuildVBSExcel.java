package com.vbs.component;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

import com.vbs.org.VBLoad;
import com.vbs.org.VBLoadList;
import com.vbs.org.VB;

public class BuildVBSExcel implements Callable {
		
		String returnStatus = "ok";
		String returnStatusText = "";
		ByteArrayOutputStream Os1 = null;		
		JAXBContext jaxbcontextinput = null;
		JAXBContext jaxbcontextoutput = null;

		com.vbs.org.VBLoad psl = null;  //input xml
	//	com.vbs.org.VBLoad mc =null; //output xml
				
		
		@Override
		public Object onCall(MuleEventContext eventContext) throws Exception {
			try
			{
											
				JAXBContext jaxbContext = JAXBContext.newInstance(VBLoad.class);
				MuleMessage msg = eventContext.getMessage();
				byte[] Bain = msg.getPayloadAsBytes();
		
				InputStream is = null;
				is = new ByteArrayInputStream(Bain);		

				Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
				psl = (com.vbs.org.VBLoad)unmarshaller.unmarshal(is);
				Os1 = new ByteArrayOutputStream( );		
			  
			    String excelFolderName=(String)msg.getProperty("excelFolder", PropertyScope.SESSION);	    
			    
			   writeVBSEXCEL(psl,excelFolderName);

				
								
				try
				{				
					javax.xml.bind.Marshaller jaxbMarshaller = jaxbContext.createMarshaller();					
					jaxbMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
					jaxbMarshaller.marshal(psl,Os1);			
				
				}
				catch (JAXBException e) 
				{
					e.printStackTrace();
					returnStatus = "Failed";
					returnStatusText = "Build ARCXML - Failed JAXB formatting";
				}
				
				
				}
				catch (Exception e)
				{
					e.printStackTrace();
					returnStatus = "Failed";
					returnStatusText = "Build ARCXML - General failure";
				}
				
				eventContext.getMessage().setSessionProperty("returnstatus", returnStatus);
				eventContext.getMessage().setSessionProperty("returnstatustext", returnStatusText);		
				
				return Os1;		
				
		}
		
	
	
	
	

	public static void writeVBSEXCEL(VBLoad vbLoad, String excelFolderName) {
		
		String filePath=excelFolderName+new SimpleDateFormat("yyyyMMdd").format(new Date())+"ForEXCEL.xlsx";
		  // Using XSSF for xlsx format, for xls use HSSF
        Workbook workbook = new XSSFWorkbook();

        Sheet pslSheet = workbook.createSheet("PremiumStatementLoad");

        List<VBLoadList> vbllList = new ArrayList<VBLoadList>();			
		List<VB> vbList = new ArrayList<VB>();	 
		
		vbllList = vbLoad.getVBLoadList();
        int rowIndex = 0;
        
        Row row = pslSheet.createRow(rowIndex++);
        int cellIndex = 0;
        
        row.createCell(cellIndex++).setCellValue("Date Generated");
        row.createCell(cellIndex++).setCellValue("VBR");        
        row.createCell(cellIndex++).setCellValue("VRN");     
        row.createCell(cellIndex++).setCellValue("Date Booked");       
        row.createCell(cellIndex++).setCellValue("Time Booked");
        row.createCell(cellIndex++).setCellValue("Amount");
       
                
        
        for(VBLoadList vbll : vbllList){
        	vbList = vbll.getVB();
        	for(VB vb: vbList){
        	
	            row = pslSheet.createRow(rowIndex++);
	            cellIndex = 0;
	            
	            row.createCell(cellIndex++).setCellValue(new Date().toGMTString());
	            row.createCell(cellIndex++).setCellValue(vb.getVBR());	            
	            row.createCell(cellIndex++).setCellValue(vb.getVRN());	         
	            row.createCell(cellIndex++).setCellValue(vb.getDateBooked());	           
	            row.createCell(cellIndex++).setCellValue(vb.getTimeBooked());
	            row.createCell(cellIndex++).setCellValue(vb.getAmount().toString());
	        
	          
            
        	 }
            

        }
        

        //write this workbook in excel file.
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            workbook.write(fos);
            fos.close();

            System.out.println(filePath + " is successfully written");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

	
	
	// Converts an XMLGregorianCalendar to an instance of java.util.Date
	public static String asDate(XMLGregorianCalendar xmlGC) {
	if(xmlGC == null) {
	return null;
	} else {		
	return (new SimpleDateFormat("dd/MM/yyyy").format(xmlGC.toGregorianCalendar().getTime()));
	}
	}
	
	public static String asTime(XMLGregorianCalendar xmlGC) {
		if(xmlGC == null) {
			return null;
		} else {
			return (new SimpleDateFormat("HH:mm:ss").format(xmlGC.toGregorianCalendar().getTime()));
		}
	}

}
