import javax.swing.*;
import java.awt.*;


class Calculator
{
    private JFrame frame = new JFrame("Calculator");
    private JLabel pan = new JLabel();
    private JTextField monitor = new JTextField();

    private JButton btn0 = new JButton("0");
    private JButton btn1 = new JButton("1");
    private JButton btn2 = new JButton("2");
    private JButton btn3 = new JButton("3");
    private JButton btn4 = new JButton("4");
    private JButton btn5 = new JButton("5");
    private JButton btn6 = new JButton("6");
    private JButton btn7 = new JButton("7");
    private JButton btn8 = new JButton("8");
    private JButton btn9 = new JButton("9");
    private JButton Fbtn1 = new JButton("C");
    private JButton Fbtn2 = new JButton("/");
    private JButton Fbtn3 = new JButton("*");
    private JButton Fbtn4 = new JButton("-");
    private JButton Fbtn5 = new JButton("+");
    private JButton Fbtn6 = new JButton("=");
    private JButton Fbtn7 = new JButton(".");
    public Calculator()
    {
        frame.setLayout(null);
        frame.setSize(295,375);

        monitor.setBounds(0,20,295,53);
        btn0.setBounds(0,286,140,53);
        Fbtn4.setBounds(210,79,70,53);
        Fbtn5.setBounds(210,132,70,106);
        Fbtn6.setBounds(210,233,70,106);
        Fbtn7.setBounds(140,286,70,53);

        pan.setBounds(0,78,210,210);
        pan.setLayout(new GridLayout(4,3));
       // pan.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pan.add(Fbtn1);
        pan.add(Fbtn2);
        pan.add(Fbtn3);
        pan.add(btn7);
        pan.add(btn8);
        pan.add(btn9);
        pan.add(btn4);
        pan.add(btn5);
        pan.add(btn6);
        pan.add(btn1);
        pan.add(btn2);
        pan.add(btn3);
        frame.add(monitor);
        frame.add(btn0);
        frame.add(Fbtn4);
        frame.add(Fbtn5);
        frame.add(Fbtn6);
        frame.add(Fbtn7);
        frame.add(pan);
        frame.setVisible(true);

    }
}
public class Main {
    public static void main(String[] args)
    {
	    new Calculator();// write your code here
    }
}
