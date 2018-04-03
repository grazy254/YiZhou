package base.portModels;

import com.alibaba.fastjson.annotation.JSONField;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseA52<M extends BaseA52<M>> extends Model<M> implements IBean {
/*
    public void setId(Long id) {
        set("id", id);
    }

    public Long getId() {
        return get("id");
    }*/

    @JSONField(name = "CompanyId")
    public void setCompanyId(String CompanyId) {
        set("CompanyId", CompanyId);
    }

    @JSONField(name = "CompanyId")
    public String getCompanyId() {
        return get("CompanyId");
    }

    @JSONField(name = "OrderId")
    public void setOrderId(String OrderId) {
        set("OrderId", OrderId);
    }

    @JSONField(name = "OrderId")
    public String getOrderId() {
        return get("OrderId");
    }

    @JSONField(name = "EvaluateTime")
    public void setEvaluateTime(Long EvaluateTime) {
        set("EvaluateTime", EvaluateTime);
    }

    @JSONField(name = "EvaluateTime")
    public Long getEvaluateTime() {
        return get("EvaluateTime");
    }

    @JSONField(name = "ServiceScore")
    public void setServiceScore(Integer ServiceScore) {
        set("ServiceScore", ServiceScore);
    }

    @JSONField(name = "ServiceScore")
    public Integer getServiceScore() {
        return get("ServiceScore");
    }

    @JSONField(name = "DriverScore")
    public void setDriverScore(Integer DriverScore) {
        set("DriverScore", DriverScore);
    }

    @JSONField(name = "DriverScore")
    public Integer getDriverScore() {
        return get("DriverScore");
    }

    @JSONField(name = "VehicleScore")
    public void setVehicleScore(Integer VehicleScore) {
        set("VehicleScore", VehicleScore);
    }

    @JSONField(name = "VehicleScore")
    public Integer getVehicleScore() {
        return get("VehicleScore");
    }

    @JSONField(name = "Detail")
    public void setDetail(String Detail) {
        set("Detail", Detail);
    }

    @JSONField(name = "Detail")
    public String getDetail() {
        return get("Detail");
    }

}