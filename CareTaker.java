import java.util.ArrayList;
import java.util.List;
class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}

public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        
        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.add(originator.saveStateToMemento());
        
        originator.setState("State #3");
        caretaker.add(originator.saveStateToMemento());
        
        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());
        
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("Restored to State #1: " + originator.getState());
        
        originator.getStateFromMemento(caretaker.get(1));
        System.out.println("Restored to State #2: " + originator.getState());
    }
}
