package com.warems.warehouse.entity;

import java.util.Date;

public class FoodRemainder
{
    private Integer fID; //食物ID
    private String name; //品名
    private String standard; //规格
    private String unit; //单位
    private Integer ennumber;//入库数量
    private Integer renumber; //剩余数量
    private Integer detailID;//入库详单编码
    private Float price; //价格
    private String producedate; //生产日期
    private String guaranteeperiod; //保质期
    private String posencode;//位置编码
    private Integer enID; //入库表ID
    private Date entrydate; //入库时间
    private String entryman; //录入人


    public FoodRemainder(){}

    public FoodRemainder(Integer fID, String name, String standard, String unit, Integer ennumber, Integer renumber, Integer detailID, Float price, String producedate, String guaranteeperiod, String posencode, Integer enID, Date entrydate, String entryman) {
        this.fID = fID;
        this.name = name;
        this.standard = standard;
        this.unit = unit;
        this.ennumber = ennumber;
        this.renumber = renumber;
        this.detailID = detailID;
        this.price = price;
        this.producedate = producedate;
        this.guaranteeperiod = guaranteeperiod;
        this.posencode = posencode;
        this.enID = enID;
        this.entrydate = entrydate;
        this.entryman = entryman;
    }

    public Integer getfID() {
        return fID;
    }

    public void setfID(Integer fID) {
        this.fID = fID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getEnnumber() {
        return ennumber;
    }

    public void setEnnumber(Integer ennumber) {
        this.ennumber = ennumber;
    }

    public Integer getRenumber() {
        return renumber;
    }

    public void setRenumber(Integer renumber) {
        this.renumber = renumber;
    }

    public Integer getDetailID() {
        return detailID;
    }

    public void setDetailID(Integer detailID) {
        this.detailID = detailID;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getProducedate() {
        return producedate;
    }

    public void setProducedate(String producedate) {
        this.producedate = producedate;
    }

    public String getGuaranteeperiod() {
        return guaranteeperiod;
    }

    public void setGuaranteeperiod(String guaranteeperiod) {
        this.guaranteeperiod = guaranteeperiod;
    }

    public String getPosencode() {
        return posencode;
    }

    public void setPosencode(String posencode) {
        this.posencode = posencode;
    }

    public Integer getEnID() {
        return enID;
    }

    public void setEnID(Integer enID) {
        this.enID = enID;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public String getEntryman() {
        return entryman;
    }

    public void setEntryman(String entryman) {
        this.entryman = entryman;
    }

    @Override
    public String toString() {
        return "FoodRemainder{" +
                "fID=" + fID +
                ", name='" + name + '\'' +
                ", standard='" + standard + '\'' +
                ", unit='" + unit + '\'' +
                ", ennumber=" + ennumber +
                ", renumber=" + renumber +
                ", detailID=" + detailID +
                ", price=" + price +
                ", producedate='" + producedate + '\'' +
                ", guaranteeperiod='" + guaranteeperiod + '\'' +
                ", posencode='" + posencode + '\'' +
                ", enID=" + enID +
                ", entrydate=" + entrydate +
                ", entryman='" + entryman + '\'' +
                '}';
    }
}
