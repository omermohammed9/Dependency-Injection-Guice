import java.nio.charset.StandardCharsets;

abstract class SpellChecker {
    public abstract Boolean check(String sc);
}

class TextEditor {
    private SpellChecker sc;

    public TextEditor(SpellChecker sc) {
        this.sc = sc;
    }

    public void run() {
        sc.check("auis");
        sc.check("AUIS");
        sc.check("omer");
    }
}

class WinSpecllChecker extends SpellChecker {
    public Boolean check(String sc) {
        if (sc.getBytes().equals(sc.getBytes(StandardCharsets.UTF_8))) {
            System.out.println("word matched: " + " " + sc);
            return true;
        } else System.out.println("not matched: " + " " + sc);
        return false;
    }
}

public class DI2 {
    public static void main(String[] args) {
        SpellChecker sc = new WinSpecllChecker();
        TextEditor t = new TextEditor(sc);
        t.run();
    }
}
