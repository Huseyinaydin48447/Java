
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.IntelliJTheme;
import com.formdev.flatlaf.FlatDarculaLaf;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.border.Border;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/** 
 *
 * @author Asus
 */
public class Main extends javax.swing.JFrame {

    private JPopupMenu contextMenu;

    public Main() {
        initComponents();
        updatePanelSizeLabels();
        setupKeyBindings();
        setupContextMenu();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lblSaveCurnetScene = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblPanel = new javax.swing.JPanel();
        btnlblPanelAddUpdate = new javax.swing.JButton();
        txtPanelAddWidth = new javax.swing.JTextField();
        txtPanelAddHeight = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        ImageFlip = new javax.swing.JCheckBox();
        btnImageUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtImagemouseX = new javax.swing.JTextField();
        txtImagemouseY = new javax.swing.JTextField();
        txtImageWidth = new javax.swing.JTextField();
        txtImageHeight = new javax.swing.JTextField();
        txtImageRot = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        PanalImageAdd = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstImageAdd = new javax.swing.JList<>();
        lbl = new javax.swing.JTextField();
        btnImageAdd = new javax.swing.JButton();
        btnImageRemove = new javax.swing.JButton();
        lblMouseLocation = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPanelAdd = new javax.swing.JScrollPane();
        lblGet = new javax.swing.JPanel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(130, 130, 130), 2, true));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        jButton4.setText("New Scene");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Load Scene");
        jButton5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton5MouseMoved(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        lblSaveCurnetScene.setText("Save Curnet Scene");
        lblSaveCurnetScene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblSaveCurnetSceneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(lblSaveCurnetScene)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(lblSaveCurnetScene))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 130, 130), 2));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 130, 130), 2));

        lblPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 130, 130)));

        btnlblPanelAddUpdate.setText("Update");
        btnlblPanelAddUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlblPanelAddUpdateActionPerformed(evt);
            }
        });

        txtPanelAddWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPanelAddWidthActionPerformed(evt);
            }
        });

        txtPanelAddHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPanelAddHeightActionPerformed(evt);
            }
        });

        jLabel1.setText("Width:");

        jLabel2.setText("Height:");

        jLabel5.setText("Scene");

        javax.swing.GroupLayout lblPanelLayout = new javax.swing.GroupLayout(lblPanel);
        lblPanel.setLayout(lblPanelLayout);
        lblPanelLayout.setHorizontalGroup(
            lblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lblPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPanelAddHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lblPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPanelAddWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnlblPanelAddUpdate))
                .addGap(52, 52, 52))
            .addGroup(lblPanelLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        lblPanelLayout.setVerticalGroup(
            lblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblPanelLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(14, 14, 14)
                .addGroup(lblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPanelAddWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(lblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPanelAddHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnlblPanelAddUpdate)
                .addGap(0, 102, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 130, 130)));

        ImageFlip.setText("flip");

        btnImageUpdate.setText("Update");
        btnImageUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageUpdateActionPerformed(evt);
            }
        });

        jLabel3.setText("PosX:");

        jLabel4.setText("PosY:");

        jLabel11.setText("Width:");

        jLabel13.setText("Height:");

        jLabel14.setText("Rot");

        jLabel15.setText("Asset");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtImageHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtImagemouseX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtImageWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtImagemouseY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtImageRot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(ImageFlip)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnImageUpdate))))
                    .addComponent(jLabel15))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtImagemouseX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtImagemouseY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtImageWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImageHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtImageRot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImageFlip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImageUpdate)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanalImageAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 130, 130), 2));

        lstImageAdd.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstImageAddValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstImageAdd);

        javax.swing.GroupLayout PanalImageAddLayout = new javax.swing.GroupLayout(PanalImageAdd);
        PanalImageAdd.setLayout(PanalImageAddLayout);
        PanalImageAddLayout.setHorizontalGroup(
            PanalImageAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanalImageAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanalImageAddLayout.setVerticalGroup(
            PanalImageAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanalImageAddLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        lbl.setText("Assets");
        lbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblActionPerformed(evt);
            }
        });

        btnImageAdd.setText("+");
        btnImageAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageAddActionPerformed(evt);
            }
        });

        btnImageRemove.setText("-");
        btnImageRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageRemoveActionPerformed(evt);
            }
        });

        lblMouseLocation.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Scene MousePos :");

        jLabel6.setText("Properties");

        lblGet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 130, 130), 5));
        lblGet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblGetKeyPressed(evt);
            }
        });
        lblGet.setLayout(null);
        lblPanelAdd.setViewportView(lblGet);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(PanalImageAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPanelAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImageAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImageRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMouseLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnImageRemove)
                                .addComponent(btnImageAdd)
                                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(lblMouseLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanalImageAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPanelAdd))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void setupContextMenu() {
        contextMenu = new JPopupMenu();

        JMenuItem bringToFrontItem = new JMenuItem("Replicate horizontally");
        bringToFrontItem.addActionListener(e -> replicateHorizontallyDialog(true));
        contextMenu.add(bringToFrontItem);

        JMenuItem sendToBackItem = new JMenuItem("Replicate vertically");
        sendToBackItem.addActionListener(e -> replicateHorizontallyDialog(false));
        contextMenu.add(sendToBackItem);

        lblGet.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                showContextMenu(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                showContextMenu(e);
            }
        });
    }

    private void showContextMenu(MouseEvent e) {
        if (e.isPopupTrigger()) {
//            contextMenu.show(e.getComponent(), e.getX(), e.getY());
        }
    }

    private void bringToFront() {

        System.out.println("Replicate horizontally");

    }

    private void sendToBack() {

        System.out.println("Replicate  vertically");
    }

