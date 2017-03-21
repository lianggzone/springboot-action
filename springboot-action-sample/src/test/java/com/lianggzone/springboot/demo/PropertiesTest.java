package com.lianggzone.springboot.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lianggzone.springboot.main.WebMain;

/**
 * <h3>概要:</h3><p>配置文件,单元测试</p>
 * <h3>功能:</h3><p></p>
 * <h3>履历:</h3>
 * <li>2016年12月31日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(WebMain.class)
public class PropertiesTest {

    @Value("${author.realname}")
    private String realname;

    @Value("${author.nickname}")
    private String nickname;
     
    @Test
    public void test1() throws Exception {
        System.out.println("real_name : " + realname);
        System.out.println("nick_name : " + nickname);
    }
    
    @Value("${author.intro}")
    private String intro;
    
    @Test
    public void test2() throws Exception {
        System.out.println("intro : " + intro);
    }
    
    @Value("${rand.str}")
    private String randStr;
    @Value("${rand.intid}")
    private int randIntid;
    @Value("${rand.longid}")
    private long randLongid;
    @Value("${rand.number}")
    private int randNumber;
    @Value("${rand.range}")
    private String randRange;
    
    @Test
    public void test3() throws Exception {
        System.out.println("rand.str : " + randStr);
        System.out.println("rand.intid : " + randIntid);
        System.out.println("rand.longid : " + randLongid);
        System.out.println("rand.number : " + randNumber);
        System.out.println("rand.range : " + randRange);
    }
    
    @Value("${author.email}")
    private String email;
    @Value("${author.blog}")
    private String blog;
    
    @Test
    public void test4() throws Exception {
        System.out.println("email : " + email);
        System.out.println("blog : " + blog);
    }
}