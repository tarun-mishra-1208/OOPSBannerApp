import java.util.HashMap;

public class OOPSBannerApp_UC8 {
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[] {
            "    ***    ",
            "  **   **  ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            "  **   **  ",
            "    ***    "
        });

        charMap.put('P', new String[] {
            " *******    ",
            " **     **  ",
            " **      ** ",
            " **     **  ",
            " *******    ",
            " **         ",
            " **         ",
            " **         ",
            " **         "
        });

        charMap.put('S', new String[] {
            "    *****  ",
            "  **      ",
            " **       ",
            "  **      ",
            "    ***   ",
            "       ** ",
            "        **",
            "       ** ",
            "  *****   "
        });

        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        if (message == null || message.isEmpty()) {
            return;
        }

        String upper = message.toUpperCase();
        int rows = charMap.get('O').length;

        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();
            for (char ch : upper.toCharArray()) {
                String[] pattern = charMap.get(ch);
                if (pattern != null) {
                    line.append(pattern[i]).append(" ");
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}