private void replicateHorizontallyDialog(boolean replicateHorizontally) {
    JTextField textField = new JTextField(10);

    Object[] message = {
        "Kaç kopya oluşturulsun?:", textField
    };

    int option = JOptionPane.showOptionDialog(
            null,
            message,
            replicateHorizontally ? "Replicate Horizontally" : "Replicate Vertically",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null,
            new Object[]{"OK", "Cancel"},
            "OK"
    );

    if (option == JOptionPane.OK_OPTION) {
        String inputValue = textField.getText();

        try {
            int numberOfCopies = Integer.parseInt(inputValue);

            replicateImages(numberOfCopies, replicateHorizontally);

            showAllImages();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Geçerli bir sayı giriniz.", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }
}

private void replicateImages(int numberOfCopies, boolean replicateHorizontally) {
    if (selectedImageLabel != null) {
        for (int i = 0; i < numberOfCopies; i++) {
            JLabel newImageLabel = new JLabel();
            Icon selectedIcon = selectedImageLabel.getIcon();

            if (selectedIcon != null) {
                newImageLabel.setIcon(selectedIcon);

                int newX = replicateHorizontally ? selectedImageLabel.getX() + selectedImageLabel.getWidth() * (i + 1) : selectedImageLabel.getX();
                int newY = replicateHorizontally ? selectedImageLabel.getY() : selectedImageLabel.getY() + selectedImageLabel.getHeight() * (i + 1);
                newImageLabel.setLocation(newX, newY);

                newImageLabel.setSize(selectedImageLabel.getSize());

                newImageLabel.setVisible(true);

                lblGet.add(newImageLabel, 0);

                initializeDragAndDrop(newImageLabel);
            } else {
                System.out.println("Selected icon is null. Ensure that the icon is set.");
            }
        }

        lblGet.revalidate();
        lblGet.repaint();
    }
}

    private void showAllImages() {
        Component[] components = lblGet.getComponents();
        for (Component component : components) {
            if (component instanceof JLabel) {
                JLabel imageLabel = (JLabel) component;
                int x = imageLabel.getX();
                int y = imageLabel.getY();
                System.out.println("Resim Konumu - X: " + x + ", Y: " + y);
            }
        }
    }

    private void replicateHorizontally(int numberOfCopies) {
        if (selectedImageLabel != null) {
            for (int i = 0; i < numberOfCopies; i++) {
                JLabel newImageLabel = new JLabel();
                Icon selectedIcon = selectedImageLabel.getIcon();

                if (selectedIcon != null) {
                    newImageLabel.setIcon(selectedIcon);

                    int newX = selectedImageLabel.getX() + selectedImageLabel.getWidth() * (i + 1);
                    int newY = selectedImageLabel.getY();
                    newImageLabel.setLocation(newX, newY);

                    newImageLabel.setSize(selectedImageLabel.getSize());

                    newImageLabel.setVisible(true);

                    lblGet.add(newImageLabel);

                    initializeDragAndDrop(newImageLabel);
                } else {
                    System.out.println("Selected icon is null. Ensure that the icon is set.");
                }
            }

            lblGet.revalidate();
            lblGet.repaint();
        }
    }


    
    
    
      
    
    
    
      
    
    
    
    
    
    
    private void btnImageRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageRemoveActionPerformed
        imageListModel.clear();


    }//GEN-LAST:event_btnImageRemoveActionPerformed

    private DefaultListModel<ImageIcon> imageListModel = new DefaultListModel<>();


    private void btnImageAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageAddActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = fileChooser.getSelectedFile();

            File[] files = selectedFolder.listFiles();

            DefaultListModel<ImageIcon> newImageListModel = new DefaultListModel<>();

            for (File file : files) {
                if (file.isFile() && isImageFile(file.getName())) {
                    int originalWidth;
                    int originalHeight;

                    try {
                        BufferedImage originalImage = ImageIO.read(file);
                        originalWidth = originalImage.getWidth();
                        originalHeight = originalImage.getHeight();

                        Dimension newSize = calculateAspectRatio(originalWidth, originalHeight, 100, 90);
                        int targetWidth = (int) newSize.getWidth();
                        int targetHeight = (int) newSize.getHeight();

                        Image scaledImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
                        ImageIcon scaledIcon = new ImageIcon(scaledImage);

                        newImageListModel.addElement(scaledIcon);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            for (int i = 0; i < newImageListModel.size(); i++) {
                imageListModel.addElement(newImageListModel.getElementAt(i));
            }

            lstImageAdd.setModel(imageListModel);
        }
    }//GEN-LAST:event_btnImageAddActionPerformed

    private Dimension calculateAspectRatio(int originalWidth, int originalHeight, int targetWidth, int targetHeight) {
        double scaleFactor = Math.min(
                (double) targetWidth / originalWidth,
                (double) targetHeight / originalHeight
        );

        int newWidth = (int) (originalWidth * scaleFactor);
        int newHeight = (int) (originalHeight * scaleFactor);

        return new Dimension(newWidth, newHeight);
    }

    private void ImageFlipItemStateChanged(java.awt.event.ItemEvent evt) {
        if (ImageFlip.isSelected()) {
            // Eğer seçiliyse, resmi yatay eksende çevir
            flipImageHorizontal();
        } else {
            // Eğer seçili değilse, çevrilmiş haliyle orijinal resmi göster
            resetImage();
        }
    }

    private Image flipImage(Image originalImage, FlipDirection direction) {
        int width = originalImage.getWidth(null);
        int height = originalImage.getHeight(null);

        BufferedImage flippedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = flippedImage.createGraphics();

        if (direction == FlipDirection.HORIZONTAL) {
            // Yatay çevirme işlemi
            g2d.drawImage(originalImage, width, 0, 0, height, 0, 0, width, height, null);
        } else if (direction == FlipDirection.VERTICAL) {
            // Dikey çevirme işlemi
            g2d.drawImage(originalImage, 0, height, width, 0, 0, 0, width, height, null);
        }

        g2d.dispose();
        return flippedImage;
    }

    private void resetImage() {
        // Eğer flip seçili değilse, orijinal haliyle resmi göster
        updateImage();
    }

    private enum FlipDirection {
        HORIZONTAL, VERTICAL
    }


    private void lblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblActionPerformed

    private JLabel selectedImageLabel; 
    private Point initialMouseClick; 
    private boolean isFrameAdded = false;  
    private boolean areCornersAdded = false; 
    private int doubleClickCount = 0; 

    private void updateMouseCoordinates(int x, int y) {
        txtImagemouseX.setText(Integer.toString(x));
        txtImagemouseY.setText(Integer.toString(y));
    }

    private void initializeDragAndDrop(JLabel imageLabel) {
        imageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    removeFrameAndCorners();
                    if (!isFrameAdded) {
                       
                        addFrameToSelectedImage();
                        addCornersToSelectedImage();
                        isFrameAdded = true;
                        areCornersAdded = true;
                        contextMenu.show(e.getComponent(), e.getX(), e.getY());
                    }
                }
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                initialMouseClick = e.getPoint();
                imageLabel.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                selectedImageLabel = imageLabel;
                lblGet.setComponentZOrder(selectedImageLabel, 0);
                
                

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                imageLabel.setCursor(Cursor.getDefaultCursor());
            }
        });

        imageLabel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = imageLabel.getX() + e.getX() - initialMouseClick.x;
                int y = imageLabel.getY() + e.getY() - initialMouseClick.y;

                x = Math.max(0, Math.min(lblGet.getWidth() - imageLabel.getWidth(), x));
                y = Math.max(0, Math.min(lblGet.getHeight() - imageLabel.getHeight(), y));

                imageLabel.setLocation(new Point(x, y));
                updateRotation();

            }
        });
        lblGet.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
