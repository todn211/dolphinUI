package com.dolphinui.utils;

import freemarker.template.Configuration;

public class FreemarkerHelper {
	
	
	/**
	 * 初始化模板基础配置
	 */
	public void initFreemarker(String basePath){
		Configuration cfg = new Configuration();
        
        //设置模板文件的基路径
//		cfg.setServletContextForTemplateLoading(basePath,"TemplateFiles");
		cfg.setClassForTemplateLoading(FreemarkerHelper.class, basePath);
		
		//设置模板的编码
		cfg.setDefaultEncoding("UTF-8");
	}
}
