import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import java.util.ArrayList;
import java.util.List;
 
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpringLayout;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
 
public class ButtonPanel extends JPanel implements ActionListener{
 
    public static final int HEIGHT = 520;
    public static final int WIDTH = 500;
    private JButton btnPushMe;
    private JTextField textField;
    private JTextField textField_2;
    private JTextPane txtpnBinarry;
    private JPanel panel;
    private JPanel panel_1;
    private JRadioButton rdbtnBezWarunkow;
    private JRadioButton rdbtnZWarunkami;
    private JRadioButton rdbtnSuperOpcja;
 
    public ButtonPanel() {
    	setBackground(Color.LIGHT_GRAY);
        btnPushMe = new JButton("Push me!");
 
        btnPushMe.addActionListener(this);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        textField = new JTextField();
        textField.setText("101");
        textField.setBackground(UIManager.getColor("TextField.inactiveBackground"));
        textField.setColumns(10);
        
        textField_2 = new JTextField();
        textField_2.setEditable(false);
        textField_2.setColumns(10);
        SpringLayout springLayout = new SpringLayout();
        springLayout.putConstraint(SpringLayout.NORTH, textField, 10, SpringLayout.NORTH, this);
        springLayout.putConstraint(SpringLayout.EAST, textField, -325, SpringLayout.EAST, this);
        springLayout.putConstraint(SpringLayout.NORTH, btnPushMe, -1, SpringLayout.NORTH, textField);
        springLayout.putConstraint(SpringLayout.WEST, btnPushMe, 6, SpringLayout.EAST, textField);
        springLayout.putConstraint(SpringLayout.WEST, textField_2, 380, SpringLayout.WEST, this);
        springLayout.putConstraint(SpringLayout.EAST, textField_2, -26, SpringLayout.EAST, this);
        springLayout.putConstraint(SpringLayout.NORTH, textField_2, 10, SpringLayout.NORTH, this);
        setLayout(springLayout);
        add(textField);
        add(btnPushMe);
        add(textField_2);
        
        JTextPane txtpnLiczbaEl = new JTextPane();
        txtpnLiczbaEl.setForeground(Color.BLACK);
        txtpnLiczbaEl.setBackground(Color.LIGHT_GRAY);
        springLayout.putConstraint(SpringLayout.WEST, textField, 6, SpringLayout.EAST, txtpnLiczbaEl);
        springLayout.putConstraint(SpringLayout.WEST, txtpnLiczbaEl, 30, SpringLayout.WEST, this);
        springLayout.putConstraint(SpringLayout.EAST, txtpnLiczbaEl, -417, SpringLayout.EAST, this);
        springLayout.putConstraint(SpringLayout.NORTH, txtpnLiczbaEl, 10, SpringLayout.NORTH, this);
        springLayout.putConstraint(SpringLayout.SOUTH, txtpnLiczbaEl, -490, SpringLayout.SOUTH, this);
        txtpnLiczbaEl.setFont(new Font("Tahoma", Font.PLAIN, 12));
        txtpnLiczbaEl.setEditable(false);
        txtpnLiczbaEl.setText("Numer:");
        add(txtpnLiczbaEl);
        
        txtpnBinarry = new JTextPane();
        springLayout.putConstraint(SpringLayout.NORTH, txtpnBinarry, 0, SpringLayout.NORTH, textField);
        springLayout.putConstraint(SpringLayout.WEST, txtpnBinarry, 50, SpringLayout.EAST, btnPushMe);
        springLayout.putConstraint(SpringLayout.SOUTH, txtpnBinarry, -490, SpringLayout.SOUTH, this);
        springLayout.putConstraint(SpringLayout.EAST, txtpnBinarry, -6, SpringLayout.WEST, textField_2);
        txtpnBinarry.setForeground(Color.BLACK);
        txtpnBinarry.setBackground(Color.LIGHT_GRAY);
        txtpnBinarry.setFont(new Font("Tahoma", Font.PLAIN, 12));
        txtpnBinarry.setEditable(false);
        txtpnBinarry.setText("Binarnie:");
        add(txtpnBinarry);
      
        panel_1 = new Grafika();
        springLayout.putConstraint(SpringLayout.NORTH, panel_1, 28, SpringLayout.SOUTH, btnPushMe);
        springLayout.putConstraint(SpringLayout.WEST, panel_1, 24, SpringLayout.WEST, this);
        springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -10, SpringLayout.SOUTH, this);
        springLayout.putConstraint(SpringLayout.EAST, panel_1, 0, SpringLayout.EAST, textField_2);
        panel_1.setForeground(Color.BLACK);
        add(panel_1);
        
