package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTaskScheduler<M extends BaseTaskScheduler<M>> extends Model<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setTaskName(String taskName) {
		set("task_name", taskName);
	}

	public String getTaskName() {
		return get("task_name");
	}

	public void setExecutionNum(Integer executionNum) {
		set("execution_num", executionNum);
	}

	public Integer getExecutionNum() {
		return get("execution_num");
	}

	public void setLastExecutionTime(java.util.Date lastExecutionTime) {
		set("last_execution_time", lastExecutionTime);
	}

	public java.util.Date getLastExecutionTime() {
		return get("last_execution_time");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

}