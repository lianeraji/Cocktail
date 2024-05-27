/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cocktail;

import java.awt.*;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;



/**
 *
 * @author lianeraji
 */
public class Game extends javax.swing.JFrame {
    private SoundPlayer soundPlayer;
    private Blender blender;
    private Logger logger;
    private ArrayList<Ingredient> ingredients;
   
  
public Game(SoundPlayer soundPlayer) {
    this.soundPlayer = soundPlayer; {
    setVisible(true);
    initComponents();
    logger = Logger.textAreaLogger(logs);
    blender = new Blender(1000, logger);  
    ingredients = new ArrayList<>();
    populateColorChoices();
    colorChoose.addActionListener(this::colorChooseActionPerformed);
    colorEnter.addActionListener(this::colorEnterActionPerformed);

        Mute.addActionListener(this::MuteActionPerformed);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image cursorImage = toolkit.getImage(getClass().getResource("Resources/cursor.png"));
        Cursor customCursor = toolkit.createCustomCursor(cursorImage, new Point(0, 0), "custom cursor");
        setCursor(customCursor);

        
        Mute.addActionListener(new java.awt.event.ActionListener() {
             @Override
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 MuteActionPerformed(evt);
   
             
             }
});

}
}
     
    public void updateCapacityDisplay(int volume) {
        currentCapacity.setText(String.format("%d / %d", volume, blender.getCapacity()));
    }

    private void resetIngredientCounts() {
        bananaCount.setText("0");
        strawberryCount.setText("0");
        blueberryCount.setText("0");
        pineappleCount.setText("0");
        mangoCount.setText("0");
        watermelonCount.setText("0");
        milkCount.setText("0");
        sugarCount.setText("0");
        iceCount.setText("0");
        }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mute = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        BLUEBERRY = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        addBanana = new javax.swing.JButton();
        bananaCount = new javax.swing.JLabel();
        minusBanana = new javax.swing.JButton();
        STRAWBERRY = new javax.swing.JLabel();
        minusStrawberry = new javax.swing.JButton();
        addStrawberry = new javax.swing.JButton();
        strawberryCount = new javax.swing.JLabel();
        WATERMELON = new javax.swing.JLabel();
        addWatermelon = new javax.swing.JButton();
        watermelonCount = new javax.swing.JLabel();
        minusWatermelon = new javax.swing.JButton();
        minusBlueberry = new javax.swing.JButton();
        blueberryCount = new javax.swing.JLabel();
        addBlueberry = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addMango = new javax.swing.JButton();
        mangoCount = new javax.swing.JLabel();
        minusMango = new javax.swing.JButton();
        PINEAPPLE = new javax.swing.JLabel();
        minusPineapple = new javax.swing.JButton();
        pineappleCount = new javax.swing.JLabel();
        addPineapple = new javax.swing.JButton();
        MILK = new javax.swing.JLabel();
        minusMilk = new javax.swing.JButton();
        milkCount = new javax.swing.JLabel();
        addMilk = new javax.swing.JButton();
        SUGAR = new javax.swing.JLabel();
        minusSugar = new javax.swing.JButton();
        sugarCount = new javax.swing.JLabel();
        addSugar = new javax.swing.JButton();
        ICE = new javax.swing.JLabel();
        minusIce = new javax.swing.JButton();
        iceCount = new javax.swing.JLabel();
        addIce = new javax.swing.JButton();
        blend = new javax.swing.JButton();
        currentCapacity = new javax.swing.JLabel();
        oneCup = new javax.swing.JButton();
        bbbrr = new javax.swing.JLabel();
        inputInput = new javax.swing.JButton();
        BLUEBERRY1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        bgd = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        colorEnter = new javax.swing.JTextField();
        colorChoose = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        colorcolor = new javax.swing.JLabel();
        colorColor1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        bgd1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        logs = new javax.swing.JTextArea();
        loggs = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        bgd2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cocktail!");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mute.setBackground(new java.awt.Color(255, 188, 163));
        Mute.setForeground(new java.awt.Color(255, 255, 255));
        Mute.setText("♬");
        Mute.setOpaque(true);
        Mute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MuteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MuteMouseExited(evt);
            }
        });
        Mute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuteActionPerformed(evt);
            }
        });
        getContentPane().add(Mute, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, -1));

        list.setEditable(false);
        list.setBackground(new java.awt.Color(255, 218, 204));
        list.setColumns(20);
        list.setRows(5);
        list.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(255, 153, 153), new java.awt.Color(255, 153, 153), new java.awt.Color(255, 204, 204)), "Your Order", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gujarati MT", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jScrollPane2.setViewportView(list);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 140, 220));

        jPanel4.setBackground(new java.awt.Color(255, 188, 163));
        jPanel4.setLayout(new java.awt.BorderLayout());

        BLUEBERRY.setBackground(new java.awt.Color(255, 188, 163));
        BLUEBERRY.setForeground(new java.awt.Color(255, 188, 163));
        BLUEBERRY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cocktail/Resources/ddd-ezgif.com-resize.gif"))); // NOI18N
        jPanel4.add(BLUEBERRY, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 140, 120));

        jTabbedPane1.setBackground(new java.awt.Color(255, 188, 163));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Gujarati MT", 1, 13)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBanana.setBackground(new java.awt.Color(255, 188, 163));
        addBanana.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        addBanana.setForeground(new java.awt.Color(255, 255, 255));
        addBanana.setText("+");
        addBanana.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        addBanana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBananaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBananaMouseExited(evt);
            }
        });
        addBanana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBananaActionPerformed(evt);
            }
        });
        jPanel1.add(addBanana, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 40, 30));

        bananaCount.setFont(new java.awt.Font("Gujarati MT", 0, 18)); // NOI18N
        bananaCount.setForeground(new java.awt.Color(255, 153, 153));
        bananaCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bananaCount.setText("0");
        jPanel1.add(bananaCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 30, 30));

        minusBanana.setBackground(new java.awt.Color(255, 188, 163));
        minusBanana.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        minusBanana.setForeground(new java.awt.Color(255, 255, 255));
        minusBanana.setText("-");
        minusBanana.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        minusBanana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusBananaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minusBananaMouseExited(evt);
            }
        });
        minusBanana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusBananaActionPerformed(evt);
            }
        });
        jPanel1.add(minusBanana, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 40, 30));

        STRAWBERRY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cocktail/Resources/Fruits/Strawberry.png"))); // NOI18N
        jPanel1.add(STRAWBERRY, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 50, -1));

        minusStrawberry.setBackground(new java.awt.Color(255, 188, 163));
        minusStrawberry.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        minusStrawberry.setForeground(new java.awt.Color(255, 255, 255));
        minusStrawberry.setText("-");
        minusStrawberry.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        minusStrawberry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusStrawberryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minusStrawberryMouseExited(evt);
            }
        });
        minusStrawberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusStrawberryActionPerformed(evt);
            }
        });
        jPanel1.add(minusStrawberry, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 40, 30));

        addStrawberry.setBackground(new java.awt.Color(255, 188, 163));
        addStrawberry.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        addStrawberry.setForeground(new java.awt.Color(255, 255, 255));
        addStrawberry.setText("+");
        addStrawberry.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        addStrawberry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addStrawberryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addStrawberryMouseExited(evt);
            }
        });
        addStrawberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStrawberryActionPerformed(evt);
            }
        });
        jPanel1.add(addStrawberry, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 40, 30));

        strawberryCount.setFont(new java.awt.Font("Gujarati MT", 0, 18)); // NOI18N
        strawberryCount.setForeground(new java.awt.Color(255, 153, 153));
        strawberryCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        strawberryCount.setText("0");
        jPanel1.add(strawberryCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 30, 30));

        WATERMELON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cocktail/Resources/Fruits/Watermelon.png"))); // NOI18N
        jPanel1.add(WATERMELON, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 80, 70));

        addWatermelon.setBackground(new java.awt.Color(255, 188, 163));
        addWatermelon.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        addWatermelon.setForeground(new java.awt.Color(255, 255, 255));
        addWatermelon.setText("+");
        addWatermelon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        addWatermelon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addWatermelonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addWatermelonMouseExited(evt);
            }
        });
        addWatermelon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWatermelonActionPerformed(evt);
            }
        });
        jPanel1.add(addWatermelon, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 40, 30));

        watermelonCount.setFont(new java.awt.Font("Gujarati MT", 0, 18)); // NOI18N
        watermelonCount.setForeground(new java.awt.Color(255, 153, 153));
        watermelonCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        watermelonCount.setText("0");
        jPanel1.add(watermelonCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 30, 30));

        minusWatermelon.setBackground(new java.awt.Color(255, 188, 163));
        minusWatermelon.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        minusWatermelon.setForeground(new java.awt.Color(255, 255, 255));
        minusWatermelon.setText("-");
        minusWatermelon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        minusWatermelon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusWatermelonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minusWatermelonMouseExited(evt);
            }
        });
        minusWatermelon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusWatermelonActionPerformed(evt);
            }
        });
        jPanel1.add(minusWatermelon, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 40, 30));

        minusBlueberry.setBackground(new java.awt.Color(255, 188, 163));
        minusBlueberry.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        minusBlueberry.setForeground(new java.awt.Color(255, 255, 255));
        minusBlueberry.setText("-");
        minusBlueberry.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        minusBlueberry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusBlueberryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minusBlueberryMouseExited(evt);
            }
        });
        minusBlueberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusBlueberryActionPerformed(evt);
            }
        });
        jPanel1.add(minusBlueberry, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 40, 30));

        blueberryCount.setFont(new java.awt.Font("Gujarati MT", 0, 18)); // NOI18N
        blueberryCount.setForeground(new java.awt.Color(255, 153, 153));
        blueberryCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blueberryCount.setText("0");
        jPanel1.add(blueberryCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 30, 30));

        addBlueberry.setBackground(new java.awt.Color(255, 188, 163));
        addBlueberry.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        addBlueberry.setForeground(new java.awt.Color(255, 255, 255));
        addBlueberry.setText("+");
        addBlueberry.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        addBlueberry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBlueberryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBlueberryMouseExited(evt);
            }
        });
        addBlueberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBlueberryActionPerformed(evt);
            }
        });
        jPanel1.add(addBlueberry, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cocktail/Resources/Fruits/Mango.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 90, 70));

        addMango.setBackground(new java.awt.Color(255, 188, 163));
        addMango.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        addMango.setForeground(new java.awt.Color(255, 255, 255));
        addMango.setText("+");
        addMango.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        addMango.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMangoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMangoMouseExited(evt);
            }
        });
        addMango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMangoActionPerformed(evt);
            }
        });
        jPanel1.add(addMango, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 40, 30));

        mangoCount.setFont(new java.awt.Font("Gujarati MT", 0, 18)); // NOI18N
        mangoCount.setForeground(new java.awt.Color(255, 153, 153));
        mangoCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mangoCount.setText("0");
        jPanel1.add(mangoCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 30, 30));

        minusMango.setBackground(new java.awt.Color(255, 188, 163));
        minusMango.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        minusMango.setForeground(new java.awt.Color(255, 255, 255));
        minusMango.setText("-");
        minusMango.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        minusMango.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusMangoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minusMangoMouseExited(evt);
            }
        });
        minusMango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusMangoActionPerformed(evt);
            }
        });
        jPanel1.add(minusMango, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 40, 30));

        PINEAPPLE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cocktail/Resources/Fruits/Pineapple.png"))); // NOI18N
        jPanel1.add(PINEAPPLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -10, 70, 70));

        minusPineapple.setBackground(new java.awt.Color(255, 188, 163));
        minusPineapple.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        minusPineapple.setForeground(new java.awt.Color(255, 255, 255));
        minusPineapple.setText("-");
        minusPineapple.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        minusPineapple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusPineappleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minusPineappleMouseExited(evt);
            }
        });
        minusPineapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusPineappleActionPerformed(evt);
            }
        });
        jPanel1.add(minusPineapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 40, 30));

        pineappleCount.setFont(new java.awt.Font("Gujarati MT", 0, 18)); // NOI18N
        pineappleCount.setForeground(new java.awt.Color(255, 153, 153));
        pineappleCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pineappleCount.setText("0");
        jPanel1.add(pineappleCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 30, 30));

        addPineapple.setBackground(new java.awt.Color(255, 188, 163));
        addPineapple.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        addPineapple.setForeground(new java.awt.Color(255, 255, 255));
        addPineapple.setText("+");
        addPineapple.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        addPineapple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPineappleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addPineappleMouseExited(evt);
            }
        });
        addPineapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPineappleActionPerformed(evt);
            }
        });
        jPanel1.add(addPineapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 40, 30));

        MILK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cocktail/Resources/Fruits/milkey.png"))); // NOI18N
        jPanel1.add(MILK, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        minusMilk.setBackground(new java.awt.Color(255, 188, 163));
        minusMilk.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        minusMilk.setForeground(new java.awt.Color(255, 255, 255));
        minusMilk.setText("-");
        minusMilk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        minusMilk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusMilkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minusMilkMouseExited(evt);
            }
        });
        minusMilk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusMilkActionPerformed(evt);
            }
        });
        jPanel1.add(minusMilk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 40, 30));

        milkCount.setFont(new java.awt.Font("Gujarati MT", 0, 18)); // NOI18N
        milkCount.setForeground(new java.awt.Color(255, 153, 153));
        milkCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        milkCount.setText("0");
        jPanel1.add(milkCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 30, 30));

        addMilk.setBackground(new java.awt.Color(255, 188, 163));
        addMilk.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        addMilk.setForeground(new java.awt.Color(255, 255, 255));
        addMilk.setText("+");
        addMilk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        addMilk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMilkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMilkMouseExited(evt);
            }
        });
        addMilk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMilkActionPerformed(evt);
            }
        });
        jPanel1.add(addMilk, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 40, 30));

        SUGAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cocktail/Resources/sugar.png"))); // NOI18N
        jPanel1.add(SUGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 160, 70));

        minusSugar.setBackground(new java.awt.Color(255, 188, 163));
        minusSugar.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        minusSugar.setForeground(new java.awt.Color(255, 255, 255));
        minusSugar.setText("-");
        minusSugar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        minusSugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusSugarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minusSugarMouseExited(evt);
            }
        });
        minusSugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusSugarActionPerformed(evt);
            }
        });
        jPanel1.add(minusSugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 40, 30));

        sugarCount.setFont(new java.awt.Font("Gujarati MT", 0, 18)); // NOI18N
        sugarCount.setForeground(new java.awt.Color(255, 153, 153));
        sugarCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sugarCount.setText("0");
        jPanel1.add(sugarCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 30, 30));

        addSugar.setBackground(new java.awt.Color(255, 188, 163));
        addSugar.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        addSugar.setForeground(new java.awt.Color(255, 255, 255));
        addSugar.setText("+");
        addSugar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        addSugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addSugarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addSugarMouseExited(evt);
            }
        });
        addSugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSugarActionPerformed(evt);
            }
        });
        jPanel1.add(addSugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 40, 30));

        ICE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cocktail/Resources/ice.png"))); // NOI18N
        jPanel1.add(ICE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 50, 80));

        minusIce.setBackground(new java.awt.Color(255, 188, 163));
        minusIce.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        minusIce.setForeground(new java.awt.Color(255, 255, 255));
        minusIce.setText("-");
        minusIce.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        minusIce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusIceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minusIceMouseExited(evt);
            }
        });
        minusIce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusIceActionPerformed(evt);
            }
        });
        jPanel1.add(minusIce, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 40, 30));

        iceCount.setFont(new java.awt.Font("Gujarati MT", 0, 18)); // NOI18N
        iceCount.setForeground(new java.awt.Color(255, 153, 153));
        iceCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iceCount.setText("0");
        jPanel1.add(iceCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 30, 30));

        addIce.setBackground(new java.awt.Color(255, 188, 163));
        addIce.setFont(new java.awt.Font("Gujarati MT", 1, 18)); // NOI18N
        addIce.setForeground(new java.awt.Color(255, 255, 255));
        addIce.setText("+");
        addIce.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        addIce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addIceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addIceMouseExited(evt);
            }
        });
        addIce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIceActionPerformed(evt);
            }
        });
        jPanel1.add(addIce, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 40, 30));

        blend.setBackground(new java.awt.Color(255, 188, 163));
        blend.setFont(new java.awt.Font("Gujarati MT", 1, 13)); // NOI18N
        blend.setForeground(new java.awt.Color(255, 255, 255));
        blend.setText("Blend and Pour all!");
        blend.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204), null));
        blend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                blendMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                blendMouseExited(evt);
            }
        });
        blend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blendActionPerformed(evt);
            }
        });
        jPanel1.add(blend, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 140, 30));

        currentCapacity.setBackground(new java.awt.Color(255, 153, 153));
        currentCapacity.setFont(new java.awt.Font("Gurmukhi MT", 1, 10)); // NOI18N
        currentCapacity.setForeground(new java.awt.Color(255, 255, 255));
        currentCapacity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentCapacity.setText("0");
        currentCapacity.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Capacity:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gurmukhi MT", 1, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        currentCapacity.setOpaque(true);
        jPanel1.add(currentCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 110, 40));

        oneCup.setBackground(new java.awt.Color(255, 188, 163));
        oneCup.setFont(new java.awt.Font("Gujarati MT", 1, 13)); // NOI18N
        oneCup.setForeground(new java.awt.Color(255, 255, 255));
        oneCup.setText("Pour 1 Cup!");
        oneCup.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204), null));
        oneCup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                oneCupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                oneCupMouseExited(evt);
            }
        });
        oneCup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneCupActionPerformed(evt);
            }
        });
        jPanel1.add(oneCup, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 100, 30));

        bbbrr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bbbrr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cocktail/Resources/Fruits/BananaReal.png"))); // NOI18N
        jPanel1.add(bbbrr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -10, -1, 80));

        inputInput.setBackground(new java.awt.Color(255, 153, 153));
        inputInput.setFont(new java.awt.Font("Gujarati MT", 1, 13)); // NOI18N
        inputInput.setForeground(new java.awt.Color(255, 255, 255));
        inputInput.setText("Input File");
        inputInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inputInputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inputInputMouseExited(evt);
            }
        });
        inputInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputInputActionPerformed(evt);
            }
        });
        jPanel1.add(inputInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 110, 40));

        BLUEBERRY1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cocktail/Resources/Fruits/Blueberry.png"))); // NOI18N
        jPanel1.add(BLUEBERRY1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, -10, 80, 70));

        jButton3.setBackground(new java.awt.Color(255, 188, 163));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Exit");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 188, 163), new java.awt.Color(255, 255, 255)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 40, 20));

        bgd.setForeground(new java.awt.Color(255, 255, 255));
        bgd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cocktail/Resources/Game.png"))); // NOI18N
        bgd.setText("jLabel4");
        bgd.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel1.add(bgd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 410, 330));

        jTabbedPane1.addTab("Make", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(colorEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 100, 20));

        jPanel3.add(colorChoose, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 100, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Gujarati MT", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 188, 163));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter a color or choose a color.");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 188, 163)));
        jLabel2.setOpaque(true);
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 210, -1));

        colorcolor.setFont(new java.awt.Font("Gujarati MT", 1, 13)); // NOI18N
        colorcolor.setForeground(new java.awt.Color(255, 153, 153));
        colorcolor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colorcolor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153)));
        jPanel3.add(colorcolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 150, 40));

        colorColor1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153)));
        jPanel3.add(colorColor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 150, 40));

        jButton2.setBackground(new java.awt.Color(255, 188, 163));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Exit");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 188, 163), new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 40, -1));

        bgd1.setForeground(new java.awt.Color(255, 255, 255));
        bgd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cocktail/Resources/login.png"))); // NOI18N
        bgd1.setText("jLabel4");
        bgd1.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel3.add(bgd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 410, 330));

        jTabbedPane1.addTab("Color", jPanel3);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logs.setEditable(false);
        logs.setColumns(20);
        logs.setRows(5);
        jScrollPane1.setViewportView(logs);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 310, 210));

        loggs.setEditable(false);
        loggs.setBackground(new java.awt.Color(255, 188, 163));
        loggs.setForeground(new java.awt.Color(255, 255, 255));
        loggs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Logs", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gujarati MT", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        loggs.setCaretColor(new java.awt.Color(255, 102, 102));
        jPanel2.add(loggs, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 330, 250));

        jButton1.setBackground(new java.awt.Color(255, 188, 163));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 204, 204), new java.awt.Color(255, 188, 163), new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 40, -1));

        bgd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cocktail/Resources/login.png"))); // NOI18N
        jPanel2.add(bgd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 310));

        jTabbedPane1.addTab("Logs", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 350));
        jTabbedPane1.getAccessibleContext().setAccessibleName("make");

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void setButtonStyle(JButton button, boolean isEntered) {
    if (isEntered) {
        button.setBackground(new java.awt.Color(252, 148, 124));
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image cursorImage = toolkit.getImage(getClass().getResource("resources/cursor2.png"));
        Cursor customCursor = toolkit.createCustomCursor(cursorImage, new Point(0, 0), "custom cursor");
        setCursor(customCursor);
    } else {
        button.setBackground(new java.awt.Color(255, 188, 163));
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image cursorImage = toolkit.getImage(getClass().getResource("resources/cursor.png"));
        Cursor customCursor = toolkit.createCustomCursor(cursorImage, new Point(0, 0), "custom cursor");
        setCursor(customCursor);
    }
}
        
