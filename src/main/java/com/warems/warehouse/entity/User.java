package com.warems.warehouse.entity;

import java.util.Date;

public class User {
    private Integer id; //主键
    private String name; //姓名
    private String password; //密码
    private String tlNumber; //电话
    private String mail; //邮箱
    private Date createtime; //创建时间
    private Integer roleid; //角色id

    public User(Integer id, String name, String password, String tlNumber, String mail, Date createtime, Integer roleid) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.tlNumber = tlNumber;
        this.mail = mail;
        this.createtime = createtime;
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", tlNumber='" + tlNumber + '\'' +
                ", mail='" + mail + '\'' +
                ", createtime=" + createtime +
                ", roleid=" + roleid +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTlNumber() {
        return tlNumber;
    }

    public void setTlNumber(String tlNumber) {
        this.tlNumber = tlNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}
