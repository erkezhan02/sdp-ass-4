public class IteratorDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();
        
        System.out.println("Iterating through names:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
