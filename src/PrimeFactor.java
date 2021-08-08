public class PrimeFactor {
    int num;
    int i,j;
    int isPrime=0;
    PrimeFactor()
    {
        num=0;
    }
    PrimeFactor(int p)
    {
        num=p;
    }
    void test()
    {
        for (i=2; i<=num; i++)
        {
            if ((num%i)==0)
            {
                isPrime=1;
                for(j=2; j<(i/2); j++)
                {
                    if ((i%j)==0)
                    {
                        isPrime=0;
                        break;
                    }
                }
                if (isPrime==1)
                    System.out.println(i+"is Prime number");
            }
        }
    }
}
class Demo
{
    public static void main(String[] args)
    {
        PrimeFactor ob = new PrimeFactor(11);
        ob.test();
    }
}
