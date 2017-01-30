package com.adcompaign.task.jaxrs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="Compaign")
public class Campaign {
	private long partner_id;
	private String duration;
	private String ad_content;

	public Campaign() {

	}

	
	public long getPartner_id() {
		return partner_id;
	}

	public void setPartner_id(long partner_id) {
		this.partner_id = partner_id;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getAd_content() {
		return ad_content;
	}

	public void setAd_content(String ad_content) {
		this.ad_content = ad_content;
	}

	
}
