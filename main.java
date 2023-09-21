import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new LinkedList<>();
    
  while(true) { //izveidots cikls priekš input kurš noslēdzas kad lietotājs ievada nulli.
    int number = sc.nextInt();
    if (number==0){
      break;
    }
    list.add(number);
  }
    System.out.println("result:");
    
		for (int n : list) {
			System.out.print(n + " "); 
    }
    System.out.println();
    
//izveidot ciklu kas iestarpina blakus esošo skaitļu summu
    for(int i=0; i<list.size()-1; i++){ //-1 jo paiet vienibu atpakal
      int sum = list.get(i)+list.get(i+1);
      list.add(i+1, sum);
      i++;
    }

    for (int n : list) {
			System.out.print(n + " "); 
    }
    //lai skaitlis ir aiz katra otra input number
    sc.close();
      }
  }
