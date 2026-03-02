import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp UC8 – Use Map for Character Patterns
 *
 * Uses HashMap for efficient character pattern storage
 * and a dedicated render function for banner display.
 *
 * @author Amogh
 * @version 8.0
 */

public class OOPSBannerApp_UC8 {

    private static final Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();
        renderBanner("OOPS");
    }

    private static void initializePatterns() {

        patternMap.put('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        patternMap.put('P', new String[]{
                "*******",
                "*     *",
                "*     *",
                "*******",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                "*******",
                "****",
                "** ",
                "*******",
                "     **",
                "    ****",
                "********"
        });
    }

    private static void renderBanner(String word) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}