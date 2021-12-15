package PartsOfSpeech;

import interfaces.ISubwordable;

public class Prep extends Word {
    public String text;
    public NounFormEnum nextWordForm;
    public Prep(String text, NounFormEnum nextWordForm) {
        this.text = text;
        this.nextWordForm = nextWordForm;
    }
    public Prep print() {
        System.out.print(this.text);
        return this;
    }
    public ISubwordable print(ISubwordable subword) {
        System.out.print(" ");
        System.out.print(text);
        System.out.print(" ");
        subword.print(nextWordForm);
        return subword;
    }
}
