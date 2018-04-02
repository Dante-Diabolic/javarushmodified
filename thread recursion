public class Solution
{
    static int count = 15;
    static volatile int countCreatedThreads = 0;

    public static void main(String[] args) {

        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread
    {
        public GenerateThread()
        {
            super(String.valueOf(++countCreatedThreads));
            start();

        }

        @Override
        public void run()
        {


            if (count>=Solution.countCreatedThreads)
            {

                GenerateThread d = new GenerateThread();
                System.out.println(d);
                try {
                    System.out.println(orThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }

        @Override
        public String toString()
        {
            return countCreatedThreads+" "+"created";
        }
    }

    public static int orThread() throws InterruptedException {
        countCreatedThreads = 20;
        for (int i = 20; i>0; i--)
        {
            Thread.sleep(1000);
            System.out.println(countCreatedThreads);
            if (countCreatedThreads>=20)
            {
                System.out.println("Done");
                break;
            }

        }
        return countCreatedThreads;
    }
}