        rdbtnBezWarunkow = new JRadioButton("Bez warunkow");
        rdbtnBezWarunkow.setSelected(true);
        springLayout.putConstraint(SpringLayout.NORTH, rdbtnBezWarunkow, 6, SpringLayout.SOUTH, textField);
        springLayout.putConstraint(SpringLayout.WEST, rdbtnBezWarunkow, 0, SpringLayout.WEST, panel_1);
        add(rdbtnBezWarunkow);
        
        rdbtnZWarunkami = new JRadioButton("Z warunkami");
        springLayout.putConstraint(SpringLayout.NORTH, rdbtnZWarunkami, 6, SpringLayout.SOUTH, textField);
        springLayout.putConstraint(SpringLayout.WEST, rdbtnZWarunkami, 6, SpringLayout.EAST, rdbtnBezWarunkow);
        add(rdbtnZWarunkami);
        
        rdbtnSuperOpcja = new JRadioButton("Super opcja!");
        springLayout.putConstraint(SpringLayout.NORTH, rdbtnSuperOpcja, 0, SpringLayout.NORTH, rdbtnBezWarunkow);
        springLayout.putConstraint(SpringLayout.WEST, rdbtnSuperOpcja, 7, SpringLayout.EAST, rdbtnZWarunkami);
        add(rdbtnSuperOpcja);
        
