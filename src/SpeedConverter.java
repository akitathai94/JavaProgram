public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        // 1 mph = 1.609 km/ h
        // return rounded value of the calculations of type long
        // if input < 0 return -1
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long speed_mph = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + speed_mph + " mi/h");
        }
        // Print message format: XX km/h = YY mi/h
        // if kilometersPerHour < 0 print "Invalid Value"

    }
}
