package win.oscene.paycore;

import java.util.Map;

/**
 * @author Sorata  2018/12/3 10:44
 */
public class AliCheckRequest extends CheckRequest {

	public AliCheckRequest(){
		this.setPayType("ali");
	}

	public AliCheckRequest(Map<String, String> map, String appId){
		this.setAppId(appId);
		this.setMap(map);
		this.setPayType("ali");
	}
}
