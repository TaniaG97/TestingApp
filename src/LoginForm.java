import org.sqlite.JDBC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class LoginForm extends JFrame
{
    private JTextField loginField;
    private JPasswordField passwordField;
    private JPanel panelLogin;
    private JButton buttonEnter;
    private JLabel lableLogin;
    private JLabel lablePass;
    private JLabel lableTitle;
    private JButton buttonRegist;

    public String login;
    public String pass;
    public String loginequals;
    public String passequals;
    public ResultSet resultSet;

    public LoginForm() throws SQLException
    {
        //инициализация формы
        super("Авторизация");

        this.setSize(500, 200);
        this.setContentPane(panelLogin);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        String BASE_PATH = "jdbc:sqlite:assets/basequestion.db"; //путь к БД
        DriverManager.registerDriver(new JDBC()); //регистрация и подключение к БД
        Connection connection = DriverManager.getConnection(BASE_PATH); //обьект для соединения с БД
//создание взаимодействия с базой
        Statement statement = connection.createStatement();

//действие для кнопки Вход
        buttonEnter.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                login = loginField.getText();
                pass = new String(passwordField.getPassword());

                try
                {
                    resultSet = statement.executeQuery("SELECT * FROM baselogin WHERE userlogin LIKE '" + login + "'");
                    passequals = resultSet.getString("password");
                    loginequals = resultSet.getString("userlogin");
                } catch (SQLException e1)
                {
                    e1.printStackTrace();
                }

                if (Objects.equals(pass, passequals))
                {
                    setVisible(false);
                    TestForm testForm = null;
                    try
                    {
                        testForm = new TestForm();
                        testForm.setVisible(true);
                    } catch (SQLException e1)
                    {
                        e1.printStackTrace();
                    }

                } else
                {
                    JOptionPane.showMessageDialog(null,
                            "непральна епт",
                            "заголовок",
                            JOptionPane.PLAIN_MESSAGE);
                }
            }
        });

// действие для кнопки Регистрация
        buttonRegist.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                setVisible(false);
                RegistForm registForm = null;
                try
                {
                    registForm = new RegistForm();
                    registForm.setVisible(true);
                } catch (SQLException e1)
                {
                    e1.printStackTrace();
                }

            }
        });
    }

}
