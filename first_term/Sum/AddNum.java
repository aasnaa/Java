package Sum;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddNum  extends JFrame implements ActionListener{
    private JTextField num1T;
    private JTextField num2T;
    private JTextField sumT;
    public AddNum()
    {
        setSize(400,400);
        setTitle("add");
        setLayout(new GridLayout(4,2,5,5));

        JLabel num1l=new JLabel("Num1:");
        JLabel num2l=new JLabel("Num2:");
        JLabel suml=new JLabel("sum:");

         num1T=new JTextField(20);
         num2T=new JTextField(20);
         sumT=new JTextField(20);

        JButton jb=new JButton("OK");
        jb.addActionListener(this);
        add(num1l);
        add(num1T);

        add(num2l);
        add(num2T);

        add(suml);
        add(sumT);


        add(jb);
        setVisible(true);

     }
    public void actionPerformed(ActionEvent e)
    {
        int a=Integer.parseInt(num1T.getText());
        int b=Integer.parseInt(num2T.getText());
        int sum=a+b;
        sumT.setText(String.valueOf(sum));




    }
    public static void main(String []args)
    {
        AddNum obj=new AddNum();
    }


}
