package lv.homework9;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {

    private Set<String> textLine = new HashSet<>();

    public void addWord(String textline) {
        textLine.add(textline);
    }

    public void printToConsole() {
        System.out.println(textLine);
    }

    public void getUniqueWords() {
        System.out.println("unique word count " + textLine.size());
    }
}
