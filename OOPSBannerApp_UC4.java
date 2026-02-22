/**
 * OOPSBannerApp UC4 – OOPS Banner Display Application
 *
 * Improved version of UC3 using String Array and Loop
 * to remove repetitive print statements.
 *
 * @author Amogh
 * @version 4.0
 */

public class OOPSBannerApp_UC4 {
    public static void main(String[] args) {
        String[] banner = {
            String.join("  ", "*****", "*****", "*******", "*******"),
            String.join("  ", "*   *", "*   *", "*     *",  "****"),
            String.join("  ", "*   *", "*   *", "*     *",  "** "),
            String.join("  ", "*   *", "*   *", "*******",  "*******"),
            String.join("  ", "*   *", "*   *", "*     ",   "     **"),
            String.join("  ", "*   *", "*   *", "*     ",   "    ****"),
            String.join("  ", "*****", "*****", "*     ",   "********")
        };
        for (String line : banner) {
            System.out.println(line);
        }
    }
}