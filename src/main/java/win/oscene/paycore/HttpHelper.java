package win.oscene.paycore;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * @author Sorata  2018/10/15 15:20
 */
@Service
public class HttpHelper {


	private final RestTemplate restTemplate;



	@Autowired
	public HttpHelper(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	private ResponseData toSign(String url,String requestUri,String json, String signKey){
		String header = SignUtils.sign(requestUri, signKey);
		HttpHeaders headers = new HttpHeaders();
		headers.add("auth", header);
		headers.add("Content-Type", "application/json;charset=utf-8");
		HttpEntity<String> httpEntity = new HttpEntity<>(json, headers);
		return JSON.parseObject(restTemplate.postForEntity(url, httpEntity, String.class).getBody(),ResponseData.class);
	}


	/**
	 *  调起预支付
	 * @param url 接口地址
	 * @param request 请求的数据
	 * @param signKey 签名秘钥
	 * @return {@link ResponseData}
	 */
	public ResponseData toPay(String url, AbstractRequest request, String signKey){
		return toSign(url + ConstantConfig.PAY_URL, ConstantConfig.PAY_URL, JSON.toJSONString(request), signKey);
	}

	/**
	 *  验签
	 * @param url 接口请求地址
	 * @param request 请求的数据
	 * @param signKey 签名秘钥
	 * @return {@link ResponseData}
	 */
	public ResponseData check(String url,CheckRequest request, String signKey){
		return toSign(url + ConstantConfig.ORDER_CHECK, ConstantConfig.ORDER_CHECK, JSON.toJSONString(request), signKey);
	}

}
