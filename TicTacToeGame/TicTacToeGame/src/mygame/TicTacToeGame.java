
package mygame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToeGame implements ActionListener		//class inherits pre-defined interface for actions performed
{
    JFrame jf;												//object creation of pre-defined class JFrame  
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;		//object creation of pre-defined class Jbutton
    
    int count=0;
    String str="";
    boolean win=false;
    
    Color c;
    
    void createGamePanel()			//method for creation of game panel
    {
        jf=new JFrame("Tic Tac Toe Game");								//frame object initialization 
        jf.setSize(500,500);											//set size of frame 
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				//stop program when closed
        jf.setLocationRelativeTo(null);									//location is center
        jf.setResizable(false);											//to stop resize 
        
        jf.setLayout(new GridLayout(3, 3));							//set 3x3 grid layout on frame
        
        /*9 button object initialization with call to 
        actionPerformed method of Actionlistener 
        whenever button is clicked*/ 
        jb1=new JButton();
        jb1.addActionListener(this);
        jf.add(jb1);
        
        jb2=new JButton();
        jb2.addActionListener(this);
        jf.add(jb2);
        
        jb3=new JButton();
        jb3.addActionListener(this);
        jf.add(jb3);
        
        jb4=new JButton();
        jb4.addActionListener(this);
        jf.add(jb4);
        
        jb5=new JButton();
        jb5.addActionListener(this);
        jf.add(jb5);
        
        jb6=new JButton();
        jb6.addActionListener(this);
        jf.add(jb6);
        
        jb7=new JButton();
        jb7.addActionListener(this);
        jf.add(jb7);
        
        jb8=new JButton();
        jb8.addActionListener(this);
        jf.add(jb8);
        
        jb9=new JButton();
        jb9.addActionListener(this);
        jf.add(jb9);
        
        jf.setVisible(true);
    }
    
    //Main method to create object of main class and call it
    public static void main(String[] args) 
    {
        TicTacToeGame ttt=new TicTacToeGame();			
        ttt.createGamePanel();
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
    	//condition for alternatively setting "X" & "O" with color effects
        count=count+1;
        if(count%2==0)
        {
            str="O";
            c=Color.GREEN;
        }
        else
        {
            str="X";
            c=Color.YELLOW;
        }
        
        /*conditions for checking the button clicked 
        and setting action according to it */
        if(e.getSource()==jb1)
        {
            jb1.setFont(new Font("Arial", Font.BOLD, 60));
            jb1.setText(str);
            jb1.setBackground(c);
            jb1.setEnabled(false);
        }
        if(e.getSource()==jb2)
        {
            jb2.setFont(new Font("Arial", Font.BOLD, 60));
            jb2.setText(str);
            jb2.setBackground(c);
            jb2.setEnabled(false);
        }
        if(e.getSource()==jb3)
        {
            jb3.setFont(new Font("Arial", Font.BOLD, 60));
            jb3.setText(str);
            jb3.setBackground(c);
            jb3.setEnabled(false);
        }
        if(e.getSource()==jb4)
        {
            jb4.setFont(new Font("Arial", Font.BOLD, 60));
            jb4.setText(str);
            jb4.setBackground(c);
            jb4.setEnabled(false);
        }
        if(e.getSource()==jb5)
        {
            jb5.setFont(new Font("Arial", Font.BOLD, 60));
            jb5.setText(str);
            jb5.setBackground(c);
            jb5.setEnabled(false);
        }
        if(e.getSource()==jb6)
        {
            jb6.setFont(new Font("Arial", Font.BOLD, 60));
            jb6.setText(str);
            jb6.setBackground(c);
            jb6.setEnabled(false);
        }
        if(e.getSource()==jb7)
        {
            jb7.setFont(new Font("Arial", Font.BOLD, 60));
            jb7.setText(str);
            jb7.setBackground(c);
            jb7.setEnabled(false);
        }
        if(e.getSource()==jb8)
        {
            jb8.setFont(new Font("Arial", Font.BOLD, 60));
            jb8.setText(str);
            jb8.setBackground(c);
            jb8.setEnabled(false);
        }
        if(e.getSource()==jb9)
        {
            jb9.setFont(new Font("Arial", Font.BOLD, 60));
            jb9.setText(str);
            jb9.setBackground(c);
            jb9.setEnabled(false);
        }
        
        winningPossibilities();
        whoWins();
    }
    
    //method to find the winning possibility-vertically,horizontally and diagnolly or else tie 
    void winningPossibilities()
    {
        //3 conditions to match row
        if(jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText() && jb1.getText() != "")
        {
            win=true;
        }
        else if(jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() && jb6.getText() != "")
        {
            win=true;
        }
        else if(jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() && jb9.getText() != "")
        {
            win=true;
        }
        //3 conditions to match columns
        else if(jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb1.getText() != "")
        {
            win=true;
        }
        else if(jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb8.getText() != "")
        {
            win=true;
        }
        else if(jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() && jb9.getText() != "")
        {
            win=true;
        }
        //2 conditions to match diagonal
        else if(jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb9.getText() != "")
        {
            win=true;
        }
        else if(jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb3.getText() != "")
        {
            win=true;
        }
        else
        {
            win=false;
        }
    }
    
    //method to show the results 
    void whoWins()
    {
        if(win==true)
        {
            //System.out.println(str+" wins");
            JOptionPane.showMessageDialog(jf, str+" wins");
            restartGame();
        }
        else if(win==false && count==9)
        {
            //System.out.println("match draw");
            JOptionPane.showMessageDialog(jf, "Match draw");
            restartGame();
        }
    }
    
    //method to ask for game restart or quit
    void restartGame()
    {
        int i=JOptionPane.showConfirmDialog(jf, "Do you want to restart the game ?");
        //condition to reset all values if game restarts
        if(i==0)
        {
            str="";
            count=0;
            win=false;
            
            jb1.setText("");
            jb2.setText("");
            jb3.setText("");
            jb4.setText("");
            jb5.setText("");
            jb6.setText("");
            jb7.setText("");
            jb8.setText("");
            jb9.setText("");
            
            jb1.setBackground(null);
            jb2.setBackground(null);
            jb3.setBackground(null);
            jb4.setBackground(null);
            jb5.setBackground(null);
            jb6.setBackground(null);
            jb7.setBackground(null);
            jb8.setBackground(null);
            jb9.setBackground(null);
            
            setBtnEnabled(true);
        }
        //condition to exit the game if no restart
        else if(i==1)
        {
            System.exit(0);
        }
        else
        {
            setBtnEnabled(false);
        }
    }
    void setBtnEnabled(boolean b)
    {
        jb1.setEnabled(b);
        jb2.setEnabled(b);
        jb3.setEnabled(b);
        jb4.setEnabled(b);
        jb5.setEnabled(b);
        jb6.setEnabled(b);
        jb7.setEnabled(b);
        jb8.setEnabled(b);
        jb9.setEnabled(b);
    }
}
