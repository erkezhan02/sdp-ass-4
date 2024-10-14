class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        System.out.println("Colleague2 sends message: " + message);
        mediator.sendMessage(message, this);
    }

    public void receive(String message) {
        System.out.println("Colleague2 receives message: " + message);
    }
}
