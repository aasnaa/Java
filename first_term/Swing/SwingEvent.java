package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingEvent extends JFrame implements ActionListener {
    private JTextField jtf;
   public SwingEvent()
   {
    setSize(400,400);
    setTitle("My frame");
    setLayout(new FlowLayout());

    JLabel jl=new JLabel("Name:");
    jtf=new JTextField(20);
    JButton jb=new JButton("OK");
    jb.addActionListener(this);
    add(jl);
    add(jtf);
    add(jb);
    setVisible(true);




   }
  

   public void actionPerformed(ActionEvent e)
   {
    String name=jtf.getText();
    jtf.setText(name.toUpperCase());


   }
   public static void main(String [] args)
   {
    SwingEvent obj=new SwingEvent();
   }

}
