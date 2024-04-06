import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Claculator implements ActionListener {
	
	boolean isOperaterClick=false;
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton egButton;
	
	String oldValue;
	JButton niButton;
	JButton frButton;
	JButton fiButton;
	JButton siButton;
	JButton onButton;
	JButton twButton;
	JButton dotButton;
	JButton thButton;
	JButton zeroButton;
	JButton eqButton;
	JButton mulButton;
	JButton divButton;
	JButton addButton;
	JButton negButton;
	JButton clrButton;
	
	public Claculator() {
	    jf=new JFrame("Claculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(900,100);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.DARK_GRAY);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		
		jf.add(displayLabel);
		
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30,130,80,80);
		jf.add(sevenButton);
		sevenButton.addActionListener(this);
		
		egButton=new JButton("8");
		egButton.setBounds(130,130,80,80);
		jf.add(egButton);
		egButton.addActionListener(this);
		
		
		niButton=new JButton("9");
		niButton.setBounds(230,130,80,80);
		jf.add(niButton);
		niButton.addActionListener(this);
		
		
	    frButton=new JButton("4");
		frButton.setBounds(30,230,80,80);
		jf.add(frButton);
		frButton.addActionListener(this);
		
		fiButton=new JButton("5");
		fiButton.setBounds(130,230,80,80);
		jf.add(fiButton);
		fiButton.addActionListener(this);
		
		siButton=new JButton("6");
		siButton.setBounds(230,230,80,80);
		jf.add(siButton);
		siButton.addActionListener(this);
		
		onButton=new JButton("1");
		onButton.setBounds(30,330,80,80);
		jf.add(onButton);
		onButton.addActionListener(this);
		
		
		twButton=new JButton("2");
		twButton.setBounds(130,330,80,80);
		jf.add(twButton);
		twButton.addActionListener(this);
		
		thButton=new JButton("3");
		thButton.setBounds(230,330,80,80);
		jf.add(thButton);
		thButton.addActionListener(this);
		
		
		
		dotButton=new JButton(".");
		dotButton.setBounds(30,430,80,80);
		jf.add(dotButton);
		dotButton.addActionListener(this);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(130,430,80,80);
		jf.add(zeroButton);
		zeroButton.addActionListener(this);
		
		eqButton=new JButton("=");
		eqButton.setBounds(230,430,80,80);
		jf.add(eqButton);
		eqButton.addActionListener(this);
		
		divButton=new JButton("/");
		divButton.setBounds(330,130,80,80);
		jf.add(divButton);
		divButton.addActionListener(this);
		
		 mulButton=new JButton("*");
		mulButton.setBounds(330,230,80,80);
		jf.add(mulButton);
		mulButton.addActionListener(this);
		
		addButton=new JButton("+");
		addButton.setBounds(330,330,80,80);
		jf.add(addButton);
		addButton.addActionListener(this);
		
		negButton=new JButton("-");
		negButton.setBounds(330,430,80,80);
		jf.add(negButton);
		negButton.addActionListener(this);
		
		
		clrButton=new JButton("x");
		clrButton.setBounds(430,430,80,80);
		jf.add(clrButton);
		clrButton.addActionListener(this);
		
		
		
	
	
	
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}
	
	public static void main(String[] args) {
		Claculator c=new Claculator();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			
			if(isOperaterClick) {
				
				displayLabel.setText("7");
				isOperaterClick=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
			
		}else if (e.getSource()==egButton) {
if(isOperaterClick) {
				
				displayLabel.setText("8");
				isOperaterClick=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
			
			
			
		}else if (e.getSource()==niButton) {
			displayLabel.setText(displayLabel.getText()+"9");			
		}else if (e.getSource()==frButton) {
			displayLabel.setText(displayLabel.getText()+"4");
			
		}else if (e.getSource()==fiButton) {
			displayLabel.setText(displayLabel.getText()+"5");
			
		}else if (e.getSource()==siButton) {
			displayLabel.setText(displayLabel.getText()+"6");
			
		}else if (e.getSource()==onButton) {
			displayLabel.setText(displayLabel.getText()+"1");
			
		}else if (e.getSource()==twButton) {
			displayLabel.setText(displayLabel.getText()+"2");
			
		}else if (e.getSource()==thButton) {
			displayLabel.setText(displayLabel.getText()+"3");
			
		}else if (e.getSource()==dotButton) {
			displayLabel.setText(displayLabel.getText()+".");
			
		}else if (e.getSource()==zeroButton) {
			displayLabel.setText(displayLabel.getText()+"0");
			
		}else if (e.getSource()==eqButton) {
			String newValue=displayLabel.getText();
			
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			
			float result=oldValueF+newValueF;
			
			displayLabel.setText(result+ "");
			
			
		}else if (e.getSource()==divButton) {
			
			
		}else if (e.getSource()==mulButton) {
			
			
		}else if (e.getSource()==addButton) {
			isOperaterClick=true;
			oldValue=displayLabel.getText();
			displayLabel.setText("+");
			
		}else if (e.getSource()==negButton) {
			
			
		}else if (e.getSource()==clrButton) {
			displayLabel.setText("");
		}
		
		
		
		
	}

}
