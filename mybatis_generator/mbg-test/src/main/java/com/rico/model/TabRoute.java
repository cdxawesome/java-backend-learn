package com.rico.model;

import java.io.Serializable;

public class TabRoute implements Serializable {
    private Integer rid;

    private String rname;

    private Double price;

    private String routeintroduce;

    private String rflag;

    private String rdate;

    private String isthemetour;

    private Integer count;

    private Integer cid;

    private String rimage;

    private Integer sid;

    private String sourceid;

    private static final long serialVersionUID = 1L;

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
        this.rname = rname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRouteintroduce() {
        return routeintroduce;
    }

    public void setRouteintroduce(String routeintroduce) {
        this.routeintroduce = routeintroduce;
    }

    public String getRflag() {
        return rflag;
    }

    public void setRflag(String rflag) {
        this.rflag = rflag;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    public String getIsthemetour() {
        return isthemetour;
    }

    public void setIsthemetour(String isthemetour) {
        this.isthemetour = isthemetour;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getRimage() {
        return rimage;
    }

    public void setRimage(String rimage) {
        this.rimage = rimage;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSourceid() {
        return sourceid;
    }

    public void setSourceid(String sourceid) {
        this.sourceid = sourceid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rid=").append(rid);
        sb.append(", rname=").append(rname);
        sb.append(", price=").append(price);
        sb.append(", routeintroduce=").append(routeintroduce);
        sb.append(", rflag=").append(rflag);
        sb.append(", rdate=").append(rdate);
        sb.append(", isthemetour=").append(isthemetour);
        sb.append(", count=").append(count);
        sb.append(", cid=").append(cid);
        sb.append(", rimage=").append(rimage);
        sb.append(", sid=").append(sid);
        sb.append(", sourceid=").append(sourceid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}