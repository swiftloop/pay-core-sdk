package win.oscene.paycore;

/**
 * @author Sorata  2018/12/3 10:16
 */
public class WxRequest extends AbstractRequest {

	private String ip;



	public WxRequest(){
		this.setPayType("wx");
	}

	public WxRequest(String appId, String orderId, String subject, String ip,
	                  Float price, String notifyUrl){
		this.setIp(ip);
		this.setAppId(appId);
		this.setNotifyUrl(notifyUrl);
		this.setOrderId(orderId);
		this.setPrice(price);
		this.setSubject(subject);
		this.setPayType("ali");
	}



	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
}
