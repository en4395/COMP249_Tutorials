package art;

public class Painting {
    public enum PaintingType {
        CAT_PAINTING,
        APPLE_PAINTING
    };

    private String painting;

    // ASCII art is from the ASCII Art Archive https://www.asciiart.eu
    public Painting(PaintingType paintingType) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 75; i++) {
            sb.append("_");
        }

        switch(paintingType) {
            case CAT_PAINTING:
                sb.append(
                        "\n" +
                        "                      /^--^\\     /^--^\\     /^--^\\                       " + "\n" +
                        "                      \\____/     \\____/     \\____/                       " + "\n" +
                        "                     /      \\   /      \\   /      \\                      " + "\n" +
                        "KAT                 |        | |        | |        |                     " + "\n" +
                        "                     \\__  __/   \\__  __/   \\__  __/                      " + "\n" +
                        "|^|^|^|^|^|^|^|^|^|^|^|^\\ \\^|^|^|^/ /^|^|^|^|^\\ \\^|^|^|^|^|^|^|^|^|^|^|^|" + "\n" +
                        "| | | | | | | | | | | | |\\ \\| | |/ /| | | | | | \\ \\ | | | | | | | | | | |" + "\n" +
                        "########################/ /######\\ \\###########/ /#######################" + "\n" +
                        "| | | | | | | | | | | | \\/| | | | \\/| | | | | |\\/ | | | | | | | | | | | |" + "\n" +
                        "|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|\n");
                break;
            case  APPLE_PAINTING:
                sb.append(
                                "\n" +
                                "                             ___\n" +
                                "                          _/`.-'`.\n" +
                                "                _      _/` .  _. '\n" +
                                "       ..:::::.(_)   /` _.'_./\n" +
                                "     .oooooooooo\\ \\o/.-'__.'o.\n" +
                                "    .ooooooooo`._\\_|_.'`oooooob.\n" +
                                "  .ooooooooooooooooooooo&&oooooob.\n" +
                                " .oooooooooooooooooooo&@@@@@@oooob.\n" +
                                ".ooooooooooooooooooooooo&&@@@@@ooob.\n" +
                                "doooooooooooooooooooooooooo&@@@@ooob\n" +
                                "doooooooooooooooooooooooooo&@@@oooob\n" +
                                "dooooooooooooooooooooooooo&@@@ooooob\n" +
                                "dooooooooooooooooooooooooo&@@oooooob\n" +
                                "`dooooooooooooooooooooooooo&@ooooob'\n" +
                                " `doooooooooooooooooooooooooooooob'\n" +
                                "  `doooooooooooooooooooooooooooob'\n" +
                                "   `doooooooooooooooooooooooooob'\n" +
                                "    `doooooooooooooooooooooooob'\n" +
                                "     `doooooooooooooooooooooob'\n" +
                                "jgs   `dooooooooobodoooooooob'\n" +
                                "       `doooooooob dooooooob'\n" +
                                "         `\"\"\"\"\"\"\"' `\"\"\"\"\"\"'\n"
                );
        }

        for(int i = 0; i < 75; i++) {
            sb.append("_");
        }

        painting = sb.toString();
    }

    @Override
    public String toString() {
        return painting;
    }
}
