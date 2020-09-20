import java.util.Scanner

public class DictionaryManagement {
    public Dictionary dictionary = new Dictionary();
    public Word word = new Word();

    public void insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
        String english = sc.nextLine();
        String vietnam = sc.nextLine();
        word.word_explain = vietnam;
        word.word_target = english;
        this.dictionary.lista.add(word);
    }

}
