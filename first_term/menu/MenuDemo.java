package menu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuDemo extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenuItem mi1,mi2,mi3;
    JMenu m;

    public MenuDemo()
    {
        mb=new JMenuBar();
        mi1=new JMenuItem("Red");
        mi2=new JMenuItem("Blue");
        mi3=new JMenuItem("Exit");
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        m=new JMenu("Color");
        m.add(mi1);
        m.add(mi2);
        m.add(mi3);
        mb.add(m);
        setJMenuBar(mb);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==mi1)
        {
           this. getContentPane().setBackground(Color.RED);

        }
        else if(e.getSource()==mi2)
        {
            this.getContentPane().setBackground(Color .BLUE);
        }
        else if(e.getSource()==mi3)
        {
            
            System.exit(0);

        }
    }
    public static void main(String []args)
    {
        new MenuDemo();
    }

}
