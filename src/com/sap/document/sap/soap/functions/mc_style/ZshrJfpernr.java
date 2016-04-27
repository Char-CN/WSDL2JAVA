
package com.sap.document.sap.soap.functions.mc_style;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * ZshrJfpernr complex type的 Java 类。
 * 
 * <p>
 * 以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ZshrJfpernr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pernr" type="{urn:sap-com:document:sap:rfc:functions}numeric8"/&gt;
 *         &lt;element name="Nachn" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Orgeh" type="{urn:sap-com:document:sap:rfc:functions}numeric8"/&gt;
 *         &lt;element name="Orgtx" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Zopath" type="{urn:sap-com:document:sap:rfc:functions}char200"/&gt;
 *         &lt;element name="Stat2" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Text1" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Werks" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Name1" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Plans" type="{urn:sap-com:document:sap:rfc:functions}numeric8"/&gt;
 *         &lt;element name="Plstx" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Ictyp" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Ictxt" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Icnum" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Email" type="{urn:sap-com:document:sap:rfc:functions}char132"/&gt;
 *         &lt;element name="Zmtel" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Zotel" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Emsid" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZshrJfpernr", propOrder = { "pernr", "nachn", "orgeh", "orgtx", "zopath", "stat2", "text1", "werks", "name1", "plans", "plstx", "ictyp",
		"ictxt", "icnum", "email", "zmtel", "zotel", "emsid" })
public class ZshrJfpernr {

	public final static String DILIMITER = "\t";
	/** 人员号 */
	@XmlElement(name = "Pernr", required = true)
	protected String pernr;
	/** 员工姓名 */
	@XmlElement(name = "Nachn", required = true)
	protected String nachn;
	/** 组织单位 */
	@XmlElement(name = "Orgeh", required = true)
	protected String orgeh;
	/** 组织单位短文本 */
	@XmlElement(name = "Orgtx", required = true)
	protected String orgtx;
	/** 组织全路径 */
	@XmlElement(name = "Zopath", required = true)
	protected String zopath;
	/** 雇佣状态 */
	@XmlElement(name = "Stat2", required = true)
	protected String stat2;
	/** 雇佣状态描述 */
	@XmlElement(name = "Text1", required = true)
	protected String text1;
	/** 人事范围 */
	@XmlElement(name = "Werks", required = true)
	protected String werks;
	/** 人事范围文本 */
	@XmlElement(name = "Name1", required = true)
	protected String name1;
	/** 职位 */
	@XmlElement(name = "Plans", required = true)
	protected String plans;
	/** 职位描述 */
	@XmlElement(name = "Plstx", required = true)
	protected String plstx;
	/** 标识类型 (IC 类型) */
	@XmlElement(name = "Ictyp", required = true)
	protected String ictyp;
	/** IC描述 */
	@XmlElement(name = "Ictxt", required = true)
	protected String ictxt;
	/** 标识编号 */
	@XmlElement(name = "Icnum", required = true)
	protected String icnum;
	/** 邮箱 */
	@XmlElement(name = "Email", required = true)
	protected String email;
	/** 手机 */
	@XmlElement(name = "Zmtel", required = true)
	protected String zmtel;
	/** 办公电话 */
	@XmlElement(name = "Zotel", required = true)
	protected String zotel;
	/** EMS用户ID */
	@XmlElement(name = "Emsid", required = true)
	protected String emsid;

