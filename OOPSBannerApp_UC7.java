/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 *
 * Uses a static inner class to encapsulate
 * character-to-pattern mapping for scalable banner rendering.
 *
 * @author Amogh
 * @version 7.0
 */

public class OOPSBannerApp_UC7 {

    public static void main(String[] args) {

        String word = "OOPS";

        String[][] patterns = new String[word.length()][];

        for (int i = 0; i < word.length(); i++) {
            patterns[i] = CharacterPatternMap.getPattern(word.charAt(i));
        }

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (int col = 0; col < patterns.length; col++) {
                line.append(patterns[col][row]).append("  ");
            }

            System.out.println(line);
        }
    }

    static class CharacterPatternMap {

        public static String[] getPattern(char ch) {

            switch (ch) {
                case 'O':
                    return new String[]{
                        "*****",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*****"
                    };

                case 'P':
                    return new String[]{
                        "*******",
                        "*     *",
                        "*     *",
                        "*******",
                        "*      ",
                        "*      ",
                        "*      "
                    };

                case 'S':
                    return new String[]{
                        "*******",
                        "****",
                        "** ",
                        "*******",
                        "     **",
                        "    ****",
                        "********"
                    };

                default:
                    return new String[]{
                        " ",
                        " ",
                        " ",
                        " ",
                        " ",
                        " ",
                        " "
                    };
            }
        }
    }
}