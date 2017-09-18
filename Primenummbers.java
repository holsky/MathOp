public class prime {


    public static int a;

    public static void main(String[] args)

    {

        all(10000);
    }

    static void all (int y)
    {
        for (int j=1; j<=y; j++)
        {
            cip(j,0);
        }
    }

    static void cip (int x,int z)
    {

        for(int i=1; i<=x&&z<3; i++)
        {
            a = x%i;
            if (a==0)
            {
                ++z;

            }

        }
            if (z==2)
            {
                System.out.println(x);
            }


    }

}
