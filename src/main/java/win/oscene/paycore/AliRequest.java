package win.oscene.paycore;

/**
 * @author Sorata  2018/12/3 9:48
 */
public class AliRequest extends AbstractRequest {


	private String body;


	public AliRequest(){
		this.setPayType("ali");
	}

	public AliRequest(String appId, String orderId, String subject, String body,
	                  Float price, String notifyUrl){
		this.setBody(body);
		this.setAppId(appId);
		this.setNotifyUrl(notifyUrl);
		this.setOrderId(orderId);
		this.setPrice(price);
		this.setSubject(subject);
		this.setPayType("ali");
	}


	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}



}
