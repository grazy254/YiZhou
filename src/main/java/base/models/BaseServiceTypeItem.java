package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseServiceTypeItem<M extends BaseServiceTypeItem<M>> extends Model<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setName(String name) {
		set("name", name);
	}

	public String getName() {
		return get("name");
	}

	public void setChargeStandard(Integer chargeStandard) {
		set("charge_standard", chargeStandard);
	}

	public Integer getChargeStandard() {
		return get("charge_standard");
	}

	public void setRoyaltyStandard(Integer royaltyStandard) {
		set("royalty_standard", royaltyStandard);
	}

	public Integer getRoyaltyStandard() {
		return get("royalty_standard");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setCreater(Integer creater) {
		set("creater", creater);
	}

	public Integer getCreater() {
		return get("creater");
	}

	public void setType(Integer type) {
		set("type", type);
	}

	public Integer getType() {
		return get("type");
	}

	public void setLastUpdateTime(java.util.Date lastUpdateTime) {
		set("last_update_time", lastUpdateTime);
	}

	public java.util.Date getLastUpdateTime() {
		return get("last_update_time");
	}

	public void setAllowFlag(Boolean allowFlag) {
		set("allow_flag", allowFlag);
	}

	public Boolean getAllowFlag() {
		return get("allow_flag");
	}

}
