package observer;

import observer.abstracts.Observer;
import observer.abstracts.Subject;

public class Policia implements Observer<Ladrao> {

    public Policia(Subject subject) {
        subject.register(this);
    }

    public void update(Ladrao ladrao) {
        if (ladrao.getRoubarBolsa()) {
            System.out.println("observer.Policia: Perseguindo o ladrão!!");
        } else {
            System.out.println("observer.Policia: Ficar de boa!!");
        }
    }
}
