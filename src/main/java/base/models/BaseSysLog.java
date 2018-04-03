package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysLog<M extends BaseSysLog<M>> extends Model<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setUrl(String url) {
		set("url", url);
	}

	public String getUrl() {
		return get("url");
	}

	public void setParams(String params) {
		set("params", params);
	}

	public String getParams() {
		return get("params");
	}

	public void setOperater(Integer operater) {
		set("operater", operater);
	}

	public Integer getOperater() {
		return get("operater");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setRemark(String remark) {
		set("remark", remark);
	}

	public String getRemark() {
		return get("remark");
	}

	public void setIpAddress(String ipAddress) {
		set("ip_address", ipAddress);
	}

	public String getIpAddress() {
		return get("ip_address");
	}

}