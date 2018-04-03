package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMemberCoupon<M extends BaseMemberCoupon<M>> extends Model<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setCouponId(Integer couponId) {
		set("coupon_id", couponId);
	}

	public Integer getCouponId() {
		return get("coupon_id");
	}

	public void setLoginId(Integer loginId) {
		set("login_id", loginId);
	}

	public Integer getLoginId() {
		return get("login_id");
	}

	public void setStatus(Integer status) {
		set("status", status);
	}

	public Integer getStatus() {
		return get("status");
	}

	public void setGainTime(java.util.Date gainTime) {
		set("gain_time", gainTime);
	}

	public java.util.Date getGainTime() {
		return get("gain_time");
	}

	public void setUseTime(java.util.Date useTime) {
		set("use_time", useTime);
	}

	public java.util.Date getUseTime() {
		return get("use_time");
	}

	public void setCouponSource(String couponSource) {
		set("coupon_source", couponSource);
	}

	public String getCouponSource() {
		return get("coupon_source");
	}

	public void setNo(String no) {
		set("no", no);
	}

	public String getNo() {
		return get("no");
	}

	public void setPassword(String password) {
		set("password", password);
	}

	public String getPassword() {
		return get("password");
	}

	public void setStartTime(java.util.Date startTime) {
		set("start_time", startTime);
	}

	public java.util.Date getStartTime() {
		return get("start_time");
	}

	public void setEndTime(java.util.Date endTime) {
		set("end_time", endTime);
	}

	public java.util.Date getEndTime() {
		return get("end_time");
	}

	public void setTitle(String title) {
		set("title", title);
	}

	public String getTitle() {
		return get("title");
	}

	public void setDescription(String description) {
		set("description", description);
	}

	public String getDescription() {
		return get("description");
	}

	public void setAmount(java.math.BigDecimal amount) {
		set("amount", amount);
	}

	public java.math.BigDecimal getAmount() {
		return get("amount");
	}

	public void setType(Integer type) {
		set("type", type);
	}

	public Integer getType() {
		return get("type");
	}

}