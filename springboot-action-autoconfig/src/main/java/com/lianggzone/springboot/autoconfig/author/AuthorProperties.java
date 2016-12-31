package com.lianggzone.springboot.autoconfig.author;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <h3>概要:</h3><p>AuthorProperties</p>
 * <h3>功能:</h3><p>自定义作者配置类</p>
 * <h3>履历:</h3>
 * <li>2016年12月31日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@ConfigurationProperties(prefix = "custom")
public class AuthorProperties {
    
	public static final String DEFAULT_AUTHOR = "LiangGzone";

	public String author = DEFAULT_AUTHOR;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
