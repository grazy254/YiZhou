package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCompanyServe<M extends BaseCompanyServe<M>> extends Model<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setAddress(String Address) {
		set("Address", Address);
	}

	public String getAddress() {
		return get("Address");
	}

	public void setServiceName(String ServiceName) {
		set("ServiceName", ServiceName);
	}

	public String getServiceName() {
		return get("ServiceName");
	}

	public void setServiceNo(String ServiceNo) {
		set("ServiceNo", ServiceNo);
	}

	public String getServiceNo() {
		return get("ServiceNo");
	}

	public void setDatailAddress(String DatailAddress) {
		set("DatailAddress", DatailAddress);
	}

	public String getDatailAddress() {
		return get("DatailAddress");
	}

	public void setResponsibleName(String ResponsibleName) {
		set("ResponsibleName", ResponsibleName);
	}

	public String getResponsibleName() {
		return get("ResponsibleName");
	}

	public void setResponsiblePhone(String ResponsiblePhone) {
		set("ResponsiblePhone", ResponsiblePhone);
	}

	public String getResponsiblePhone() {
		return get("ResponsiblePhone");
	}

	public void setManagerName(String ManagerName) {
		set("ManagerName", ManagerName);
	}

	public String getManagerName() {
		return get("ManagerName");
	}

	public void setManagerPhone(String ManagerPhone) {
		set("ManagerPhone", ManagerPhone);
	}

	public String getManagerPhone() {
		return get("ManagerPhone");
	}

	public void setMailAddress(String MailAddress) {
		set("MailAddress", MailAddress);
	}

	public String getMailAddress() {
		return get("MailAddress");
	}

	public void setCreateDate(java.util.Date CreateDate) {
		set("CreateDate", CreateDate);
	}

	public java.util.Date getCreateDate() {
		return get("CreateDate");
	}

	public void setState(Integer State) {
		set("State", State);
	}

	public Integer getState() {
		return get("State");
	}

	public void setFlag(Integer Flag) {
		set("Flag", Flag);
	}

	public Integer getFlag() {
		return get("Flag");
	}

	public void setUpdateTime(java.util.Date UpdateTime) {
		set("UpdateTime", UpdateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("UpdateTime");
	}

}