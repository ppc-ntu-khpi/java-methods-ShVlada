public class Exercise{

    public static long Ackermann(long m, long n) {
  if (m == 0) 
  {
    return n+1;
  }
if (m > 3) 
  {
    System.out.println("m не може бути більше 3");
    System.exit(0);
  }
  if (m > 0 && n == 0) {
    return Ackermann(m-1, 1);
  }
  if (m > 0 && n > 0 ) {
    return Ackermann(m-1, Ackermann(m, n-1));
  }
  System.out.println("Недійсні введення: m і n не можуть бути від’ємними");
  return -1;
  
}
    }