package principal;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import vista.GUI_MenuPrincipal;

public class Main {

    public static void main(String[] args) {
        
        FlatArcDarkOrangeIJTheme.setup();

        new GUI_MenuPrincipal().setVisible(true);
    }
}
