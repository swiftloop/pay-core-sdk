package win.oscene.paycore;

/**
 * @author Sorata  2018/12/3 9:48
 */
public abstract class AbstractRequest {

	private String appId;

	private String subject;

	private Float price;

	private String orderId;

	private String payType;

	private String notifyUrl;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPayType() {
		return payType;
	}

	protected void setPayType(String payType) {
		this.payType = payType;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}




	@Override
	public String toString() {
		return "AbstractRequest{" +
				"appId='" + appId + '\'' +
				", subject='" + subject + '\'' +
				", price=" + price +
				", orderId='" + orderId + '\'' +
				", payType='" + payType + '\'' +
				", notifyUrl='" + notifyUrl + '\'' +
				'}';
	}
}
