package PartsOfSpeech;

import interfaces.*;

public class Noun extends Word implements IActionable, IDescribeable, ISubwordable  {
    public String pronoun;
    public String name;
    public String subword;
    public GenderEnum gender;

    public Noun(String name, String subword, GenderEnum gender) {
        this.gender = gender;
        this.name = name;
        this.subword = subword;
        switch(gender) {
            case MALE:
                this.pronoun = "он";
                break;
            case FEMALE:
                this.pronoun = "она";
                break;
            case THIS:
                this.pronoun = "оно";
                break;
            case THEY:
                this.pronoun = "они";
                break;
        }
    }

    public Noun print() {
        return this.print(true);
    }
    public Noun print(Boolean preSpace) {
        if (preSpace) {
            System.out.print(" ");
        }
        System.out.print(this.name);
        return this;
    }
    public Noun print(NounFormEnum nounForm) {
        switch(nounForm) {
            case BASE:
                System.out.print(this.name);
                break;
            case SUB:
                System.out.print(this.subword);
                break;
            case OWN:
                System.out.print(this.pronoun);
                break;
        }
        return this;
    }

    public Noun describe(String description) {
        System.out.print(" ");
        System.out.print(description);
        return this;
    }
    
    public Action action(Action action) {
        action.print(this.gender);
        return action;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Noun) {
            return ((Noun)obj).name.equals(this.name);
        } else {
            return false;
        }
    }
}
