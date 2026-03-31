public class OOPSBannerApp_UC7 {
    static class CharacterPatternMap {
        char character;
        String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', new String[] {
                "    ***    ",
                "  **   **  ",
                " **     ** ",
                " **     ** ",
                " **     ** ",
                " **     ** ",
                " **     ** ",
                "  **   **  ",
                "    ***    "
            }),
            new CharacterPatternMap('P', new String[] {
                " *******    ",
                " **     **  ",
                " **      ** ",
                " **     **  ",
                " *******    ",
                " **         ",
                " **         ",
                " **         ",
                " **         "
            }),
            new CharacterPatternMap('S', new String[] {
                "    *****  ",
                "  **      ",
                " **       ",
                "  **      ",
                "    ***   ",
                "       ** ",
                "        **",
                "       ** ",
                "  *****   "
            })
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.character == ch) {
                return map.pattern;
            }
        }
        return null;
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        if (message == null || message.isEmpty()) {
            return;
        }

        String upper = message.toUpperCase();
        String[][] patterns = new String[upper.length()][];

        for (int i = 0; i < upper.length(); i++) {
            patterns[i] = getCharacterPattern(upper.charAt(i), charMaps);
        }

        int rows = patterns[0].length;
        for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();
            for (String[] pattern : patterns) {
                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}