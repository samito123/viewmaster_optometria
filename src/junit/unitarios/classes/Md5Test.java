package junit.unitarios.classes;

import static org.junit.Assert.*;

import org.junit.Test;

import control.auxiliares.Md5;

public class Md5Test {

	@Test
	public void Md5Test() {
		System.out.println(new Md5().TransformaEmMd5("123"));
	}

}