private void handleIngredientButtonAction(Fruit.FruitType ingredientType, int count, JButton button) {
    if (button.getText().equals("+")) {
        try {
            Fruit ingredient = new Fruit(ingredientType, 1);
            blender.addIngredient(ingredient);
            count++;
            updateCapacityDisplay(blender.getCurrentVolume());
            updateIngredientListDisplay(ingredientType, true); 
        } catch (BlenderException e) {
            
            showCenteredJOptionPane(this, e.getMessage(), "Capacity Error", JOptionPane.ERROR_MESSAGE);
        }
    } else if (button.getText().equals("-") && count > 0) {
        try {
            Ingredient ingredientToRemove = blender.getIngredients().stream()
                .filter(i -> i instanceof Fruit && ((Fruit) i).getType() == ingredientType)
                .findFirst().orElse(null);
            if (ingredientToRemove != null) {
                blender.removeIngredient(ingredientToRemove);
                count--;
                updateCapacityDisplay(blender.getCurrentVolume());
                updateIngredientListDisplay(ingredientType, false); 
            }
        } catch (Exception e) {
            showCenteredJOptionPane(this, "Error removing ingredient: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }else {
            showCenteredJOptionPane(this, "No " + ingredientType.toString().toLowerCase() + "s to remove.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    switch (ingredientType) {
        case BANANA:
            bananaCount.setText(String.valueOf(count));
            break;
        case STRAWBERRY:
            strawberryCount.setText(String.valueOf(count));
            break;
        case WATERMELON:
            watermelonCount.setText(String.valueOf(count));
            break;
        case BLUEBERRY:
            blueberryCount.setText(String.valueOf(count));
            break;
        case MANGO:
            mangoCount.setText(String.valueOf(count));
            break;
        case PINEAPPLE:
            pineappleCount.setText(String.valueOf(count));
            break;
    }
}

    private void addBananaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBananaActionPerformed
         handleIngredientButtonAction(Fruit.FruitType.BANANA, Integer.parseInt(bananaCount.getText()), addBanana);
    }//GEN-LAST:event_addBananaActionPerformed

    private void addBananaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBananaMouseEntered
        setButtonStyle(addBanana, true);
    }//GEN-LAST:event_addBananaMouseEntered

    private void addBananaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBananaMouseExited
        setButtonStyle(addBanana, false);
    }//GEN-LAST:event_addBananaMouseExited

    private void MuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuteActionPerformed

    soundPlayer.toggleMute();
       if (soundPlayer.isMuted()) {
           Mute.setText("✘♬"); 
       } else {
           Mute.setText("♬"); 
       }

    }//GEN-LAST:event_MuteActionPerformed

    private void MuteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MuteMouseEntered
        Mute.setBackground(new java.awt.Color(252,148,124));     
        Toolkit toolkit = Toolkit.getDefaultToolkit();       
        Image cursorImage = toolkit.getImage(getClass().getResource("resources/cursor2.png"));
        Cursor customCursor = toolkit.createCustomCursor(cursorImage, new Point(0, 0), "custom cursor");
     
        setCursor(customCursor);
         if (soundPlayer.isMuted()) {
            Mute.setText("♬"); 
        } else {
            Mute.setText("✘♬"); 
        }

         if (soundPlayer.isMuted()) {
            Mute.setText("♬"); 
        } else {
            Mute.setText("✘♬"); 
        }
     
    }//GEN-LAST:event_MuteMouseEntered

    private void MuteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MuteMouseExited
     
        Mute.setBackground(new java.awt.Color(255, 188, 163));
        Toolkit toolkit = Toolkit.getDefaultToolkit();       
        Image cursorImage = toolkit.getImage(getClass().getResource("resources/cursor.png"));
        Cursor customCursor = toolkit.createCustomCursor(cursorImage, new Point(0, 0), "custom cursor");
        setCursor(customCursor);
     
    if (soundPlayer.isMuted()) {
        Mute.setText("✘♬"); 
    } else {
        Mute.setText("♬"); 
    }


    }//GEN-LAST:event_MuteMouseExited

    private void minusBananaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusBananaMouseEntered
        setButtonStyle(minusBanana, true);
    }//GEN-LAST:event_minusBananaMouseEntered

    private void minusBananaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusBananaMouseExited
        setButtonStyle(minusBanana, false);
    }//GEN-LAST:event_minusBananaMouseExited

    private void minusBananaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusBananaActionPerformed
        handleIngredientButtonAction(Fruit.FruitType.BANANA, Integer.parseInt(bananaCount.getText()), minusBanana);
    }//GEN-LAST:event_minusBananaActionPerformed

    private void minusStrawberryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusStrawberryMouseEntered
        setButtonStyle(minusStrawberry, true);
    }//GEN-LAST:event_minusStrawberryMouseEntered

    private void minusStrawberryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusStrawberryMouseExited
        setButtonStyle(minusStrawberry, false);
    }//GEN-LAST:event_minusStrawberryMouseExited

    private void minusStrawberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusStrawberryActionPerformed
        handleIngredientButtonAction(Fruit.FruitType.STRAWBERRY, Integer.parseInt(strawberryCount.getText()), minusStrawberry);
    }//GEN-LAST:event_minusStrawberryActionPerformed

    private void addStrawberryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStrawberryMouseEntered
        setButtonStyle(addStrawberry, true);
    }//GEN-LAST:event_addStrawberryMouseEntered

    private void addStrawberryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStrawberryMouseExited
        setButtonStyle(addStrawberry, false);
    }//GEN-LAST:event_addStrawberryMouseExited

    private void addStrawberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStrawberryActionPerformed
        handleIngredientButtonAction(Fruit.FruitType.STRAWBERRY, Integer.parseInt(strawberryCount.getText()), addStrawberry);
    }//GEN-LAST:event_addStrawberryActionPerformed

    private void addWatermelonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addWatermelonMouseEntered
        setButtonStyle(addWatermelon, true);
    }//GEN-LAST:event_addWatermelonMouseEntered

    private void addWatermelonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addWatermelonMouseExited
        setButtonStyle(addWatermelon, false);
    }//GEN-LAST:event_addWatermelonMouseExited

    private void addWatermelonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWatermelonActionPerformed
        handleIngredientButtonAction(Fruit.FruitType.WATERMELON, Integer.parseInt(watermelonCount.getText()), addWatermelon);
    }//GEN-LAST:event_addWatermelonActionPerformed

    private void minusWatermelonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusWatermelonMouseEntered
        setButtonStyle(minusWatermelon, true);
    }//GEN-LAST:event_minusWatermelonMouseEntered

    private void minusWatermelonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusWatermelonMouseExited
        setButtonStyle(minusWatermelon, false);
    }//GEN-LAST:event_minusWatermelonMouseExited

    private void minusWatermelonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusWatermelonActionPerformed
        handleIngredientButtonAction(Fruit.FruitType.WATERMELON, Integer.parseInt(watermelonCount.getText()), minusWatermelon);
    }//GEN-LAST:event_minusWatermelonActionPerformed

    private void minusBlueberryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusBlueberryMouseEntered
        setButtonStyle(minusBlueberry, true);
    }//GEN-LAST:event_minusBlueberryMouseEntered

    private void minusBlueberryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusBlueberryMouseExited
         setButtonStyle(minusBlueberry, false);
    }//GEN-LAST:event_minusBlueberryMouseExited

    private void minusBlueberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusBlueberryActionPerformed
        handleIngredientButtonAction(Fruit.FruitType.BLUEBERRY, Integer.parseInt(blueberryCount.getText()), minusBlueberry);
    }//GEN-LAST:event_minusBlueberryActionPerformed

    private void addBlueberryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBlueberryMouseEntered
        setButtonStyle(addBlueberry, true);
    }//GEN-LAST:event_addBlueberryMouseEntered

    private void addBlueberryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBlueberryMouseExited
        setButtonStyle(addBlueberry, false);
    }//GEN-LAST:event_addBlueberryMouseExited

    private void addBlueberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBlueberryActionPerformed
        handleIngredientButtonAction(Fruit.FruitType.BLUEBERRY, Integer.parseInt(blueberryCount.getText()), addBlueberry);
    }//GEN-LAST:event_addBlueberryActionPerformed

    private void addMangoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMangoMouseEntered
        setButtonStyle(addMango, true);
    }//GEN-LAST:event_addMangoMouseEntered

    private void addMangoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMangoMouseExited
        setButtonStyle(addMango, false);
    }//GEN-LAST:event_addMangoMouseExited

    private void addMangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMangoActionPerformed
        handleIngredientButtonAction(Fruit.FruitType.MANGO, Integer.parseInt(mangoCount.getText()), addMango);
    }//GEN-LAST:event_addMangoActionPerformed

    private void minusMangoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMangoMouseEntered
        setButtonStyle(minusMango, true);
    }//GEN-LAST:event_minusMangoMouseEntered

    private void minusMangoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMangoMouseExited
        setButtonStyle(minusMango, false);
    }//GEN-LAST:event_minusMangoMouseExited

    private void minusMangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusMangoActionPerformed
        handleIngredientButtonAction(Fruit.FruitType.MANGO, Integer.parseInt(mangoCount.getText()), minusMango);
    }//GEN-LAST:event_minusMangoActionPerformed

    private void minusPineappleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusPineappleMouseEntered
        setButtonStyle(minusPineapple, true);
    }//GEN-LAST:event_minusPineappleMouseEntered

    private void minusPineappleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusPineappleMouseExited
        setButtonStyle(minusPineapple, false);
    }//GEN-LAST:event_minusPineappleMouseExited

    private void minusPineappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusPineappleActionPerformed
        handleIngredientButtonAction(Fruit.FruitType.PINEAPPLE, Integer.parseInt(pineappleCount.getText()), minusPineapple);
    }//GEN-LAST:event_minusPineappleActionPerformed

    private void addPineappleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPineappleMouseEntered
        setButtonStyle(addPineapple, true);
    }//GEN-LAST:event_addPineappleMouseEntered

    private void addPineappleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPineappleMouseExited
        setButtonStyle(addPineapple, false);
    }//GEN-LAST:event_addPineappleMouseExited

    private void addPineappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPineappleActionPerformed
        handleIngredientButtonAction(Fruit.FruitType.PINEAPPLE, Integer.parseInt(pineappleCount.getText()), addPineapple);
    }//GEN-LAST:event_addPineappleActionPerformed

    private void blendMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blendMouseEntered
        setButtonStyle(blend, true);
    }//GEN-LAST:event_blendMouseEntered

    private void blendMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blendMouseExited
        setButtonStyle(blend, false);
    }//GEN-LAST:event_blendMouseExited

    private void blendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blendActionPerformed
  try {
    System.out.println("Start blending process");

    Cocktail cocktail = blender.blend();
    String hexColor = cocktail.getColor();
    String ingredientSummary = blender.getIngredientSummary();
    int totalVolume = cocktail.getVolume();
    int totalCalories = cocktail.getCalories();
    int cups = (int) Math.ceil(totalVolume / 100.0);
    populateColorChoices();

    updateCapacityDisplay(blender.getCurrentVolume());
    blender.clearIngredients();
    resetIngredientCounts();
    
    StringBuilder logMessage = new StringBuilder();
    logMessage.append("Cocktail blended successfully!<br>Ingredients: ").append(ingredientSummary).append("<br>")
            .append("Total Calories: ").append(totalCalories).append(", Color: ").append(hexColor).append(", Total Volume: ").append(totalVolume).append("ml, Cups: ").append(cups);


    JOptionPane optionPane = new JOptionPane ("<html><body>" + logMessage.toString() + "</body></html>", JOptionPane.INFORMATION_MESSAGE);
    JDialog dialog = optionPane.createDialog("Blending Complete");
    dialog.setModal(true); 

    dialog.setVisible(true);
    list.setText("");

    

    System.out.println("End blending process");
    System.out.println("\n----------------");
} catch (BlenderException e) {
   showCenteredJOptionPane(this, e.getMessage(), "Blending Error", JOptionPane.ERROR_MESSAGE);
} catch (HeadlessException e) {
   showCenteredJOptionPane(this, "Unexpected error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_blendActionPerformed

    private void minusMilkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMilkMouseEntered
        setButtonStyle(minusMilk, true);
    }//GEN-LAST:event_minusMilkMouseEntered

    private void minusMilkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMilkMouseExited
        setButtonStyle(minusMilk, false);
    }//GEN-LAST:event_minusMilkMouseExited

    private void minusMilkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusMilkActionPerformed

 int count = Integer.parseInt(milkCount.getText());
    if (count > 0) {
        try {
            Ingredient milkToRemove = blender.getIngredients().stream()
               .filter(i -> i instanceof Milk)
               .findFirst().orElse(null);
            if (milkToRemove != null) {
                blender.removeIngredient(milkToRemove);
                milkCount.setText(String.valueOf(--count));
                updateCapacityDisplay(blender.getCurrentVolume());

            }
        } catch (Exception e) {
            showCenteredJOptionPane(this, "Error removing milk: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        showCenteredJOptionPane(this, "No milk to remove.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_minusMilkActionPerformed

    private void addMilkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMilkMouseEntered
        setButtonStyle(addMilk, true);
    }//GEN-LAST:event_addMilkMouseEntered

    private void addMilkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMilkMouseExited
        setButtonStyle(addMilk, false);
    }//GEN-LAST:event_addMilkMouseExited

    private void addMilkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMilkActionPerformed
       try {
        int count = Integer.parseInt(milkCount.getText()); 
        Milk milk = new Milk(1);  
        blender.addIngredient(milk);
        milkCount.setText(String.valueOf(++count)); 
        updateCapacityDisplay(blender.getCurrentVolume()); 
        updateIngredientListDisplay("Milk", true);

    } catch (BlenderException e) {
        showCenteredJOptionPane(this, e.getMessage(), "Capacity Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        showCenteredJOptionPane(this, "Invalid number format for milk count.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_addMilkActionPerformed

    private void minusSugarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusSugarMouseEntered
        setButtonStyle(minusSugar, true);
    }//GEN-LAST:event_minusSugarMouseEntered

    private void minusSugarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusSugarMouseExited
        setButtonStyle(minusSugar, false);
    }//GEN-LAST:event_minusSugarMouseExited

    private void minusSugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusSugarActionPerformed

 int count = Integer.parseInt(sugarCount.getText());
    if (count > 0) {
        try {
            Ingredient sugarToRemove = blender.getIngredients().stream()
               .filter(i -> i instanceof Milk)
               .findFirst().orElse(null);
            if (sugarToRemove != null) {
                blender.removeIngredient(sugarToRemove);
                sugarCount.setText(String.valueOf(--count));
                updateIngredientListDisplay("Sugar", false);
                updateCapacityDisplay(blender.getCurrentVolume());
            }
            updateIngredientListDisplay("Milk", false);
        } catch (Exception e) {
            showCenteredJOptionPane(this, "Error removing sugar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        showCenteredJOptionPane(this, "No sugar to remove.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_minusSugarActionPerformed

    private void addSugarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSugarMouseEntered
        setButtonStyle(addSugar, true);
    }//GEN-LAST:event_addSugarMouseEntered

    private void addSugarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSugarMouseExited
        setButtonStyle(addSugar, false);
    }//GEN-LAST:event_addSugarMouseExited

    private void addSugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSugarActionPerformed
        try {
        int count = Integer.parseInt(sugarCount.getText()); 
        Sugar sugar = new Sugar(1);  
        blender.addIngredient(sugar);
        sugarCount.setText(String.valueOf(++count)); 
        updateIngredientListDisplay("Sugar", true);
        updateCapacityDisplay(blender.getCurrentVolume()); 
    } catch (BlenderException e) {
        showCenteredJOptionPane(this, e.getMessage(), "Capacity Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        showCenteredJOptionPane(this, "Invalid number format for sugar count.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_addSugarActionPerformed

    private void minusIceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusIceMouseEntered
        setButtonStyle(minusIce, true);
    }//GEN-LAST:event_minusIceMouseEntered

    private void minusIceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusIceMouseExited
        setButtonStyle(minusIce, false);
    }//GEN-LAST:event_minusIceMouseExited

    private void minusIceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusIceActionPerformed

 int count = Integer.parseInt(iceCount.getText());
    if (count > 0) {
        try {
            Ingredient iceToRemove = blender.getIngredients().stream()
               .filter(i -> i instanceof Milk)
               .findFirst().orElse(null);
            if (iceToRemove != null) {
                blender.removeIngredient(iceToRemove);
                milkCount.setText(String.valueOf(--count));
                updateIngredientListDisplay("Ice", false);
                updateCapacityDisplay(blender.getCurrentVolume());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error removing ice: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "No ice to remove.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_minusIceActionPerformed

    private void addIceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addIceMouseEntered
        setButtonStyle(addIce, true);
    }//GEN-LAST:event_addIceMouseEntered

    private void addIceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addIceMouseExited
        setButtonStyle(addIce, false);
    }//GEN-LAST:event_addIceMouseExited

    private void addIceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIceActionPerformed
        try {
        int count = Integer.parseInt(iceCount.getText()); 
        Ice ice = new Ice(1);  
        blender.addIngredient(ice);
        iceCount.setText(String.valueOf(++count)); 
        updateCapacityDisplay(blender.getCurrentVolume()); 
        updateIngredientListDisplay("Ice", true);
    } catch (BlenderException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Capacity Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid number format for ice count.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_addIceActionPerformed

    private void oneCupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneCupActionPerformed
                                     
    int currentVolume = blender.getCurrentVolume(); 
    if (currentVolume == 0) {
        JOptionPane.showMessageDialog(this, "Blender is empty. Cannot pour a cup.", "Pour Error", JOptionPane.ERROR_MESSAGE);
        logger.log("Failed to pour: Blender is empty.");
        return;
    }

    int cupVolume = Math.min(currentVolume, 100);
    double percentageFull = (double) cupVolume / 100 * 100;
    double cupCalories = ((double) blender.getTotalCalories() * cupVolume) / currentVolume;

    String message = String.format("Poured one cup: %d mL (%.2f%% full), Calories: %.0f Calories", cupVolume, percentageFull, cupCalories);
    logger.log(message);
    JOptionPane.showMessageDialog(this, message, "Cup Poured", JOptionPane.INFORMATION_MESSAGE);

    blender.setCurrentVolume(currentVolume - cupVolume); 
    updateCapacityDisplay(blender.getCurrentVolume());

    }//GEN-LAST:event_oneCupActionPerformed

    private void oneCupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneCupMouseEntered
        setButtonStyle(oneCup, true);
    }//GEN-LAST:event_oneCupMouseEntered

    private void oneCupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneCupMouseExited
        setButtonStyle(oneCup, false);
    }//GEN-LAST:event_oneCupMouseExited

    private void inputInputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputInputMouseEntered
        setButtonStyle(inputInput, true);
    }//GEN-LAST:event_inputInputMouseEntered

    private void inputInputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputInputMouseExited
        setButtonStyle(inputInput, false);
    }//GEN-LAST:event_inputInputMouseExited

    private void inputInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputInputActionPerformed

    String filePath = "src/cocktail/input.txt";
    try {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ");
            if (parts.length != 2) {
                JOptionPane.showMessageDialog(this, "Invalid format in input file.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            int quantity = Integer.parseInt(parts[0]);
            String ingredientName = parts[1].toUpperCase();

            for (int i = 0; i < quantity; i++) {
                addIngredientByName(ingredientName);
            }
        }
        reader.close();
    } catch (FileNotFoundException e) {
        JOptionPane.showMessageDialog(this, "The file was not found: " + e.getMessage(), "File Not Found", JOptionPane.ERROR_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error reading the file: " + e.getMessage(), "Read Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error in number format in the input file: " + e.getMessage(), "Number Format Error", JOptionPane.ERROR_MESSAGE);
    } catch (BlenderException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Blending Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void addIngredientByName(String ingredientName) throws BlenderException {
    Ingredient ingredient;
    switch (ingredientName) {
        case "BANANA":
            ingredient = new Fruit(Fruit.FruitType.BANANA, 1);
            bananaCount.setText(String.valueOf(Integer.parseInt(bananaCount.getText()) + 1));
            break;
        case "STRAWBERRY":
            ingredient = new Fruit(Fruit.FruitType.STRAWBERRY, 1);
            strawberryCount.setText(String.valueOf(Integer.parseInt(strawberryCount.getText()) + 1));
            break;
        case "BLUEBERRY":
            ingredient = new Fruit(Fruit.FruitType.BLUEBERRY, 1);
            blueberryCount.setText(String.valueOf(Integer.parseInt(blueberryCount.getText()) + 1));
            break;
        case "MANGO":
            ingredient = new Fruit(Fruit.FruitType.MANGO, 1);
            mangoCount.setText(String.valueOf(Integer.parseInt(mangoCount.getText()) + 1));
            break;
        case "PINEAPPLE":
            ingredient = new Fruit(Fruit.FruitType.PINEAPPLE, 1);
            pineappleCount.setText(String.valueOf(Integer.parseInt(pineappleCount.getText()) + 1));
            break;
        case "WATERMELON":
            ingredient = new Fruit(Fruit.FruitType.WATERMELON, 1);
            watermelonCount.setText(String.valueOf(Integer.parseInt(watermelonCount.getText()) + 1));
            break;
        case "MILK":
            ingredient = new Milk(1);
            milkCount.setText(String.valueOf(Integer.parseInt(milkCount.getText()) + 1));
            break;
        case "SUGAR":
            ingredient = new Sugar(1);
            sugarCount.setText(String.valueOf(Integer.parseInt(sugarCount.getText()) + 1));
            break;
        case "ICE":
            ingredient = new Ice(1);
            iceCount.setText(String.valueOf(Integer.parseInt(iceCount.getText()) + 1));
            break;
        default:
            JOptionPane.showMessageDialog(this, "Ingredient not recognized: " + ingredientName, "Ingredient Error", JOptionPane.ERROR_MESSAGE);
            return;
    }

    blender.addIngredient(ingredient);
    updateCapacityDisplay(blender.getCurrentVolume());
    updateIngredientListDisplay(ingredientName.toLowerCase(), true);


    }//GEN-LAST:event_inputInputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         if (JOptionPane.showConfirmDialog(null, "Confirm if you want to exit", "Exit Confirmation",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

         if (JOptionPane.showConfirmDialog(null, "Confirm if you want to exit", "Exit Confirmation",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

         if (JOptionPane.showConfirmDialog(null, "Confirm if you want to exit", "Exit Confirmation",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

private void populateColorChoices() {
    List<String> colors = blender.getUsedColors();
    for (String color : colors) {
        if (!colorExistsInComboBox(color)) {
            colorChoose.addItem(color);
        }
    }
}

private boolean colorExistsInComboBox(String color) {
    for (int i = 0; i < colorChoose.getItemCount(); i++) {
        if (colorChoose.getItemAt(i).equals(color)) {
            return true;
        }
    }
    return false;
}
    private void colorChooseActionPerformed(java.awt.event.ActionEvent evt) {
        String selectedColor = (String) colorChoose.getSelectedItem();
        updateColorDisplay(selectedColor);
    }
    
    private void colorEnterActionPerformed(ActionEvent evt) {
    String text = colorEnter.getText();
    updateColorDisplay(text); 
}

    private void updateColorDisplay(String hexColor) {
        try {
            Color color = Color.decode(hexColor);
            colorColor1.setBackground(color);
            colorColor1.setOpaque(true); 
            colorcolor.setText("RGB: " + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid color format. Please enter a valid hex color code.", "Color Format Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SoundPlayer soundPlayer = new SoundPlayer();
                new Game(soundPlayer).setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BLUEBERRY;
    private javax.swing.JLabel BLUEBERRY1;
    private javax.swing.JLabel ICE;
    private javax.swing.JLabel MILK;
    private javax.swing.JToggleButton Mute;
    private javax.swing.JLabel PINEAPPLE;
    private javax.swing.JLabel STRAWBERRY;
    private javax.swing.JLabel SUGAR;
    private javax.swing.JLabel WATERMELON;
    private javax.swing.JButton addBanana;
    private javax.swing.JButton addBlueberry;
    private javax.swing.JButton addIce;
    private javax.swing.JButton addMango;
    private javax.swing.JButton addMilk;
    private javax.swing.JButton addPineapple;
    private javax.swing.JButton addStrawberry;
    private javax.swing.JButton addSugar;
    private javax.swing.JButton addWatermelon;
    private javax.swing.JLabel bananaCount;
    private javax.swing.JLabel bbbrr;
    private javax.swing.JLabel bgd;
    private javax.swing.JLabel bgd1;
    private javax.swing.JLabel bgd2;
    private javax.swing.JButton blend;
    private javax.swing.JLabel blueberryCount;
    private javax.swing.JComboBox<String> colorChoose;
    private javax.swing.JLabel colorColor1;
    private javax.swing.JTextField colorEnter;
    private javax.swing.JLabel colorcolor;
    private javax.swing.JLabel currentCapacity;
    private javax.swing.JLabel iceCount;
    private javax.swing.JButton inputInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea list;
    private javax.swing.JTextField loggs;
    private javax.swing.JTextArea logs;
    private javax.swing.JLabel mangoCount;
    private javax.swing.JLabel milkCount;
    private javax.swing.JButton minusBanana;
    private javax.swing.JButton minusBlueberry;
    private javax.swing.JButton minusIce;
    private javax.swing.JButton minusMango;
    private javax.swing.JButton minusMilk;
    private javax.swing.JButton minusPineapple;
    private javax.swing.JButton minusStrawberry;
    private javax.swing.JButton minusSugar;
    private javax.swing.JButton minusWatermelon;
    private javax.swing.JButton oneCup;
    private javax.swing.JLabel pineappleCount;
    private javax.swing.JLabel strawberryCount;
    private javax.swing.JLabel sugarCount;
    private javax.swing.JLabel watermelonCount;
    // End of variables declaration//GEN-END:variables

private void updateIngredientListDisplay(Fruit.FruitType ingredientType, boolean add) {
    String ingredientName = ingredientType.toString().toLowerCase();
    if (add) {
        list.append(ingredientName + "\n");
    } else {
        String currentText = list.getText();
        String newText = currentText.replaceFirst(ingredientName + "\n", "");
        list.setText(newText);
    }
}
private void updateIngredientListDisplay(String ingredient, boolean add) {
    if (add) {
        list.append(ingredient + "\n");
    } else {
        String currentText = list.getText();
        list.setText(currentText.replaceFirst(ingredient + "\n", ""));
    }
}
public static void showCenteredJOptionPane(JFrame frame, String message, String title, int messageType) {
    JOptionPane optionPane = new JOptionPane(message, messageType);
    JDialog dialog = optionPane.createDialog(frame, title);
    dialog.setLocationRelativeTo(frame);
    dialog.setVisible(true);
}

}
