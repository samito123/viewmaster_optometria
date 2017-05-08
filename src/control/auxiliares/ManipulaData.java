package control.auxiliares;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ManipulaData {
	
	public Date SetDateParaTestes() throws ParseException{
		String dataTexto = "1988-07-22";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date data = simpleDateFormat.parse(dataTexto);
		return data;
	}

}
