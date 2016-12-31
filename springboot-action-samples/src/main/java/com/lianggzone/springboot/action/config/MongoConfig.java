package com.lianggzone.springboot.action.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories
public class MongoConfig extends AbstractMongoConfiguration {

    private String mongoHost = "localhost";
    private int mongoPort = 27017;
    private String dbName = "springboot-db";
    
    private static final String MONGO_BASE_PACKAGE = "com.lianggzone.springboot.action.data.mongodb.entity";

    @Autowired
    private ApplicationContext appContext;
    
    @Override
    protected String getDatabaseName() {
        return dbName;
    }
    
    @Override
    public Mongo mongo() throws Exception {
        MongoClient mongoClient = new MongoClient(mongoHost, mongoPort);
        return mongoClient;
    }

    @Override
    protected String getMappingBasePackage() {
        return MONGO_BASE_PACKAGE;
    }
    
    @Override
    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), getDatabaseName());
    }
}