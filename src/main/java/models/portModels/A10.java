package models.portModels;

import annotation.TableBind;
import base.portModels.BaseA10;

import java.util.List;

/**
 * Generated by JFinal.
 */
@TableBind(tableName = "A10")
public class A10 extends BaseA10<A10> {
	public static final A10 dao = new A10();
	public List<A10> findCompany(){
		return  find("Select * from A10");
	}
}