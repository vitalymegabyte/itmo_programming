package PartsOfSpeech;

public class Person extends Noun {
    
    public Person(String name, String subword, GenderEnum gender) {
        super(name, subword, gender);
    }
    
    public Person talk() {
        System.out.print(": ");
        return this;
    }
}
