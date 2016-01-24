package com.nivi.www;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nivi.www.bean.VB;
import com.nivi.www.bean.VBLoad;
import com.nivi.www.bean.VBLoadList;
import com.nivi.www.bean.VBLoadStart;
import com.vbs.org.rest.VBRestInput;


//   http://localhost:8080/VBSRest/api/json/VBLoad/

@Path("/json")
public class WebController {
	
	 private static VBLoadStart vbLoadStart = new VBLoadStart();
	    
		static {

			VBLoad vbLoad = new VBLoad();	    	
			vbLoad.setDateGenerated("07-01-2016");	
			VBLoadList vbLoadList = new VBLoadList();
			List<VB> vbList = new ArrayList<VB>();
			VB vb = new VB();
			vb.setAmount("20.00");
			vb.setDateBooked("01-01-2016");
			vb.setTimeBooked("09:15");
			vb.setVbr("100");
			vb.setVRN("A100");
			vbList.add(vb);
			vbLoadList.setVbList(vbList);
			vbLoad.setVbLoadList(vbLoadList);
			vbLoadStart.setVbLoad(vbLoad);

		}

	 
	    @GET
	    @Path("/VBLoad/")
	    @Produces("application/json")
	    public VBLoadStart getVBLoadJSON(){
	    	System.out.println("in the WebController GET");
	        return vbLoadStart;
	    }

	 
	    @POST
	    @Path("/VBLoad/post")
	    @Produces(MediaType.TEXT_PLAIN)	 
	    @Consumes("application/xml")
	     public String setVBLoadJSON(VBRestInput vBRestInput){
	    	System.out.println(vBRestInput);
	    	
	    	System.out.println(vBRestInput.getVBR());
	    	
	    	System.out.println("in the WebController POST");
	    	return (vBRestInput.getVBR());
	    }
	    
	 /*   @POST
	    @Path("/VBLoad/post")
	    @Produces(MediaType.TEXT_PLAIN)	 
	    @Consumes(MediaType.TEXT_PLAIN)
	    public String setVBLoadJSON(String vBRestInput){
	    	System.out.println(vBRestInput);
	    	
	   
	    	
	    	System.out.println("in the WebController POST");
	    	return ("SUCCESS");
	    }*/
	    
}
