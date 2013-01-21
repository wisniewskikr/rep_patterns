package pl.kwi.mementos;


public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveToMemento() {
        return new Memento(state);
    }

    public String restoreFromMemento(Memento m) {
        return m.getSavedState();
    }
}
