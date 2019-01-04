package com.szit.arbitrate.api.chat.controller;

import com.szit.arbitrate.api.common.vm.ApiOutParamsVm;

public interface ApiChatMessageController {
	
	/**
	 * 
	* @Title: getMessageListByClientAndPage 
	* @param @param sendclientid
	* @param @param recclientid
	* @param @param page
	* @param @return
	* @return ApiOutParamsVm 
	* @throws
	 */
	public ApiOutParamsVm getMessageListByClientAndPage(String sendclientid,
			String recid, String rectype, Integer page,String content,String caseid);

	/**
	 * 
	* @Title: uploadMediaResource 
	* @param @param clientid
	* @param @param restype
	* @param @return
	* @return ApiOutParamsVm 
	* @throws
	 */
	public ApiOutParamsVm uploadMediaResource(String clientid, String restype);
	
	/**
	 * 
	* @Title: sendMediaMessage 
	* @param @param sendclientid
	* @param @param receiveid
	* @param @param rectype
	* @param @param sendfiletype
	* @param @return
	* @return ApiOutParamsVm 
	* @throws
	 */
	public ApiOutParamsVm sendMessage(String sendclientid, String receiveid, String rectype,
			String contenttype, String content, String caseid);
	
	/**
	 * 
	* @Title: revocatMessage  
	* @param @param chatmessageid
	* @param @return    设定文件  
	* @return ApiOutParamsVm    返回类型  
	* @throws
	 */
	public ApiOutParamsVm revocatMessage(String clientid, String chatmessageid);
	
	/**
	 * 
	* @Title: getConsultClientListByPage  
	* @param @param clientid
	* @param @param page
	* @param @return    设定文件  
	* @return ApiOutParamsVm    返回类型  
	* @throws
	 */
	public ApiOutParamsVm getConsultClientListByPage(Integer page);
	
	/**
	 * 
	* @Title: getMessageListByMsgIdForCounts  
	* @Description: 获取某跳条聊天记录前后各10条消息
	* @param @param chatmessageid
	* @param @return    设定文件  
	* @return ApiOutParamsVm    返回类型  
	* @throws
	 */
	public ApiOutParamsVm getMessageListByMsgIdForCounts(String chatmessageid);
	
}
