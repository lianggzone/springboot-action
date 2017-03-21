package com.lianggzone.springboot.action.data.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <h3>概要:</h3><p>Author实体对象</p>
 * <h3>功能:</h3><p>Author</p>
 * <h3>履历:</h3>
 * <li>2017年01月03日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@Entity
@Table(name = "t_author")
public class Author{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

	@Column(name="real_name")
    private String realName;
	
	@Column(name="nick_name")
    private String nickName;
    
    // SET和GET方法
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRealName() {
        return realName;
    }
    public void setRealName(String realName) {
        this.realName = realName;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    } 
}