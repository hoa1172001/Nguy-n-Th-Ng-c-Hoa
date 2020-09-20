import java.util.ArrayList;

public class Dictionary {
    public ArrayList<Word> lista= new ArrayList<Word>();

    public void setLista(ArrayList<Word> list) {
        this.lista= list;
    }

    public ArrayList<Word> getList() {
        return lista;
    }
}