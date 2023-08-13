package abstracts.task9;

public class Main {
    public static void main(String[] args) {
        Instrument glockenspiel = new Glockenspiel();
        Instrument violin = new Violin();

        glockenspiel.play();
        glockenspiel.tune();

        violin.play();
        violin.tune();
    }
}
