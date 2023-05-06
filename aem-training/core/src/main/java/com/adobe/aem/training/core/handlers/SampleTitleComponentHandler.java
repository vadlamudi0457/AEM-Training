package com.adobe.aem.training.core.handlers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;

import com.adobe.aem.training.core.models.HeaderLinkBean;
import com.adobe.cq.sightly.WCMUsePojo;

public class SampleTitleComponentHandler extends WCMUsePojo {

	List<HeaderLinkBean>headerLinks ;
	
	Resource sampleTitleComponentResource;
	
	@Override
	public void activate() throws Exception {
		sampleTitleComponentResource = getResource();
		setHeaderLinks();
		
	}
	private void setHeaderLinks() {
		headerLinks = new ArrayList<>();
		if(null != sampleTitleComponentResource) {
			Resource headernavlinksResource = sampleTitleComponentResource.getChild("headernavlinks");
			if(null !=headernavlinksResource && headernavlinksResource.hasChildren())
			{
				Iterator<Resource>headerLinksItr = headernavlinksResource.listChildren();
				while(headerLinksItr.hasNext()) {
				Resource headerLinksResource = headerLinksItr.next();
				ValueMap headerLinksvalueMap = headerLinksResource.getValueMap();
				String label = headerLinksvalueMap.get("label"," ");
				String path = headerLinksvalueMap.get("path"," ");
				HeaderLinkBean headerLinkBean = new HeaderLinkBean();
				headerLinkBean.setLabel(label);
				headerLinkBean.setPath(path);
				
				headerLinks.add(headerLinkBean);				}
			}
		}
		
		
	}
	public List<HeaderLinkBean> headerLinks(){
		return headerLinks;
	}

}