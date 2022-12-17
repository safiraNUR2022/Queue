public class QueueTest {

    public static void main(String[] args) {
        Employee vira = new Employee("Mikel", "Ridho", 125);
        Employee mega = new Employee("Dian", "Maretha", 4569);
        Employee mehnaz = new Employee("Desi", "Ismi", 27);
        Employee misel = new Employee("Sofi", "Salsa", 3298);
        Employee hasna = new Employee("Salma", "End", 76);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(vira);
        queue.add(mega);
        queue.add(mehnaz);
        queue.add(misel);
        queue.add(hasna);
        
        System.out.println("Add to Queue \n");
        queue.printQueue();

        queue.remove();
        queue.remove();
        System.out.println("Remove 2 Data from Queue \n");
        queue.printQueue();

        System.out.println("Peek Data From Queue \n");
        System.out.println(queue.peek());
        queue.remove();
        queue.remove();
        queue.remove();
        //queue.remove();

        queue.add(misel);

        System.out.println("Print Queue \n");
        queue.printQueue();
    }
    
}
