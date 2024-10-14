class NameRepository {
    private String[] names = {"John", "Jane", "Alice", "Bob"};

    public Iterator getIterator() {
        return new NameIterator();
    }
