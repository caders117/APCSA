import java.util.*;
public class Main {
  
  public static void main(String[] args){
    ArrayList<Integer> scores = new ArrayList<Integer>();
    getScores(scores);
    System.out.println("Average: " + getAverage(scores));
  }
  
  static void getScores(ArrayList<Integer> s){
    Scanner scan = new Scanner(System.in);
    int a;
    while(true){
      System.out.print("Give me a positive int please (-1 to quit): ");
      a = scan.nextInt();
      if(a >= 0)
        s.add(a);
      else 
        break;
    }
  }
  
  static double getAverage(ArrayList<Integer> s){
    int total = 0;
    int min = s.get(0);
    int max = s.get(0);
    
    for(int x : s){
      if(x > max)
        max = x;
      if(x < min)
        min = x;
    }
    
    for(int i = 0; i < s.size();)
      if(s.get(i) == max || s.get(i) == min)
        s.remove(i);
      else
        i++;
    
    for(int x : s)
      total += x;
    
    return s.size() == 0 ? 0.0 : total / s.size();
  }
}
