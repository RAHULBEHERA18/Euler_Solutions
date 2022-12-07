import java.util.ArrayList;

public class smallestmultiple {
  public class Solution  {

    public ArrayList<Integer> list = new ArrayList<Integer>();
  

  public ArrayList<Integer> addtolist() {
    for (int i = 1; i <= 20; i++) {
      list.add(i);
    }
    return list;
  }
  
  
  public int find() {
    int num = 2520;
    while(true) {
      for(int i: list) {
        if(num % i == 0) {
          return num;
        }
        else {
          num = num + 1;
        }
  
      }
    }
  }
  
  public static void main(String[] args) {
    Solution sol = new Solution();
    sol.addtolist();
    System.out.println(sol.find());
  }
  
  
  }
}
