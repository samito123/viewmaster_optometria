package control.auxiliares;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5 {

	public String TransformaEmMd5(String texto){
		String textoMd5 = null;
		MessageDigest m;
		try {
			m = MessageDigest.getInstance("MD5");
			m.update(texto.getBytes(), 0, texto.length());
			textoMd5 = new BigInteger(1,m.digest()).toString(16);
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Erro TranformaEmMd5: "+e);
		}
	    return textoMd5;
	}
}
