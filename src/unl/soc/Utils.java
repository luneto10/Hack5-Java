package unl.soc;
/**
 * Name: Luciano Carvalho (lguedesdecarvalhon2@huskers.unl.edu)
 *
 * Date: 2023 - 09 - 28
 *
 * Some utils formula header file
 */
public class Utils {

    /**
     * Takes a value in Degrees and return
     * the value in radians
     */
    public static double degreesToRadians(double degree)
    {
        return (degree * Math.PI) / 180;
    }

    /**
     * Takes 4 values of latitude and longitude
     * and return the distance between these two
     * points.
     *
     */
    public static double getAirDistance(double originLatitude,
                                        double originLongitude,
                                        double destinationLatitude,
                                        double destinationLongitude)
    {

        // Valitading the user input
        if (destinationLatitude > 90 || destinationLatitude < -90 || originLatitude > 90 || originLatitude < -90)
        {
            System.out.printf("\nPLEASE, ENTER A LATITUDE VALUE IN THE RANGE OF [-90,90]!\n\n");
            System.exit(1);
        }

        if (originLongitude < -180 || originLongitude > 180 || destinationLongitude < -180 || destinationLongitude > 180)
        {
            System.out.printf("\nPLEASE, ENTER A LONGITUDE VALUE IN THE RANGE OF [-180,180]!\n\n");
            System.exit(1);
        }

        return Math.acos(Math.sin((originLatitude / 180) * Math.PI) * Math.sin((destinationLatitude / 180) * Math.PI) + Math.cos((destinationLatitude / 180) * Math.PI) *
                Math.cos((originLatitude / 180) * Math.PI) * Math.cos((destinationLongitude / 180) * Math.PI - (originLongitude / 180) * Math.PI)) * 6371;
    }

    /**
     * Takes the value of time and the percent of the speed
     * of the light and return the time dilation by Lorentz
     * Formula
     */
    public static double lorentzTimeDilation(double t, double percentC)
    {
        if (percentC > 1 || percentC < 0)
        {
            System.out.printf("ERROR: Enter a percent value between 0 and 1");
            System.exit(1);
        }
        if (t < 0)
        {
            System.out.printf("ERROR: Enter a positive time");
            System.exit(1);
        }

        return t / Math.sqrt(1 - Math.pow(percentC, 2));
    }

}
