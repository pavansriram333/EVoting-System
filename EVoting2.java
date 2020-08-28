import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class EVoting2 extends JFrame implements ActionListener,MouseListener
{
JPanel welcome;
JPanel home;
JPanel register;
JPanel login;
JPanel vote;
JPanel eCards;
JPanel error;
JPanel success;
JPanel thanku;
CardLayout cardLo;
JButton reg;
JButton log;
JButton submitreg;
JButton loginB;
JButton subvote;
JButton logout;
JButton backhome;
JTextField dob1;
JTextField name1;
JTextField aadhar1;
JTextField phno1;
TextField passwordr1;
Checkbox c1;
Checkbox c2;
Checkbox c3;
Checkbox c4;
EVoting2()
{
setLayout(new BorderLayout());

welcome=new JPanel();
JLabel welmsg=new JLabel("ONLINE VOTING SYSTEM[E-VOTING]");
welcome.add(welmsg);
add(welcome,BorderLayout.NORTH);


error=new JPanel();
JLabel errmsg=new JLabel("U ARE NOT ELIGIBLE TO VOTE");
error.add(errmsg);


success=new JPanel();
success.setLayout(new GridLayout(2,1,3,3));
JLabel succmsg=new JLabel("U ARE SUCCESSFULLY REGISTERED TO EVOTING");
backhome=new JButton("RETURN TO HOME PAGE");
success.add(succmsg);
success.add(backhome);

thanku=new JPanel();
thanku.setLayout(new GridLayout(2,1,3,3));
JLabel msg4=new JLabel("THANK YOU FOR VOTING");
logout=new JButton("LOGOUT!");
thanku.add(msg4);
thanku.add(logout);



home=new JPanel();
home.setLayout(new GridLayout(3,1,3,3));
JLabel msg=new JLabel("WELCOME TO ONLINE VOTING SYSTEM");
reg=new JButton("REGISTER");
log=new JButton("LOGIN & VOTE");
home.add(msg);
home.add(reg);
home.add(log);
//add(home,BorderLayout.CENTER);


register=new JPanel();
register.setLayout(new GridLayout(7,2,3,3));
JLabel msg1=new JLabel("ENTER YOUR DETAILS:");
JLabel msg2=new JLabel("fields marked * are complusory");
JLabel msg3=new JLabel(" ");
JLabel name=new JLabel("NAME");
JLabel comp1=new JLabel("|enter ur full name|");
JLabel dob=new JLabel("DOB");
JLabel comp2=new JLabel("|enter date of birth in d format DD-MM-YYYY|");
JLabel aadhar=new JLabel("AADHAR NUMBER");
JLabel comp3=new JLabel("12-digit aadhar number");
JLabel phno=new JLabel("PHONE NUMBER");
JLabel comp4=new JLabel("10-digit mobile Number");
Label passwordr=new Label("password");
JLabel comp5=new JLabel("ur password must consist a uppercase & a digit");
name1=new JTextField(20);
dob1=new JTextField(9);
aadhar1=new JTextField(12);
phno1=new JTextField(10);
passwordr1=new TextField(10);
passwordr1.setEchoChar('*');
submitreg=new JButton("SUBMIT");
register.add(msg1);
register.add(msg2);
register.add(msg3);
register.add(name);
register.add(name1);
register.add(comp1);
register.add(dob);
register.add(dob1);
register.add(comp2);
register.add(aadhar);
register.add(aadhar1);
register.add(comp3);
register.add(phno);
register.add(phno1);
register.add(comp4);
register.add(passwordr);
register.add(passwordr1);
register.add(comp5);
register.add(submitreg);
//add(register,BorderLayout.CENTER);


login=new JPanel();
login.setLayout(new GridLayout(3,2,3,3));
login.setSize(150,150);
login.setBackground(Color.RED);
JLabel username=new JLabel("USERNAME");
JLabel password=new JLabel("PASSWORD");
JTextField username1=new JTextField(20);
TextField password1=new TextField(10);
password1.setEchoChar('*');
loginB=new JButton("LOGIN!");
login.add(username);
login.add(username1);
login.add(password);
login.add(password1);
login.add(loginB);
//add(log);


vote=new JPanel();
vote.setLayout(new GridLayout(5,1,3,3));
CheckboxGroup cbg=new CheckboxGroup();
c1=new Checkbox("BAJJURI SANATH KUMAR",cbg,false);
c2=new Checkbox("HANUMATH",cbg,false);
c3=new Checkbox("ANURAG NAREN",cbg,false);
c4=new Checkbox("PONUGUPATI PAWAN",cbg,false);
subvote=new JButton("SUBMIT UR VOTE");
vote.add(c1);
vote.add(c2);
vote.add(c3);
vote.add(c4);
vote.add(subvote);
//add(vote);


eCards=new JPanel();
cardLo=new CardLayout();
eCards.setLayout(cardLo);
eCards.setSize(200,200);

eCards.add(home,"HOME");
eCards.add(register,"REGISTER");
eCards.add(login,"LOGIN");
eCards.add(error,"ERROR");
eCards.add(vote,"VOTE");
eCards.add(success,"SUCCESS");
eCards.add(thanku,"THANKU");

add(eCards,BorderLayout.CENTER);

setSize(400,400);
setVisible(true);

submitreg.addActionListener(this);
reg.addActionListener(this);
backhome.addActionListener(this);
log.addActionListener(this);
loginB.addActionListener(this);
logout.addActionListener(this);
subvote.addActionListener(this);
addMouseListener(this);

/*
reg.addMouseListener(this);
log.addMouseListener(this);
submit.addMouseListener(this);
loginB.addMouseListener(this);
subvote.addMouseListener(this);
*/


}

public Insets getInsets(){ return new Insets(30,30,30,30);}


 public void mousePressed(MouseEvent me) { 
    } 
 public void mouseClicked(MouseEvent me) { 

  } 
  public void mouseEntered(MouseEvent me) { 
  } 
  public void mouseExited(MouseEvent me) { 
  } 
  public void mouseReleased(MouseEvent me) { 
  } 


public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==reg)
{
	cardLo.show(eCards,"REGISTER");
}


