class ConcreteHandler2 implements Handler {
    private Handler next;

    public void setNext(Handler handler) {
        next = handler;
    }

    public void handleRequest(String request) {
        if (request.equals("Task2")) {
            System.out.println("Handled by Handler2");
        } else if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("Request cannot be handled");
        }
    }
}
