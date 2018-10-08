import javax.swing.*;
import java.awt.*;

public class TestForm extends JFrame
{
    private JButton buttonNext;
    private JPanel panel1;
    private JRadioButton radioButtonAnswer1;
    private JRadioButton radioButtonAnswer2;
    private JRadioButton radioButtonAnswer3;
    private JRadioButton radioButtonAnswer4;
    private JLabel lablePicture;
    private JLabel lableQuestion;

    public TestForm()
    {
        super("Тестирование");
        this.setBounds(200, 200, 500, 500);
        this.setContentPane(panel1);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$()
    {
        panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(5, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-1286));
        panel1.setDoubleBuffered(false);
        panel1.setMinimumSize(new Dimension(100, 100));
        panel1.setOpaque(true);
        panel1.setPreferredSize(new Dimension(500, 500));
        panel1.setVisible(true);
        radioButtonAnswer1 = new JRadioButton();
        radioButtonAnswer1.setFont(new Font("Arial", Font.PLAIN, 12));
        radioButtonAnswer1.setText("Ответ 1");
        panel1.add(radioButtonAnswer1, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(74, 147), null, 0, false));
        radioButtonAnswer2 = new JRadioButton();
        radioButtonAnswer2.setFont(new Font("Arial", Font.PLAIN, 12));
        radioButtonAnswer2.setText("Ответ 2");
        panel1.add(radioButtonAnswer2, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(74, 55), null, 0, false));
        radioButtonAnswer3 = new JRadioButton();
        radioButtonAnswer3.setFont(new Font("Arial", Font.PLAIN, 12));
        radioButtonAnswer3.setText("Ответ 3");
        panel1.add(radioButtonAnswer3, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(74, 147), null, 0, false));
        radioButtonAnswer4 = new JRadioButton();
        radioButtonAnswer4.setFont(new Font("Arial", Font.PLAIN, 12));
        radioButtonAnswer4.setText("Ответ 4");
        panel1.add(radioButtonAnswer4, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(74, 55), null, 0, false));
        lablePicture = new JLabel();
        lablePicture.setText("");
        panel1.add(lablePicture, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(0, 89), null, 0, false));
        buttonNext = new JButton();
        buttonNext.setFont(new Font("Arial", Font.PLAIN, 14));
        buttonNext.setText("Дальше");
        panel1.add(buttonNext, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(64, 40), null, 0, false));
        lableQuestion = new JLabel();
        lableQuestion.setFont(new Font("Arial", Font.PLAIN, 12));
        lableQuestion.setForeground(new Color(-16711422));
        lableQuestion.setText("Какой-то гребаный вопрос");
        panel1.add(lableQuestion, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(151, 81), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$()
    {
        return panel1;
    }
}
