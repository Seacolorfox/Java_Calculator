import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Calculator
{
    private StringBuilder storeCount = new StringBuilder();
    private double firstNum;
    private double lastNum;
    private double result;
    private int state;

    private JFrame frame = new JFrame("Calculator");
    private JLabel pan = new JLabel();
    private JLabel monitor = new JLabel();

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
    private JButton cleanBtn = new JButton("C");
    private JButton divisionBtn2 = new JButton("/");
    private JButton multiplyBtn = new JButton("*");
    private JButton minusBtn = new JButton("-");
    private JButton addBtn = new JButton("+");
    private JButton equalBtn = new JButton("=");
    private JButton dotBtn = new JButton(".");

    public Calculator()
    {
        frame.setLayout(null);
        frame.setSize(295,375);

        monitor.setBounds(0,20,295,53);
       // monitor.setl
        btn0.setBounds(0,286,140,53);
        minusBtn.setBounds(210,79,70,53);
        addBtn.setBounds(210,132,70,106);
        equalBtn.setBounds(210,233,70,106);
        dotBtn.setBounds(140,286,70,53);

        pan.setBounds(0,78,210,210);
        pan.setLayout(new GridLayout(4,3));
       // pan.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pan.add(cleanBtn);
        pan.add(divisionBtn2);
        pan.add(multiplyBtn);
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
        frame.add(minusBtn);
        frame.add(addBtn);
        frame.add(equalBtn);
        frame.add(dotBtn);
        frame.add(pan);
        frame.setVisible(true);

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btn0)
                {
                    storeCount.append("0");
                    monitor.setText(storeCount.toString());
                }
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btn1)
                {
                    storeCount.append("1");
                    monitor.setText(storeCount.toString());
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btn2)
                {
                    storeCount.append("2");
                    monitor.setText(storeCount.toString());
                }
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btn3)
                {
                    storeCount.append("3");
                    monitor.setText(storeCount.toString());
                }
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btn4)
                {
                    storeCount.append("4");
                    monitor.setText(storeCount.toString());
                }
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btn5)
                {
                    storeCount.append("5");
                    monitor.setText(storeCount.toString());
                }
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btn6)
                {
                    storeCount.append("6");
                    monitor.setText(storeCount.toString());
                }
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btn7)
                {
                    storeCount.append("7");
                    monitor.setText(storeCount.toString());
                }
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btn8)
                {
                    storeCount.append("8");
                    monitor.setText(storeCount.toString());
                }
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btn9)
                {
                    storeCount.append("9");
                    monitor.setText(storeCount.toString());
                }
            }
        });
        dotBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==dotBtn)
                {
                    storeCount.append(".");
                    monitor.setText(storeCount.toString());
                }
            }
        });
        cleanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                storeCount=new StringBuilder();
                firstNum = 0;
                lastNum = 0;
                result = 0;
                monitor.setText(storeCount.toString());
            }
        });
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state=1;
                firstNum = Double.parseDouble(storeCount.toString());
                storeCount = new StringBuilder();
                monitor.setText("+");
            }
        });
        minusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state = 2;
                firstNum = Double.parseDouble(storeCount.toString());
                storeCount = new StringBuilder();
                monitor.setText("-");
            }
        });
        multiplyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state = 3;
                firstNum = Double.parseDouble(storeCount.toString());
                storeCount = new StringBuilder();
                monitor.setText("*");
            }
        });
        divisionBtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state = 4;
                firstNum = Double.parseDouble(storeCount.toString());
                storeCount = new StringBuilder();
                monitor.setText("/");
            }
        });
        equalBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!(firstNum==0.0)&&!"".equals(storeCount.toString()))
                {
                    if(state == 1)
                    {
                        lastNum = Double.parseDouble(storeCount.toString());
                        result = firstNum + lastNum;
                        monitor.setText(""+result);
                    }
                    if(state == 2)
                    {
                        lastNum = Double.parseDouble(storeCount.toString());
                        result = firstNum - lastNum;
                        monitor.setText(""+result);
                    }
                    if(state == 3)
                    {
                        lastNum = Double.parseDouble(storeCount.toString());
                        result = firstNum * lastNum;
                        monitor.setText(""+result);
                    }
                    if(state == 4)
                    {
                        lastNum = Double.parseDouble(storeCount.toString());
                        result = firstNum / lastNum;
                        monitor.setText(""+result);
                    }
                }
            }
        });
    }
}
public class Main {
    public static void main(String[] args)
    {
	    new Calculator();// write your code here
    }
}
