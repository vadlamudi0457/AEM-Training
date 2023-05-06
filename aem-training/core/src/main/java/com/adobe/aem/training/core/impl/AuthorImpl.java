package com.adobe.aem.training.core.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;
import org.apache.sling.models.annotations.injectorspecific.RequestAttribute;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.training.core.models.Author;
import com.day.cq.wcm.api.Page;

@Model(adaptables = SlingHttpServletRequest.class, adapters = Author.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AuthorImpl implements Author {

	@ValueMapValue
	@Default(values = "AEM")
	String fname;

	@ValueMapValue
	@Required
	@Default(values = "Training")
	String lname;

	@ValueMapValue
	boolean professor;

	@ScriptVariable
	Page currentPage;
	
	@RequestAttribute
	String inputOne;
	
	@ValueMapValue 
	@Named("jcr:createdBy")
	private String createdBy;
	
	public String getCreatedBy() {
		return createdBy;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public Page getCurrentPage() {
		return currentPage;
	}

	public String getInputOne() {
		return inputOne;
	}

	public String getInputTwo() {
		return inputTwo;
	}

	@RequestAttribute
	String inputTwo;

	@Override
	public String getFirstName() {

		return fname;
	}

	@Override
	public String getLastName() {

		return lname;
	}

	@Override
	public boolean getProfessor() {

		return professor;
	}

	@Override
	public String getPageTitle() {

		return currentPage.getTitle();
	}

}
