
public class Collection extends TextCharacter implements Measurable {
    
    int Number_of_document = 2;

    public int getNumDoc() {
        return Number_of_document;
    }
    public int getARI() {
        return 5;
    }

    public int measurable(){
        return Number_of_document;

    }

}