//                int mouseX = e.getX();
//                int mouseY = e.getY();
//
//                lblMouseLocation.setText("(" + mouseX + ", " + mouseY + ")");
                int mouseX = selectedImageLabel.getX(); 
                int mouseY = selectedImageLabel.getY();
                txtImagemouseX.setText(Integer.toString(mouseX));
                txtImagemouseY.setText(Integer.toString(mouseY));

                int imageWidth = selectedImageLabel.getWidth();
                int imageHeight = selectedImageLabel.getHeight();

                txtImageWidth.setText(String.valueOf(imageWidth));
                txtImageHeight.setText(String.valueOf(imageHeight));

                if (isFrameAdded || areCornersAdded) {
                    selectedImageLabel.setBorder(null);
                    removeCornersFromSelectedImage();
                    isFrameAdded = false;
                    areCornersAdded = false;
                }
            }
        });

        lblGet.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int mouseX = e.getX();
                int mouseY = e.getY();

                lblMouseLocation.setText("(" + mouseX + ", " + mouseY + ")");

                updatePanelSizeLabels();

            }
        });
        
        
    }

    private void updateRotation() {
        if (selectedImageLabel != null) {

            int rotationAngle = calculateRotationAngle(); 

            txtImageRot.setText(Integer.toString(rotationAngle));
        }
    }

    private int calculateRotationAngle() {
       
        return 0; 
    }

    private void updatePanelSizeLabels() {
        int panelWidth = lblPanelAdd.getWidth();
        int panelHeight = lblPanelAdd.getHeight();

        txtPanelAddWidth.setText("" + panelWidth);
        txtPanelAddHeight.setText("" + panelHeight);
    }

    private void addCornersToSelectedImage() {
        JLabel topLeftCorner = createCornerLabel(Color.BLUE);
        JLabel topRightCorner = createCornerLabel(Color.BLUE);
        JLabel bottomLeftCorner = createCornerLabel(Color.BLUE);
        JLabel bottomRightCorner = createCornerLabel(Color.BLUE);

        placeCorner(topLeftCorner, 0, 0);
        placeCorner(topRightCorner, selectedImageLabel.getWidth() - topLeftCorner.getWidth(), 0);
        placeCorner(bottomLeftCorner, 0, selectedImageLabel.getHeight() - bottomLeftCorner.getHeight());
        placeCorner(bottomRightCorner, selectedImageLabel.getWidth() - bottomRightCorner.getWidth(),
                selectedImageLabel.getHeight() - bottomRightCorner.getHeight());

        addResizeDragFunctionality(topLeftCorner, ResizeDirection.TOP_LEFT);
        addResizeDragFunctionality(topRightCorner, ResizeDirection.TOP_RIGHT);
        addResizeDragFunctionality(bottomLeftCorner, ResizeDirection.BOTTOM_LEFT);
        addResizeDragFunctionality(bottomRightCorner, ResizeDirection.BOTTOM_RIGHT);

        selectedImageLabel.add(topLeftCorner);
        selectedImageLabel.add(topRightCorner);
        selectedImageLabel.add(bottomLeftCorner);
        selectedImageLabel.add(bottomRightCorner);
    }

    private enum ResizeDirection {
        TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT
    }

    
    private void addResizeDragFunctionality(JLabel cornerLabel, ResizeDirection direction) {
        cornerLabel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int cornerX = cornerLabel.getX();
                int cornerY = cornerLabel.getY();

                int mouseX = e.getXOnScreen();
                int mouseY = e.getYOnScreen();

                int deltaX = mouseX - initialMouseClick.x;
                int deltaY = mouseY - initialMouseClick.y;

                int newWidth = selectedImageLabel.getWidth();
                int newHeight = selectedImageLabel.getHeight();

                switch (direction) {
                    case TOP_LEFT:
                        newWidth -= deltaX;
                        newHeight -= deltaY;
                        break;
                    case TOP_RIGHT:
                        newWidth += deltaX;
                        newHeight -= deltaY;
                        break;
                    case BOTTOM_LEFT:
                        newWidth -= deltaX;
                        newHeight += deltaY;
                        break;
                    case BOTTOM_RIGHT:
                        newWidth += deltaX;
                        newHeight += deltaY;
                        break;
                }

                newWidth = Math.max(50, newWidth);
                newHeight = Math.max(50, newHeight);

                selectedImageLabel.setSize(newWidth, newHeight);
                initialMouseClick.x = mouseX;
                initialMouseClick.y = mouseY;
            }
        });

        cornerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialMouseClick = e.getPoint();
            }
        });
    }

    private JLabel createCornerLabel(Color color) {
        JLabel cornerLabel = new JLabel();
        cornerLabel.setSize(10, 10); 
        cornerLabel.setOpaque(true);
        cornerLabel.setBackground(color);
        return cornerLabel;
    }

    private void placeCorner(JLabel cornerLabel, int x, int y) {
    int imageWidth = selectedImageLabel.getWidth();
    int imageHeight = selectedImageLabel.getHeight();

    int cornerX = Math.min(Math.max(x, 0), imageWidth - cornerLabel.getWidth());
    int cornerY = Math.min(Math.max(y, 0), imageHeight - cornerLabel.getHeight());

    cornerLabel.setLocation(cornerX, cornerY);

    cornerLabel.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
           
        }
    });
}


    private void removeCornersFromSelectedImage() {
        Component[] components = selectedImageLabel.getComponents();
        for (Component component : components) {
            if (component instanceof JLabel && ((JLabel) component).getBackground() == Color.BLUE) {
                selectedImageLabel.remove(component);
            }
        }
    }

    private void addFrameToSelectedImage() {
        Border frameBorder = BorderFactory.createLineBorder(Color.white, 4);

        selectedImageLabel.setBorder(frameBorder);

        int smallSquareSize = 20;
        Color smallSquareColor = Color.BLUE;

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null); 

        JPanel rightSquare = new JPanel();
        rightSquare.setBackground(smallSquareColor);
        rightSquare.setBounds(selectedImageLabel.getWidth() - smallSquareSize,
                selectedImageLabel.getHeight() / 2 - smallSquareSize / 2,
                smallSquareSize, smallSquareSize);
        contentPanel.add(rightSquare);

        JPanel centerSquare = new JPanel();
        centerSquare.setBackground(smallSquareColor);
        centerSquare.setBounds(selectedImageLabel.getWidth() / 2 - smallSquareSize / 2,
                selectedImageLabel.getHeight() / 2 - smallSquareSize / 2,
                smallSquareSize, smallSquareSize);
        contentPanel.add(centerSquare);

        JPanel leftSquare = new JPanel();
        leftSquare.setBackground(smallSquareColor);
        leftSquare.setBounds(0, selectedImageLabel.getHeight() / 2 - smallSquareSize / 2,
                smallSquareSize, smallSquareSize);
        contentPanel.add(leftSquare);

        selectedImageLabel.add(contentPanel);

        selectedImageLabel.revalidate();
        selectedImageLabel.repaint();

        updateImage();

    }

    private void cropAndResizeSelectedImage() {
        if (selectedImageLabel != null) {
            ImageIcon selectedImageIcon = (ImageIcon) selectedImageLabel.getIcon();
            Image selectedImage = selectedImageIcon.getImage();

            int targetWidth = selectedImageLabel.getWidth();
            int targetHeight = selectedImageLabel.getHeight();

            int originalWidth = selectedImage.getWidth(null);
            int originalHeight = selectedImage.getHeight(null);

            int x = Math.max(0, (originalWidth - targetWidth) / 2);
            int y = Math.max(0, (originalHeight - targetHeight) / 2);

            Image croppedImage = selectedImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
            ImageIcon croppedIcon = new ImageIcon(croppedImage);

            selectedImageLabel.setIcon(croppedIcon);

            System.out.println("Seçilen resim kırpıldı ve boyutlandırıldı.");
        }
    }

    private void updateImage() {
        if (selectedImageLabel != null) {
            ImageIcon selectedImageIcon = (ImageIcon) selectedImageLabel.getIcon();
            Image selectedImage = selectedImageIcon.getImage();

            int targetWidth = selectedImageLabel.getWidth();
            int targetHeight = selectedImageLabel.getHeight();

            int originalWidth = selectedImage.getWidth(null);
            int originalHeight = selectedImage.getHeight(null);

            double widthRatio = (double) targetWidth / originalWidth;
            double heightRatio = (double) targetHeight / originalHeight;

            double scaleFactor = Math.min(widthRatio, heightRatio);

            int newWidth = (int) (originalWidth * scaleFactor);
            int newHeight = (int) (originalHeight * scaleFactor);

            Image resizedImage = selectedImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

            BufferedImage bufferedResizedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = bufferedResizedImage.createGraphics();
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2d.drawImage(resizedImage, 0, 0, null);
            g2d.dispose();

            ImageIcon resizedIcon = new ImageIcon(bufferedResizedImage);

            selectedImageLabel.setIcon(resizedIcon);

            System.out.println("Seçilen resim ve çerçeve güncellendi.");
        }
    }

    private ImageIcon resizeImageWithAspectRatio(ImageIcon imageIcon, int targetWidth, int targetHeight) {
        Image selectedImage = imageIcon.getImage();

        int originalWidth = selectedImage.getWidth(null);
        int originalHeight = selectedImage.getHeight(null);

        double widthRatio = (double) targetWidth / originalWidth;
        double heightRatio = (double) targetHeight / originalHeight;

        double scaleFactor = Math.min(widthRatio, heightRatio);

        int newWidth = (int) (originalWidth * scaleFactor);
        int newHeight = (int) (originalHeight * scaleFactor);

        Image resizedImage = selectedImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

        return new ImageIcon(resizedImage);
    }

    

    
    
    
    
    private void lstImageAddValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstImageAddValueChanged
        if (!evt.getValueIsAdjusting()) {
            int selectedIndex = lstImageAdd.getSelectedIndex();
            if (selectedIndex != -1) {
                removeFrameAndCorners();
addMouseListenerToPanel(lblGet);

                ImageIcon selectedImage = imageListModel.getElementAt(selectedIndex);

                selectedImageLabel = new JLabel(selectedImage);

                Dimension imageSize = new Dimension(100, 90);
                selectedImageLabel.setPreferredSize(imageSize);
                int x = 10;
                int y = 10 + selectedIndex + (imageSize.height + 10);
                selectedImageLabel.setBounds(x, y, imageSize.width, imageSize.height);

                lblGet.add(selectedImageLabel);
                lblGet.revalidate();
                lblGet.repaint();

                initializeDragAndDrop(selectedImageLabel);

                updateMousePositionLabels(selectedImageLabel.getLocation());

                System.out.println("Seçilen resim eklendi. Index: " + selectedIndex);
            }
    }//GEN-LAST:event_lstImageAddValueChanged
    }

    private void updateMousePositionLabels(Point location) {
        int mouseX = location.x;
        int mouseY = location.y;

        txtImagemouseX.setText(Integer.toString(mouseX));
        txtImagemouseY.setText(Integer.toString(mouseY));
    }

    private void removeFrameAndCorners() {
        if (selectedImageLabel != null) {
            selectedImageLabel.setBorder(null);
            removeCornersFromSelectedImage();

            isFrameAdded = false;
            areCornersAdded = false;

        }
    }

    private boolean containsComponent(Container container, Component component) {
        Component[] components = container.getComponents();
        for (Component c : components) {
            if (c.equals(component)) {
                return true;
            }
        }
        return false;
    }

    private void jButton5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseMoved


    }//GEN-LAST:event_jButton5MouseMoved
