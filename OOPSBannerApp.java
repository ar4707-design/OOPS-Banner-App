/**
 * OOPSBannerApp UC8 – OOPS Banner Application (Use Case 8)
 *
 * This use case improves modularity by using only
 * static utility methods inside the main class
 * to generate each letter pattern.
 *
 * Same Output as previous use cases.
 *
 * @author Developer
 * @version 8.0
 */

public class OOPSBannerApp {

    // ==========================
    // Part 2 – Utility Static Methods
    // ==========================

    public static String[] getOPattern() {
        return new String[] {
                " ***** ",
                "**   **",
                "**   **",
                "**   **",
                " ***** "
        };
    }

    public static String[] getPPattern() {
        return new String[] {
                "****** ",
                "**   **",
                "****** ",
                "**      ",
                "**      "
        };
    }

    public static String[] getSPattern() {
        return new String[] {
                " ******",
                "**      ",
                " ***** ",
                "      **",
                " ******"
        };
    }

    // ==========================
    // Part 3 – Main Method
    // ==========================

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                    oPattern[i] + "   " +
                    oPattern[i] + "   " +
                    pPattern[i] + "   " +
                    sPattern[i]
            );
        }
    }
}
