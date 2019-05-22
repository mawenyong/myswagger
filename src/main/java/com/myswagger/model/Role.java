package com.myswagger.model;

import java.util.Date;

/**
 * 编写者：
 * 编写时间：
 * 类实体描述：
 */
public class Role {
    private Integer rid;

    private String rname;

    private Date risbegin;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public Date getRisbegin() {
        return risbegin;
    }

    public void setRisbegin(Date risbegin) {
        this.risbegin = risbegin;
    }
}