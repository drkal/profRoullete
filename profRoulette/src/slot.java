

import java.awt.Color;
import java.awt.Component;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SpinnerDateModel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Panos
 */
public class slot extends javax.swing.JFrame {

    public static int m;
    public static int i;
    public static double r;
    public static JButton j = new JButton();
    public static TextField t = new TextField();
    
    /**
     * Creates new form slot
     */
    public slot() {
        setLocation(600, 100);
        initComponents();
    }
    
    public static void stopSafe(){
        jB1.setEnabled(true);
        jB2.setEnabled(true);
        jB3.setEnabled(true);
        jB4.setEnabled(true);
        jb5.setEnabled(true);
        jb6.setEnabled(true);
        jb7.setEnabled(true);
        jb8.setEnabled(true);
        jb9.setEnabled(true);
        jb10.setEnabled(true);
        jb11.setEnabled(true);
        jb12.setEnabled(true);
        jb13.setEnabled(true);
        jb14.setEnabled(true);
        jB15.setEnabled(true);
        jB16.setEnabled(true);
        jB17.setEnabled(true);
        jB18.setEnabled(true);
        jB19.setEnabled(true);
        jB20.setEnabled(true);
        jB21.setEnabled(true);
        jB22.setEnabled(true);
        jB23.setEnabled(true);
        jB24.setEnabled(true);
        jB25.setEnabled(true);
        jB26.setEnabled(true);
        jB27.setEnabled(true);
        jB28.setEnabled(true);
        jB29.setEnabled(true);
        jB30.setEnabled(true);
        jB31.setEnabled(true);
        jB32.setEnabled(true);
        jB33.setEnabled(true);
        jB34.setEnabled(true);
        jB35.setEnabled(true);
        jB36.setEnabled(true);
        oddB.setEnabled(true);
        evenB.setEnabled(true);
        red.setEnabled(true);
        black.setEnabled(true);
        Nunber.setEnabled(true);
        Colore.setEnabled(true);
        bet.setEnabled(true);
        betCheck.setEnabled(true);
        nobetCheck.setEnabled(true);
        spin.setEnabled(true);
        ClearB.setEnabled(true);
        newGame.setEnabled(true);
   }
    public static void colorStopSafe(){
        oddB.setEnabled(true);
        evenB.setEnabled(true);
        red.setEnabled(true);
        black.setEnabled(true);
        Nunber.setEnabled(true);
        Colore.setEnabled(true);
        bet.setEnabled(true);
        betCheck.setEnabled(true);
        nobetCheck.setEnabled(true);
        spin.setEnabled(true);
        ClearB.setEnabled(true);
        newGame.setEnabled(true);
    }
    
     public static void safety(){
     jB1.setEnabled(false);
        jB2.setEnabled(false);
        jB3.setEnabled(false);
        jB4.setEnabled(false);
        jb5.setEnabled(false);
        jb6.setEnabled(false);
        jb7.setEnabled(false);
        jb8.setEnabled(false);
        jb9.setEnabled(false);
        jb10.setEnabled(false);
        jb11.setEnabled(false);
        jb12.setEnabled(false);
        jb13.setEnabled(false);
        jb14.setEnabled(false);
        jB15.setEnabled(false);
        jB16.setEnabled(false);
        jB17.setEnabled(false);
        jB18.setEnabled(false);
        jB19.setEnabled(false);
        jB20.setEnabled(false);
        jB21.setEnabled(false);
        jB22.setEnabled(false);
        jB23.setEnabled(false);
        jB24.setEnabled(false);
        jB25.setEnabled(false);
        jB26.setEnabled(false);
        jB27.setEnabled(false);
        jB28.setEnabled(false);
        jB29.setEnabled(false);
        jB30.setEnabled(false);
        jB31.setEnabled(false);
        jB32.setEnabled(false);
        jB33.setEnabled(false);
        jB34.setEnabled(false);
        jB35.setEnabled(false);
        jB36.setEnabled(false);
         oddB.setEnabled(false);
        evenB.setEnabled(false);
        red.setEnabled(false);
        black.setEnabled(false);
        Nunber.setEnabled(false);
        Colore.setEnabled(false);
        bet.setEnabled(false);
        betCheck.setEnabled(false);
        nobetCheck.setEnabled(false);
        spin.setEnabled(false);
        ClearB.setEnabled(false);
        newGame.setEnabled(false);
    }
   

   

    public void budgetCheck() {
       if(Double.parseDouble(money.getText())<=0 && betCheck.isSelected()){
                 JOptionPane.showMessageDialog(null, "Τελείωσαν τα χρήματα σου.\nΠαίξε χωρίς πονταρίσματα,\nή αν θες ξεκίνα ένα καινούριο παιχνίδι.");
                 nobetCheck.setSelected(true);
                 bet.setText("0");
                 return;
        }else {
          all();
        }
    }

    public static void numberCheck() {
        if (result.getText().equals(given.getText())) {
            ++r;
            m = 1;
            talk.insert("Συγχαρητήρια!!! Κέρδισες!!!\nΒγήκε το " + given.getText() + "\nπου επέλεξες! " + Attakes.win(), 0);
        } else {
            talk.insert("Δυστυχώς Έχασες " + Attakes.lost(), 0);
            m = 0;
        }
    }

