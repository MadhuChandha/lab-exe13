package labex13;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class conversi implements ActionListener {

    
    JTextField t,t1;
    JButton b;
    JLabel l,l1;
    conversi()
    {
        JFrame f=new JFrame();
        l=new JLabel("enter number of miles");
        l.setBounds(200,10,150,20);
        t=new JTextField();
        t.setBounds(200,50,150,20);
        b=new JButton("CONVERT");
        b.setBounds(200,100,150,20);
        l1=new JLabel("RESULTS IN km");
        l1.setBounds(200,125,150,20);
        t1=new JTextField();
        t1.setBounds(200,150,150,20);
        b.addActionListener(this);
        
        f.add(l);
        f.add(t);
        f.add(b);
        f.add(t1);
        f.add(l1);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s=t.getText();
       double c=Double.parseDouble(s);
       double c1=0;
       c1=c*1.609;
       String result = String.valueOf(c1);
       t1.setText(result);
       
    }
    public static void main(String[]args)
    {
        new conversi();
    }
    }
