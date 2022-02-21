public class Exercise{

    public static long Ackermann(long m, long n) {
  if (m == 0) 
  {
    return n+1;
  }
if (m > 3) 
  {
    System.out.println("m cannot be more than 3");
    System.exit(0);
  }
  if (m > 0 && n == 0) {
    return Ackermann(m-1, 1);
  }
  if (m > 0 && n > 0 ) {
    return Ackermann(m-1, Ackermann(m, n-1));
  }
  System.out.println("Invalid inputs: m and n cannot be negative");
  return -1;
  
}
    }