	/**
	 * 获取pernr属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPernr() {
		return pernr;
	}

	/**
	 * 设置pernr属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPernr(String value) {
		this.pernr = value;
	}

	/**
	 * 获取nachn属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNachn() {
		return nachn;
	}

	/**
	 * 设置nachn属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNachn(String value) {
		this.nachn = value;
	}

	/**
	 * 获取orgeh属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOrgeh() {
		return orgeh;
	}

	/**
	 * 设置orgeh属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOrgeh(String value) {
		this.orgeh = value;
	}

	/**
	 * 获取orgtx属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOrgtx() {
		return orgtx;
	}

	/**
	 * 设置orgtx属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOrgtx(String value) {
		this.orgtx = value;
	}

	/**
	 * 获取zopath属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZopath() {
		return zopath;
	}

	/**
	 * 设置zopath属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setZopath(String value) {
		this.zopath = value;
	}

	/**
	 * 获取stat2属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStat2() {
		return stat2;
	}

	/**
	 * 设置stat2属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStat2(String value) {
		this.stat2 = value;
	}

	/**
	 * 获取text1属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getText1() {
		return text1;
	}

	/**
	 * 设置text1属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setText1(String value) {
		this.text1 = value;
	}

	/**
	 * 获取werks属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWerks() {
		return werks;
	}

	/**
	 * 设置werks属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWerks(String value) {
		this.werks = value;
	}

	/**
	 * 获取name1属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName1() {
		return name1;
	}

	/**
	 * 设置name1属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName1(String value) {
		this.name1 = value;
	}

	/**
	 * 获取plans属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPlans() {
		return plans;
	}

	/**
	 * 设置plans属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPlans(String value) {
		this.plans = value;
	}

	/**
	 * 获取plstx属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPlstx() {
		return plstx;
	}

	/**
	 * 设置plstx属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPlstx(String value) {
		this.plstx = value;
	}

	/**
	 * 获取ictyp属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIctyp() {
		return ictyp;
	}

	/**
	 * 设置ictyp属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIctyp(String value) {
		this.ictyp = value;
	}

	/**
	 * 获取ictxt属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIctxt() {
		return ictxt;
	}

	/**
	 * 设置ictxt属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIctxt(String value) {
		this.ictxt = value;
	}

	/**
	 * 获取icnum属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIcnum() {
		return icnum;
	}

	/**
	 * 设置icnum属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIcnum(String value) {
		this.icnum = value;
	}

	/**
	 * 获取email属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置email属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEmail(String value) {
		this.email = value;
	}

	/**
	 * 获取zmtel属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZmtel() {
		return zmtel;
	}

	/**
	 * 设置zmtel属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setZmtel(String value) {
		this.zmtel = value;
	}

	/**
	 * 获取zotel属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZotel() {
		return zotel;
	}

	/**
	 * 设置zotel属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setZotel(String value) {
		this.zotel = value;
	}

	/**
	 * 获取emsid属性的值。
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEmsid() {
		return emsid;
	}

	/**
	 * 设置emsid属性的值。
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEmsid(String value) {
		this.emsid = value;
	}

	public void clearChar() {
		this.pernr = this.pernr.replace("\r", "").replace("\n", "").replace("\t", "");
		this.nachn = this.nachn.replace("\r", "").replace("\n", "").replace("\t", "");
		this.orgeh = this.orgeh.replace("\r", "").replace("\n", "").replace("\t", "");
		this.orgtx = this.orgtx.replace("\r", "").replace("\n", "").replace("\t", "");
		this.zopath = this.zopath.replace("\r", "").replace("\n", "").replace("\t", "");
		this.stat2 = this.stat2.replace("\r", "").replace("\n", "").replace("\t", "");
		this.text1 = this.text1.replace("\r", "").replace("\n", "").replace("\t", "");
		this.werks = this.werks.replace("\r", "").replace("\n", "").replace("\t", "");
		this.name1 = this.name1.replace("\r", "").replace("\n", "").replace("\t", "");
		this.plans = this.plans.replace("\r", "").replace("\n", "").replace("\t", "");
		this.plstx = this.plstx.replace("\r", "").replace("\n", "").replace("\t", "");
		this.ictyp = this.ictyp.replace("\r", "").replace("\n", "").replace("\t", "");
		this.ictxt = this.ictxt.replace("\r", "").replace("\n", "").replace("\t", "");
		this.icnum = this.icnum.replace("\r", "").replace("\n", "").replace("\t", "");
		this.email = this.email.replace("\r", "").replace("\n", "").replace("\t", "");
		this.zmtel = this.zmtel.replace("\r", "").replace("\n", "").replace("\t", "");
		this.zotel = this.zotel.replace("\r", "").replace("\n", "").replace("\t", "");
		this.emsid = this.emsid.replace("\r", "").replace("\n", "").replace("\t", "");
	}

	@Override
	public String toString() {
		// return pernr + " " + nachn + " " + orgeh + " " + orgtx + " " + zopath
		// + " " + stat2 + " " + text1 + " " + werks + " " + name1 + " " + plans
		// + " " + plstx + " " + ictyp + " " + ictxt + " " + icnum + " " + email
		// + " " + zmtel + " " + zotel + " " + emsid;
		//return pernr + DILIMITER + nachn + DILIMITER + name1 + DILIMITER + orgtx + DILIMITER + ictxt + DILIMITER + icnum;
		//     人员编号	           姓名	               人事范围	           人事范围文本	       组织单位	           组织单位名称	       IC标识类型 (IC 类型)   身份证号	           手机号	               邮箱	               办公电话	           EMS号
		return pernr + DILIMITER + nachn + DILIMITER + werks + DILIMITER + name1 + DILIMITER + orgeh + DILIMITER + orgtx + DILIMITER + ictyp + DILIMITER + ictxt + DILIMITER + zmtel + DILIMITER + email + DILIMITER + zotel + DILIMITER + emsid;
	}

	public String toFields() {
		return "pernr" + DILIMITER + "nachn" + DILIMITER  + "orgeh" + DILIMITER  + "orgtx" + DILIMITER       + "zopath" + DILIMITER   + "stat2" + DILIMITER  + "text1" + DILIMITER      + "werks" + DILIMITER  + "name1" + DILIMITER     + "plans" + DILIMITER + "plstx" + DILIMITER + "ictyp" + DILIMITER           + "ictxt" + DILIMITER + "icnum" + DILIMITER   + "email" + DILIMITER + "zmtel" + DILIMITER + "zotel" + DILIMITER + "emsid";
	}

	public String toFieldsInfo() {
		return "人员号" + DILIMITER + "员工姓名" + DILIMITER + "组织单位" + DILIMITER + "组织单位短文本" + DILIMITER + "组织全路径" + DILIMITER + "雇佣状态" + DILIMITER + "雇佣状态描述" + DILIMITER + "人事范围" + DILIMITER + "人事范围文本" + DILIMITER + "职位" + DILIMITER + "职位描述" + DILIMITER + "标识类型 (IC 类型)" + DILIMITER + "IC描述" + DILIMITER + "标识编号" + DILIMITER + "邮箱" + DILIMITER + "手机" + DILIMITER + "办公电话" + DILIMITER + "EMS用户ID";
	}

	public String toStringAll() {
		return pernr   + DILIMITER + nachn    + DILIMITER + orgeh + DILIMITER     + orgtx + DILIMITER        + zopath + DILIMITER     + stat2 + DILIMITER    + text1 + DILIMITER        + werks + DILIMITER     + name1 + DILIMITER       + plans + DILIMITER + plstx + DILIMITER     + ictyp + DILIMITER             + ictxt + DILIMITER   + icnum + DILIMITER    + email + DILIMITER + zmtel + DILIMITER + zotel + DILIMITER     + emsid;
	}

}
