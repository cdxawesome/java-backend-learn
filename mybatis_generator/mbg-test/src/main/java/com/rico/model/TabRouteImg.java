package com.rico.model;

import java.io.Serializable;

public class TabRouteImg implements Serializable {
    private Integer rgid;

    private Integer rid;

    private String bigpic;

    private String smallpic;

    private static final long serialVersionUID = 1L;

    public Integer getRgid() {
        return rgid;
    }

    public void setRgid(Integer rgid) {
        this.rgid = rgid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getBigpic() {
        return bigpic;
    }

    public void setBigpic(String bigpic) {
        this.bigpic = bigpic;
    }

    public String getSmallpic() {
        return smallpic;
    }

    public void setSmallpic(String smallpic) {
        this.smallpic = smallpic;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rgid=").append(rgid);
        sb.append(", rid=").append(rid);
        sb.append(", bigpic=").append(bigpic);
        sb.append(", smallpic=").append(smallpic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}