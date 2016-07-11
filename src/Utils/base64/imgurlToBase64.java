package Utils.base64;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 * @description 网络图片转base64
 * @date 2016-07-11
 * @author gzm
 *
 */
public class imgurlToBase64 {

	public static void main(String[] args) {
		String photoUrl = "http://g.hiphotos.baidu.com/baike/pic/item/9c16fdfaaf51f3de5a152d4196eef01f3a297974.jpg";
		URL url;
		String baseCurPhoto="";
		try {
			url = new URL(photoUrl);
			 baseCurPhoto = encodeImgageToBase64(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println("图片路径错误："+photoUrl);
		}
		System.out.println(baseCurPhoto.replaceAll("\r\n", ""));
	}
	
	public  static String encodeImgageToBase64(URL imageUrl) {// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
		ByteArrayOutputStream outputStream = null;
		try {
		  BufferedImage bufferedImage = ImageIO.read(imageUrl);
		  outputStream = new ByteArrayOutputStream();
		  ImageIO.write(bufferedImage, "jpg", outputStream);
		} catch (MalformedURLException e1) {
		  e1.printStackTrace();
		} catch (IOException e) {
		  e.printStackTrace();
		}
		// 对字节数组Base64编码
		 sun.misc.BASE64Encoder encoder = new  sun.misc.BASE64Encoder();
		return encoder.encode(outputStream.toByteArray());// 返回Base64编码过的字节数组字符串
	  }

}
