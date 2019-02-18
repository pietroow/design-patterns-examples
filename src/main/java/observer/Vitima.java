package observer;

import observer.abstracts.Observer;
import observer.abstracts.Subject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
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
}
