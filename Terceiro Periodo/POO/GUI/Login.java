import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class Login extends JFrame {
    private JTextField txtUser;
    private JPasswordField passUser;
    private JButton btnLogin;
    
    
    Login(){
        //Janela Configuração
        setSize(300, 200);
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5);
        //Label
        JLabel userLabel = new JLabel("Usuário:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(userLabel, gbc);
        
        JLabel passwordLabel = new JLabel("Senha:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(passwordLabel, gbc);
        
        //Campo de texto e de senha
        txtUser = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(txtUser,gbc);

        passUser = new JPasswordField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(passUser, gbc);

        //Botão
        btnLogin = new JButton("Login");
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(btnLogin, gbc);
        
        //Torna janela visivel
        setVisible(true);
        
    }


   
   

}
