package base.portModels;

import com.alibaba.fastjson.annotation.JSONField;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseA62<M extends BaseA62<M>> extends Model<M> implements IBean {

/*    public void setId(Long id) {
        set("id", id);
    }

    public Long getId() {
        return get("id");
    }*/

    @JSONField(name = "CompanyId")
    public void setCompanyId(String CompanyId) {
        set("CompanyId", CompanyId);
    }

    @JSONField(name = "CompanyId")
    public String getCompanyId() {
        return get("CompanyId");
    }

    @JSONField(name = "Address")
    public void setAddress(Integer Address) {
        set("Address", Address);
    }

    @JSONField(name = "Address")
    public Integer getAddress() {
        return get("Address");
    }

    @JSONField(name = "RouteId")
    public void setRouteId(String RouteId) {
        set("RouteId", RouteId);
    }

    @JSONField(name = "RouteId")
    public String getRouteId() {
        return get("RouteId");
    }

    @JSONField(name = "DriverName")
    public void setDriverName(String DriverName) {
        set("DriverName", DriverName);
    }

    @JSONField(name = "DriverName")
    public String getDriverName() {
        return get("DriverName");
    }

    @JSONField(name = "DriverPhone")
    public void setDriverPhone(String DriverPhone) {
        set("DriverPhone", DriverPhone);
    }

    @JSONField(name = "DriverPhone")
    public String getDriverPhone() {
        return get("DriverPhone");
    }

    @JSONField(name = "LicenseId")
    public void setLicenseId(String LicenseId) {
        set("LicenseId", LicenseId);
    }

    @JSONField(name = "LicenseId")
    public String getLicenseId() {
        return get("LicenseId");
    }

    @JSONField(name = "VehicleNo")
    public void setVehicleNo(String VehicleNo) {
        set("VehicleNo", VehicleNo);
    }

    @JSONField(name = "VehicleNo")
    public String getVehicleNo() {
        return get("VehicleNo");
    }

    @JSONField(name = "Departure")
    public void setDeparture(String Departure) {
        set("Departure", Departure);
    }

    @JSONField(name = "Departure")
    public String getDeparture() {
        return get("Departure");
    }

    @JSONField(name = "DepLongitude")
    public void setDepLongitude(Long DepLongitude) {
        set("DepLongitude", DepLongitude);
    }

    @JSONField(name = "DepLongitude")
    public Long getDepLongitude() {
        return get("DepLongitude");
    }

    @JSONField(name = "DepLatitude")
    public void setDepLatitude(Long DepLatitude) {
        set("DepLatitude", DepLatitude);
    }

    @JSONField(name = "DepLatitude")
    public Long getDepLatitude() {
        return get("DepLatitude");
    }

    @JSONField(name = "Destination")
    public void setDestination(String Destination) {
        set("Destination", Destination);
    }

    @JSONField(name = "Destination")
    public String getDestination() {
        return get("Destination");
    }

    @JSONField(name = "DestLongitude")
    public void setDestLongitude(Long DestLongitude) {
        set("DestLongitude", DestLongitude);
    }

    @JSONField(name = "DestLongitude")
    public Long getDestLongitude() {
        return get("DestLongitude");
    }

    @JSONField(name = "DestLatitude")
    public void setDestLatitude(Long DestLatitude) {
        set("DestLatitude", DestLatitude);
    }

    @JSONField(name = "DestLatitude")
    public Long getDestLatitude() {
        return get("DestLatitude");
    }

    @JSONField(name = "Encrypt")
    public void setEncrypt(Integer Encrypt) {
        set("Encrypt", Encrypt);
    }

    @JSONField(name = "Encrypt")
    public Integer getEncrypt() {
        return get("Encrypt");
    }

    @JSONField(name = "RouteCreateTime")
    public void setRouteCreateTime(Long RouteCreateTime) {
        set("RouteCreateTime", RouteCreateTime);
    }

    @JSONField(name = "RouteCreateTime")
    public Long getRouteCreateTime() {
        return get("RouteCreateTime");
    }

    @JSONField(name = "RouteMile")
    public void setRouteMile(Long RouteMile) {
        set("RouteMile", RouteMile);
    }

    @JSONField(name = "RouteMile")
    public Long getRouteMile() {
        return get("RouteMile");
    }

    @JSONField(name = "RouteNote")
    public void setRouteNote(String RouteNote) {
        set("RouteNote", RouteNote);
    }

    @JSONField(name = "RouteNote")
    public String getRouteNote() {
        return get("RouteNote");
    }

}
