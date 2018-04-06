public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t1.printResult();
        t2.printResult();

    }

    public static class Read3Strings extends Thread
    {
        ArrayList list = new ArrayList();
        @Override
        public void run()
        {
            for (int i = 0; i<3; i++)
            {

                try
                {

                    list.add(reader.readLine());

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        public void printResult()
        {
            for (Object list: list)
            System.out.print(list+" ");
            System.out.println("\n");

        }
    }


    
}
