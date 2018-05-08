package com.szit.arbitrate.client.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hsit.common.kfbase.entity.DomainEntity;

/**
 * 
* @ClassName: ClientNotOnlineNotify  
* @Description:召集被申述人未回复通知实体   
* @author   
* @date 2017年6月16日 下午2:57:26  
* @Copyright
* @versions:1.0 
*
 */
@JsonIgnoreProperties({"name","description","displayOrder","createTime"})
public class ClientNotOnlineNotify extends DomainEntity{
	
	private String clientId;//用户id
	private String clientName;//用户姓名
	private Date gatherTime;//召集时间
	
	private String caseId;//案件id
	private String caseExplain;//案件申述点
	private String mediatorClientId;//调解员id
	
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public Date getGatherTime() {
		return gatherTime;
	}
	public void setGatherTime(Date gatherTime) {
		this.gatherTime = gatherTime;
	}
	
	public String getCaseId() {
		return caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	public String getCaseExplain() {
		return caseExplain;
	}
	public void setCaseExplain(String caseExplain) {
		this.caseExplain = caseExplain;
	}
	public String getMediatorClientId() {
		return mediatorClientId;
	}
	public void setMediatorClientId(String mediatorClientId) {
		this.mediatorClientId = mediatorClientId;
	}

}