        ButtonGroup group = new ButtonGroup();
        group.add(rdbtnBezWarunkow);
        group.add(rdbtnZWarunkami);
        group.add(rdbtnSuperOpcja);
    }
    
    	

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        int liczba = 0;
        liczba = Integer.parseInt(textField.getText());
        if (liczba == 0)
        	liczba=101;
        int krokow = 450;
        int [] tablica1 = new int[krokow];
        int [] tablica2 = new int[krokow];
        int [][] tablica3 = new int[krokow][krokow];


       
        
        StringBuffer b = new StringBuffer();
        String a;
        int tabliczka[] = new int[8];
    	int x=liczba;
    	for(int i=0;i<8;i++)
    		tabliczka[i]=0;
    	for(int i=0;i<8;i++)
    	{
    		tabliczka[7-i]=x%2;
    		x/=2;
    		
    	}
    	
    	for(int i=0;i<8;i++)
    	{
    	b.append(tabliczka[i]);
    	}
    	a=b.toString();
        textField_2.setText(a);
        
        if(rdbtnBezWarunkow.isSelected())
        	licz(0,liczba,tablica1,tablica2,krokow,tablica3);
        if(rdbtnZWarunkami.isSelected())
        	licz(1,liczba,tablica1,tablica2,krokow,tablica3);
        if(rdbtnSuperOpcja.isSelected())
        	licz(2,liczba,tablica1,tablica2,krokow,tablica3);
        
    }
    
    public void licz(int co, int dlugosc, int tab1[], int tab11[],int szerokie,int tab111[][])
    {
    	int tabliczka[] = new int[8];
    	int x=dlugosc;
    	for(int i=0;i<8;i++)
    		tabliczka[i]=0;

    	for(int i=0;i<8;i++)
    	{
    	tabliczka[i]=x%2;
    	x/=2;
    	}

    	//for(int i=0;i<8;i++)
    	//{
    	//System.out.print(tabliczka[7-i]);
    	//}
    	//System.out.print("\n\n\n");
    	for(int i=0;i<szerokie;i++)
    		{
    			tab1[i]=0;
    			tab11[i]=0;
    		}
    	tab1[szerokie/2]=1;

    	if(co==1)
    	{
    		tab1[0]=1;
    		tab1[dlugosc-1]=1;
    		tab11[0]=1;
    		tab11[dlugosc-1]=1;
    	}

    		//for(int i=0;i<szerokie;i++)
    		//System.out.print(tab1[i]);
    		//System.out.println();


    		for(int b=0;b<szerokie;b++)
    		{

    			if(co==0 || co==1)
    			for(int a=1;a<szerokie-1;a++)
    			{

    			if(tab1[a-1]==1 && tab1[a]==1 && tab1[a+1]==1)
    				tab11[a]=tabliczka[7];
    			if(tab1[a-1]==1 && tab1[a]==1 && tab1[a+1]==0)
    				tab11[a]=tabliczka[6];
    			if(tab1[a-1]==1 && tab1[a]==0 && tab1[a+1]==1)
    				tab11[a]=tabliczka[5];
    			if(tab1[a-1]==1 && tab1[a]==0 && tab1[a+1]==0)
    				tab11[a]=tabliczka[4];
    			if(tab1[a-1]==0 && tab1[a]==1 && tab1[a+1]==1)
    				tab11[a]=tabliczka[3];
    			if(tab1[a-1]==0 && tab1[a]==1 && tab1[a+1]==0)
    				tab11[a]=tabliczka[2];
    			if(tab1[a-1]==0 && tab1[a]==0 && tab1[a+1]==1)
    				tab11[a]=tabliczka[1];
    			if(tab1[a-1]==0 && tab1[a]==0 && tab1[a+1]==0)
    				tab11[a]=tabliczka[0];
    			}	

    			if(co==2)
    			for(int a=0;a<szerokie;a++)
    			{
    			if(a==0)
    			{
    			if(tab1[szerokie-1]==1 && tab1[a]==1 && tab1[a+1]==1)
    				tab11[a]=tabliczka[7];
    			if(tab1[szerokie-1]==1 && tab1[a]==1 && tab1[a+1]==0)
    				tab11[a]=tabliczka[6];
    			if(tab1[szerokie-1]==1 && tab1[a]==0 && tab1[a+1]==1)
    				tab11[a]=tabliczka[5];
    			if(tab1[szerokie-1]==1 && tab1[a]==0 && tab1[a+1]==0)
    				tab11[a]=tabliczka[4];
    			if(tab1[szerokie-1]==0 && tab1[a]==1 && tab1[a+1]==1)
    				tab11[a]=tabliczka[3];
    			if(tab1[szerokie-1]==0 && tab1[a]==1 && tab1[a+1]==0)
    				tab11[a]=tabliczka[2];
    			if(tab1[szerokie-1]==0 && tab1[a]==0 && tab1[a+1]==1)
    				tab11[a]=tabliczka[1];
    			if(tab1[szerokie-1]==0 && tab1[a]==0 && tab1[a+1]==0)
    				tab11[a]=tabliczka[0];
    			}
    			
    			
    			if(a==szerokie-1)
    			{
    			if(tab1[a-1]==1 && tab1[a]==1 && tab1[0]==1)
    				tab11[a]=tabliczka[7];
    			if(tab1[a-1]==1 && tab1[a]==1 && tab1[0]==0)
    				tab11[a]=tabliczka[6];
    			if(tab1[a-1]==1 && tab1[a]==0 && tab1[0]==1)
    				tab11[a]=tabliczka[5];
    			if(tab1[a-1]==1 && tab1[a]==0 && tab1[0]==0)
    				tab11[a]=tabliczka[4];
    			if(tab1[a-1]==0 && tab1[a]==1 && tab1[0]==1)
    				tab11[a]=tabliczka[3];
    			if(tab1[a-1]==0 && tab1[a]==1 && tab1[0]==0)
    				tab11[a]=tabliczka[2];
    			if(tab1[a-1]==0 && tab1[a]==0 && tab1[0]==1)
    				tab11[a]=tabliczka[1];
    			if(tab1[a-1]==0 && tab1[a]==0 && tab1[0]==0)
    				tab11[a]=tabliczka[0];
    			}
    			
    			if(a>0 && a<szerokie-1)
    			{
    			if(tab1[a-1]==1 && tab1[a]==1 && tab1[a+1]==1)
    				tab11[a]=tabliczka[7];
    			if(tab1[a-1]==1 && tab1[a]==1 && tab1[a+1]==0)
    				tab11[a]=tabliczka[6];
    			if(tab1[a-1]==1 && tab1[a]==0 && tab1[a+1]==1)
    				tab11[a]=tabliczka[5];
    			if(tab1[a-1]==1 && tab1[a]==0 && tab1[a+1]==0)
    				tab11[a]=tabliczka[4];
    			if(tab1[a-1]==0 && tab1[a]==1 && tab1[a+1]==1)
    				tab11[a]=tabliczka[3];
    			if(tab1[a-1]==0 && tab1[a]==1 && tab1[a+1]==0)
    				tab11[a]=tabliczka[2];
    			if(tab1[a-1]==0 && tab1[a]==0 && tab1[a+1]==1)
    				tab11[a]=tabliczka[1];
    			if(tab1[a-1]==0 && tab1[a]==0 && tab1[a+1]==0)
    				tab11[a]=tabliczka[0];
    			}
    			
    			

    			}
    		
    		for(int a=0;a<szerokie;a++)
    		{
    			tab1[a]=tab11[a];
        		tab111[a][b]=tab1[a];
    		}
        	
    		


    		}
    		
    		//for(int i=0;i<szerokie;i++)
    		//{
    			//for(int j=0;j<szerokie;j++)
    					//System.out.print(tab111[i][j]);
    					//if(tab111[i][j]==1)
    					//{
    					//		//g.drawOval(50+i, 50+j, 1, 1);
    					//		//Graphics2D eee = null;
    					//		//eee.drawOval(50+i, 50+j, 1, 1);
    					//}
    			//System.out.println();
    		//}
    		((Grafika) panel_1).GrafikaFun(tab111);
    		System.out.println();
    }

}