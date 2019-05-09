package observer;

import observer.abstracts.Observer;
import observer.abstracts.Subject;

import java.util.ArrayList;
import java.util.List;

public class Vitima implements Subject {

    private Boolean dandoSopa;
    private List<Observer> observadores = new ArrayList<>();

    public void register(Observer observer) {
        observadores.add(observer);
    }

    public void unregister(Observer observer) {
        observadores.remove(observer);
    }

    public void notifyObservers(Object o) {
        observadores.forEach(observer -> observer.update(o));
    }

    public Boolean getDandoSopa() {
        return dandoSopa;
    }

    public List<Observer> getObservadores() {
        return observadores;
    }

    public void setDandoSopa(Boolean dandoSopa) {
        this.dandoSopa = dandoSopa;
    }

    public void setObservadores(List<Observer> observadores) {
        this.observadores = observadores;
    }
}
