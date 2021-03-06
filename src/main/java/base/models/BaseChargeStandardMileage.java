package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseChargeStandardMileage<M extends BaseChargeStandardMileage<M>> extends Model<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setStart(java.math.BigDecimal start) {
		set("start", start);
	}

	public java.math.BigDecimal getStart() {
		return get("start");
	}

	public void setEnd(java.math.BigDecimal end) {
		set("end", end);
	}

	public java.math.BigDecimal getEnd() {
		return get("end");
	}

	public void setJiajiajine(java.math.BigDecimal jiajiajine) {
		set("jiajiajine", jiajiajine);
	}

	public java.math.BigDecimal getJiajiajine() {
		return get("jiajiajine");
	}

	public void setChargeStandardItem(Integer chargeStandardItem) {
		set("charge_standard_item", chargeStandardItem);
	}

	public Integer getChargeStandardItem() {
		return get("charge_standard_item");
	}

	public void setChargeStandard(Integer chargeStandard) {
		set("charge_standard", chargeStandard);
	}

	public Integer getChargeStandard() {
		return get("charge_standard");
	}

}
