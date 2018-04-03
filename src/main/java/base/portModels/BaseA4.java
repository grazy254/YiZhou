package base.portModels;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseA4<M extends BaseA4<M>> extends Model<M> implements IBean {



//	public void setId(Long id) {
//		set("id", id);
//	}
//
//	public Long getId() {
//		return get("id");
//
//	}

	@JSONField(name = "CompanyId")
	public void setCompanyId(String CompanyId) {
		set("CompanyId", CompanyId);
	}



	@JSONField(name = "CompanyId")
	public String getCompanyId() {
		return get("CompanyId");
	}

	@JSONField(name = "CompanyName")
	public void setCompanyName(String CompanyName) {
		set("CompanyName", CompanyName);
	}

	@JSONField(name = "CompanyName")
	public String getCompanyName() {
		return get("CompanyName");
	}

	@JSONField(name = "Identifier")
	public void setIdentifier(String Identifier) {
		set("Identifier", Identifier);
	}

	@JSONField(name = "Identifier")
	public String getIdentifier() {
		return get("Identifier");
	}

	@JSONField(name = "Address")
	public void setAddress(Integer Address) {
		set("Address", Address);
	}

	@JSONField(name = "Address")
	public Integer getAddress() {
		return get("Address");
	}

	@JSONField(name = "BusinessScope")
	public void setBusinessScope(String BusinessScope) {
		set("BusinessScope", BusinessScope);
	}

	@JSONField(name = "BusinessScope")
	public String getBusinessScope() {
		return get("BusinessScope");
	}

	@JSONField(name = "ContactAddress")
	public void setContactAddress(String ContactAddress) {
		set("ContactAddress", ContactAddress);
	}

	@JSONField(name = "ContactAddress")
	public String getContactAddress() {
		return get("ContactAddress");
	}

	@JSONField(name = "EconomicType")
	public void setEconomicType(String EconomicType) {
		set("EconomicType", EconomicType);

	}

	@JSONField(name = "EconomicType")
	public String getEconomicType() {
		return get("EconomicType");
	}

	@JSONField(name = "RegCapital")
	public void setRegCapital(String RegCapital) {
		set("RegCapital", RegCapital);
	}

	@JSONField(name = "RegCapital")
	public String getRegCapital() {
		return get("RegCapital");
	}

	@JSONField(name = "LegalName")
	public void setLegalName(String LegalName) {
		set("LegalName", LegalName);
	}

	@JSONField(name = "LegalName")
	public String getLegalName() {
		return get("LegalName");
	}

	@JSONField(name = "LegalID")
	public void setLegalID(String LegalID) {
		set("LegalID", LegalID);
	}

	@JSONField(name = "LegalID")
	public String getLegalID() {
		return get("LegalID");
	}

	@JSONField(name = "LegalPhone")
	public void setLegalPhone(String LegalPhone) {
		set("LegalPhone", LegalPhone);
	}

	@JSONField(name = "LegalPhone")
	public String getLegalPhone() {
		return get("LegalPhone");
	}

	@JSONField(name = "LegalPhoto")
	public void setLegalPhoto(String LegalPhoto) {
		set("LegalPhoto", LegalPhoto);
	}

	@JSONField(name = "LegalPhoto")
	public String getLegalPhoto() {
		return get("LegalPhoto");
	}

	@JSONField(name = "State")
	public void setState(Integer State) {
		set("State", State);
	}

	@JSONField(name = "State")
	public Integer getState() {
		return get("State");
	}

	@JSONField(name = "Flag")
	public void setFlag(Integer Flag) {
		set("Flag", Flag);
	}

	@JSONField(name = "Flag")
	public Integer getFlag() {
		return get("Flag");
	}

	@JSONField(name = "UpdateTime")
	public void setUpdateTime(Long UpdateTime) {
		set("UpdateTime", UpdateTime);
	}

	@JSONField(name = "UpdateTime")
	public Long getUpdateTime() {
		return get("UpdateTime");
	}

}