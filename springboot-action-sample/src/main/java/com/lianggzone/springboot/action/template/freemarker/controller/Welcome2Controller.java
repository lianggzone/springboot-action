package com.lianggzone.springboot.action.template.freemarker.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateNotFoundException;

/**
 * <h3>概要:</h3><p>AuthorController</p>
 * <h3>功能:</h3><p>AuthorController</p>
 * <h3>履历:</h3>
 * <li>2016年12月13日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@RestController("template.freemarkerController2")
@EnableAutoConfiguration
public class Welcome2Controller {
	
	@Autowired  
	private Configuration configuration; 
	
	@RequestMapping("/template/freemarker/welcome2")
	public String welcome2(Map<String, Object> model) throws Exception {
		model.put("time", new Date());
		model.put("message", "梁桂钊");
		
		Template template = configuration.getTemplate("welcome.ftl"); 
	    String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);  
	    
	    FileUtils.writeStringToFile(new File("d:/welcome.html"), content);
	    
	    return "welcome";
	}
}
