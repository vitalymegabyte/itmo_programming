package PartsOfSpeech;
import interfaces.*;

public class Action extends Word implements IDescribeable {
    public String name_male;
    public String name_female;
    public String name_this;
    public String name_they;

    public Action(String name_male, String name_female, String name_this, String name_they) {
        this.name_male = name_male;
        this.name_female = name_female;
        this.name_this = name_this;
        this.name_they = name_they;
    }

    public Action print() {
        System.out.print(" ");
        System.out.print(name_male);
        return this;
    }

    public Action print(GenderEnum genderEnum) {
        System.out.print(" ");
        switch(genderEnum) {
            case MALE:
                System.out.print(name_male);
                break;
            case FEMALE:
                System.out.print(name_female);
                break;
            case THIS:
                System.out.print(name_this);
                break;
            case THEY:
                System.out.print(name_they);
                break;
            default:
                break;
        }
        return this;
    }

    public IDescribeable describe(String description) {
        System.out.print(description);
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Action) {
            Action action = (Action)obj;
            return action.name_male.equals(this.name_male) && action.name_female.equals(this.name_female);
        } else {
            return false;
        }
    }
}
