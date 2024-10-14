class ConcreteHandler3 implements Handler {
    private Handler next;

    public void setNext(Handler handler) {
        next = handler;
    }

    public void handleRequest(String request) {
        if (request.equals("Task3")) {
            System.out.println("Handled by Handler3");
        } else if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("Request cannot be handled");
        }
    }
}
