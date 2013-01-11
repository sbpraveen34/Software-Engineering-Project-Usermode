/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ravi
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
public class clientmap 
{
    JFrame f;   
    int doneint = 0;
    JTextField fx,fy,fn ,tn;
    JButton done;
    JButton setnodes;
    int fromx,fromy , tox , toy;
    String froms , tos;
    public void go()
    {
    	System.out.println("inside map making process ");
        mypanel m = new mypanel();
        m.addMouseListener(new panellis());
        f = new JFrame("MAP");
        f.setVisible(true);f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setSize(700,700);
        fx = new JTextField("20");
        fx.setText("0-0");
        fy = new JTextField("20");
        fy.setText("0-0");
        fn = new JTextField("40");
        tn = new JTextField("20");
        fn.setText("NO WHERE");
        tn.setText("NO WHERE"); froms = "NO WHERE"; tos = "NO WHERE";
        done = new JButton("DONE");
        setnodes = new JButton("set start pt");
        done.addActionListener(new donelis());
        f.getContentPane().add(m , BorderLayout.CENTER);
        m.repaint();
        JPanel p = new JPanel(); p.add(fx);p.add(fy);p.add(fn);p.add(setnodes);p.add(done);
        f.getContentPane().add(p,BorderLayout.SOUTH);
    }
    
    class panellis implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {
        	//System.out.println("inside mouse clicked");
             if(setnodes.getText().equals("set start pt"))
             {
                 fromx = e.getX(); fromy = e.getY(); f.repaint(); froms = getname(fromx , fromy);fn.setText("near"+froms);setnodes.setText("set destination");
                 fx.setText(fromx+"--"+fromy);
             }
             else
             {
                 tox = e.getX(); toy = e.getY(); f.repaint();tos = getname(tox , toy);fn.setText("near"+froms+ "-- " +tos);setnodes.setText("set start pt");
                 fy.setText(tox+"--"+toy);
             }
        }
        
        String getname(int x , int y)
        {
        	System.out.println("inside getname");
            String name = null;
            try
            {
            	//System.out.println("opening jmap.txt");
                BufferedReader br = new BufferedReader(new FileReader("jmap.txt"));
                        String line = "" ;  double min = 999999999;
                        while((line = br.readLine())!= null)
                        {
                        	//System.out.println("line is now "+line);
                            String[] s = new String[3];s = line.split("/");
                            int xx = toint(s[1]);int yy = toint(s[2]);double dis = (xx-x)*(xx-x) + (yy-y)*(yy-y) ; dis = Math.sqrt(dis);
                            //System.out.println("xx is "+xx);System.out.println("yy is "+yy);System.out.println("dis is "+dis);
                           // if(dis <= 7)
                            //{
                            	System.out.println("yo we got a hit ");
                                if(min > dis){  min = dis ; name = s[0];}
                            //}
                        }
                        if(name == null)
                            name = "------";
                     //   System.out.println("i got name as "+name);
            }catch(Exception ee){}
            System.out.println(" outside catch and i got name as "+name);
            return name;
        }
        int toint(String s)
       {
        int sum = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            int e = s.charAt(i) - '0';
            sum = sum*10 + e ;
        }
        return sum ;
       }
        public void mousePressed(MouseEvent e)
        {
            
        }
        public void mouseReleased(MouseEvent e)
        {
            
        }
        public void mouseEntered(MouseEvent e)
        {
            
        }
        public void mouseExited(MouseEvent e)
        {
            
        }
                
    }
    class mypanel extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            g.setColor(Color.WHITE);
            g.drawRect(0, 0, f.getHeight(), f.getWidth());
            Image I = new ImageIcon("jmap.jpg").getImage();
            g.drawImage(I, 0, 0, this);
        }
    }
    class donelis implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            f.setVisible(false);
            doneint = 1;
            System.out.println("my work is done set done int 1");
        }
    }
    
    String getfname()
    {
        
        return froms;
    }
    String gettname()
    {
        return tos;
    }
    int getfromx()
    {
    	return fromx;
    }
    int getfromy()
    {
    	return fromy;
    }
    int gettox()
    {
    	return tox;
    }
    int gettoy()
    {
    	return tox;
    }
}