    public static void colorCheck() {
        if ((result.getBackground().equals(given.getBackground()))) {
            if (Color.red.equals(result.getBackground())) {
                ++r;
                talk.insert("Συγχαρητήρια!!!\nΚέρδισες!!!\n Βγήκε το Κόκκινο! " + Attakes.win(), 0);
                m = 1;

            } else if (Color.black.equals(result.getBackground())) {
                ++r;
                talk.insert("Συγχαρητήρια!!!\nΚέρδισες!!!\n Βγήκε το Μαύρο! " + Attakes.win(), 0);
                m = 1;
            }
        } else {
            talk.insert("Δυστυχώς Έχασες " + Attakes.lost(), 0);
            m = 0;
        }
    }

    public static void EvOdCheck() {
        int a;
        String b = result.getText();
        a = Integer.parseInt(b);
        if (a % 2 == 0 && given.getText().equals("O")) {
            ++r;
            talk.insert("Συγχαρητήρια!!!\nΚέρδισες!!!\nΒγήκε το " + result.getText() + " και είναι\nΑΡΤΙΟΣ " + Attakes.win(), 0);
            m = 1;


        } else if (a % 2 != 0 && given.getText().equals("E")) {
            ++r;
            talk.insert("Συγχαρητήρια!!!\nΚέρδισες!!!\nΒγήκε το " + result.getText() + " και είναι\nΠΕΡΙΤΟΣ " + Attakes.win(), 0);
            m = 1;

        } else {
            talk.insert("Δυστυχώς Έχασες " + Attakes.lost(), 0);
            m = 0;
        }
    }

    public static void evcolCheck() {
        int a;
        String b = result.getText();
        a = Integer.parseInt(b);
        if (given.getText().equals("O") && a % 2 == 0) {
            if (given.getBackground().equals(result.getBackground())) {
                ++r;
                talk.insert("Συγχαρητήρια!!!\nΚέρδισες!!!\nΒγήκε το " + result.getText() + " και είναι\nΑΡΤΙΟΣ " + Attakes.win(), 0);
                m = 1;
            } else {
                talk.insert("Δυστυχώς Έχασες " + Attakes.lost(), 0);
                m = 0;
            }
        } else if (given.getText().equals("E") && a % 2 != 0) {
            if (given.getBackground().equals(result.getBackground())) {
                ++r;
                talk.insert("Συγχαρητήρια!!!\nΚέρδισες!!!\nΒγήκε το " + result.getText() + " και είναι\nΠΕΡΙΤΟΣ " + Attakes.win(), 0);
                m = 1;
            } else {
                talk.insert("Δυστυχώς Έχασες " + Attakes.lost(), 0);
                m = 0;
            }
        } else {
            talk.insert("Δυστυχώς Έχασες " + Attakes.lost(), 0);
            m = 0;
        }

    }

    public void all() {

        if (given.getBackground().equals(Color.green) && "".equals(given.getText())) {
            JOptionPane.showMessageDialog(null, "Ξέχασες να επιλέξεις\nπροσπάθησε πάλι!");
        } else if (!Nunber.isSelected() && !Colore.isSelected()) {
            JOptionPane.showMessageDialog(null, "Δώσε μία επιλογή:\nΝούμερο, χρώμα, Μονά-Ζυγά ");
        } else if (betCheck.isSelected() && ("0".equals(bet.getText()) || "".equals(bet.getText()))) {
            JOptionPane.showMessageDialog(null, "Βάλε ένα ποσό.");
        } else if (Nunber.isSelected()) {
            Thread t10 = new Thread(new myPlayer(), "t10");
            t10.start();
             Thread t3 = new Thread(new luck(), "t3");
            t3.start();
          
        } else if (Colore.isSelected() && "".equals(given.getText())) {
            Thread t10 = new Thread(new myPlayer(), "t10");
           t10.start();
//            Thread t4 = new Thread(new luckC(), "t4");
//            t4.start();         
            Thread t3 = new Thread(new luck(), "t3");
            t3.start();
           
        } else if (Colore.isSelected() && !"".equals(given.getText())) {
            Thread t10 = new Thread(new myPlayer(), "t10");
           t10.start();
          Thread t3 = new Thread(new luck(), "t3");
            t3.start();
        }
           
    }

