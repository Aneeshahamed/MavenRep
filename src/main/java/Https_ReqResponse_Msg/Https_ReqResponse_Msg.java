package Https_ReqResponse_Msg;

import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Https_ReqResponse_Msg {

	public static void main(String[] args) throws Exception {
		String Request="https://www.google.com/";
		Https_URL(Request);
	}
	public static void Https_URL(String Request) throws Exception
	{
	    String https_url = Request;
	    URL url;
	    url = new URL(https_url);
	    HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
	    print_https_cert(con);
	}
	public static int print_https_cert(HttpsURLConnection con) throws Exception
	{
	    if(con!=null)
	    {
	    	System.out.println("Response Code : " + con.getResponseCode());	
	    	return con.getResponseCode();	
	    }
	    return 0;	
	}
}