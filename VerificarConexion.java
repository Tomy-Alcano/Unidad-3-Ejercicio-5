import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class VerificarConexion {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            JFrame ventana = new JFrame("Verificar Conexión");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(400,250);
            ventana.setLocationRelativeTo(null);

            JPanel panel = new JPanel(new GridLayout(2,1));

            JLabel lblEstado = new JLabel("Estado de la conexión: sin verificar", SwingConstants.CENTER);

            JButton btnVerificar = new JButton("Verificar conexión");

            btnVerificar.addActionListener(e -> {

                try(Connection conexion = Conexion.conectar()){
                    lblEstado.setText("✔ Conexión exitosa");
                    lblEstado.setForeground(Color.GREEN);
                } catch (Exception ex) {
                    lblEstado.setText("✘ Error de conexión");

                    lblEstado.setForeground(Color.RED);

                    JOptionPane.showMessageDialog(ventana, ex.getMessage());
                }
            });

            panel.add(lblEstado);
            panel.add(btnVerificar);

            ventana.add(panel);

            ventana.setVisible(true);
        });

    }

}
