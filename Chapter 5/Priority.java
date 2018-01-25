public interface Priority {
    
    static int MIN_PRIORITY = 1;
    static int MED_PRIORITY = 5;
    static int MAX_PRIORITY = 10;
    
    public void setPriority(int p);
    
    public int getPriority();
}
