package com.jobcard.management.helper;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="JOB_CARD_DETAILS")
public class JobCardEntity {

	@Column(name="JOB_ID")
	private Integer jobId;
	@Column(name="PRODUCT_TYPE")
	private String productType;
	@Column(name="PRODUCT_BRAND")
	private String productBrand;
	@Column(name="PRODUCT_MODEL_NO")
	private String productModelNo;
	@Column(name="JOB_DESCRIPTION")
	private String jobDescription;
	@Column(name="JOB_CREATE_DATE")
	private Date jobCreateDate;
	@Column(name="APPROX_JOB_COMPLETE_DATE")
	private Date approxJobCompleteDate;
	@Column(name="CONTACT_PERSON_NAME")
	private String contactPersonName;
	@Column(name="CONTACT_PERSON_MOBILE")
	private String contactPersonMobile;
	@Column(name="CONTACT_PERSON_ADDRESS")
	private String contactPersonAddress;
	@Column(name="CONTACT_PERSON_EMAIL")
	private String contactPersonEmail;
	@Column(name="JOB_STATUS")
	private String jobStatus;
	@Column(name="CLIENT_REMARK")
	private String clientRemark;
	@Column(name="SERVICE_ENGINEER_STATUS")
	private String serviceEngineerStatus;
	@Column(name="SERVICE_ENGINEER_REMARK")
	private String serviceEngineerRemark;

	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public String getProductModelNo() {
		return productModelNo;
	}
	public void setProductModelNo(String productModelNo) {
		this.productModelNo = productModelNo;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public Date getJobCreateDate() {
		return jobCreateDate;
	}
	public void setJobCreateDate(Date jobCreateDate) {
		this.jobCreateDate = jobCreateDate;
	}
	public Date getApproxJobCompleteDate() {
		return approxJobCompleteDate;
	}
	public void setApproxJobCompleteDate(Date approxJobCompleteDate) {
		this.approxJobCompleteDate = approxJobCompleteDate;
	}
	public String getContactPersonName() {
		return contactPersonName;
	}
	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}
	public String getContactPersonMobile() {
		return contactPersonMobile;
	}
	public void setContactPersonMobile(String contactPersonMobile) {
		this.contactPersonMobile = contactPersonMobile;
	}
	public String getContactPersonAddress() {
		return contactPersonAddress;
	}
	public void setContactPersonAddress(String contactPersonAddress) {
		this.contactPersonAddress = contactPersonAddress;
	}
	public String getContactPersonEmail() {
		return contactPersonEmail;
	}
	public void setContactPersonEmail(String contactPersonEmail) {
		this.contactPersonEmail = contactPersonEmail;
	}
	public String getJobStatus() {
		return jobStatus;
	}
	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}
	public String getClientRemark() {
		return clientRemark;
	}
	public void setClientRemark(String clientRemark) {
		this.clientRemark = clientRemark;
	}
	public String getServiceEngineerStatus() {
		return serviceEngineerStatus;
	}
	public void setServiceEngineerStatus(String serviceEngineerStatus) {
		this.serviceEngineerStatus = serviceEngineerStatus;
	}
	public String getServiceEngineerRemark() {
		return serviceEngineerRemark;
	}
	public void setServiceEngineerRemark(String serviceEngineerRemark) {
		this.serviceEngineerRemark = serviceEngineerRemark;
	}
	
}