if(ae.getSource()==backhome)
{
	cardLo.show(eCards,"HOME");
}

if(ae.getSource()==logout)
{
	cardLo.show(eCards,"HOME");
}


if(ae.getSource()==submitreg)
{
int year=0;
int cyear=2018;
String s=dob1.getText();
StringTokenizer str=new StringTokenizer(s,"-");
while(str.hasMoreTokens())
{
System.out.println("hi");
String y=str.nextToken();
 year=Integer.parseInt(y);

}
if(cyear-year>=18)
{
System.out.println("hi");

		try
		{
		 String content1 = "NAME:"+name1.getText()+"	";
		 String content2 = "DATE OF BIRTH:"+dob1.getText()+"	";
		 String content3 = "AADHAR NO.:"+aadhar1.getText()+"	";
		 String content4 = "PHONE NO:"+phno1.getText()+"	";
		 String content5 = "PASSWORD"+passwordr1.getText()+"	";
		 String content6 = ".............||............";
	String filename=name1.getText();


        	File file = new File(filename);	//"/group2/filename.txt"

	        // if file doesnt exists, then create it
	        if (!file.exists()) {
	            file.createNewFile();
	        }
	
	        FileWriter fw = new FileWriter(file.getAbsoluteFile());
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.write(content1);
		bw.write(content2);
		bw.write(content3);
		bw.write(content4);
		bw.write(content5);
		bw.write(content6);
	        bw.close();
	
	        System.out.println("Done");
	
		}	
		catch(Exception e)	
		{
			  e.printStackTrace();
		}

	cardLo.show(eCards,"SUCCESS");
	name1.setText("");
	dob1.setText("");
	aadhar1.setText("");
	phno1.setText("");
	passwordr1.setText("");
}
else
{
	name1.setText("");
	dob1.setText("");
	aadhar1.setText("");
	phno1.setText("");
	passwordr1.setText("");
	//cardLo.show(error,"ERROR");
}
}

if(ae.getSource()==log)
{
	cardLo.show(eCards,"LOGIN");
}

if(ae.getSource()==loginB)
{
	cardLo.show(eCards,"VOTE");
}


if(ae.getSource()==subvote)
{
int v1=0;
int v2=0;
int v3=0;
int v4=0;
	
	if(c1.getState())
	{
		v1++;
System.out.println(v1);
	}	
	if(c2.getState())
	{
		v2++;
System.out.println(v2);
	}
	
	if(c3.getState())
	{	
		v3++;
System.out.println(v3);
	}
			
	if(c4.getState())
	{
		v4++;
System.out.println(v4);
	}
c1.setState(false);
c2.setState(false);
c3.setState(false);
c4.setState(false);

	cardLo.show(eCards,"THANKU");		//doubt

}


}
public static void main(String args[])
{

new EVoting2();
}
 

}