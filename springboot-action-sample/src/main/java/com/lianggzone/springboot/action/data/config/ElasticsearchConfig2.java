package com.lianggzone.springboot.action.data.config;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * ElasticsearchConfig
 * @author 梁桂钊
 * @since 
 * <p>更新时间: 2016年1月18日  v0.1</p><p>版本内容: 创建</p>
 */
@Configuration
@EnableElasticsearchRepositories("com.lianggzone.springboot.action.data.elasticsearch")
public class ElasticsearchConfig2 {

    private String hostname = "127.0.0.1";
    private int port = 9300;

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(client());
    }

    @Bean
    public Client client() {
        TransportClient client = new TransportClient();
        TransportAddress address = new InetSocketTransportAddress(hostname, port);
        
        client.addTransportAddress(address);
        return client;
    }
}