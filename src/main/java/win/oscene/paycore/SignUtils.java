package win.oscene.paycore;

import com.akeyo.utils.XFDigest;

import java.util.Random;

/**
 * @author Sorata  2018/10/15 14:56
 */
public class SignUtils {

	private static final char[] CHARS = {'a','b','c','d','e','f','g','h','i','j','k','l',
			'm','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'};

	private static long tx(){
		return System.currentTimeMillis() / 1000;
	}

	private static String randStr(){
		Random random = new Random();
		char[] chars = new char[16];
		for (int i = 0; i < 16; i++) {
			chars[i] = CHARS[random.nextInt(CHARS.length) ];
		}
		return new String(chars);
	}


	public static String sign(String url, String key){
		StringBuilder stringBuilder = new StringBuilder();
		long tx = tx();
		stringBuilder.append(tx).append(":");
		String rand = randStr();
		String sign = XFDigest.sha256(url +rand + tx + key );
		stringBuilder.append(sign).append(":").append(rand);
		return  stringBuilder.toString();
	}




}
