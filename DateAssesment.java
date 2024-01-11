/*Given a time at 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00 AM on a 12-hour clock and 00:00:00 on a 24-hour clock. Noon is 12:00:00 PM on 12-hour clock and 12:00:00 on 24-hour clock*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class DateAssesment
{
    
        public static String convertTime(String timeConvert) 
        {
            try 
            {
                SimpleDateFormat inFormat = new SimpleDateFormat("hh:mm:ss aa");
                SimpleDateFormat outFormat = new SimpleDateFormat("HH:mm:ss");
                
                Date date = inFormat.parse(timeConvert);
                return outFormat.format(date);
            } 
            catch (ParseException e) 
            {
                e.printStackTrace();
                return "Invalid input format";
            }
        }


          public static void main(String[] args) 
          {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Time In HH:MM:SS Format :");
            String time = sc.nextLine();
            System.out.println(convertTime(time));
        }
    }
    


