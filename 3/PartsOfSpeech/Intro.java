package PartsOfSpeech;

public class Intro extends Word {
    String text;

    public Intro(String text) {
        this.text = text;
    }

    public Intro print() {
        System.out.print(text);
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Intro) {
            return ((Intro)obj).text.equals(this.text);
        } else {
            return false;
        }
    }
}
