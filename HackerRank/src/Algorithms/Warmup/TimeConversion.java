package Algorithms.Warmup;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String time = in.next();
        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        String output = null;
        try{
      	 date= df.parse(time);
      	 output = outputformat.format(date);
      	 System.out.println(output);
        }catch(ParseException pe){
           pe.printStackTrace();
         }

	}

}
