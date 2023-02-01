public class Main {
    public static void main(String[] args) {
        String incomingText = "yourapp the quick brown fox jumps over the lazy dog";
        CountWords countWords = new CountWords(incomingText);
        countWords.printResult();
    }
}