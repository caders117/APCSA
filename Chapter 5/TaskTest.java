public class TaskTest {
    public static void main(String[] args) {
        
        Task t1 = new Task("Task 1");
        Task t2 = new Task("Task 2");
        
        t1.setPriority(3);
        t2.setPriority(Priority.MIN_PRIORITY);
        
        System.out.println(t1);
        System.out.println(t2);
    }
    
    static void comparePriorities(Task t1, Task t2) {
        if(t1.compareTo(t2) == 1)
            System.out.println(
    }
}
        
