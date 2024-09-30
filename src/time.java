
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

public class time {
	private static final String TIME_FORMAT = "hh:mm:ss aa";
    private static final String DATE_FORMAT = "yyyy/MM/dd";
    private static final String FILE_DATE_FORMAT = "MM_dd_yy_HHmmss";
    private static final String DATE_TIME_FORMAT = "MM/dd/yyyy HH:mm:ss";
    

    public static String getDateTime()
    {           
        DateFormat dateFormat = new SimpleDateFormat(time.DATE_TIME_FORMAT);
        Date date = new Date();
        return dateFormat.format(date);
    }
    

    public static String getDate()
    {
        DateFormat dateFormat = new SimpleDateFormat(time.DATE_FORMAT);
        Date date = new Date();
        return dateFormat.format(date);
    }
    

    public static String getFileDate()
    {
        DateFormat dateFormat = new SimpleDateFormat(time.FILE_DATE_FORMAT);
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static String getDate(String format)
    {
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    public static String getTime()
    {
        DateFormat dateFormat = new SimpleDateFormat(time.TIME_FORMAT);
        Date date = new Date();
        return dateFormat.format(date);
    }

  

}
