package in.blogspot.randomcompiler.reverse.words;

public class ReverseWords {
    public static void reverseWords(StringBuilder sb, int startIndex, int endIndex) {
        reverseString(sb, startIndex, endIndex);
        int wordBegin = startIndex;
        for(int i=startIndex; i<=endIndex; i++) {
            if(i == endIndex) {
                reverseString(sb, wordBegin, i);
            }else if(sb.charAt(i) == ' ') {
                reverseString(sb, wordBegin, i-1);
                wordBegin = i+1;
            }
        }
    }

    private static void reverseString(StringBuilder sb, int startIndex, int endIndex) {
        while(startIndex < endIndex) {
            Character temp = sb.charAt(startIndex);
            sb.setCharAt(startIndex, sb.charAt(endIndex));
            sb.setCharAt(endIndex, temp);
            startIndex++;
            endIndex--;
        }
    }
}
