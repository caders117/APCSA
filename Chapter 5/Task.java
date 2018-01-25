public class Task implements Priority, Comparable {
    int priority;
    String name;
    
    public Task(String n) {
        this.name = n;
    }
    
    public String getName() {
        return name;
    }
    
    public void setPriority(int p) {
        priority = p;
    }
    
    public int getPriority() {
        return priority;
    }
    
    public String toString() {
        return "\"name\" has priority of " + priority;
    }
    
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
