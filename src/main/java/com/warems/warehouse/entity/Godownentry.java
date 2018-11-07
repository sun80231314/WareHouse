package com.warems.warehouse.entity;

import java.util.Date;

public class Godownentry {
    private Integer id; //主键
    private String entryman; //录入人
    private Date entrydate; //入库时间
    private String entry_order_number; //入库单号
    private String entryencode; //入库详单编码

    public Godownentry(Integer id, String entryman, Date entrydate, String entry_order_number, String entryencode) {
        this.id = id;
        this.entryman = entryman;
        this.entrydate = entrydate;
        this.entry_order_number = entry_order_number;
        this.entryencode = entryencode;
    }

    @Override
    public String toString() {
        return "Godownentry{" +
                "id=" + id +
                ", entryman='" + entryman + '\'' +
                ", entrydate=" + entrydate +
                ", entry_order_number='" + entry_order_number + '\'' +
                ", entryencode='" + entryencode + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEntryman() {
        return entryman;
    }

    public void setEntryman(String entryman) {
        this.entryman = entryman;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public String getEntry_order_number() {
        return entry_order_number;
    }

    public void setEntry_order_number(String entry_order_number) {
        this.entry_order_number = entry_order_number;
    }

    public String getEntryencode() {
        return entryencode;
    }

    public void setEntryencode(String entryencode) {
        this.entryencode = entryencode;
    }
}
