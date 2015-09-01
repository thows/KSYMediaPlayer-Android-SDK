package com.ksy.media.player.log;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import android.text.TextUtils;

public class LogRecord {
	
	private String cpu;
	private String memory;
	private String core;
	private String device;
	private String uuid;
	private String system;
	private String net;
	private String gmt;
	private long date;
	private String userAgent;
	private String deviceIp;
	private String serverIp; //TODO
	private String cpuUsage;
	private String memoryUsage;
	private long firstFrameTime;
	private int cacheBufferSize;
//	private long seekBegin;
//	private long seekEnd;
	private String seekStatus;
	private String seekMessage;
	private String playStatus;
	private String playMetaData; //TODO
	

	private static LogRecord mInstance;
	private static Object mLockObject = new Object();
	
	public static LogRecord getInstance() {
		if (null == mInstance) {
			synchronized (mLockObject) {
				if (null == mInstance) {
					mInstance = new LogRecord();
				}
			}
		}
		return mInstance;
	}
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getCore() {
		return core;
	}

	public void setCore(String core) {
		this.core = core;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getNet() {
		return net;
	}

	public void setNet(String net) {
		this.net = net;
	}

	public String getGmt() {
		return gmt;
	}

	public void setGmt(String gmt) {
		this.gmt = gmt;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getDeviceIp() {
		return deviceIp;
	}

	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public String getCpuUsage() {
		return cpuUsage;
	}

	public void setCpuUsage(String cpuUsage) {
		this.cpuUsage = cpuUsage;
	}

	public String getMemoryUsage() {
		return memoryUsage;
	}

	public void setMemoryUsage(String memoryUsage) {
		this.memoryUsage = memoryUsage;
	}

	public long getFirstFrameTime() {
		return firstFrameTime;
	}

	public void setFirstFrameTime(long firstFrameTime) {
		this.firstFrameTime = firstFrameTime;
	}

	public int getCacheBufferSize() {
		return cacheBufferSize;
	}

	public void setCacheBufferSize(int cacheBufferSize) {
		this.cacheBufferSize = cacheBufferSize;
	}

	/*public long getSeekBegin() {
		return seekBegin;
	}

	public void setSeekBegin(long seekBegin) {
		this.seekBegin = seekBegin;
	}

	public long getSeekEnd() {
		return seekEnd;
	}

	public void setSeekEnd(long seekEnd) {
		this.seekEnd = seekEnd;
	}*/

	public String getSeekStatus() {
		return seekStatus;
	}

	public void setSeekStatus(String seekStatus) {
		this.seekStatus = seekStatus;
	}

	public String getSeekMessage() {
		return seekMessage;
	}

	public void setSeekMessage(String seekMessage) {
		this.seekMessage = seekMessage;
	}

	public String getPlayStatus() {
		return playStatus;
	}

	public void setPlayStatus(String playStatus) {
		this.playStatus = playStatus;
	}

	public String getPlayMetaData() {
		return playMetaData;
	}

	public void setPlayMetaData(String playMetaData) {
		this.playMetaData = playMetaData;
	}


	/*public void copyRecord(LogRecord record) {
		setCpu(record.getCpu());
		setMemory(record.getMemory());
		setCore(record.getCore());
		setDevice(record.getDevice());
		setUuid(record.getUuid());
		setSystem(record.getSystem());
		setNet(record.getNet());
		setGmt(record.getGmt());
		setDate(record.getDate());
		setUserAgent(record.getUserAgent());
		setDeviceIp(record.getDeviceIp());
		setServerIp(record.getServerIp());
		setCpuUsage(record.getCpuUsage());
		setMemoryUsage(record.getMemoryUsage());
		setFirstFrameTime(record.getFirstFrameTime());
		setCacheBufferSize(record.getCacheBufferSize());
        setSeekBegin(record.getSeekBegin());
        setSeekEnd(record.getSeekEnd());
        setSeekStatus(record.getSeekStatus());
        setSeekMessage(record.getSeekMessage());
        setSeekStatus(record.getPlayStatus());
        setPlayMetaData(record.getPlayMetaData());
	}*/

	
/*	@Override
	public String toString() {
		JSONObject object = new JSONObject();
		checkValue();
		try {
			// Source Ip
			object.put("SI", source_ip);
			// Target Ip
			object.put("TI", target_ip);
			// IMEI
			object.put("ID", id);
			// Network Type
			object.put("NT", connect_type);
			// Send Time
			object.put("ST", String.valueOf(getSend_before_time()));
			// First Data Time
			object.put("FT", getSend_first_data_time());
			// Response Time
			object.put("RT", String.valueOf(getSend_complete_time()));
			// Response Size
			// Client State
			object.put("CS", client_state);
			// Error
			object.put("ER", error);
			// Request Id
			object.put("RI", requestId);
			// Connect Type
			object.put("CT", network_type);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return object.toString();
	}

	private void checkValue() {
		if (TextUtils.isEmpty(source_ip)) {
			source_ip = "";
		}
		if (TextUtils.isEmpty(target_ip)) {
			target_ip = "";
		}if (TextUtils.isEmpty(id)) {
			id = "";
		}if (TextUtils.isEmpty(connect_type)) {
			connect_type = "";
		}if (TextUtils.isEmpty(client_state)) {
			client_state = "";
		}if (TextUtils.isEmpty(error)) {
			error = "";
		}if (TextUtils.isEmpty(requestId)) {
			requestId = "";
		}if (TextUtils.isEmpty(network_type)) {
			network_type = "";
		}
	}

	public Map<String, String> toHashMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("LogSourceIp", getSource_ip());
		map.put("LogTargetIp", getTarget_ip());
		map.put("LogModel", getModel());
		map.put("LogManufacturer", getManufacturer());
		map.put("LogBuildVersion", getBuild_version());
		map.put("LogDeviceId", getId());
		map.put("LogNetworkType", getConnect_type());
		map.put("LogClientState", getClient_state());
		map.put("LogMobileNetworkType", getNetwork_type());
		map.put("LogError", getError());
		map.put("LogRequestId", getRequestId());
		return map;

	}*/

	
	//"{\"_id\":\"uuid\",\"date\":\"date\",\"type\":\"101\",\"cpu\":\"cpu\",\"memory\":\"memory\",\"core\":\"core\",\"device\":\"device\",\"system\":\"system\",\"userAgent\":\"userAgent\",\"gmt\":\"gmt\"}"
	public String getBaseDataJson() {
      JSONObject obj = new JSONObject();
        
	    try {
			obj.put("_id", getUuid());
			obj.put("date", getDate()); //TODO
		    obj.put("type", "101");
		    obj.put("cpu", getCpu());
		    obj.put("memory", getMemory());
		    obj.put("core", getCore());
		    obj.put("device", getDevice());
		    obj.put("system", getSystem());
		    obj.put("userAgent", getUserAgent());
		    obj.put("gmt", getGmt());
		    
		} catch (JSONException e) {
			e.printStackTrace();
		}
	    
		return obj.toString();
	}
	
	public String getBaseDataEndJson() {
      JSONObject obj = new JSONObject();
        
	    try {
			obj.put("_id", getUuid());
			obj.put("date", getDate()); //TODO
		    obj.put("type", "103");
		    obj.put("cpu", getCpu());
		    obj.put("memory", getMemory());
		    obj.put("core", getCore());
		    obj.put("device", getDevice());
		    obj.put("system", getSystem());
		    obj.put("userAgent", getUserAgent());
		    obj.put("gmt", getGmt());
		    
		} catch (JSONException e) {
			e.printStackTrace();
		}
	    
		return obj.toString();
	}
	
	//"{\"_id\":\"uuid\",\"date\":\"date\",\"type\":\"102\",\"playStatus\":\"playStatus\",\"gmt\":\"gmt\"}"
	public String getPlayStatusJson() {
       JSONObject obj = new JSONObject();
        
	    try {
			obj.put("_id", getUuid());
			obj.put("date", getDate()); //TODO
		    obj.put("type", "102");
		    obj.put("playStatus", getPlayStatus());
		    obj.put("gmt", getGmt());
		    
		} catch (JSONException e) {
			e.printStackTrace();
		}
	    
		return obj.toString();
	}
	
	//"{\"_id\":\"uuid\",\"date\":\"date\",\"type\":\"103\",\"firstFrameTime\":\"firstFrameTime\",\"playMetaData\":\"playMetaData\",\"gmt\":\"gmt\"}"
	public String getFirstFrameTimeJson() {
       JSONObject obj = new JSONObject();
        
	    try {
			obj.put("_id", getUuid());
			obj.put("date", getDate());
		    obj.put("type", "102");
		    obj.put("firstFrameTime", getFirstFrameTime());
		    obj.put("cacheBufferSize", getCacheBufferSize()); //String.valueOf(getCacheBufferSize())
		    obj.put("playMetaData", getPlayMetaData());
		    obj.put("gmt", getGmt());
		    
		} catch (JSONException e) {
			e.printStackTrace();
		}
	    
		return obj.toString();
	}
	
	
	//"{\"_id\":\"uuid\",\"date\":\"date\",\"type\":\"200\",\"field\":\"net\",\"net\":\"net\",\"deviceIp\":\"deviceIp\",\"serverIp\":\"serverIp\",\"gmt\":\"gmt\"}"
	public String getNetStateJson() {
       JSONObject obj = new JSONObject();
        
	    try {
			obj.put("_id", getUuid());
			obj.put("date", getDate());
		    obj.put("type", "200");
		    obj.put("field", "net");
		    obj.put("net", getNet());
		    obj.put("deviceIp", getDeviceIp());
		    obj.put("serverIp", getServerIp());
		    obj.put("gmt", getGmt());
		    
		} catch (JSONException e) {
			e.printStackTrace();
		}
	    
		return obj.toString();
	}
	
	
	//"{\"_id\":\"uuid\",\"date\":\"date\",\"type\":\"200\",\"field\":\"usage\",\"deviceUsage\":\"{"cpuUsage":"cpuUsage","memoryUsage":"memoryUsage"}\",\"gmt\":\"gmt\"}" 
	public String getCapabilityJson() {
		JSONObject obj = new JSONObject();
		
		try {
			obj.put("_id", getUuid());
			obj.put("date", getDate());
			obj.put("type", "200");
			obj.put("field", "usage");
//			obj.put("deviceUsage", getCurrentUsage());
			obj.put("cpuUsage", getCpuUsage());
			obj.put("memoryUsage", getMemoryUsage());
			obj.put("gmt", getGmt());
			    
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return obj.toString();
	}
	
	/*private Object getCurrentUsage() {
        JSONObject obj = new JSONObject();
        
	    try {
			obj.put("cpuUsage", getCpuUsage());
			obj.put("memoryUsage", getMemoryUsage());
		    
		} catch (JSONException e) {
			e.printStackTrace();
		}
	    
		return obj;
	}*/
	
	//"{\"_id\":\"uuid\",\"date\":\"date\",\"type\":\"201\",\"field\":\"seekbegin\",\"seekBegin\":\"seekBegin\",\"gmt\":\"gmt\"}"
	public String getSeekBeginJson() {
        JSONObject obj = new JSONObject();
        
	    try {
			obj.put("_id", getUuid());
			obj.put("date", getDate());
		    obj.put("type", "201");
		    obj.put("field", "seek");
//		    obj.put("seekBegin", getSeekBegin()); //String.valueOf(getSeekBegin())
		    obj.put("gmt", getGmt());
		    
		} catch (JSONException e) {
			e.printStackTrace();
		}
	    
		return obj.toString();
	}
	
	//"{\"_id\":\"uuid\",\"date\":\"date\",\"type\":\"202\",\"field\":\"seekend\",\"seekEnd\":\"seekEnd\",\"gmt\":\"gmt\"}"
	public String getSeekEndJson() {
        JSONObject obj = new JSONObject();
        
	    try {
			obj.put("_id", getUuid());
			obj.put("date", getDate());
		    obj.put("type", "203");
		    obj.put("field", "seek");
		    obj.put("Status", getSeekStatus());
		    obj.put("Message", getSeekMessage());
//		    obj.put("seekEnd", getSeekEnd());
		    obj.put("gmt", getGmt());
		    
		} catch (JSONException e) {
			e.printStackTrace();
		}
	    
		return obj.toString();
	}
	
	//"{\"_id\":\"uuid\",\"date\":\"date\",\"type\":\"200\",\"field\":\"seekrecord\",\"seekStatus\":\"seekStatus\",\"gmt\":\"gmt\"}"
	/*public String getSeekStateJson() {
        JSONObject obj = new JSONObject();
        
	    try {
			obj.put("_id", getUuid());
			obj.put("date", getDate());
		    obj.put("type", "200");
		    obj.put("field", "seekrecord");
		    obj.put("seekStatus", getSeekStatus());
		    obj.put("gmt", getGmt());
		    
		} catch (JSONException e) {
			e.printStackTrace();
		}
	    
		return obj.toString();
	}*/

	//"{\"_id\":\"uuid\",\"date\":\"date\",\"type\":\"200\",\"field\":\"seekdetail\",\"seekMessage\":\"seekMessage\",\"gmt\":\"gmt\"}"
	/*public String getSeekDetailJson() {
        JSONObject obj = new JSONObject();
        
	    try {
			obj.put("_id", getUuid());
			obj.put("date", getDate());
		    obj.put("type", "200");
		    obj.put("field", "seekdetail");
		    obj.put("seekMessage", getSeekMessage());
		    obj.put("gmt", getGmt());
		    
		} catch (JSONException e) {
			e.printStackTrace();
		}
	    
		return obj.toString();
	}*/
	
	
}