private int currentWidth; 
private int currentHeight; 
    private void btnlblPanelAddUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlblPanelAddUpdateActionPerformed
  
    currentWidth = lblGet.getWidth();
    currentHeight = lblGet.getHeight();

    int newWidth;
    int newHeight;

    try {
        newWidth = Integer.parseInt(txtPanelAddWidth.getText());
        newHeight = Integer.parseInt(txtPanelAddHeight.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Geçerli bir sayı giriniz.", "Hata", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (newWidth <= 0 || newHeight <= 0) {
        JOptionPane.showMessageDialog(this, "Genişlik ve yükseklik pozitif tam sayı olmalıdır.", "Hata", JOptionPane.ERROR_MESSAGE);
        return;
    }

    lblGet.setSize(newWidth, newHeight);
    lblGet.setPreferredSize(new Dimension(newWidth, newHeight));

    revalidate();
    repaint();
    System.out.println("Panel güncellendi. Yeni Boyut: " + newWidth + " x " + newHeight);

    }
private void lblGetMouseEntered(java.awt.event.MouseEvent evt) {                                          
    lblGet.setSize(currentWidth, currentHeight);
    lblGet.setPreferredSize(new Dimension(currentWidth, currentHeight));

    revalidate();
    repaint();
}

    private void updateComponentsInsidePanel() {
        
        Component[] components = lblPanelAdd.getComponents();
        for (Component component : components) {
            component.setSize(component.getWidth() + 50, component.getHeight());
        }


    }//GEN-LAST:event_btnlblPanelAddUpdateActionPerformed

    private void txtPanelAddWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPanelAddWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPanelAddWidthActionPerformed

    private void txtPanelAddHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPanelAddHeightActionPerformed
    }//GEN-LAST:event_txtPanelAddHeightActionPerformed

    private void btnImageUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageUpdateActionPerformed
        if (selectedImageLabel != null) {
            updateImageProperties();
            updateImageFrame();
            updateImageLocation();

        }

    }//GEN-LAST:event_btnImageUpdateActionPerformed

    private void lblGetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblGetKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblGetKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         
        showUpdatePanel();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void lblSaveCurnetSceneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblSaveCurnetSceneActionPerformed
        // TODO add your handling code here:
           

    }//GEN-LAST:event_lblSaveCurnetSceneActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(lblPanel);
            System.out.println("Arayüz başarıyla dosyaya kaydedildi.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            javax.swing.JPanel loadedPanel = (javax.swing.JPanel) ois.readObject();

            lblPanel.removeAll();
            lblPanel.add(loadedPanel);
            lblPanel.revalidate();
            lblPanel.repaint();

            System.out.println("Arayüz başarıyla dosyadan yüklendi.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    
    
   private void showUpdatePanel() {
    JPanel squarePanel = new JPanel();
    squarePanel.setLayout(new GridLayout(3, 2)); 

    JLabel lblWidth = new JLabel("Width:");
    JTextField txtWidth = new JTextField();
    squarePanel.add(lblWidth);
    squarePanel.add(txtWidth);

    JLabel lblHeight = new JLabel("Height:");
    JTextField txtHeight = new JTextField();
    squarePanel.add(lblHeight);
    squarePanel.add(txtHeight);

    JButton btnUpdate = new JButton("Update");
    btnUpdate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int width = Integer.parseInt(txtWidth.getText());
            int height = Integer.parseInt(txtHeight.getText());

            lblGet.setPreferredSize(new Dimension(width, height));

            lblGet.revalidate();
            lblGet.repaint();
            ((JDialog) SwingUtilities.getWindowAncestor(squarePanel)).dispose();

            lblGet.removeAll();
        }
    });
    squarePanel.add(btnUpdate);

    JDialog dialog = new JDialog();
    dialog.add(squarePanel);
    dialog.pack();
    dialog.setLocationRelativeTo(null); 
    dialog.setVisible(true);
}

    private void showMessage(String message) {
    JOptionPane.showMessageDialog(null, message);
}
    private void updateImageLocation() {
        if (selectedImageLabel != null) {
            int newX, newY;

            try {
                newX = Integer.parseInt(txtImagemouseX.getText());
                newY = Integer.parseInt(txtImagemouseY.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Geçerli bir sayı giriniz.", "Hata", JOptionPane.ERROR_MESSAGE);
                return;
            }

            selectedImageLabel.setLocation(newX, newY);

            System.out.println("Resmin konumu güncellendi. Yeni X: " + newX + ", Yeni Y: " + newY);
        }
    }

    private void updateImageProperties() {
        if (selectedImageLabel != null) {
            int newWidth, newHeight;
            try {
                newWidth = Integer.parseInt(txtImageWidth.getText());
                newHeight = Integer.parseInt(txtImageHeight.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Geçerli bir sayı giriniz.", "Hata", JOptionPane.ERROR_MESSAGE);
                return;
            }

            selectedImageLabel.setSize(newWidth, newHeight);

            int rotationAngle;
            try {
                rotationAngle = Integer.parseInt(txtImageRot.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Geçerli bir sayı giriniz.", "Hata", JOptionPane.ERROR_MESSAGE);
                return;
            }

            rotateImage(rotationAngle);

            boolean isFlipped = ImageFlip.isSelected();
            if (isFlipped) {
                flipImageHorizontal();
            }
        }
    }

    private void updateImageFrame() {
        if (selectedImageLabel != null) {
            removeFrameAndCorners(); 
            addFrameToSelectedImage(); 
            addCornersToSelectedImage(); 
            isFrameAdded = true;
            areCornersAdded = true;
        }
    }

    private void rotateImage(int rotationAngle) {
        if (selectedImageLabel != null) {
            ImageIcon selectedImageIcon = (ImageIcon) selectedImageLabel.getIcon();
            Image selectedImage = selectedImageIcon.getImage();

            Image rotatedImage = rotateImage(selectedImage, rotationAngle);
            ImageIcon rotatedIcon = new ImageIcon(rotatedImage);

            selectedImageLabel.setIcon(rotatedIcon);
        }
    }

    private Image rotateImage(Image originalImage, int angle) {
        int width = originalImage.getWidth(null);
        int height = originalImage.getHeight(null);

        BufferedImage rotatedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = rotatedImage.createGraphics();

        g2d.rotate(Math.toRadians(angle), width / 2, height / 2);
        g2d.drawImage(originalImage, 0, 0, null);

        g2d.dispose();
        return rotatedImage;
    }

    private void flipImageHorizontal() {
        if (selectedImageLabel != null) {
            ImageIcon selectedImageIcon = (ImageIcon) selectedImageLabel.getIcon();
            Image selectedImage = selectedImageIcon.getImage();

            Image flippedImage = flipImage(selectedImage, FlipDirection.HORIZONTAL);
            ImageIcon flippedIcon = new ImageIcon(flippedImage);

            selectedImageLabel.setIcon(flippedIcon);
        }
    }

    private void updateSelectedImage(int newWidth, int newHeight, int newRotation, boolean flipHorizontal) {
        if (selectedImageLabel != null) {
            ImageIcon selectedImageIcon = (ImageIcon) selectedImageLabel.getIcon();
            Image selectedImage = selectedImageIcon.getImage();

            ImageIcon resizedIcon = resizeImageWithAspectRatio(newWidth, newHeight, selectedImage);

            if (flipHorizontal) {
                resizedIcon = new ImageIcon(flipImage(resizedIcon.getImage(), FlipDirection.HORIZONTAL));
            }

            Image rotatedImage = rotateImage(resizedIcon.getImage(), newRotation);
            ImageIcon rotatedIcon = new ImageIcon(rotatedImage);

            selectedImageLabel.setIcon(rotatedIcon);

            System.out.println("Seçilen resim güncellendi. Yeni Boyut: " + newWidth + " x " + newHeight + ", Yeni Rotasyon: " + newRotation);
        }
    }

    private ImageIcon resizeImageWithAspectRatio(int targetWidth, int targetHeight, Image originalImage) {
        // ...

        Image resizedImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    private void setupKeyBindings() {
        InputMap inputMap = lblGet.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = lblGet.getActionMap();

        KeyStroke deleteKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0);
        inputMap.put(deleteKeyStroke, "deleteAction");
        
        
        
        KeyStroke copyKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_C, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
        KeyStroke pasteKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_V, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
        inputMap.put(copyKeyStroke, "copyAction");
        inputMap.put(pasteKeyStroke, "pasteAction");
        actionMap.put("copyAction", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                copySelectedImage();
            }
        });

        actionMap.put("pasteAction", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pasteImageToPanel();
            }
        });

        actionMap.put("deleteAction", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteSelectedImage();
            }
        });
    }

    
    
    
