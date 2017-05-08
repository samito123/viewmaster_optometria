package junit.unitarios.classes;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateTest {

	@Test
	public void SetDateCalendarTest() {
		Calendar myCal = Calendar.getInstance();
		myCal.set(Calendar.YEAR, 2010);
		myCal.set(Calendar.MONTH, Calendar.JULY);
		myCal.set(Calendar.DAY_OF_MONTH, 2);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String date = simpleDateFormat.format(myCal.getTime());
		System.out.println(date);
	}
	
	@Test
	public void SetDateTest() throws ParseException{
		String dataTexto = "1988-07-22";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date data = simpleDateFormat.parse(dataTexto);
		System.out.println(data);
	}

}
