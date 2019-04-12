package com.dolphinui.layout;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * master∑÷÷ß
 */
public class Hgitem extends SimpleTagSupport {
	private String label;
	
	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
		this.getJspContext().getOut().write("from Hgitem:" + label);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
}