private void copySelectedImage() {
    
    if (selectedImageLabel != null) {
        copiedImageIcon = new ImageIcon(((ImageIcon) selectedImageLabel.getIcon()).getImage());
        showMessage("Resim kopyalandı.");
    } else {
        showMessage("Kopyalanacak resim bulunamadı. Lütfen bir resim seçin.");
    }
}
private ImageIcon copiedImageIcon;  

// ...

private void pasteImageToPanel() {
    
    if (copiedImageIcon != null && copiedImageIcon.getImage() != null) {
        JLabel newImageLabel = new JLabel(new ImageIcon(copiedImageIcon.getImage()));
newImageLabel.setSize(copiedImageIcon.getIconWidth(), copiedImageIcon.getIconHeight());

        addMouseListenerToImageLabel(newImageLabel);


        lblGet.add(newImageLabel);

        lblGet.revalidate();
        lblGet.repaint();

        showMessage("Kopyalanan resim başarıyla yapıştırıldı.");
    } else {
        showMessage("Yapıştırılacak resim bulunamadı. Lütfen bir resim kopyalayın.");
    }
    
    
}
    
        private int offsetX, offsetY; 

    
         private void lblGetMousePressed(java.awt.event.MouseEvent evt) {
        selectedImageLabel = (JLabel) evt.getSource(); // Seçili resmi al
        Point point = SwingUtilities.convertPoint(selectedImageLabel, evt.getPoint(), selectedImageLabel.getParent());
        offsetX = (int) point.getX() - selectedImageLabel.getX();
        offsetY = (int) point.getY() - selectedImageLabel.getY();
    }
    
    private void lblGetMouseDragged(java.awt.event.MouseEvent evt) {
        if (selectedImageLabel != null) {
            int x = evt.getX() + selectedImageLabel.getX() - offsetX;
            int y = evt.getY() + selectedImageLabel.getY() - offsetY;

            selectedImageLabel.setLocation(x, y);

        }
    }

  private void addMouseListenerToImageLabel(JLabel imageLabel) {
    imageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mousePressed(java.awt.event.MouseEvent evt) {
            lblGetMousePressed(evt);
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            isImageSelected = !isImageSelected;
            updateImageSelectionFeedback();
        }
    });
    imageLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
        public void mouseDragged(java.awt.event.MouseEvent evt) {
            lblGetMouseDragged(evt);
        }
    });
}
private void updateImageSelectionFeedback() {
    if (selectedImageLabel != null) {
        if (isImageSelected) {
            selectedImageLabel.setBorder(BorderFactory.createLineBorder(Color.white, 4));
            addCornersToSelectedImage();
        } else {
            selectedImageLabel.setBorder(null);
            removeCornersFromSelectedImage();
        }
        selectedImageLabel.revalidate();
        selectedImageLabel.repaint();
    }
}
    
    private boolean isImageSelected = false;

    
    
    private void addMouseListenerToPanel(JPanel panel) {
    panel.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (isImageSelected && !selectedImageLabel.getBounds().contains(evt.getPoint())) {
                isImageSelected = false;
                updateImageSelectionFeedback();
            }
        }
    });
}

    
    
    private void updatePanelSize(int newWidth, int newHeight) {
    lblPanel.setPreferredSize(new Dimension(newWidth, newHeight));

    txtPanelAddWidth.setText(String.valueOf(newWidth));
    txtPanelAddHeight.setText(String.valueOf(newHeight));

    revalidate();
    repaint();

    System.out.println("Panel güncellendi. Yeni Boyut: " + newWidth + " x " + newHeight);
}

