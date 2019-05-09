package observer;

import observer.abstracts.Observer;
import observer.abstracts.Subject;

import java.util.ArrayList;
import java.util.List;

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

    public Boolean getRoubarBolsa() {
        return roubarBolsa;
    }

    public List<Observer> getObservadores() {
        return observadores;
    }
}
