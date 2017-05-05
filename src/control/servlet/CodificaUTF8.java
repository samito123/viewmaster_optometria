package control.servlet;

import java.io.UnsupportedEncodingException;

public class CodificaUTF8 {

	public String CodificaString(String string) throws UnsupportedEncodingException{
		return new String(string.getBytes("UTF-8"), "ISO-8859-1");
	}
}
