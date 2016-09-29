package com.lsu.misaka;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import java.awt.Frame;
import javax.swing.JOptionPane;
 
public class FiveChessFrame extends Frame implements MouseListener {
    int width=Toolkit.getDefaultToolkit().getScreenSize().width;
    int height=Toolkit.getDefaultToolkit().getScreenSize().height;

    int x=0;int y=0;

    int[][] allChess=new int[19][19];

    boolean isBlack=true;

    boolean canPlay=true;
    public FiveChessFrame(){
        setTitle("fivechess");
        setSize(500, 500);
        setLocation((width-500)/2,(height-500)/2);
        setResizable(false);
        addMouseListener(this);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics g){
        g.setFont(new Font("黑体",Font.BOLD,20));
        g.drawString("游戏信息", 120, 60);
        g.setFont(new Font("送体",Font.BOLD,12));
        g.drawString("黑方时间", 60, 480);
        g.drawString("白方时间", 260, 480);

        int y_index=0;
        for (int i = 0; i < 19; i++) {
            g.drawLine(12, 73+y_index, 372, 73+y_index);
            y_index+=20;
        }
        int x_index=0;
        for (int i = 0; i < 19; i++) {
            g.drawLine(12+x_index, 73, 12+x_index, 433);
            x_index+=20;
        }
        g.fillOval(70, 131, 4, 4);
        g.fillOval(310, 131, 4, 4);
        g.fillOval(70, 371, 4, 4);
        g.fillOval(310, 371, 4, 4);

        for (int i = 0; i<19; i++) {
            for (int j = 0; j < 19; j++) {
                if(this.allChess[i][j]==1){
                    int tempX=i*20+12;
                    int tempY=j*20+73;
                    g.fillOval(tempX-7, tempY-7, 14, 14);
                }
                if(this.allChess[i][j]==2){
                    int tempX=i*20+12;
                    int tempY=j*20+73;
                    g.setColor(Color.WHITE);
                    g.fillOval(tempX-7, tempY-7, 14, 14);
                    g.setColor(Color.BLACK);
                    g.drawOval(tempX-7, tempY-7, 14, 14);
                }
            }
        }
    }
    public void mouseClicked(MouseEvent e) {
         
    }
    public void mouseEntered(MouseEvent e) {
         
    }
    public void mouseExited(MouseEvent e) {
         
    }
    public void mousePressed(MouseEvent e) {
        if(canPlay==false){
            return;
        }
        System.out.println(e.getX()+"---"+e.getY());
         x=e.getX();
         y=e.getY();
        if(x>=12&&x<=372&&y>=73&&y<433){
            x=(x-12)/20;
            y=(y-73)/20;
            if(allChess[x][y]==0){
                if(this.isBlack==true){
                    allChess[x][y]=1;
                    isBlack=false;
                }
                else{
                    allChess[x][y]=2;
                    isBlack=true;
                }
                boolean winFlag=this.Check_Win();
                if(winFlag){
                    JOptionPane.showMessageDialog(this, "over,"+(allChess[x][y]==1?"black":"white")+" win");
                    canPlay=false;
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "error");
            }           
            this.repaint();
        }
    }
    private boolean Check_Win(){
        boolean flag=false;
        int count=1;
        int color=this.allChess[x][y];        
        count=Check_Count(1, 0, color);
        if(count>=5){
            flag=true;
        }
        else{
            count=Check_Count(0, 1, color);
            if(count>=5){
                flag=true;
            }
            else{
                count=Check_Count(1, -1, color);
                if(count>=5){
                    flag=true;
                }
                else{
                    count=Check_Count(1, 1, color);
                    if(count>=5){
                        flag=true;
                    }
                }
            }
        }
        return flag;
    }
    private int Check_Count(int xChange,int yChange,int color){
        int count=1;
        int tempX=xChange;
        int tempY=yChange;
        while(color==this.allChess[x+xChange][y+yChange]){
            count++;
            if(xChange!=0) {
                xChange++;
            }
            if(yChange!=0){
                if(yChange>0)
                yChange++;
                if(yChange<0)
                yChange--;
            }
        }
        xChange=tempX;yChange=tempY;
        while(color==this.allChess[x-xChange][y-yChange]){
            count++;
            if(xChange!=0){
                xChange++;
            }
            if(yChange!=0){
                if(yChange>0)
                yChange++;
                if(yChange<0)
                yChange--;
            }
        }
        return count;
    }
    public void mouseReleased(MouseEvent e) {
         
    }
    public static void main(String[] args) {
        new FiveChessFrame();
    }
}
