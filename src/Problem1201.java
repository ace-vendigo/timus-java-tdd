import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*Task: Иногда очень важно знать,каким днём недели будет заданная дата.И мы начинаем искать ближайший календарь.
        Немного удачи — и календарь найден.Только для того,чтобы узнать,что он не содержит нужной даты.Какая жалость!
        Поэтому вас попросили создать календарь,который сможет обработать любую дату в диапазоне лет от 1600до 2400.
        По дате ваша программа должна напечатать(см.примеры ниже)правильный календарь для месяца,содержащего дату.
        Не забудьте про високосные годы.Год является високосным,если он кратен четырём,кроме случая,
        когда он кратен 100,кроме случая,когда он кратен 400.Например,1996 — високосный год,
        1900 — не високосный(кратен 4и кратен 100),2000 — високосный(кратен 4,кратен 100и кратен 400).
        Исходные данные
        Первая строка ввода содержит дату,то есть три целых числа:день(1–31),месяц(1–12)и год(1600–2400),разделённые пробелами.
        Результат
        Вывод должен содержать ровно 7строк с правильным календарём на месяц,в котором содержится заданная дата.
        Формат календаря дан в примере ниже(для удобства чтения пробелы в примере вывода заменены точками,
        настоящий вывод должен содержать пробелы).И не забудьте отметить заданную дату квадратными скобками.*/
//Status: Не готове
public class Problem1201 {

    static class Solution {
        void solve() throws IOException {
            int day = readInt();
            int month = readInt();
            int year = readInt();
            Calendar calendar = new GregorianCalendar(year-1900, month, day);
            calendar.get(Calendar.DAY_OF_WEEK);

            String template = "%day%..%w1%...%w2%...%w3%...%w4%...%w5%";
            String[] days = {"mon","tue","wed","thu","fri","sat","sun"};
            for (int dN=0; dN<7; dN++) {
                String currentS = template.replace("%day%",days[dN]);
                //TODO Доробити вставку чисел та дужок
                writer.println(currentS);
            }

            writer.flush();
        }

        StreamTokenizer reader;
        PrintWriter writer;

        Solution(StreamTokenizer reader, PrintWriter writer) {
            this.reader = reader;
            this.writer = writer;
        }

        String readLine() throws IOException {
            reader.nextToken();
            return reader.sval;
        }

        int readInt() throws IOException {
            reader.nextToken();
            return (int) reader.nval;
        }

        double readDouble() throws IOException {
            reader.nextToken();
            return (double) reader.nval;
        }
    }

    public static void main(String[] args) throws IOException {
        new Solution(new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in))),
                new PrintWriter(new OutputStreamWriter(System.out)))
                .solve();
    }
}
