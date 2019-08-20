package financascasa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author dougl
 */
public class FinancasCasa {

    private static Connection conn;

    public static void main(String[] args) throws ClassNotFoundException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/financadomestica?useSSL=false", "root", "");

            MenuJFrame menuJFrame = new MenuJFrame(conn);
            menuJFrame.setVisible(true);
            menuJFrame.setTitle("Controle de Finanças");
            menuJFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println("Erro" + ex.getMessage());

        }

    }

}
