import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ApplicationForm extends JFrame {

    private JTextField inputField;

    public ApplicationForm() throws HeadlessException {
        setTitle("Calculator");
        setBounds(100, 100, 250, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setJMenuBar(createMenu());

        setLayout(new BorderLayout());

        add(createTop(), BorderLayout.NORTH);
        add(createBottom(), BorderLayout.CENTER);


        setVisible(true);
    }

    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("File");
        menuBar.add(menu);
        menu.add(new JMenuItem("Clear"));
        JMenuItem exit = menu.add(new JMenuItem("Exit"));
        exit.addActionListener(new ExitButtonListener());
        return menuBar;
    }

    private JPanel createTop() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);
        return top;
    }

    private JPanel createBottom()  {
        JPanel bottom = new JPanel();
        bottom.setLayout(new BorderLayout());

        JPanel digitsPanel = new JPanel();

        digitsPanel.setLayout(new GridLayout(4, 3));
        ActionListener buttonListener = new ButtonListener(inputField);
        String buttonTitle;
        JButton button;
        for (int i = 1; i <= 12; i++) {
            switch (i){
                case 1,2,3,4,5,6,7,8,9 -> {
                    buttonTitle = String.valueOf(i);
                    button = new JButton(buttonTitle);
                    button.addActionListener(buttonListener);
                    digitsPanel.add(button);
                }
                case 10 -> {
                    buttonTitle = "=";
                    button = new JButton(buttonTitle);
                    button.addActionListener(e -> {
                        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
                        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
                        try {
                            String str = inputField.getText();
                            System.out.println(str);
                            Object expResult1 = scriptEngine.eval(str);
                            inputField.setText((String)expResult1);
                        } catch (ScriptException ex) {
                            ex.printStackTrace();
                        }
                    });
                    digitsPanel.add(button);
                }
                case 11 -> {
                    buttonTitle = "0";
                    button = new JButton(buttonTitle);
                    button.addActionListener(buttonListener);
                    digitsPanel.add(button);
                }
                case 12 -> {
                    buttonTitle = "C";
                    button = new JButton(buttonTitle);
                    button.addActionListener(e -> inputField.setText(""));
                    digitsPanel.add(button);
                }
            }


        }

        bottom.add(digitsPanel, BorderLayout.CENTER);

        JPanel operators = new JPanel();
        operators.setLayout(new GridLayout(4, 1));
        JButton minus = new JButton("-");
        minus.addActionListener(buttonListener);
        operators.add(minus);
        JButton plus = new JButton("+");
        plus.addActionListener(buttonListener);
        operators.add(plus);
        JButton division = new JButton("/");
        division.addActionListener(buttonListener);
        operators.add(division);
        JButton multiply = new JButton("*");
        multiply.addActionListener(buttonListener);
        operators.add(multiply);
//        JButton clear = new JButton("C");
//        clear.addActionListener(e -> inputField.setText("") );
//        operators.add(clear);

        bottom.add(operators, BorderLayout.WEST);

        return bottom;
    }
}
