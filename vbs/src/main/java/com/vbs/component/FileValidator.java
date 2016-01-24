package com.vbs.component;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import java.text.ParseException;

import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.vbs.org.VB;
import com.vbs.org.VBLoad;
import com.vbs.org.VBLoadList;


public class FileValidator {

		public static void main(String[] args) {
			  
			File folder = new File("C:\\ESB\\Files\\VBS\\Archive");
			File[] listOfFiles  =folder.listFiles();
			for (int i = 0; i < listOfFiles.length; i++) {			    
			    	String fileName = "C:\\ESB\\Files\\VBS\\Archive\\"+(listOfFiles[i].getName());
    	        	getExcelToXML(fileName);
    	        	System.out.println("fileName  successfull "+fileName);
			         	  
			      }
			}

		
		public static String getExcelToXML(String filePath){				
			List<VBLoadList> prrList = getVBLoad(filePath);					
			ByteArrayOutputStream Os1 = getExcelToJavaObj(prrList);	
			System.out.println(Os1.toString());
			return (Os1.toString());
			//return getStrReplace(Os1.toString());	
		}
		
		
		
		public static ByteArrayOutputStream getExcelToJavaObj(List<VBLoadList> prrList){		
			VBLoad vbLoad = new VBLoad();				
			vbLoad.setDateGenerated(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));			
			vbLoad.getVBLoadList().addAll(prrList);					
			
			try {

				ByteArrayOutputStream Os1 = new ByteArrayOutputStream( );		
				JAXBContext jaxbContext = JAXBContext.newInstance(VBLoad.class);
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();			
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // output pretty printed
				jaxbMarshaller.marshal(vbLoad, Os1);
				return Os1;

			} catch (JAXBException e) {
				e.printStackTrace();
			}
	    		
