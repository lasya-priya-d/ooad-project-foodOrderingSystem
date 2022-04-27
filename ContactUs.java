import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ContactUs extends Homepage
{
	JLabel l = new JLabel("TEAM NO 8");
	JLabel l1 = new JLabel("NEHA, DEEPALI & LASYA");
	JLabel l2 = new JLabel("6th sem, CSE");
	JLabel l3 = new JLabel("PES UNIVERISITY EC CAMPUS");
	JLabel l4 = new JLabel("Bangalore");
	JLabel l5 = new JLabel("Please Give Us Your Valuable Feedback ");
	JLabel l6 = new JLabel("Email");
	JTextField f = new JTextField();
	JLabel l7 = new JLabel("Feedback");
	JTextField f1 = new JTextField();
	JButton b = new JButton("Submit");

	
	public ContactUs()
	{
		//setSize(1500,1000);
		//setVisible(true);
		//setLayout(null);
		
		l.setBounds(110,100,600,30);
		l.setFont(new Font("Arial",25,25));
		add(l);
		
		l1.setBounds(110,130,600,30);
		l1.setFont(new Font("Arial",25,25));
		add(l1);
		
		l2.setBounds(110,160,600,30);
		l2.setFont(new Font("Arial",25,25));
		add(l2);
		
		l3.setBounds(110,190,600,30);
		l3.setFont(new Font("Arial",25,25));
		add(l3);
		
		l4.setBounds(110,220,600,30);
		l4.setFont(new Font("Arial",25,25));
		add(l4);
		
		l5.setBounds(800,350,600,30);
		l5.setFont(new Font("Arial",25,25));
		add(l5);
		
		
		l6.setBounds(850,400,100,30);
		l6.setFont(new Font("Arial",25,25));
		add(l6);
		
		f.setBounds(950,400,250,30);
		add(f);
		
		l7.setBounds(850,450,100,30);
		l7.setFont(new Font("Arial",25,25));
		add(l7);
		
		f1.setBounds(950,450,250,120);
		add(f1);
		
		add(b);
		b.setBounds(950,600,150,30);
	}
	
	public void actionPerformed(ActionEvent a)
	{
		   if(a.getSource() == b1)
			{
				this.setVisible(false);
				Homepage h = new Homepage();
			}
		   else if(a.getSource() == b2)
			{
				this.setVisible(false);
				Menu m = new Menu();
			}
		   else if(a.getSource() == b3)
			{
				HomeDelivery s = new HomeDelivery();
			}
			else if(a.getSource() == b4)
			{
				this.setVisible(false);
				ContactUs c = new ContactUs();
			}
			else if(a.getSource() == b5)
			{
				Admin B = new Admin();
			}
			else
			{
				Login n = new Login();
			}
	}
}