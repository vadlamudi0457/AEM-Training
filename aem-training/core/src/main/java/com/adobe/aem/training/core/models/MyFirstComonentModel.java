package com.adobe.aem.training.core.models;

import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class MyFirstComonentModel {

	@ValueMapValue
	private String title;
	
	@ValueMapValue 
	private String type;

	@ValueMapValue 
	private String id;
	
	@ValueMapValue 
	private String text;
	
	@ValueMapValue 
	@Named("sling:resourceType")
	private String resourceType;

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}
	
	public String getText() {
		return text;
	}
	
	public String getResourceType() {
		return resourceType;
	}
	
	
}
