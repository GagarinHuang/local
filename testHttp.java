import java.io.*;
import java.net.*;


public class testHttp {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL usst=new URL("http://www.usst.edu.cn/s/1/t/517/p/2/list.htm");
		BufferedReader in =new BufferedReader(new InputStreamReader(usst.openStream(),"UTF-8"));
		String s;
		while((s=in.readLine())!=null)
		{
			System.out.println(s);
		}
		in.close();
	}

}