private void lblPanelAddActionPerformed(java.awt.event.ActionEvent evt) {
    int currentWidth = lblPanel.getWidth();
    int currentHeight = lblPanel.getHeight();

    int newWidth, newHeight;

    try {
        newWidth = Integer.parseInt(txtPanelAddWidth.getText());
        newHeight = Integer.parseInt(txtPanelAddHeight.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Geçerli bir sayı giriniz.", "Hata", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (newWidth <= 0 || newHeight <= 0) {
        JOptionPane.showMessageDialog(this, "Genişlik ve yükseklik pozitif tam sayı olmalıdır.", "Hata", JOptionPane.ERROR_MESSAGE);
        return;
    }

    updatePanelSize(newWidth, newHeight);
}

    
    
    
    
    

    private void deleteSelectedImage() {
        if (lblGet.getComponentCount() > 0) {
            lblGet.remove(0);
            lblGet.revalidate();
            lblGet.repaint();
        }
    }

    private boolean isImageFile(String fileName) {
        String[] supportedExtensions = {"jpg", "jpeg", "png", "gif"};
        for (String extension : supportedExtensions) {
            if (fileName.toLowerCase().endsWith("." + extension)) {
                return true;
            }
        }
        return false;
    }
    private static final Logger LOG = Logger.getLogger(Main.class.getName());

    @Override
    public synchronized void addMouseListener(MouseListener l) {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        FlatDarculaLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ImageFlip;
    private javax.swing.JPanel PanalImageAdd;
    private javax.swing.JButton btnImageAdd;
    private javax.swing.JButton btnImageRemove;
    private javax.swing.JButton btnImageUpdate;
    private javax.swing.JButton btnlblPanelAddUpdate;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lbl;
    private javax.swing.JPanel lblGet;
    private javax.swing.JLabel lblMouseLocation;
    private javax.swing.JPanel lblPanel;
    private javax.swing.JScrollPane lblPanelAdd;
    private javax.swing.JButton lblSaveCurnetScene;
    private javax.swing.JList<ImageIcon> lstImageAdd;
    private javax.swing.JTextField txtImageHeight;
    private javax.swing.JTextField txtImageRot;
    private javax.swing.JTextField txtImageWidth;
    private javax.swing.JTextField txtImagemouseX;
    private javax.swing.JTextField txtImagemouseY;
    private javax.swing.JTextField txtPanelAddHeight;
    private javax.swing.JTextField txtPanelAddWidth;
    // End of variables declaration//GEN-END:variables
}
