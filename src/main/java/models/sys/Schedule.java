package models.sys;


import annotation.TableBind;
import base.Constant;
import base.models.BaseSchedule;
import com.jfinal.plugin.activerecord.Db;
import plugin.sqlInXml.SqlManager;

/**
 * Generated by JFinal.
 */
@TableBind(tableName = "dele_schedule")
public class Schedule extends BaseSchedule<Schedule> {
	public static final Schedule dao = new Schedule();

	//查询待办事项
	public Schedule findByOrderId(int id){
		return findFirst(SqlManager.sql("schedule.findByOrderId"),id);
	}


	//更改待办事项状态
	public int updateByOrderId(int id){
		return Db.update("update dele_schedule set status = ? where orderId = ?", Constant.ScheduleStatus.finish, id);
	}

	//获取待办事项数目
	public int findScheduleCount() {
		Number c = findFirst(SqlManager.sql("schedule.findScheduleCount"), Constant.ScheduleStatus.wait).getNumber("c");
		return c == null ? 0 : c.intValue();
	}
}
