package com.lti.rest;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
//rest api for others
import javax.ws.rs.core.Context;

@Path("/pnr")
public class PnrService 
{
	@GET
	@Produces("application/json")
	public PnrDetails check(@QueryParam("pnrNo")long pnrNo, @Context HttpServletResponse response){
		
		response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
		
		/*
		 * *IN A REAL APPLICATION ,WE WILL ACESS SOME DA0 CLASS
		 * which in turn will access the database and return
         * the required information to us
         */
		PnrDao dao=new PnrDao();
		PnrDetails pnrDetails=dao.fetchPnrDetails(pnrNo);
		return pnrDetails;
	}
	
}
