package com.adobe.aem.training.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class NewsArticleModel {
	@ValueMapValue
	private String headlineText;
	
	@ValueMapValue
	private String description;

	public String getHeadlineText() {
		return headlineText;
	}

	public String getDescription() {
		return description;
	}
	

	
	

}
