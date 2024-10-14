class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        System.out.println("Colleague1 sends message: " + message);
        mediator.sendMessage(message, this);
    }

    public void receive(String message) {
        System.out.println("Colleague1 receives message: " + message);
    }
}
