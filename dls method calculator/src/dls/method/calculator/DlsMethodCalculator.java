/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dls.method.calculator;

/**
 *
 * @author Ashish Katare
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DlsMethodCalculator extends JFrame implements ActionListener {
    
    JComboBox overs;
    JTextField overs2,runs1,wckt1,runs3;
    JButton generate;

   DlsMethodCalculator(){
       
       setSize(900,506);
       setLocation(400,150);
       setTitle("dls calc");
       setVisible(true);
       
       ImageIcon back = new ImageIcon(ClassLoader.getSystemResource("backimg/cric.jpg"));
        Image back2 = back.getImage().getScaledInstance(900, 506, Image.SCALE_DEFAULT);
        ImageIcon back3 = new ImageIcon(back2);
        JLabel imgback1 = new JLabel(back3);
        add(imgback1);
        
        JLabel head = new JLabel("Rain Interrupts Play!!");
        head.setFont(new Font("Raleway" , Font.BOLD,35));
        head.setBounds(270,30,400,40);
        head.setForeground(Color.yellow);
        imgback1.add(head);
        
         JLabel head1 = new JLabel("  Don't Worry , Just say hello to DLS");
        head1.setFont(new Font("Osward" , Font.ROMAN_BASELINE,20));
        head1.setBounds(280,82,340,28);
        head1.setForeground(Color.white);
        head1.setBackground(Color.BLACK);
        head1.setOpaque(true);
        imgback1.add(head1);
        
        JLabel inning1 = new JLabel(" Innings 1");
        inning1.setFont(new Font("Osward" , Font.ITALIC,20));
        inning1.setBounds(100,150,90,28);
        inning1.setForeground(Color.white);
        inning1.setBackground(Color.BLACK);
        inning1.setOpaque(true);
        imgback1.add(inning1);
        
        JLabel inning2 = new JLabel(" Innings 2");
        inning2.setFont(new Font("Osward" , Font.ITALIC,20));
        inning2.setBounds(700,150,90,28);
        inning2.setForeground(Color.white);
        inning2.setBackground(Color.BLACK);
        inning2.setOpaque(true);
        imgback1.add(inning2);
        
        JLabel Overs = new JLabel(" Overs :-");
        Overs.setFont(new Font("Osward" , Font.ITALIC,20));
        Overs.setBounds(50,200,85,28);
        Overs.setForeground(Color.white);
        Overs.setBackground(Color.BLACK);
        Overs.setOpaque(true);
        imgback1.add(Overs);
        
        String[] ovr = {"20"};
        overs = new JComboBox(ovr);
        overs.setBounds(145,200,100,28);
        overs.setBackground(Color.white);
        imgback1.add(overs);
        
        JLabel Overs2 = new JLabel(" Overs :-");
        Overs2.setFont(new Font("Osward" , Font.ITALIC,20));
        Overs2.setBounds(650,200,85,28);
        Overs2.setForeground(Color.white);
        Overs2.setBackground(Color.BLACK);
        Overs2.setOpaque(true);
        imgback1.add(Overs2);
        
        overs2 = new JTextField();
        overs2.setBounds(745,200,100,28);
        overs2.setBackground(Color.white);
        imgback1.add(overs2);
        
        JLabel bfr = new JLabel("(Overs Remaining)");
        bfr.setBounds(655,235,200,22);
        bfr.setForeground(Color.yellow);
        imgback1.add(bfr);
        
        JLabel runs = new JLabel(" Runs :-");
        runs.setFont(new Font("Osward" , Font.ITALIC,20));
        runs.setBounds(50,250,85,28);
        runs.setForeground(Color.white);
        runs.setBackground(Color.BLACK);
        runs.setOpaque(true);
        imgback1.add(runs);
        
        runs1 = new JTextField();
        runs1.setBounds(145,250,100,28);
        runs1.setBackground(Color.white);
        imgback1.add(runs1);
        
        JLabel wckt = new JLabel("Wickets:-");
        wckt.setFont(new Font("Osward" , Font.ITALIC,20));
        wckt.setBounds(650,265,87,28);
        wckt.setForeground(Color.white);
        wckt.setBackground(Color.BLACK);
        wckt.setOpaque(true);
        imgback1.add(wckt);
        
        wckt1 = new JTextField();
        wckt1.setBounds(745,265,100,28);
        wckt1.setBackground(Color.white);
        imgback1.add(wckt1);
        
         JLabel rmn = new JLabel("(Wickets lost)");
        rmn.setBounds(650,300,200,22);
        rmn.setForeground(Color.yellow);
        imgback1.add(rmn);
        
        generate = new JButton("Generate");
        generate.setBounds(380,200,120,40);
        generate.setFont(new Font( "Raleway" ,Font.ITALIC , 20 ));
        generate.setForeground(Color.WHITE);
        generate.setBackground(Color.red);
        generate.addActionListener(this);
        imgback1.add(generate);
           
   }
   
   public void actionPerformed(ActionEvent ae){
       
       String totalovers = (String) overs.getSelectedItem();
       
        String run = runs1.getText();
        String ov = overs2.getText();
        String wc = wckt1.getText();
        
        if(ae.getSource()==generate && (run.equals("") || ov.equals("") || wc.equals(""))){
            JOptionPane.showMessageDialog(null, "please fill all queries");
        }
        
        double totalrunsining1 = Double.parseDouble(runs1.getText());
        int remainingovers = Integer.parseInt(overs2.getText());
        int wicketlost = Integer.parseInt(wckt1.getText());
        
        double to = Double.parseDouble(totalovers);
        
        if(ae.getSource()==generate && remainingovers<=20 && wicketlost<=9){
            
            double arr[][] = {{100.0,96.8 ,92.6,86.7,78.8,68.2,54.4,37.5,21.3,8.3},
                              {96.1,93.3,89.2,83.9,76.7,66.6,53.5,37.3,21.0,8.3},
                              {92.2,89.6,85.9,81.1,74.2,65.0,52.7,36.9,21.0,8.3},
                              {88.2,85.7,82.5,77.9,71.7,63.3,51.6,36.6,21.0,8.3},
                              {84.1,81.8,79.0,74.7,69.1,61.3,50.4,36.2,20.8,8.3},
                              {79.9,77.9,75.3,71.6,66.4,59.2,49.1,35.7,20.8,8.3},
                              {75.4,73.7,71.4,68.0,63.4,56.9,47.7,35.2,20.8,8.3},
                              {71.0,69.4,67.3,64.5,60.4,54.4,46.1,34.5,20.7,8.3},
                              {66.4,65.0,63.3,60.6,57.1,51.9,44.3,33.6,20.5,8.3},
                              {61.7,60.4,59.0,56.7,53.7,49.1,42.4,32.7,20.3,8.3},
                              {56.7,55.8,54.4,52.7,50.0,46.1,40.3,31.6,20.1,8.3},
                              {51.8,51.1,49.8,48.4,46.1,42.8,37.8,30.2,19.8,8.3},
                              {46.6,45.9,45.1,43.8,42.0,39.4,35.2,28.6,19.3,8.3},
                              {41.3,40.8,40.1,39.2,37.8,35.5,32.2,26.9,18.6,8.3},
                              {35.9,35.5,35.0,34.3,33.2,31.4,29.0,24.6,17.8,8.1},
                              {30.4,30.0,29.7,29.2,28.4,27.2,25.3,22.1,16.6,8.1},
                              {24.6,24.4,24.2,23.9,23.3,22.4,21.2,18.9,14.8,8.0},
                              {18.7,18.6,18.4,18.2,18.0,17.5,16.8,15.4,12.7,7.4},
                              {12.7,12.5,12.5,12.4,12.4,12.0,11.7,11.0, 9.7,6.5},
                              {6.4,6.4,6.4,6.4,6.4,6.2,6.2,6.0,5.7,4.4}
            };
             double resources = arr[20-remainingovers][wicketlost];
            double target = (totalrunsining1/100)*resources;
            
            JOptionPane.showMessageDialog(null, "reduced target in "+remainingovers + " overs will be :- "+target);
       
        }
        else{
            JOptionPane.showMessageDialog(null, "please fill all queries correctly");
        }
   }
    
    public static void main(String[] args) {
        
        new DlsMethodCalculator();
    }
    
}
