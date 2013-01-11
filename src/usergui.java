

import java.util.regex.Pattern;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JTextField;



/*
 * usergui.java
 *
 * Created on Jan 2, 2013, 8:23:39 AM
 */
/**
 *
 * @author ravi
 */
public class usergui extends javax.swing.JFrame {

    /** Creates new form usergui */
    int st;
    localpanel localp;
    long_distance_infop longp;
    int fromx , fromy ;
    int tox , toy ;
    String fname , tname , type;
    public usergui() {
        fname = null; tname = null; type = null;
        initComponents();
        mylongphoto m = new mylongphoto();
        System.out.println("adding photo");homepane.add(m);homepane.repaint();m.repaint();
        //localphotopane.add(m);
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        mainpanel = new javax.swing.JTabbedPane();
        homepane = new javax.swing.JPanel();
        localpane = new javax.swing.JPanel();
        panelocal = new javax.swing.JPanel();
        localphotopane = new javax.swing.JPanel();
        localname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        localdate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        localmobile = new javax.swing.JTextField();
        localroute = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        localtype = new javax.swing.JComboBox();
        localpickup = new javax.swing.JButton();
        localstatuslabel = new javax.swing.JLabel("welcome ...................");
        jLabel16 = new javax.swing.JLabel();
        localpassen_no = new javax.swing.JTextField();
        localtimehr = new javax.swing.JTextField();
        localtimemin = new javax.swing.JTextField();
        longpane = new javax.swing.JPanel();
        longpanel = new javax.swing.JPanel();
        localphotopane1 = new javax.swing.JPanel();
        canvas2 = new java.awt.Canvas();
        longname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        longdate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        longtimehr = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        longtimemin = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        longmobile = new javax.swing.JTextField();
        longroute = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        longtype = new javax.swing.JComboBox();
        longpickup = new javax.swing.JButton();
        longstatuslabel = new javax.swing.JLabel();
        one_way = new javax.swing.JRadioButton();
        round_trip = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 2, 24));
        jLabel1.setText("                         Book my Kabee");

        mainpanel.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout homepaneLayout = new javax.swing.GroupLayout(homepane);
        homepane.setLayout(homepaneLayout);
        homepaneLayout.setHorizontalGroup(
            homepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );
        homepaneLayout.setVerticalGroup(
            homepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        mainpanel.addTab("HOME", homepane);

        panelocal.setBackground(new java.awt.Color(255, 255, 255));

        localphotopane.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout localphotopaneLayout = new javax.swing.GroupLayout(localphotopane);
        localphotopane.setLayout(localphotopaneLayout);
        localphotopaneLayout.setHorizontalGroup(
            localphotopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 202, Short.MAX_VALUE)
        );
        localphotopaneLayout.setVerticalGroup(
            localphotopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        localname.setText("jTextField1");
        localname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localnameActionPerformed(evt);
            }
        });

        jLabel2.setText("NAME");

        jLabel3.setText("DATE");

        localdate.setText("jTextField1");

        jLabel4.setText("TIME");

        jLabel5.setText("HR");

        jLabel6.setText("MIN");

        jLabel7.setText("MOBILE");

        localmobile.setText("mobile no......");

        localroute.setText("SELECT ROUTE");
        localroute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routelis(evt);
            }
        });

        jLabel8.setText("TYPE");

        localtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TOYOTA", "INNOVA", "VERNA" }));
        localtype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typelis(evt);
            }
        });

        localpickup.setText("PICK UP");
        localpickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localpickup(evt);
            }
        });

        jLabel16.setText("PASSENGERS");

        localpassen_no.setText("0");

        localtimehr.setText("00");
        localtimehr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localtimehrActionPerformed(evt);
            }
        });

        localtimemin.setText("00");

        javax.swing.GroupLayout panelocalLayout = new javax.swing.GroupLayout(panelocal);
        panelocal.setLayout(panelocalLayout);
        panelocalLayout.setHorizontalGroup(
            panelocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelocalLayout.createSequentialGroup()
                .addComponent(localphotopane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(panelocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelocalLayout.createSequentialGroup()
                            .addGap(209, 209, 209)
                            .addComponent(localpickup))
                        .addGroup(panelocalLayout.createSequentialGroup()
                            .addGroup(panelocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(panelocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(localdate)
                                .addGroup(panelocalLayout.createSequentialGroup()
                                    .addComponent(localtimehr, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(localtimemin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6))
                                .addComponent(localname, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(localtype, 0, 188, Short.MAX_VALUE)
                                .addComponent(localroute, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addComponent(localmobile)))
                        .addComponent(localstatuslabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelocalLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(34, 34, 34)
                        .addComponent(localpassen_no, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelocalLayout.setVerticalGroup(
            panelocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelocalLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(localname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(localdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(localtimehr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localtimemin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(localmobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(localroute)
                .addGap(12, 12, 12)
                .addGroup(panelocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(localtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(localpassen_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(localpickup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(localstatuslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(localphotopane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout localpaneLayout = new javax.swing.GroupLayout(localpane);
        localpane.setLayout(localpaneLayout);
        localpaneLayout.setHorizontalGroup(
            localpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
            .addGroup(localpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelocal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        localpaneLayout.setVerticalGroup(
            localpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(localpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainpanel.addTab("LOCAL CAB", localpane);

        longpanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout localphotopane1Layout = new javax.swing.GroupLayout(localphotopane1);
        localphotopane1.setLayout(localphotopane1Layout);
        localphotopane1Layout.setHorizontalGroup(
            localphotopane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(localphotopane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(localphotopane1Layout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(canvas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(85, Short.MAX_VALUE)))
        );
        localphotopane1Layout.setVerticalGroup(
            localphotopane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(localphotopane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(localphotopane1Layout.createSequentialGroup()
                    .addGap(192, 192, 192)
                    .addComponent(canvas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(288, Short.MAX_VALUE)))
        );

        longname.setText("jTextField1");

        jLabel9.setText("NAME");

        jLabel10.setText("DATE");

        longdate.setText("jTextField1");

        jLabel11.setText("TIME");

        longtimehr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", " " }));

        jLabel12.setText("HR");

        longtimemin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55" }));

        jLabel13.setText("MIN");

        jLabel14.setText("MOBILE");

        longmobile.setText("mobile no......");

        longroute.setText("SELECT ROUTE");

        jLabel15.setText("TYPE");

        longtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        longpickup.setText("PICK UP");
        longpickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localpickup(evt);
            }
        });

        buttonGroup1.add(one_way);
        one_way.setFont(new java.awt.Font("Tahoma", 0, 10));
        one_way.setText("ONE WAY");

        buttonGroup1.add(round_trip);
        round_trip.setFont(new java.awt.Font("Tahoma", 0, 10));
        round_trip.setText("ROUND TRIP");

        javax.swing.GroupLayout longpanelLayout = new javax.swing.GroupLayout(longpanel);
        longpanel.setLayout(longpanelLayout);
        longpanelLayout.setHorizontalGroup(
            longpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(longpanelLayout.createSequentialGroup()
                .addComponent(localphotopane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(longpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(longpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(longpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(longpanelLayout.createSequentialGroup()
                                .addGroup(longpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(29, 29, 29)
                                .addGroup(longpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(longpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(longdate)
                                        .addComponent(longname, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                                    .addGroup(longpanelLayout.createSequentialGroup()
                                        .addComponent(longtimehr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(longtimemin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13))))
                            .addGroup(longpanelLayout.createSequentialGroup()
                                .addGroup(longpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(longpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(longtype, 0, 188, Short.MAX_VALUE)
                                    .addComponent(longroute, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(longmobile)
                                    .addComponent(one_way))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(round_trip))
                    .addGroup(longpanelLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(longpickup))
                    .addGroup(longpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(longstatuslabel, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)))
                .addContainerGap())
        );
        longpanelLayout.setVerticalGroup(
            longpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(localphotopane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(longpanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(longpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(longname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(longpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(longdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(longpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(longtimehr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(longtimemin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(longpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(longmobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(longroute)
                .addGap(12, 12, 12)
                .addGroup(longpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(longtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(longpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(round_trip)
                    .addComponent(one_way))
                .addGap(26, 26, 26)
                .addComponent(longpickup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(longstatuslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout longpaneLayout = new javax.swing.GroupLayout(longpane);
        longpane.setLayout(longpaneLayout);
        longpaneLayout.setHorizontalGroup(
            longpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
            .addGroup(longpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(longpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        longpaneLayout.setVerticalGroup(
            longpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(longpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(longpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainpanel.addTab("LONG DISTANCE", longpane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addComponent(mainpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void localpickup(java.awt.event.ActionEvent evt) {                             
        System.out.println("hello");
        boolean proceed = true ;
        info f = new info();
         f.name = localname.getText();f.date = localdate.getText();f.hour = localtimehr.getText();
        f.tox = tox; f.min = localtimemin.getText(); f.mobile = localmobile.getText();f.fromx = fromx;f.fromy = fromy;
         f.type = type;f.toy = toy;
        f.passen_no = localpassen_no.getText();
        f.fname  = fname; f.tname = tname;
        if(type == null)
        {  proceed = false; putstatus(9);}
        if(fname == null || tname == null)
            proceed = false;
        if(! Pattern.matches("[0-5]", f.passen_no))
        { proceed = false ;  putstatus(7);}
        if(Pattern.matches(" *", f.name) )
        { proceed = false ;  putstatus(1);}
        if(f.date.charAt(2) != '-'  ||  f.date.charAt(5) != '-' )
        {  proceed = false ; putstatus(8);}
        f.d = (f.date.charAt(0)-'0')*10 + (f.date.charAt(1)-'0') ;
        f.m = (f.date.charAt(3)-'0')*10 + (f.date.charAt(4)-'0') ;
        f.y = (f.date.charAt(6)-'0')*1000 + (f.date.charAt(7)-'0')*100 + (f.date.charAt(8)-'0')*10 + (f.date.charAt(9)-'0');
        if( !(f.d >0 && f.d < 32))
        { proceed = false;putstatus(4);}
        if( !(f.m >0 && f.m < 13))
            {proceed = false; putstatus(5);}
        if( f.y != 2013)
            {proceed = false; putstatus(6);}
        if(!Pattern.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]", f.mobile))
        {  proceed = false ; putstatus(2);}
        System.out.println("proceed is "+proceed);
        if(proceed)
        {
        	localstatuslabel.setText("processing .........");
            System.out.println("its true");
            try{
            //FileWriter fw = new FileWriter("input.txt");
           // BufferedWriter br = new BufferedWriter(fw);
                userserver br = new userserver();
             br.write( f);
             System.out.println("running runn and waiting for status update");
             int status = br.runn();    
             System.out.println("got status ");
             putstatus(status);                  ///////////////////   enters the status label info  
             System.out.println("closing the connection");
             br.close();
            
            fromx = 0;fromy = 0;tox = 0;toy = 0;
            }catch(Exception e){}
            
        }
    }                            

    private void localnameActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        
    }                                         

    private void routelis(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        
        System.out.println("pressed route");
        go();   
        System.out.println("closing window");
       // while(true)
        //{
          //  if(m.doneint == 1)
            //{
               if(doneint == 1) f.setVisible(false);
            //}
        //}
    }

    private void typelis(java.awt.event.ItemEvent evt) {
        // TODO add your handling code here:
        if( evt.getStateChange() == ItemEvent.SELECTED ) {
        int i = localtype.getSelectedIndex();
        if(i== 0)
            type = "TOYOTA";
        if(i== 1)
            type = "INNOVA";
        if(i== 2)
            type = "VERNA";
        System.out.println("i got type as "+type);
    }
    }

    private void localtimehrActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[] ) {
        

            
                new usergui().setVisible(true);
            
       
    }
    
    void putstatus(int status)
    {
        System.out.println("inside putstatus ");
        if(status == 0)
            localstatuslabel.setText("your request was successfull");
        
        if(status == 1)
            localstatuslabel.setText(" enter a valid name");
        
        if(status == 2)
            localstatuslabel.setText(" enter a valid mobile no.");
        
        if(status == 3)
            localstatuslabel.setText(" connection closed abruptly");
        if(status == 4)
        	localstatuslabel.setText(" day is wrong format");
        if(status == 5)
        	localstatuslabel.setText(" month is wrong format");
        if(status == 6)
        	localstatuslabel.setText(" year is wrong format");
        if(status == 7)
        	localstatuslabel.setText(" passen_no should be between 1-5");
        if(status == 8)
        	localstatuslabel.setText(" date is incorrect");
        if(status == 9)
        	localstatuslabel.setText(" date is type not set");
        if(status == 10)
        	localstatuslabel.setText(" cab not available");        
    }
    // Variables declaration - do not modify
    public javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Canvas canvas2;
    public javax.swing.JPanel homepane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField localdate;
    public javax.swing.JTextField localmobile;
    public javax.swing.JTextField localname;
    private javax.swing.JPanel localpane;
    public javax.swing.JTextField localpassen_no;
    public javax.swing.JPanel localphotopane;
    public javax.swing.JPanel localphotopane1;
    public javax.swing.JButton localpickup;
    public javax.swing.JButton localroute;
    public javax.swing.JLabel localstatuslabel;
    public javax.swing.JTextField localtimehr;
    private javax.swing.JTextField localtimemin;
    public javax.swing.JComboBox localtype;
    public javax.swing.JTextField longdate;
    public javax.swing.JTextField longmobile;
    public javax.swing.JTextField longname;
    private javax.swing.JPanel longpane;
    public javax.swing.JPanel longpanel;
    public javax.swing.JButton longpickup;
    public javax.swing.JButton longroute;
    public javax.swing.JLabel longstatuslabel;
    public javax.swing.JComboBox longtimehr;
    public javax.swing.JComboBox longtimemin;
    public javax.swing.JComboBox longtype;
    private javax.swing.JTabbedPane mainpanel;
    public javax.swing.JRadioButton one_way;
    private javax.swing.JPanel panelocal;
    public javax.swing.JRadioButton round_trip;
    // End of variables declaration


class mylongphoto extends JPanel
{
    
    public void paintComponent(Graphics g)
    {
        System.out.println("inside mylong photo");
       // g.setColor(Color.white);g.drawRect(0, 0, this.getWidth(), this.getHeight());
        Image image = new ImageIcon("jmap.jpg").getImage();
        g.drawImage(image , 5, 45 ,this);
    }


}

    JFrame f;   
    int doneint = 0;
    JTextField fx,fy,fn ,tn;
    JButton done;
    JButton setnodes;
    String froms , tos;

    public void go()
    {
    	doneint = 0;
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
                 fx.setText(fromx+"--"+fromy);  fname = froms ;
             }
             else
             {
                 tox = e.getX(); toy = e.getY(); f.repaint();tos = getname(tox , toy);fn.setText("near"+froms+ "-- " +tos);setnodes.setText("set start pt");
                 fy.setText(tox+"--"+toy);tname = tos;
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
    
    

}