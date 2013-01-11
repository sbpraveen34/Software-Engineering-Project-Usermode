/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ravi
 */
import java.net.*;
import java.util.*;
import java.io.*;
public class userserver {
    
    Socket soc;
    
    DataOutputStream dout;
    DataInputStream din ;
    
    userserver() throws Exception
    {
        soc = new Socket("172.17.3.129" , 6000);
        din=new DataInputStream(soc.getInputStream()); 
        dout=new DataOutputStream(soc.getOutputStream());        
        
        
        
    }
   
     public int runn()
    {        
        while(true)
        {
            try
            {
               String status = din.readUTF();
               System.out.println("inside runn of user server status is "+(status.charAt(0)-'0') );
                return status.charAt(0)-'0'; 
                   
                
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
            
        }
    }
    void write(info  s )
    {
        try
        {
        	System.out.println("user server :");
        	System.out.println("fname"+s.fname);
        	System.out.println("tname"+s.tname);
        	System.out.println("fromx"+s.fromx);
        	System.out.println("fromy"+s.fromy);
        	System.out.println("tox"+s.tox);
        	System.out.println("toy"+s.toy);
            dout.writeUTF(s.name);
            dout.flush();            
            dout.write(s.d);dout.flush();
            dout.write(s.m);dout.flush();
            dout.write(s.y);dout.flush();
            dout.writeUTF(s.hour);dout.flush();
            dout.writeUTF(s.min);dout.flush();
            dout.writeUTF(s.mobile);dout.flush();
            dout.writeUTF(s.fname);dout.flush();
            dout.writeUTF(s.tname);dout.flush();
            dout.writeUTF(s.passen_no);dout.flush();
            dout.writeUTF(s.tox+"");dout.flush();
            dout.writeUTF(s.toy+"");dout.flush();
            dout.writeUTF(s.fromx+"");dout.flush();
            dout.writeUTF(s.fromy+"");dout.flush();
            dout.writeUTF(s.type);dout.flush();
            dout.writeUTF(s.date);dout.flush();
        /*	BufferedWriter br = new BufferedWriter(new FileWriter("input.txt")); br.append(s.name);br.flush();br.newLine();
        	br.append(s.d+"");br.flush();br.newLine();br.append(s.m+"");br.flush();br.newLine();
        	br.append(s.y+"");br.flush();br.newLine();br.append(s.hour);br.flush();br.newLine();
        	br.append(s.min);br.flush();br.newLine();br.append(s.mobile);br.flush();br.newLine();
        	br.append(s.fname);br.flush();br.newLine();br.append(s.tname);br.flush();br.newLine();
        	br.append(s.passen_no);br.flush();br.newLine();br.append(s.tox+"");br.flush();br.newLine();
        	br.append(s.toy+"");br.flush();br.newLine();br.append(s.fromx+"");br.flush();br.newLine();
        	br.append(s.fromy+"");br.flush();br.newLine();br.append(s.type);br.flush();br.newLine();
        	br.append(s.date);br.flush();br.newLine();*/
        }catch(Exception e){}
    }
    void close()
    {
        try
        {
           // dout.writeUTF("LOGOUT");
            soc.close();
        }catch(Exception e){}
    }
}
