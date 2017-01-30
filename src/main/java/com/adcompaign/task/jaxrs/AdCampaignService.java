package com.adcompaign.task.jaxrs;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


@Produces({"application/xml","application/json"})
public interface AdCampaignService {

	@GET
	@Path("/campaigns/{partner_id}")
	Campaign getCampaign(@PathParam("partner_id") String partner_id);

	@PUT
	@Path("/campaigns/")
	Response updateCampaign(Campaign c);

	@POST
	@Path("/campaigns/")
	Response addCampaign(Campaign comp);

	@DELETE
	@Path("/campaigns/{partner_id}")
	Response deleteCampaign(Campaign c);

	//Prescription getPrescription(String prescriptionId);

}