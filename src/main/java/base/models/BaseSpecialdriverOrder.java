package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSpecialdriverOrder<M extends BaseSpecialdriverOrder<M>> extends Model<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setSpecialDriver(Integer specialDriver) {
		set("special_driver", specialDriver);
	}

	public Integer getSpecialDriver() {
		return get("special_driver");
	}

	public void setOrderid(Integer orderid) {
		set("orderid", orderid);
	}

	public Integer getOrderid() {
		return get("orderid");
	}

	public void setOver(Integer over) {
		set("over", over);
	}

	public Integer getOver() {
		return get("over");
	}
}
