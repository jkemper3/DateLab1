package Lab2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author jkemper3
 */
public class DateService {

    SimpleDateFormat sdf = new SimpleDateFormat();
    private Date date;

    public Date convertStringToDate(String d) throws ParseException {

        String sDate = "2/01/2010";

        date = sdf.parse(sDate);

        return date;

    }

    public Calendar converStringToCalendar(String d) throws ParseException {

        String sDate = "2/01/2010";

        date = sdf.parse(sDate);

        return date;

    }
}
