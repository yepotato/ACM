package Utils.File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * 把某字符串存到本地txt
 * @author gzm
 *
 */
public class StringToTxt {
	public static void main(String[] args) {
		String txt = "111";
		String fileName = "1.txt";
		System.out.println(saveAsTxt(txt, fileName));
		StringBuffer sb = new StringBuffer();
		sb.append(fileName);
		writeFile("F:\\Work\\11.txt", sb);
	}
	
	private static String saveAsTxt(String txt,String fileName ) {
//		String onlinePathString = "http://101.1.7.242:81/ceshi/";
		//获取相对路径
		//绝对路径linux path="/alidata1/ceshi/"; windows path="F:\\Work\\";
//		String path = getClass().getResource("../").getFile().toString(); //web 项目获取相对路径
		 //获取class 文件的所在路径
//		  System.out.println(Thread.currentThread().getContextClassLoader().getResource("").getFile());  
//	        System.out.println(StringToTxt.class.getClassLoader().getResource("").getFile());  
//	        System.out.println(ClassLoader.getSystemResource("").getFile());  
//	        System.out.println(StringToTxt.class.getResource("").getFile());  
//	        System.out.println(StringToTxt.class.getResource("/").getFile()); 
				
		//获取项目的根目录
		File directory = new File("");// 参数为空
		  String courseFile="";
		try {
			courseFile = directory.getCanonicalPath();	//获取项目的根目录
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		String path=courseFile;
		try {
			path+="\\"+fileName;
			
	        File file=new File(path);
	        StringBuffer sb=new StringBuffer();
	        sb.append(txt);
	        if(!file.exists())
	            file.createNewFile();
	        FileOutputStream out=new FileOutputStream(file,false); //如果追加方式用true        
	       
	        out.write(sb.toString().getBytes("utf-8"));//注意需要转换对应的字符集
	        out.close();
		} catch (Exception e) {
			throw new RuntimeException("windows 文件"+path+"写入失败");
		}
		
		return path;
	}
	
	
	public static boolean writeFile(String filePath,StringBuffer text)
	 {
	  try
	  {
	   BufferedWriter rw=new BufferedWriter
	   (new OutputStreamWriter(new FileOutputStream(filePath)));
	   rw.write(new String(text));
	   rw.close();
	   
	  }
	  catch(Exception e)
	  {
		 
	   e.printStackTrace();  
	   throw new RuntimeException("文件写入失败");
	  }
	  return true;
	 }
	
	

}
