public class a3q10_tracing {
  public static void main(String[] args) {
    int m = 17, n = 13, p = 1, sum = 30;
    while(0 < p%10){
       if(m % 10 == 0){
          sum = sum * m % n + p / n ;
       }
       else{
          if(m % 4 == 0){
             sum += n + (--m);
          }
          else{
             sum -= m--;
          }
       }
       p+=1;
       System.out.println(sum);
    }
    System.out.println(!(n%13 == 0) && !false || p>10);
  }
}