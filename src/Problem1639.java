import java.io.*;
/*Task: Малыш обиделся на Карлсона. Тот без спроса съел в доме всё сладкое и даже к соседям залезть успел.
        И вновь — только родители принесли домой большую шоколадку размера m × n, а Карлсон тут как тут!
        Малыш твёрдо решил, что на этот раз ни кусочка шоколада этому обжоре не достанется.
        Известно, что кроме еды у Карлсона есть ещё одна слабость: он любит играть в азартные игры
        и иногда ради возможности сыграть даже готов пожертвовать своим желудком.
        Поэтому Малыш предложил Карлсону следующую игру: за один ход игрок должен взять один из кусков шоколада
        и разломить его на два куска вдоль линий, разделяющих дольки. Игроки ходят по очереди; проигрывает тот,
        кто не может сделать ход, так как остались только куски шоколада размера 1 × 1. Победитель забирает весь
        шоколад себе. Однако Карлсона так просто не проведёшь! Он быстро смекнул, должен ли он ходить первым или
        уступить право первого хода Малышу, чтобы гарантированно выиграть. А Вы бы смогли определить это на его месте?
        Исходные данные
        В единственной строке через пробел записаны целые числа m и n (1 ≤ m, n ≤ 50) — длина и ширина шоколадки в дольках.
        Результат
        Если для того, чтобы выиграть, Карлсону нужно ходить первым, выведите в единственной строке «[:=[first]», иначе выведите «[second]=:]».*/
//Status: Accepted
public class Problem1639 {

    static class Solution {
        void solve() throws IOException {
            int m = readInt();
            int n = readInt();
            String answer = ((m * n) % 2 == 0) ? "[:=[first]" : "[second]=:]";
            writer.print(answer);
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
