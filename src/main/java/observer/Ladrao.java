package observer;

import observer.abstracts.Observer;
import observer.abstracts.Subject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Ladrao implements Subject, Observer<Vitima> {

    private Boolean roubarBolsa;
    private List<Observer> observadores = new ArrayList<>();

    public Ladrao(Subject subject) {
        subject.register(this);
    }

    public void register(Observer observer) {
        observadores.add(observer);
    }

    public void unregister(Observer observer) {
        observadores.remove(observer);
    }

    public void notifyObservers(Object o) {
        observadores.forEach(observer -> observer.update(o));
    }

    public void update(Vitima vitima) {
        if (vitima.getDandoSopa()) {
            System.out.println("observer.Ladrao: Vou roubar a bolsa !!");
            this.roubarBolsa = true;
        } else {
            this.roubarBolsa = false;
        }
        this.notifyObservers(this);
    }
}
