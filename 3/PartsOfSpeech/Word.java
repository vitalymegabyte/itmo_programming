package PartsOfSpeech;

import interfaces.ISubwordable;

public abstract class Word {
    public abstract Word print();
    
    public ISubwordable subword(ISubwordable word, NounFormEnum nounForm) {
        System.out.print(" ");
        word.print(nounForm);
        return word;
    }

    public ISubwordable subword(ISubwordable word) {
        return this.subword(word, NounFormEnum.SUB);
    }
    public ISubwordable subword(ISubwordable word, String prep) {
        System.out.print(" ");
        System.out.print(prep);
        return this.subword(word);
    }
}