		return null;
		
	}
	
	
	  public static List<VBLoadList> getVBLoad(String filePath){
			Map<String,Object> map = readExcelSheet(filePath);
			List<VBLoadList> valueObjectList = (List<VBLoadList>)map.get("valueObjectList");			
			return valueObjectList;
	    }

	  

	    public static Map<String,Object> readExcelSheet(String filePath) {			
	    		    	
	    	VBLoadList vbll = null;		
			Map<String, Object> rowMap = null;

			try {
				XSSFWorkbook myWorkBook = new XSSFWorkbook(new FileInputStream(filePath));
				XSSFSheet mySheet = myWorkBook.getSheetAt(0);
				boolean isFirstRow = true;
				rowMap = new HashMap<String, Object>();
				List<VBLoadList> cellsList = new ArrayList<VBLoadList>();				
				List<VB> vbList =  new ArrayList<VB>();
				vbll = new VBLoadList();
				vbll = getVBLLObject(mySheet);
				
				for(Row myRow : mySheet){					
					if (!(isFirstRow)) {	
						if(!isRowEmpty(myRow)){
							addRowCells(vbList, myRow);
						}						
					}	 					
					if(isFirstRow) {
						isFirstRow = false;
					}
					
				}				
							
				vbll.setVb(vbList);	
				cellsList.add(vbll);				
				rowMap.put("valueObjectList", cellsList);
				
			} catch (Exception e) {
				//System.out.println("Reading from excel sheet");
				System.out.println("This file is not valid :: "+filePath);
			}
			
			return rowMap;

	     }
	    
	    
	    
    private static VBLoadList getVBLLObject(XSSFSheet mySheet) {
    	boolean isFirstRow = true;
    	VBLoadList vbLoadList = new VBLoadList();	    	
    	List<VB> vbList =  new ArrayList<VB>();    	
    	VB vb = new VB();
	        
	    int count = 1;
    	for(Row row : mySheet){
			
			if (!(isFirstRow)) {	
				if(!isRowEmpty(row)){
					if(count == 1){
					int cInd = 0;  
					Cell cl = row.getCell(cInd++);  // VBR
					
					if(StringUtils.isNotBlank(getStringValue(cl)))
				    vb.setVBR(cl.getStringCellValue());
					
					
					cl = row.getCell(cInd++); // VRN	
					if(StringUtils.isNotBlank(getStringValue(cl)))
				    vb.setVRN(cl.getStringCellValue());
					
					cl = row.getCell(cInd++); // DateBooked					
				    vb.setDateBooked(getDateString(cl.getDateCellValue()));
					
					
					cl = row.getCell(cInd++); // TimeBooked					
				    vb.setTimeBooked(getTimeString(cl.getDateCellValue()));
					
					cl = row.getCell(cInd++); // Amount						
				    vb.setAmount(BigDecimal.valueOf(cl.getNumericCellValue()));
					
					vb.setSource("EXCEL");
					vb.setTarget("FILE");
					 
				 
					vbList.add(vb);
					
					}					
					
				break;	
					
				}						
			}	 					
			if(isFirstRow) {
				isFirstRow = false;
			}
			
		}
    	
    	vbLoadList.setVb(vbList);
    	return vbLoadList;
		}


	public static void addRowCells(List<VB> vbList, Row row) {
	    	
	        int cInd = 0;     
	        VB vb = new VB();	
			               
			Cell cl = row.getCell(cInd++);  // vbr		
			if(StringUtils.isNotBlank(getStringValue(cl)))
			vb.setVBR(cl.getStringCellValue());
			
			
			cl = row.getCell(cInd++); // VRN	
			if(StringUtils.isNotBlank(getStringValue(cl)))
		     vb.setVRN(cl.getStringCellValue());
			
			cl = row.getCell(cInd++); // DateBooked			
			if(StringUtils.isNotBlank(getStringValue(cl)))		
			 vb.setDateBooked(getDateString(cl.getDateCellValue()));
			
			cl = row.getCell(cInd++); // TimeBooked
				     
		     vb.setTimeBooked(getTimeString(cl.getDateCellValue()));
			
			cl = row.getCell(cInd++); // Amount	
			vb.setAmount(BigDecimal.valueOf(cl.getNumericCellValue()));
		  
			
			 vb.setSource("EXCEL");
			 vb.setTarget("FILE");
		
		//	System.out.println("row number :::: "+ row.getRowNum());		
			vbList.add(vb);
		//	System.out.println(vbList.size());
			
		}

	     
	    
	
	
	private static String getDateString(Date d) {			
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String dateStr = null;		
		dateStr = formatter.format(d);				
		return dateStr;
	}
	
	private static String getTimeString(Date d) {			
		SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
		String dateStr = null;		
		dateStr = formatter.format(d);				
		return dateStr;
	}
	
	
	

	private static boolean isObjectNotNull(Object obj){
	    if(obj != null && obj != "" &&  obj.toString().length() > 0){	
			return true;
		}
		else {		
			return false;
		}		
	}
	
	
	public static boolean isRowEmpty(Row row) {
	    for (int c = row.getFirstCellNum(); c < row.getLastCellNum(); c++) {
	        Cell cell = row.getCell(c);
	        if (cell != null && cell.getCellType() != Cell.CELL_TYPE_BLANK)
	            return false;
	    }
	    return true;
	}
	
	
		
	
	
	public static String getStringValue(Cell cl){			
			String value = null;
			if(isObjectNotNull(cl)){
				int cellType = cl.getCellType();					
				if (cellType == Cell.CELL_TYPE_NUMERIC) {					
					value = String.valueOf(new Double(cl.getNumericCellValue()).intValue());
					return value;
					} 
				else {
					value = cl.getStringCellValue();
					return value;
				}
			}		
			return value;			
		}
	
	
	

	

	/*
	public static String getStrReplace(String inputMsg){		
		String s = "<ns2:PremiumStatementLoad xmlns:ns2=\"C:/Work/Projects/ARC/FullMsgSchemaPremiumReconciliationRs\">";
		String s1 = "<n:PremiumStatementLoad xmlns:n=\"http://www.polaris-uk.co.uk/Schema/1/PremiumReconciliationRs\">";		
		inputMsg = inputMsg.replace(s, s1);		
		String s2 = "</ns2:PremiumStatementLoad>";
		String s3 = "</n:PremiumStatementLoad>";		
		inputMsg = inputMsg.replace(s2, s3);		
		return inputMsg;		
	}*/
  	
}
