import java.awt.*;

import javax.swing.JPanel;
 
public class Grafika extends JPanel 
{
	public int tab1[][] = new int[450][450];
	void GrafikaFun(int tab[][])
	{
		for(int i=0;i<450;i++)
			for(int j=0;j<450;j++)
				this.tab1[j][i]=tab[j][i];
		this.repaint();
	}
	Grafika()
	{
		for(int i=50;i<400;i++)
			for(int j=330;j<360;j++)
				this.tab1[i][j]=1;
		for(int i=50;i<80;i++)
			for(int j=300;j<330;j++)
				this.tab1[i][j]=1;
		for(int i=370;i<400;i++)
			for(int j=300;j<330;j++)
				this.tab1[i][j]=1;
		for(int i=90;i<120;i++)
			for(int j=60;j<90;j++)
				this.tab1[i][j]=1;
		for(int i=330;i<360;i++)
			for(int j=60;j<90;j++)
				this.tab1[i][j]=1;
	}
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
 
        for(int i=0;i<450;i++)
        	for(int j=0;j<450;j++)
        		if(tab1[i][j]==1)
        			g2d.drawRect(i, j, 1, 1);
    }
}
