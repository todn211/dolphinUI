package com.dolphinui.layout;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * 横向布局容器，位于此容器内的控件都以横向形式排列
 * @author XING
 */
public class Hgroup extends SimpleTagSupport {
	private int gap;
	private String title;
	private String type;
	private List<String> labels;
	
	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
		for (int i=0;i<labels.size();i++) {
			this.getJspContext().setAttribute("label", labels.get(i) + i);
			this.getJspBody().invoke(null);
		}
	}

	public int getGap() {
		return gap;
	}

	public void setGap(int gap) {
		this.gap = gap;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}
}