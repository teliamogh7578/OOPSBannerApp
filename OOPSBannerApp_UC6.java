/**
 * OOPSBannerApp UC6 – Static Helper Methods Version
 *
 * Uses static methods to generate ASCII patterns
 * for O, P and S characters.
 *
 * @author Amogh
 * @version 6.0
 */

public class OOPSBannerApp_UC6 {

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        String[] banner = {
            String.join("  ", O[0], O[0], P[0], S[0]),
            String.join("  ", O[1], O[1], P[1], S[1]),
            String.join("  ", O[2], O[2], P[2], S[2]),
            String.join("  ", O[3], O[3], P[3], S[3]),
            String.join("  ", O[4], O[4], P[4], S[4]),
            String.join("  ", O[5], O[5], P[5], S[5]),
            String.join("  ", O[6], O[6], P[6], S[6])
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static String[] getO() {
        return new String[] {
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        };
    }

    public static String[] getP() {
        return new String[] {
            "*******",
            "*     *",
            "*     *",
            "*******",
            "*      ",
            "*      ",
            "*      "
        };
    }

    public static String[] getS() {
        return new String[] {
            "*******",
            "****",
            "** ",
            "*******",
            "     **",
            "    ****",
            "********"
        };
    }
}