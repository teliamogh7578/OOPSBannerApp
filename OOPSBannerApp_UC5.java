/**
 * OOPSBannerApp UC5 – Optimized Array Initialization
 *
 * Combines array declaration and initialization
 * with String.join() for concise and readable code.
 *
 * @author Amogh
 * @version 5.0
 */

public class OOPSBannerApp_UC5 {

    public static void main(String[] args) {

        String[] banner = {
            String.join("  ", "*****", "*****", "*******", "*******"),
            String.join("  ", "*   *", "*   *", "*     *", "****"),
            String.join("  ", "*   *", "*   *", "*     *", "** "),
            String.join("  ", "*   *", "*   *", "*******", "*******"),
            String.join("  ", "*   *", "*   *", "*     ", "     **"),
            String.join("  ", "*   *", "*   *", "*     ", "    ****"),
            String.join("  ", "*****", "*****", "*     ", "********")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}