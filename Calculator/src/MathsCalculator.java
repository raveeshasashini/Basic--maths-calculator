import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MathsCalculator extends JFrame{
    String op;
    int value1,value2,result;
    private JLabel displayLabel;
    private JButton btn4;
    private JButton btn1;
    private JButton btn3;
    private JButton btn0;
    private JButton btn6;
    private JButton btn7;
    private JButton btn2;
    private JButton btn5;
    private JButton btn8;
    private JButton btn9;
    private JButton btnClear;
    private JButton btnequal;
    private JButton btnadd;
    private JButton btnsub;
    private JButton btnmulti;
    private JButton btndiv;
    private JButton btnfloat;
    private JPanel calPanel;
    private JLabel oplabel;


    public MathsCalculator(){
        add(calPanel);
        setTitle("Maths calculator....");
        setVisible(true);
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(displayLabel.getText()+"0");
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(displayLabel.getText()+"1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(displayLabel.getText()+"2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(displayLabel.getText()+"3");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(displayLabel.getText()+"4");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(displayLabel.getText()+"5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(displayLabel.getText()+"6");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(displayLabel.getText()+"7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(displayLabel.getText()+"8");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText(displayLabel.getText()+"9");
            }
        });

        btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value1=Integer.parseInt(displayLabel.getText());
                displayLabel.setText("");
                oplabel.setText("+");
                op="+";
            }
        });
        btnsub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value1=Integer.parseInt(displayLabel.getText());
                displayLabel.setText("");
                oplabel.setText("-");
                op="-";

            }
        });
        btnmulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value1=Integer.parseInt(displayLabel.getText());
                displayLabel.setText("");
                oplabel.setText("*");
                op="*";
            }
        });
        btndiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value1=Integer.parseInt(displayLabel.getText());
                displayLabel.setText("");
                oplabel.setText("/");
                op="/";

            }
        });
        btnfloat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value1=Integer.parseInt(displayLabel.getText());
                op=".";
            }
        });

        btnClear.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clear();
            }
        });
        btnequal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                calculate();
            }
        });
    }
    public void clear(){
        String number=displayLabel.getText();
        if(number!=null && !number.isEmpty()){
            displayLabel.setText(number.substring(0,number.length()-1));
        }
    }
    public void calculate() {
        value2 = Integer.parseInt(displayLabel.getText());

        if (op.equals("+")) {
            result = value1 + value2;
            displayLabel.setText(Integer.toString(result));
        }

        if (op.equals("-")) {
            result = value1 - value2;
            displayLabel.setText(Integer.toString(result));
        }

        if (op.equals("/")) {
            result = value1 / value2;
            displayLabel.setText(Integer.toString(result));
        }

        if (op.equals("*")) {
            result = value1 * value2;
            displayLabel.setText(Integer.toString(result));
        }

        oplabel.setText("");
    }

    public static void main(String[] args) {
        MathsCalculator calObj=new MathsCalculator();
    }
}
