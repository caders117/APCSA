public class TaskTest {
    public static void main(String[] args) {
        
        Task t1 = new Task("Eat");
        Task t2 = new Task("Play");
        Task t3 = new Task("Work");
        
        t1.setPriority(3);
        t2.setPriority(Priority.MIN_PRIORITY);
        t3.setPriority(3);
        
        System.out.println("\f");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        
        System.out.println();
        
        comparePriorities(t1, t2);
        comparePriorities(t2, t1);
        comparePriorities(t1, t3);
    }
    
    /**
     * Compares two priorities.
     * 
     * @param t1 first priority
     * @param t2 priority to be compared
     */
    static void comparePriorities(Task t1, Task t2) {
        if(t1.compareTo(t2) == 1)
            System.out.println("\"" + t1.getName() + "\" has a higher priority than " + 
                                "\"" + t2.getName() + "\"");
        else if(t1.compareTo(t2) == 0)
            System.out.println("\"" + t1.getName() + "\" has an equal priority to " +
                                "\"" + t2.getName() + "\"");
        else
            System.out.println("\"" + t1.getName() + "\" has a lower priority than " + 
                                "\"" + t2.getName() + "\"");
    }
}
        
