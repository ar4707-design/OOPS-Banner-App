/**
 * OOPSBannerApp UC7 – OOPS Banner Application (Use Case 7)
 *
 * This use case enhances UC6 by introducing:
 * 1. Outer Class
 * 2. Inner Class for Banner Patterns
 * 3. Static Utility Methods
 * 4. Same Output as previous use cases
 *
 * @author Developer
 * @version 7.0
 */

public class OOPSBannerApp {

    // ==========================
    // Part 1 – Outer Class
    // ==========================

    // ==========================
    // Part 2 – Inner Class
    // ==========================
    static class BannerPattern {

        public String[] getOPattern() {
            return new String[]{
                    " ***** ",
                    "**   **",
                    "**   **",
                    "**   **",
                    " ***** "
            };
        }

        public String[] getPPattern() {
            return new String[]{
                    "****** ",
                    "**   **",
                    "****** ",
                    "**      ",
                    "**      "
            };
        }

        public String[] getSPattern() {
            return new String[]{
                    " ******",
                    "**      ",
                    " ***** ",
                    "      **",
                    " ******"
            };
        }
    }

    // ==========================
    // Part 3 – Outer Class Utility Static Method
    // ==========================
    public static void printBanner(String[] o, String[] p, String[] s) {
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "   " + o[i] + "   " + p[i] + "   " + s[i]);
        }
    }

    // ==========================
    // Part 4 – Main Method
    // ==========================
    public static void main(String[] args) {

        BannerPattern banner = new BannerPattern();

        String[] oPattern = banner.getOPattern();
        String[] pPattern = banner.getPPattern();
        String[] sPattern = banner.getSPattern();

        printBanner(oPattern, pPattern, sPattern);
    }
}
