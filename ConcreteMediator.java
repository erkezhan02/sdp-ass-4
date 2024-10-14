class ConcreteMediator implements Mediator {
    private Colleague colleague1;
    private Colleague colleague2;

    public void setColleague1(Colleague colleague) {
        colleague1 = colleague;
    }

    public void setColleague2(Colleague colleague) {
        colleague2 = colleague;
    }

    public void sendMessage(String message, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.receive(message);
        } else {
            colleague1.receive(message);
        }
    }
}
