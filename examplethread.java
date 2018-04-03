public class Solution {
    public static int number = 5;

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new CountDownRunnable(), "Уменьшаем");
        t.start();
        t.join();
        Thread a = new Thread(new CountUpRunnable(), "Увеличиваем");
        a.start();
        a.join();
        Thread c = new Thread(new RuMultiply(), "Умножаем");
        c.start();
        c.join();
        System.out.println("Потоки остановились");


    }

    public static class CountUpRunnable implements Runnable
    {
        private int countIndexUp = 1;

        public void run()
        {
            try {


                while (true) {
                    Thread.sleep(500);
                    System.out.println(toString());
                    countIndexUp ++;
                    if (countIndexUp ==6) return;





                }
            }catch (InterruptedException e){}


        }

        @Override
        public String toString() {
            return Thread.currentThread().getName()+": "+countIndexUp;
        }
        //Add your code here - добавь код тут
    }


    public static class CountDownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run()
        {

            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;


        }
    }
    public static class RuMultiply implements Runnable
    {
        private int countMulty = Solution.number;
        @Override
        public void run()
        {
            try
            {
                while (true)
                {
                    Thread.sleep(1000);
                    countMulty*=2;
                    System.out.println(toString());
                    if (countMulty==20) return;
                }


            }catch (InterruptedException e){}


        }
        @Override
        public String toString() {
            return Thread.currentThread().getName()+" :"+countMulty;
        }
    }


}