    public static void checkWin() {

        if (Nunber.isSelected()) {
            numberCheck();
        } else if (Colore.isSelected()) {
            if (given.getBackground().equals(Color.green)) {
                EvOdCheck();
            } else if ((given.getBackground().equals(red.getBackground()) || given.getBackground().equals(black.getBackground())) && "".equals(given.getText())) {
                colorCheck();
            } else {
                evcolCheck();
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        numPanel = new javax.swing.JPanel();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jb10 = new javax.swing.JButton();
        jb11 = new javax.swing.JButton();
        jb12 = new javax.swing.JButton();
        jb13 = new javax.swing.JButton();
        jb14 = new javax.swing.JButton();
        jB15 = new javax.swing.JButton();
        jB16 = new javax.swing.JButton();
        jB17 = new javax.swing.JButton();
        jB18 = new javax.swing.JButton();
        jB19 = new javax.swing.JButton();
        jB20 = new javax.swing.JButton();
        jB21 = new javax.swing.JButton();
        jB22 = new javax.swing.JButton();
        jB23 = new javax.swing.JButton();
        jB24 = new javax.swing.JButton();
        jB25 = new javax.swing.JButton();
        jB26 = new javax.swing.JButton();
        jB27 = new javax.swing.JButton();
        jB28 = new javax.swing.JButton();
        jB29 = new javax.swing.JButton();
        jB30 = new javax.swing.JButton();
        jB31 = new javax.swing.JButton();
        jB32 = new javax.swing.JButton();
        jB33 = new javax.swing.JButton();
        jB34 = new javax.swing.JButton();
        jB35 = new javax.swing.JButton();
        jB36 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        result = new javax.swing.JTextField();
        given = new javax.swing.JTextField();
        spin = new javax.swing.JButton();
        newGame = new javax.swing.JButton();
        ClearB = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Nunber = new javax.swing.JRadioButton();
        Colore = new javax.swing.JRadioButton();
        red = new javax.swing.JButton();
        black = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        talk = new javax.swing.JTextArea();
        oddB = new javax.swing.JButton();
        evenB = new javax.swing.JButton();
        bet = new javax.swing.JTextField();
        money = new javax.swing.JTextField();
        games = new javax.swing.JTextField();
        percent = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        betCheck = new javax.swing.JCheckBox();
        nobetCheck = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 0));
        setForeground(java.awt.Color.white);
        setResizable(false);

        numPanel.setBackground(new java.awt.Color(51, 102, 0));
        numPanel.setLayout(new java.awt.GridLayout(12, 3));

        jB1.setBackground(java.awt.Color.red);
        jB1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB1.setText("1");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });
        numPanel.add(jB1);

        jB2.setBackground(new java.awt.Color(0, 0, 0));
        jB2.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB2.setForeground(new java.awt.Color(255, 255, 255));
        jB2.setText("2");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });
        numPanel.add(jB2);

        jB3.setBackground(java.awt.Color.red);
        jB3.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB3.setText("3");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });
        numPanel.add(jB3);

        jB4.setBackground(new java.awt.Color(0, 0, 0));
        jB4.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB4.setForeground(new java.awt.Color(255, 255, 255));
        jB4.setText("4");
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });
        numPanel.add(jB4);

        jb5.setBackground(java.awt.Color.red);
        jb5.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jb5.setText("5");
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });
        numPanel.add(jb5);

        jb6.setBackground(new java.awt.Color(0, 0, 0));
        jb6.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jb6.setForeground(new java.awt.Color(255, 255, 255));
        jb6.setText("6");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });
        numPanel.add(jb6);

        jb7.setBackground(java.awt.Color.red);
        jb7.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jb7.setText("7");
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });
        numPanel.add(jb7);

        jb8.setBackground(new java.awt.Color(0, 0, 0));
        jb8.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jb8.setForeground(new java.awt.Color(255, 255, 255));
        jb8.setText("8");
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });
        numPanel.add(jb8);

        jb9.setBackground(java.awt.Color.red);
        jb9.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jb9.setText("9");
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });
        numPanel.add(jb9);

        jb10.setBackground(new java.awt.Color(0, 0, 0));
        jb10.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jb10.setForeground(new java.awt.Color(255, 255, 255));
        jb10.setText("10");
        jb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb10ActionPerformed(evt);
            }
        });
        numPanel.add(jb10);

        jb11.setBackground(new java.awt.Color(0, 0, 0));
        jb11.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jb11.setForeground(new java.awt.Color(255, 255, 255));
        jb11.setText("11");
        jb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb11ActionPerformed(evt);
            }
        });
        numPanel.add(jb11);

        jb12.setBackground(java.awt.Color.red);
        jb12.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jb12.setText("12");
        jb12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb12ActionPerformed(evt);
            }
        });
        numPanel.add(jb12);

        jb13.setBackground(new java.awt.Color(0, 0, 0));
        jb13.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jb13.setForeground(new java.awt.Color(255, 255, 255));
        jb13.setText("13");
        jb13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb13ActionPerformed(evt);
            }
        });
        numPanel.add(jb13);

        jb14.setBackground(java.awt.Color.red);
        jb14.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jb14.setText("14");
        jb14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb14ActionPerformed(evt);
            }
        });
        numPanel.add(jb14);

        jB15.setBackground(new java.awt.Color(0, 0, 0));
        jB15.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB15.setForeground(new java.awt.Color(255, 255, 255));
        jB15.setText("15");
        jB15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB15ActionPerformed(evt);
            }
        });
        numPanel.add(jB15);

        jB16.setBackground(java.awt.Color.red);
        jB16.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB16.setText("16");
        jB16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB16ActionPerformed(evt);
            }
        });
        numPanel.add(jB16);

        jB17.setBackground(new java.awt.Color(0, 0, 0));
        jB17.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB17.setForeground(new java.awt.Color(255, 255, 255));
        jB17.setText("17");
        jB17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB17ActionPerformed(evt);
            }
        });
        numPanel.add(jB17);

        jB18.setBackground(java.awt.Color.red);
        jB18.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB18.setText("18");
        jB18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB18ActionPerformed(evt);
            }
        });
        numPanel.add(jB18);

        jB19.setBackground(java.awt.Color.red);
        jB19.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB19.setText("19");
        jB19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB19ActionPerformed(evt);
            }
        });
        numPanel.add(jB19);

        jB20.setBackground(new java.awt.Color(0, 0, 0));
        jB20.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB20.setForeground(new java.awt.Color(255, 255, 255));
        jB20.setText("20");
        jB20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB20ActionPerformed(evt);
            }
        });
        numPanel.add(jB20);

        jB21.setBackground(java.awt.Color.red);
        jB21.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB21.setText("21");
        jB21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB21ActionPerformed(evt);
            }
        });
        numPanel.add(jB21);

        jB22.setBackground(new java.awt.Color(0, 0, 0));
        jB22.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB22.setForeground(new java.awt.Color(255, 255, 255));
        jB22.setText("22");
        jB22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB22ActionPerformed(evt);
            }
        });
        numPanel.add(jB22);

        jB23.setBackground(java.awt.Color.red);
        jB23.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB23.setText("23");
        jB23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB23ActionPerformed(evt);
            }
        });
        numPanel.add(jB23);

        jB24.setBackground(new java.awt.Color(0, 0, 0));
        jB24.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB24.setForeground(new java.awt.Color(255, 255, 255));
        jB24.setText("24");
        jB24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB24ActionPerformed(evt);
            }
        });
        numPanel.add(jB24);

        jB25.setBackground(java.awt.Color.red);
        jB25.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB25.setText("25");
        jB25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB25ActionPerformed(evt);
            }
        });
        numPanel.add(jB25);

        jB26.setBackground(new java.awt.Color(0, 0, 0));
        jB26.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB26.setForeground(new java.awt.Color(255, 255, 255));
        jB26.setText("26");
        jB26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB26ActionPerformed(evt);
            }
        });
        numPanel.add(jB26);

        jB27.setBackground(java.awt.Color.red);
        jB27.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB27.setText("27");
        jB27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB27ActionPerformed(evt);
            }
        });
        numPanel.add(jB27);

        jB28.setBackground(new java.awt.Color(0, 0, 0));
        jB28.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB28.setForeground(new java.awt.Color(255, 255, 255));
        jB28.setText("28");
        jB28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB28ActionPerformed(evt);
            }
        });
        numPanel.add(jB28);

        jB29.setBackground(new java.awt.Color(0, 0, 0));
        jB29.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB29.setForeground(new java.awt.Color(255, 255, 255));
        jB29.setText("29");
        jB29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB29ActionPerformed(evt);
            }
        });
        numPanel.add(jB29);

        jB30.setBackground(java.awt.Color.red);
        jB30.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB30.setText("30");
        jB30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB30ActionPerformed(evt);
            }
        });
        numPanel.add(jB30);

        jB31.setBackground(new java.awt.Color(0, 0, 0));
        jB31.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB31.setForeground(new java.awt.Color(255, 255, 255));
        jB31.setText("31");
        jB31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB31ActionPerformed(evt);
            }
        });
        numPanel.add(jB31);

        jB32.setBackground(java.awt.Color.red);
        jB32.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB32.setText("32");
        jB32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB32ActionPerformed(evt);
            }
        });
        numPanel.add(jB32);

        jB33.setBackground(new java.awt.Color(0, 0, 0));
        jB33.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB33.setForeground(new java.awt.Color(255, 255, 255));
        jB33.setText("33");
        jB33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB33ActionPerformed(evt);
            }
        });
        numPanel.add(jB33);

        jB34.setBackground(java.awt.Color.red);
        jB34.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB34.setText("34");
        jB34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB34ActionPerformed(evt);
            }
        });
        numPanel.add(jB34);

        jB35.setBackground(new java.awt.Color(0, 0, 0));
        jB35.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB35.setForeground(new java.awt.Color(255, 255, 255));
        jB35.setText("35");
        jB35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB35ActionPerformed(evt);
            }
        });
        numPanel.add(jB35);

        jB36.setBackground(java.awt.Color.red);
        jB36.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jB36.setText("36");
        jB36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB36ActionPerformed(evt);
            }
        });
        numPanel.add(jB36);

        result.setEditable(false);
        result.setBackground(new java.awt.Color(102, 255, 0));
        result.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        given.setEditable(false);
        given.setBackground(new java.awt.Color(102, 255, 0));
        given.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N

        spin.setBackground(new java.awt.Color(255, 0, 255));
        spin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        spin.setText("SPIN");
        spin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spinActionPerformed(evt);
            }
        });

        newGame.setBackground(new java.awt.Color(255, 204, 102));
        newGame.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        newGame.setText("NEW GAME");
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });

        ClearB.setBackground(new java.awt.Color(0, 255, 255));
        ClearB.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ClearB.setText("Clear");
        ClearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(given, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClearB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(given, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ClearB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newGame, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        buttonGroup1.add(Nunber);
        Nunber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Nunber.setForeground(new java.awt.Color(0, 0, 255));
        Nunber.setText("Number");
        Nunber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NunberActionPerformed(evt);
            }
        });

        buttonGroup1.add(Colore);
        Colore.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Colore.setForeground(new java.awt.Color(0, 0, 255));
        Colore.setText("Color Odd & Even");
        Colore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nunber)
                    .addComponent(Colore))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Nunber)
                .addGap(18, 18, 18)
                .addComponent(Colore)
                .addGap(41, 41, 41))
        );

        red.setBackground(java.awt.Color.red);
        red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redActionPerformed(evt);
            }
        });

        black.setBackground(new java.awt.Color(0, 0, 0));
        black.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(51, 102, 0));

        talk.setEditable(false);
        talk.setBackground(new java.awt.Color(204, 0, 204));
        talk.setColumns(10);
        talk.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        talk.setForeground(new java.awt.Color(255, 255, 51));
        talk.setLineWrap(true);
        talk.setRows(6);
        talk.setText("                      Γεια σου !\n         Είμαι η νέα εξελιγμένη ρουλέτα!\n        Σου φεξε πάλι!!! \n\tΒρήκες ξανά παιχνίδι να παίζεις!!!\n      Διάλεξε μία από τις επιλογές μου και\n\tδοκίμασε την τύχη σου!!!\n\tΚαλη Τύχη!!!");
        jScrollPane1.setViewportView(talk);

        oddB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        oddB.setText("Odd");
        oddB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oddBActionPerformed(evt);
            }
        });

        evenB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        evenB.setText("Even");
        evenB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evenBActionPerformed(evt);
            }
        });

        bet.setEditable(false);
        bet.setText("0");
        bet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betActionPerformed(evt);
            }
        });

        money.setEditable(false);
        money.setText("1000");
        money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneyActionPerformed(evt);
            }
        });

        games.setEditable(false);

        percent.setEditable(false);

        jLabel1.setBackground(new java.awt.Color(51, 102, 0));
        jLabel1.setText("Money");

        jLabel2.setBackground(new java.awt.Color(51, 102, 0));
        jLabel2.setText("Games");

        jLabel3.setBackground(new java.awt.Color(51, 102, 0));
        jLabel3.setText("Success");

        jLabel4.setBackground(new java.awt.Color(51, 102, 0));
        jLabel4.setText("bet");

        buttonGroup2.add(betCheck);
        betCheck.setText("bet");
        betCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betCheckActionPerformed(evt);
            }
        });

        buttonGroup2.add(nobetCheck);
        nobetCheck.setSelected(true);
        nobetCheck.setText("no bet");
        nobetCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nobetCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(oddB, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(money, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(evenB)
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(games, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(bet, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(betCheck)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nobetCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(red, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(black, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(numPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(red, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(black, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oddB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(evenB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(betCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(games, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nobetCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        bet.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) ||
                    (c == KeyEvent.VK_BACK_SPACE) ||
                    (c == KeyEvent.VK_DELETE))) {
                e.consume();
            }
        }
    });

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        j.setEnabled(true);
        jB1.setEnabled(false);
        j = jB1;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        j.setEnabled(true);
        jB2.setEnabled(false);
        j = jB2;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        j.setEnabled(true);
        jB3.setEnabled(false);
        j = jB3;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
        j.setEnabled(true);
        jB4.setEnabled(false);
        j = jB4;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB4ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        j.setEnabled(true);
        jb5.setEnabled(false);
        j = jb5;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        j.setEnabled(true);
        jb6.setEnabled(false);
        j = jb6;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        j.setEnabled(true);
        jb7.setEnabled(false);
        j = jb7;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        j.setEnabled(true);
        jb8.setEnabled(false);
        j = jb8;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
        j.setEnabled(true);
        jb9.setEnabled(false);
        j = jb9;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jb9ActionPerformed

    private void jb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb10ActionPerformed
        j.setEnabled(true);
        jb10.setEnabled(false);
        j = jb10;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jb10ActionPerformed

    private void jb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb11ActionPerformed
        j.setEnabled(true);
        jb11.setEnabled(false);
        j = jb11;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jb11ActionPerformed

    private void jb12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb12ActionPerformed
        j.setEnabled(true);
        jb12.setEnabled(false);
        j = jb12;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jb12ActionPerformed

    private void jb13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb13ActionPerformed
        j.setEnabled(true);
        jb13.setEnabled(false);
        j = jb13;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jb13ActionPerformed

    private void jb14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb14ActionPerformed
        j.setEnabled(true);
        jb14.setEnabled(false);
        j = jb14;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jb14ActionPerformed

    private void jB15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB15ActionPerformed
        j.setEnabled(true);
        jB15.setEnabled(false);
        j = jB15;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB15ActionPerformed

    private void jB16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB16ActionPerformed
        j.setEnabled(true);
        jB16.setEnabled(false);
        j = jB16;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB16ActionPerformed

    private void jB17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB17ActionPerformed
        j.setEnabled(true);
        jB17.setEnabled(false);
        j = jB17;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB17ActionPerformed

    private void jB18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB18ActionPerformed
        j.setEnabled(true);
        jB18.setEnabled(false);
        j = jB18;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB18ActionPerformed

    private void jB19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB19ActionPerformed
        j.setEnabled(true);
        jB19.setEnabled(false);
        j = jB19;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB19ActionPerformed

    private void jB20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB20ActionPerformed
        j.setEnabled(true);
        jB20.setEnabled(false);
        j = jB20;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB20ActionPerformed

    private void jB21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB21ActionPerformed
        j.setEnabled(true);
        jB21.setEnabled(false);
        j = jB21;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB21ActionPerformed

    private void jB22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB22ActionPerformed
        j.setEnabled(true);
        jB22.setEnabled(false);
        j = jB22;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB22ActionPerformed

    private void jB23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB23ActionPerformed
        j.setEnabled(true);
        jB23.setEnabled(false);
        j = jB23;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB23ActionPerformed

    private void jB24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB24ActionPerformed
        j.setEnabled(true);
        jB24.setEnabled(false);
        j = jB24;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB24ActionPerformed

    private void jB25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB25ActionPerformed
        j.setEnabled(true);
        jB25.setEnabled(false);
        j = jB25;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB25ActionPerformed

    private void jB26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB26ActionPerformed
        j.setEnabled(true);
        jB26.setEnabled(false);
        j = jB26;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB26ActionPerformed

    private void jB27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB27ActionPerformed
        j.setEnabled(true);
        jB27.setEnabled(false);
        j = jB27;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB27ActionPerformed

    private void jB28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB28ActionPerformed
        j.setEnabled(true);
        jB28.setEnabled(false);
        j = jB28;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB28ActionPerformed

    private void jB29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB29ActionPerformed
        j.setEnabled(true);
        jB29.setEnabled(false);
        j = jB29;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB29ActionPerformed

    private void jB30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB30ActionPerformed
        j.setEnabled(true);
        jB30.setEnabled(false);
        j = jB30;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB30ActionPerformed

    private void jB31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB31ActionPerformed
        j.setEnabled(true);
        jB31.setEnabled(false);
        j = jB31;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB31ActionPerformed

    private void jB32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB32ActionPerformed
        j.setEnabled(true);
        jB32.setEnabled(false);
        j = jB32;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB32ActionPerformed

    private void jB33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB33ActionPerformed
        j.setEnabled(true);
        jB33.setEnabled(false);
        j = jB33;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB33ActionPerformed

    private void jB34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB34ActionPerformed
        j.setEnabled(true);
        jB34.setEnabled(false);
        j = jB34;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB34ActionPerformed

    private void jB35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB35ActionPerformed
        j.setEnabled(true);
        jB35.setEnabled(false);
        j = jB35;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB35ActionPerformed

    private void jB36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB36ActionPerformed
        j.setEnabled(true);
        jB36.setEnabled(false);
        j = jB36;
        given.setBackground(j.getBackground());
        given.setForeground(j.getForeground());
        given.setText(j.getText());
    }//GEN-LAST:event_jB36ActionPerformed

    private void spinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spinActionPerformed
        
       budgetCheck();
        

    }//GEN-LAST:event_spinActionPerformed

    private void NunberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NunberActionPerformed
        
        oddB.setEnabled(false);
        evenB.setEnabled(false);
        given.setBackground(Color.green);
        result.setBackground(Color.green);
        result.setText("");
        given.setText("");
        red.setEnabled(false);
        black.setEnabled(false);
        jB1.setEnabled(true);
        jB2.setEnabled(true);
        jB3.setEnabled(true);
        jB4.setEnabled(true);
        jb5.setEnabled(true);
        jb6.setEnabled(true);
        jb7.setEnabled(true);
        jb8.setEnabled(true);
        jb9.setEnabled(true);
        jb10.setEnabled(true);
        jb11.setEnabled(true);
        jb12.setEnabled(true);
        jb13.setEnabled(true);
        jb14.setEnabled(true);
        jB15.setEnabled(true);
        jB16.setEnabled(true);
        jB17.setEnabled(true);
        jB18.setEnabled(true);
        jB19.setEnabled(true);
        jB20.setEnabled(true);
        jB21.setEnabled(true);
        jB22.setEnabled(true);
        jB23.setEnabled(true);
        jB24.setEnabled(true);
        jB25.setEnabled(true);
        jB26.setEnabled(true);
        jB27.setEnabled(true);
        jB28.setEnabled(true);
        jB29.setEnabled(true);
        jB30.setEnabled(true);
        jB31.setEnabled(true);
        jB32.setEnabled(true);
        jB33.setEnabled(true);
        jB34.setEnabled(true);
        jB35.setEnabled(true);
        jB36.setEnabled(true);
    }//GEN-LAST:event_NunberActionPerformed

    private void ColoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColoreActionPerformed
       
        oddB.setEnabled(true);
        evenB.setEnabled(true);
        given.setBackground(Color.green);
        result.setBackground(Color.green);
        result.setText("");
        given.setText("");
        red.setEnabled(true);
        black.setEnabled(true);
        jB1.setEnabled(false);
        jB2.setEnabled(false);
        jB3.setEnabled(false);
        jB4.setEnabled(false);
        jb5.setEnabled(false);
        jb6.setEnabled(false);
        jb7.setEnabled(false);
        jb8.setEnabled(false);
        jb9.setEnabled(false);
        jb10.setEnabled(false);
        jb11.setEnabled(false);
        jb12.setEnabled(false);
        jb13.setEnabled(false);
        jb14.setEnabled(false);
        jB15.setEnabled(false);
        jB16.setEnabled(false);
        jB17.setEnabled(false);
        jB18.setEnabled(false);
        jB19.setEnabled(false);
        jB20.setEnabled(false);
        jB21.setEnabled(false);
        jB22.setEnabled(false);
        jB23.setEnabled(false);
        jB24.setEnabled(false);
        jB25.setEnabled(false);
        jB26.setEnabled(false);
        jB27.setEnabled(false);
        jB28.setEnabled(false);
        jB29.setEnabled(false);
        jB30.setEnabled(false);
        jB31.setEnabled(false);
        jB32.setEnabled(false);
        jB33.setEnabled(false);
        jB34.setEnabled(false);
        jB35.setEnabled(false);
        jB36.setEnabled(false);
    }//GEN-LAST:event_ColoreActionPerformed

    private void redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redActionPerformed

        given.setBackground(red.getBackground());

        t.setText("1");
    }//GEN-LAST:event_redActionPerformed

    private void blackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackActionPerformed
        given.setBackground(black.getBackground());

        t.setText("2");
    }//GEN-LAST:event_blackActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultActionPerformed

    private void oddBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oddBActionPerformed
        given.setForeground(Color.lightGray);
        given.setText("O");

    }//GEN-LAST:event_oddBActionPerformed

    private void evenBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evenBActionPerformed
        given.setForeground(Color.lightGray);
        given.setText("E");
    }//GEN-LAST:event_evenBActionPerformed

    private void nobetCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nobetCheckActionPerformed
        bet.setEditable(false);
    }//GEN-LAST:event_nobetCheckActionPerformed

    private void betCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betCheckActionPerformed
        bet.setEditable(true);
    }//GEN-LAST:event_betCheckActionPerformed

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
        result.setText("");
        result.setBackground(Color.green);
        
        given.setText("");
        given.setBackground(Color.green);
        
        money.setText("1000");
        bet.setText("0");
        percent.setText("");
        games.setText("");
        i = 0;
        r = 0;
         jB1.setEnabled(true);
        jB2.setEnabled(true);
        jB3.setEnabled(true);
        jB4.setEnabled(true);
        jb5.setEnabled(true);
        jb6.setEnabled(true);
        jb7.setEnabled(true);
        jb8.setEnabled(true);
        jb9.setEnabled(true);
        jb10.setEnabled(true);
        jb11.setEnabled(true);
        jb12.setEnabled(true);
        jb13.setEnabled(true);
        jb14.setEnabled(true);
        jB15.setEnabled(true);
        jB16.setEnabled(true);
        jB17.setEnabled(true);
        jB18.setEnabled(true);
        jB19.setEnabled(true);
        jB20.setEnabled(true);
        jB21.setEnabled(true);
        jB22.setEnabled(true);
        jB23.setEnabled(true);
        jB24.setEnabled(true);
        jB25.setEnabled(true);
        jB26.setEnabled(true);
        jB27.setEnabled(true);
        jB28.setEnabled(true);
        jB29.setEnabled(true);
        jB30.setEnabled(true);
        jB31.setEnabled(true);
        jB32.setEnabled(true);
        jB33.setEnabled(true);
        jB34.setEnabled(true);
        jB35.setEnabled(true);
        jB36.setEnabled(true);
       
       
        
       Nunber.setSelected(true);
        oddB.setEnabled(false);
        evenB.setEnabled(false);
        red.setEnabled(false);
        black.setEnabled(false);
        talk.setText("Επέλεξε αριθμό, Χρώμα,\nΜονά-Ζυγά ή\nΧρώμα και Μονά-Ζυγά,\nαν επιθυμείς πόνταρε ποσό\nκαι δοκίμασε την τύχη σου!\n");
       
    }//GEN-LAST:event_newGameActionPerformed

    private void ClearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBActionPerformed
       result.setBackground(Color.green);
       given.setBackground(Color.green);
       result.setText("");
       given.setText("");
       if(Nunber.isSelected()){
             jB1.setEnabled(true);
        jB2.setEnabled(true);
        jB3.setEnabled(true);
        jB4.setEnabled(true);
        jb5.setEnabled(true);
        jb6.setEnabled(true);
        jb7.setEnabled(true);
        jb8.setEnabled(true);
        jb9.setEnabled(true);
        jb10.setEnabled(true);
        jb11.setEnabled(true);
        jb12.setEnabled(true);
        jb13.setEnabled(true);
        jb14.setEnabled(true);
        jB15.setEnabled(true);
        jB16.setEnabled(true);
        jB17.setEnabled(true);
        jB18.setEnabled(true);
        jB19.setEnabled(true);
        jB20.setEnabled(true);
        jB21.setEnabled(true);
        jB22.setEnabled(true);
        jB23.setEnabled(true);
        jB24.setEnabled(true);
        jB25.setEnabled(true);
        jB26.setEnabled(true);
        jB27.setEnabled(true);
        jB28.setEnabled(true);
        jB29.setEnabled(true);
        jB30.setEnabled(true);
        jB31.setEnabled(true);
        jB32.setEnabled(true);
        jB33.setEnabled(true);
        jB34.setEnabled(true);
        jB35.setEnabled(true);
        jB36.setEnabled(true);
       
       }else if(Colore.isSelected()){
        red.setEnabled(true);
        black.setEnabled(true);
        oddB.setEnabled(true);
        evenB.setSelected(true);
       }else{
            jB1.setEnabled(true);
        jB2.setEnabled(true);
        jB3.setEnabled(true);
        jB4.setEnabled(true);
        jb5.setEnabled(true);
        jb6.setEnabled(true);
        jb7.setEnabled(true);
        jb8.setEnabled(true);
        jb9.setEnabled(true);
        jb10.setEnabled(true);
        jb11.setEnabled(true);
        jb12.setEnabled(true);
        jb13.setEnabled(true);
        jb14.setEnabled(true);
        jB15.setEnabled(true);
        jB16.setEnabled(true);
        jB17.setEnabled(true);
        jB18.setEnabled(true);
        jB19.setEnabled(true);
        jB20.setEnabled(true);
        jB21.setEnabled(true);
        jB22.setEnabled(true);
        jB23.setEnabled(true);
        jB24.setEnabled(true);
        jB25.setEnabled(true);
        jB26.setEnabled(true);
        jB27.setEnabled(true);
        jB28.setEnabled(true);
        jB29.setEnabled(true);
        jB30.setEnabled(true);
        jB31.setEnabled(true);
        jB32.setEnabled(true);
        jB33.setEnabled(true);
        jB34.setEnabled(true);
        jB35.setEnabled(true);
        jB36.setEnabled(true);
       }
    }//GEN-LAST:event_ClearBActionPerformed

    private void moneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moneyActionPerformed

    private void betActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_betActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new slot().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton ClearB;
    public static javax.swing.JRadioButton Colore;
    public static javax.swing.JRadioButton Nunber;
    public static javax.swing.JTextField bet;
    public static javax.swing.JCheckBox betCheck;
    public static javax.swing.JButton black;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public static javax.swing.JButton evenB;
    public static javax.swing.JTextField games;
    public static javax.swing.JTextField given;
    public static javax.swing.JButton jB1;
    public static javax.swing.JButton jB15;
    public static javax.swing.JButton jB16;
    public static javax.swing.JButton jB17;
    public static javax.swing.JButton jB18;
    public static javax.swing.JButton jB19;
    public static javax.swing.JButton jB2;
    public static javax.swing.JButton jB20;
    public static javax.swing.JButton jB21;
    public static javax.swing.JButton jB22;
    public static javax.swing.JButton jB23;
    public static javax.swing.JButton jB24;
    public static javax.swing.JButton jB25;
    public static javax.swing.JButton jB26;
    public static javax.swing.JButton jB27;
    public static javax.swing.JButton jB28;
    public static javax.swing.JButton jB29;
    public static javax.swing.JButton jB3;
    public static javax.swing.JButton jB30;
    public static javax.swing.JButton jB31;
    public static javax.swing.JButton jB32;
    public static javax.swing.JButton jB33;
    public static javax.swing.JButton jB34;
    public static javax.swing.JButton jB35;
    public static javax.swing.JButton jB36;
    public static javax.swing.JButton jB4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JButton jb10;
    public static javax.swing.JButton jb11;
    public static javax.swing.JButton jb12;
    public static javax.swing.JButton jb13;
    public static javax.swing.JButton jb14;
    public static javax.swing.JButton jb5;
    public static javax.swing.JButton jb6;
    public static javax.swing.JButton jb7;
    public static javax.swing.JButton jb8;
    public static javax.swing.JButton jb9;
    public static javax.swing.JTextField money;
    public static javax.swing.JButton newGame;
    public static javax.swing.JCheckBox nobetCheck;
    private javax.swing.JPanel numPanel;
    public static javax.swing.JButton oddB;
    public static javax.swing.JTextField percent;
    public static javax.swing.JButton red;
    public static javax.swing.JTextField result;
    public static javax.swing.JButton spin;
    public static javax.swing.JTextArea talk;
    // End of variables declaration//GEN-END:variables
 

   
}
