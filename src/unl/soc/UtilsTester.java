package unl.soc;
/**
 * Name: Luciano Carvalho (lguedesdecarvalhon2@huskers.unl.edu)
 *
 * Date: 2023 - 09 - 28
 *
 * Test cases for the utils functions
 */
public class UtilsTester {
    public static final double ERROR_MARGIN = 0.0001;

    /**
     * Returns true if the two given values a, b subtracted
     * has less ERROR_MARGIN value
     */
    public static boolean isClose(double a, double b)
    {
        return Math.abs(a - b) < ERROR_MARGIN;
    }

    public static void main(String[] args) {

        double expect, actual;
        int numPassed = 0;
        int numFailed = 0;

        expect = 1.032796;
        actual = Utils.lorentzTimeDilation(1, 0.25);
        System.out.printf("TESTING: lorentzTimeDilation(1 , 0.25): ");
        if (!isClose(expect, actual))
        {
            System.out.printf("Failed lorentzTimeDilation: Returned: %lf Expected: %lf\n", actual, expect);
            numFailed++;
        }
        else
        {
            System.out.printf("PASSED\n");
            numPassed++;
        }

        expect = 3335.847799;
        actual = Utils.getAirDistance(10, 100, 40, 100);
        System.out.printf("TESTING: getAirDistance(10, 100, 40, 100): ");
        if (!isClose(expect, actual))
        {
            System.out.printf("Failed getAirDistance: Returned: %lf Expected: %lf\n", actual, expect);
            numFailed++;
        }
        else
        {
            System.out.printf("PASSED\n");
            numPassed++;
        }

        expect = 5 * Math.PI/ 9;
        actual = Utils.degreesToRadians(100);
        System.out.printf("TESTING: degreesToRadians(100) : ");
        if (!isClose(expect, actual))
        {
            System.out.printf("Failed getAirDistance: Returned: %lf Expected: %lf\n", actual, expect);
            numFailed++;
        }
        else
        {
            System.out.printf("PASSED\n");
            numPassed++;
        }

        System.out.printf("\nNumber Test Cases Passed: %6d\n", numPassed);
        System.out.printf("Number Test Cases Failed: %6d\n", numFailed);
        System.out.printf("Percent Passed:           %6.2f\n", 100.0 * numPassed / (numPassed + numFailed));

    }
}
