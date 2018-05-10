package com.jobcard.management.dto;

import java.io.Serializable;
import java.util.Date;

public class JobCardDto implements Serializable{

	private static final long serialVersionUID = -5329532590117941786L;

	private Integer jobId;
	private String productType;
	private String productBrand;
	private String productModelNo;
	private String jobDescription;
	private Date jobCreateDate;
	private Date approxJobCompleteDate;
	private String contactPersonName;
	private String contactPersonmobile;
	private String contactPersonAddress;
	private String contactPersonEmail;
	private String jobStatus;
	private String clientRemark;
	private String serviceEngineerStatus;
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
	public String getContactPersonmobile() {
		return contactPersonmobile;
	}
	public void setContactPersonmobile(String contactPersonmobile) {
		this.contactPersonmobile = contactPersonmobile;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
