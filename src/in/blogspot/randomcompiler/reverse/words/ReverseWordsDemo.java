package in.blogspot.randomcompiler.reverse.words;

public class ReverseWordsDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Program");
        sb.append(" ");
        sb.append("to");
        sb.append(" ");
        sb.append("reverse");
        sb.append(" ");
        sb.append("words");
        sb.append(" ");
        sb.append("in");
        sb.append(" ");
        sb.append("a");
        sb.append(" ");
        sb.append("sentence");
        
        System.out.println(sb.toString());
        ReverseWords.reverseWords(sb, 0, sb.length()-1);
        System.out.println(sb.toString());
    }
}
