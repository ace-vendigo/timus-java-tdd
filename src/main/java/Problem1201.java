import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

//Status: WA1
public class Problem1201 {

    static class Solution {
        void solve() throws IOException {
            int day = readInt();
            int month = readInt() - 1;
            int year = readInt();
            Calendar calendar = new GregorianCalendar(year, month, 1);

            String template = "%day% %w1% %w2% %w3% %w4% %w5% %w6%";
            String[] days = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
            //Insert day names into the calendar
            for (int dN = 0; dN < 7; dN++) {
                days[dN] = template.replace("%day%", days[dN]);
            }

            //Replacing %wN% templates with dayNumbers
            while (calendar.get(Calendar.MONTH) == month) {
                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
                int daysIndex = (dayOfWeek == 1) ? 6 : dayOfWeek - 2; //By default Sunday == 1, Monday == 2 (We want Monday==0 ... Sunday==6)
                int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
                int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                String dayRec = String.valueOf(dayOfMonth);
                if (dayOfMonth < 10) {
                    dayRec = " " + dayRec;
                }
                if (dayOfMonth == day) {
                    dayRec = "[" + dayRec + "]";
                } else {
                    dayRec = " " + dayRec + " ";
                }
                String templateS = "%w" + weekOfMonth + "%";
                days[daysIndex] = days[daysIndex].replace(templateS, dayRec);

                calendar.add(Calendar.DAY_OF_MONTH, 1);
            }


            for (int dN = 0; dN < 7; dN++) {
                //Replace remaining templates with spaces
                days[dN] = days[dN].replace("%w1%", "    ");
                days[dN] = days[dN].replace("%w5%", "    ");
                days[dN] = days[dN].replace("%w6%", "    ");
                //Remove spaces in the end
                days[dN] = days[dN].trim();
                //Output
                String delimeter = dN<6?"\n":"";
                writer.print(days[dN]+delimeter);
            }

            writer.flush();
        }

        StreamTokenizer reader;
        PrintWriter writer;

        Solution(StreamTokenizer reader, PrintWriter writer) {
            this.reader = reader;
            this.writer = writer;
        }

        int readInt() throws IOException {
            reader.nextToken();
            return (int) reader.nval;
        }
    }

    public static void main(String[] args) throws IOException {
        new Solution(new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in))),
                new PrintWriter(new OutputStreamWriter(System.out)))
                .solve();
    }
}
