public class largestprime {
  public class Question3 {

        public static void main(String args[])
        {
            long a=0L, z=0L;
            long n=600851475143L;

            for(long i=2;i<=n ;++i)
            {
                if(600851475143L % i==0)
                {
                    a=i;

                    if(a%2==0)
                        {;  }
                    else if(a%3==0)
                        { ;}
                    else if(a%5==0)
                        { ;}
                    else if(a%7==0)
                        { ;}
                    else if (a>z)
                    { 
                        z=a;
                    }

                }

            }

            System.out.println(z);

        }
    }
}
