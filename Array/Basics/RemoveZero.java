package Array.Basics;

public class RemoveZero {
    public static void main(String[] args) {
        long n = 1020030;
        long res=0,place=1;
          while(n>0){
              long digit =n%10;
              if(digit!=0){
                  res+=digit*place;
                  place*=10;
              }
              n/=10;
          }
        System.out.println(res);
    }
}
