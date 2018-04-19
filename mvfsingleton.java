public class Solution {
    public static void main(String[] args) {
        IMF fund = IMF.getFund();
        IMF anotherFund = IMF.getFund();
        System.out.println(fund == anotherFund );
    }
}

public class IMF {

    private static IMF imf;

    public static IMF getFund()
    {
        IMF im = null;
        synchronized (IMF.class)
        {
            imf = new IMF();
            imf = im;
            
        }
        
        return im;
    }

    private IMF() 
    {
    }
}
