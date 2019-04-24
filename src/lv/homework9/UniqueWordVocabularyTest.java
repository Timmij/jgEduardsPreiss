package lv.homework9;

public class UniqueWordVocabularyTest {

    public static void main(String[] args) {
        UniqueWordVocabulary textLine = new UniqueWordVocabulary();
        textLine.addWord("Kas tas");
        textLine.addWord("labi ka ir");
        textLine.addWord("kur var");
        textLine.addWord("paest");
        textLine.addWord("paest");
        textLine.addWord("garsigi");
        textLine.addWord("garsigi");

        textLine.getUniqueWords();

    }
}
