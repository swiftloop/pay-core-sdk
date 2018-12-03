package win.oscene.paycore;



import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by: sorata on 2017/5/10 0010.
 */
public class XmlUtil {


	public static Map<String, String> loadXmlStr(String xml) {
		Map<String, String> map = new HashMap<>(16);
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		Document document;
		try {
			builderFactory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
			builderFactory.setFeature("http://xml.org/sax/features/external-general-entities", false);
			builderFactory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
			builderFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
			builderFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			builderFactory.setXIncludeAware(false);
			builderFactory.setExpandEntityReferences(false);
			builder = builderFactory.newDocumentBuilder();
			document = builder.parse(new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)));
			document.normalize();
		} catch (Exception e) {
			throw new IllegalArgumentException("解析xml失败,原因:" + e.getMessage());
		}
		NodeList allNodes = document.getFirstChild().getChildNodes();
		for (int i = 0; i < allNodes.getLength(); ++i) {
			Node node = allNodes.item(i);
			if (node instanceof Element) {
				map.put(node.getNodeName(), node.getTextContent());
			}
		}
		return map;
	}


}
