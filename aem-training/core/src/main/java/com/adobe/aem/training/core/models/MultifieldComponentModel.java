package com.adobe.aem.training.core.models;

import java.util.List;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

@Model(adaptables= {SlingHttpServletRequest.class,Resource.class}, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MultifieldComponentModel {
	@SlingObject
	Resource resourece;
	
	@ChildResource
	List<MultifieldModel> headernavLinks;
	
	public List<MultifieldModel> getHeaderLinks(){
		return null;
	}

}
