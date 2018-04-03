package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 * 车辆保险表
 */
@SuppressWarnings("serial")
public abstract class BaseInsurance<M extends BaseInsurance<M>> extends Model<M> implements IBean {


    public void setId(Long id) {
        set("id", id);
    }

    public Long getId() {
        return get("id");
    }

    public void setCompanyId(String CompanyId) {
        set("CompanyId", CompanyId);
    }

    public String getCompanyId() {
        return get("CompanyId");
    }

    public void setVehicleNo(String VehicleNo) {
        set("VehicleNo", VehicleNo);
    }

    public String getVehicleNo() {
        return get("VehicleNo");
    }

    public void setInsurCom(String InsurCom) {
        set("InsurCom", InsurCom);
    }

    public String getInsurCom() {
        return get("InsurCom");
    }

    public void setInsurNum(String InsurNum) {
        set("InsurNum", InsurNum);
    }

    public String getInsurNum() {
        return get("InsurNum");
    }

    public void setInsurType(String InsurType) {
        set("InsurType", InsurType);
    }

    public String getInsurType() {
        return get("InsurType");
    }

    public void setInsurCount(Integer InsurCount) {
        set("InsurCount", InsurCount);
    }

    public Integer getInsurCount() {
        return get("InsurCount");
    }

    public void setInsurEff(Integer InsurEff) {
        set("InsurEff", InsurEff);
    }

    public Integer getInsurEff() {
        return get("InsurEff");
    }

    public void setInsurExp(Integer InsurExp) {
        set("InsurExp", InsurExp);
    }

    public Integer getInsurExp() {
        return get("InsurExp");
    }

    public void setFlag(Integer Flag) {
        set("Flag", Flag);
    }

    public Integer getFlag() {
        return get("Flag");
    }

    public void setUpdateTime(Long UpdateTime) {
        set("UpdateTime", UpdateTime);
    }

    public Long getUpdateTime() {
        return get("UpdateTime");
    }

}