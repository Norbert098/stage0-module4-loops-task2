package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int temp = 0;
        String result = "";
        while (temp < chars.length) {
            result += chars[temp];
            temp++;
        }
        System.out.print(result);
    }
}
