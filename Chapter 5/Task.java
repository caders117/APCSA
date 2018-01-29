/**
 * Task class represents a task that has a priority
 * and can be compared to other tasks.
 * 
 * @author Cade
 * @version 1/29/2018
 */
public class Task implements Priority, Comparable {
    int priority;
    String name;
    
    /**
     * Constructor that sets the name of the task
     * 
     * @param n name of task
     */
    public Task(String n) {
        this.name = n;
    }
    
    /**
     * Getter to get the name of the task
     * 
     * @return name of the priority
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets this task's priority
     * 
     * @param p priority to set this task to
     */
    public void setPriority(int p) {
        priority = p;
    }
    
    /**
     * Getter for this task's priority
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }
    
    /**
     * toString() override method
     * 
     * @return String representation of the task
     */
    public String toString() {
        return "\"" + name + "\" has priority of " + priority;
    }
    
    /**
     * Compares this Task to another Task based on priority
     * 
     * @param Task to be compared
     */
    public int compareTo(Object o) {
        Task t = ((Task)o);
        if(this.priority > t.getPriority())
            return 1;
        else if(this.priority == t.getPriority())
            return 0;
        else 
            return -1;
    }
}
