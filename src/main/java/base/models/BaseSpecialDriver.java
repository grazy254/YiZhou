package base.models;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSpecialDriver<M extends BaseSpecialDriver<M>> extends Model<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setSpecialCarId(Integer specialCarId) {
		set("special_car_id", specialCarId);
	}

	public Integer getSpecialCarId() {
		return get("special_car_id");
	}

	public void setDriverInfoId(Integer driverInfoId) {
		set("driver_info_id", driverInfoId);
	}

	public Integer getDriverInfoId() {
		return get("driver_info_id");
	}

	public void setLineStatus(Integer lineStatus) {
		set("line_status", lineStatus);
	}

	public Integer getLineStatus() {
		return get("line_status");
	}

	public void setPeople(Integer people) {
		set("people", people);
	}

	public Integer getPeople() {
		return get("people");
	}

	public void setFlag(Integer flag) {
		set("flag", flag);
	}

	public Integer getFlag() {
		return get("flag");
	}

}