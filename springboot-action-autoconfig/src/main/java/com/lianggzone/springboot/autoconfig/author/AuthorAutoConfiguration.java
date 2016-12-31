package com.lianggzone.springboot.autoconfig.author;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <h3>概要:</h3><p>AuthorAutoConfiguration</p>
 * <h3>功能:</h3><p>自定义自动加载配置类</p>
 * <h3>履历:</h3>
 * <li>2016年12月31日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@Configuration
@ConditionalOnClass({ AuthorServer.class })
@EnableConfigurationProperties(AuthorProperties.class)
public class AuthorAutoConfiguration {

    @Resource
    private AuthorProperties authorProperties;
    
    @Bean
    @ConditionalOnMissingBean(AuthorServer.class)
    @ConditionalOnProperty(name = "custom.author.enabled", matchIfMissing = true)
    public AuthorServer authorResolver() {
        AuthorServer authorServer = new AuthorServer();
        authorServer.setAuthor(authorProperties.getAuthor());
        return authorServer;
    }
}
