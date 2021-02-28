public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        // This will print message in format: "XX KB = YY MB and ZZ KB"
        // If kiloBytes < 0 than print "Invalid Value"
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mBytes = kiloBytes / 1024;
            int kBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + mBytes + " MB and " + kBytes + " KB");
            // else modulo operator: MB = kiloBytes % 1024
            // KB = kiloBytes - MB * 1024;
        }
    }
}
