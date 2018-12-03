package win.oscene.paycore;

import java.util.Map;

/**
 * @author Sorata  2018/12/3 10:46
 */
public class WxCheckRequest extends CheckRequest {

	public WxCheckRequest(){
		this.setPayType("wx");
	}

	public WxCheckRequest(Map<String, String> map, String appId){
		this.setAppId(appId);
		this.setMap(map);
		this.setPayType("wx");
	}

}
