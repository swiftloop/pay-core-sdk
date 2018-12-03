package win.oscene.paycore;

import java.util.Map;

/**
 * @author Sorata  2018/10/12 15:15
 */

public abstract class CheckRequest {

	private Map<String,String> map;

	private String appId;

	private String payType;


	public String getPayType() {
		return payType;
	}

	void setPayType(String payType) {
		this.payType = payType;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}


}
