package com.overpayment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="page_cfg")
public class PageConfig {

	@Id
	@Column(name="page_id")
	private String pageId;
	
	@Column(name="page_config")
	private String pageConfig;

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String getPageConfig() {
		return pageConfig;
	}

	public void setPageConfig(String pageConfig) {
		this.pageConfig = pageConfig;
	}
	
	
}
