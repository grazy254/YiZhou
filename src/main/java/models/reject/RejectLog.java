package models.reject;


import annotation.TableBind;
import base.models.BaseRejectLog;
import kits.StringsKit;
import plugin.sqlInXml.SqlManager;

import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
@TableBind(tableName = "reject_log")
public class RejectLog extends BaseRejectLog<RejectLog> {
    public static final RejectLog dao = new RejectLog();
    
    public RejectLog findRejectLog(int orderId, int driverId) {
        return findFirst("select * from reject_log where order_id=" + orderId + " and  driver_id = " + driverId);
    }
    
    
    /**
     * 查看订单推送给信息
     *
     * @return
     */
    public List<RejectLog> findRejectLogList(int orderId) {
        String where = " and order_id = " + orderId;
        try {
            return find(StringsKit.replaceSql(SqlManager.sql("rejectLog.driverFavorableRate"), where));
        } catch (NullPointerException e) {
            return null;
        }
    }
}