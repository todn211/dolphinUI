package com.dolphinui.utils;

import freemarker.template.Configuration;

public class FreemarkerHelper {
	
	
	/**
	 * ��ʼ��ģ���������
	 */
	public void initFreemarker(String basePath){
		Configuration cfg = new Configuration();
        
        //����ģ���ļ��Ļ�·��
//		cfg.setServletContextForTemplateLoading(basePath,"TemplateFiles");
		cfg.setClassForTemplateLoading(FreemarkerHelper.class, basePath);
		
		//����ģ��ı���
		cfg.setDefaultEncoding("UTF-8");
	}
}
