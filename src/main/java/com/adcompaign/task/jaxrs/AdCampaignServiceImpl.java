package com.adcompaign.task.jaxrs;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response;

public class AdCampaignServiceImpl implements AdCampaignService {
	private long partner_Id = 123;
	Map<Long, Campaign> campaigns= new HashMap<Long, Campaign>();
	Campaign c = new Campaign();
	public AdCampaignServiceImpl() {
		init();
	}

	final void init() {
		
		c.setAd_content("My Add"); 
		c.setDuration("15 Secs"); 
		c.setPartner_id(partner_Id); 
		campaigns.put(c.getPartner_id(),c);
	}

	public Campaign getCampaign(String id) {
		System.out.println("Get method called with ID "+id);
		 Long campaignid = Long.parseLong(id);
		 Campaign camp =campaigns.get(campaignid);	
		 return camp;
		 
	}

	public Response updateCampaign(Campaign c) {
		// TODO Auto-generated method stub
		return null;
	}

	public Response addCampaign(Campaign camp) {
		System.out.println("Add Comapaign called ..");
	    camp.setPartner_id(++partner_Id);
	    campaigns.put(camp.getPartner_id(), camp);
		return Response.ok(camp).build();
		// TODO Auto-generated method stub
	}

	public Response deleteCampaign(Campaign c) {
		// TODO Auto-generated method stub
		return null;
	}
}
