
public class DictionaryCommandline {
    private static DictionaryManagement dictionaryManagement = new DictionaryManagement();
    private static Dictionary dictionary = new Dictionary();

    public static void showAllWord() {
        System.out.println("No\t|English\t|Vietnam");
        int i = 1;
        for (Word word : dictionary.getList()) {
            System.out.println(i + "\t|" + word.getWord_target() + "\t|" + word.getWord_explain());
        }
    }

    public static void dictionaryBasic() {
        dictionaryManagement.insertFromCommandline();
        showAllWord();
    }
}
