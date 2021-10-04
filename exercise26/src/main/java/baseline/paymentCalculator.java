
package baseline;
import java.lang.Math;

public class paymentCalculator {

    // n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
    public double  calculateMonthsUntilPaidOff(double APR, double balance, double monthlyPayment)
    {
        APR /= 100;
        double i = APR/365;
        double n = Math.log(1+((balance/monthlyPayment)*(1-(Math.pow((1+i),30)))));
        n = -(1/30)*n;
        double d = Math.log(1+i);

        n = n/d;

        return Math.rint(n);
    }

}