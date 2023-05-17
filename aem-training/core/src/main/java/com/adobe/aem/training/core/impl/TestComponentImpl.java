package com.adobe.aem.training.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.RequestAttribute;
import org.apache.sling.models.annotations.injectorspecific.ResourcePath;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.training.core.models.TestComponent;
import com.day.cq.wcm.api.Page;

@Model(adaptables = {Resource.class,SlingHttpServletRequest.class},
adapters = TestComponent.class, 
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class TestComponentImpl implements TestComponent {
	@ValueMapValue
	String parentPath;
	
	@SlingObject
	SlingHttpServletRequest request;
	
	@SlingObject
	ResourceResolver resolver;
	
	@SlingObject
	Resource resource1;
	
	@SlingObject
	Page page;

	@ValueMapValue
	@Named("jcr:createdBy")
	String createdBy;

	@ResourcePath(path = "/content/training")
	Resource resource;

	@RequestAttribute
	String reqAttribute;

	@ScriptVariable
	Page currentPage;

	@ValueMapValue
	@Default(values = "AEM")
	public String fName;

	@ValueMapValue
	@Default(values = "Training")
	public String lName;

	@ValueMapValue

	public boolean isProfessor;

	@Override
	public String getFirstName() {

		return fName;
	}

	@Override
	public String getLastName() {

		return lName;
	}

	@Override
	public boolean getIsProfessor() {

		return isProfessor;
	}

	@Override
	public String getPageTitle() {

		return currentPage.getTitle();
	}

	@Override
	public String getReqAttribute() {

		return reqAttribute;
	}

	@Override
	public String getHomePageName() {

		return resource1.getName();
	}

	@Override
	public String getCreatedBy() {

		return createdBy;
	}
	@PostConstruct
	protected void init() {
		resolver = request.getResourceResolver();
		resource1 = resolver.getResource(parentPath);
		page = resource1.adaptTo(Page.class);
	}
	public List getChildPages() {
		List<String> list = new ArrayList<String>();
		Iterator<Page>itr = page.listChildren();
		
		while(itr.hasNext()) {
			list.add(itr.next().getName());
		}
		return list;
		
	}

	@Override
	public String getParenthPath() {
		// TODO Auto-generated method stub
		return parentPath;
	}

}
