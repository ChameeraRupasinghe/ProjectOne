import java.util.Scanner;
public class Fact_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give your number: ");
        int a = input.nextInt();
        Help helpobj = new Help();
        int k = helpobj.fac(a);
        System.out.println("Factorial of "+a+" is: "+k);
    }
    
}
class Help {
  public int getnum(int num){
      return num;
  }
  public int fac(int x){
      if (x==0){
          return 1;
      }else{
          return getnum(x)*fac(x-1);
      }
          
          
  }
}

