package proyectojuegos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import desempate.miframe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;

import static proyectojuegos.hiloUno.tiempo2;

/**
 *
 * @author jenni
 */
public class JuegoPiscina extends javax.swing.JFrame {

    /**
     * Creates new form JuegoPiscina
     */
    String n1 = "";
    String n2 = "";
    String n3 = "";
    String n4 = "";
    String n5 = "";
    boolean bus = false;

    int tiempo1 = 0;
    public static int contcarreras = 0;
    public static int ganador1 = 0;
    public static int ganador2 = 0;
    public static int ganador3 = 0;
    public static int ganador4 = 0;
    public static int ganador5 = 0;

    public static int perdedor1 = 0;
    public static int perdedor2 = 0;
    public static int perdedor3 = 0;
    public static int perdedor4 = 0;
    public static int perdedor5 = 0;
    public static String perdidomas = "";
    public static String ganadomas = "";

    public static ArrayList listacomp = new ArrayList<>();

    public JuegoPiscina() {
        this.getContentPane().setBackground(new java.awt.Color(238, 232, 170));
        t = new Timer(10, acciones);
        initComponents();
        back2.setBorder(null);
        back2.setContentAreaFilled(false);
        cerrar2.setBorder(null);
        cerrar2.setContentAreaFilled(false);
        nada1.setContentAreaFilled(false);
        nada1.setBorder(null);
        nada2.setContentAreaFilled(false);
        nada2.setBorder(null);
        nada3.setContentAreaFilled(false);
        nada3.setBorder(null);
        nada4.setContentAreaFilled(false);
        nada4.setBorder(null);
        nada5.setContentAreaFilled(false);
        nada5.setBorder(null);
        reportes.setContentAreaFilled(false);
        reportes.setBorder(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back2 = new javax.swing.JButton();
        cerrar2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblLinea = new javax.swing.JLabel();
        nadador1 = new javax.swing.JLabel();
        nadador2 = new javax.swing.JLabel();
        nadador3 = new javax.swing.JLabel();
        nadador4 = new javax.swing.JLabel();
        nadador5 = new javax.swing.JLabel();
        piscina = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nada1 = new javax.swing.JButton();
        nada2 = new javax.swing.JButton();
        nada3 = new javax.swing.JButton();
        nada4 = new javax.swing.JButton();
        nada5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        iniciar = new javax.swing.JButton();
        nueva = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtR = new javax.swing.JTextArea();
        time = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        eliminar = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        reportes = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        desempate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha-hacia-la-izquierda.png"))); // NOI18N
        back2.setFocusable(false);
        back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back2ActionPerformed(evt);
            }
        });
        getContentPane().add(back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, -1));

        cerrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        cerrar2.setFocusable(false);
        cerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar2ActionPerformed(evt);
            }
        });
        getContentPane().add(cerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 50, -1));

        jPanel1.setBackground(new java.awt.Color(238, 232, 170));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lblLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, -70, -1, 480));
        jPanel1.add(nadador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 110, 80));
        jPanel1.add(nadador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 110, 80));
        jPanel1.add(nadador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, 80));
        jPanel1.add(nadador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 80));

        nadador5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nadador5MousePressed(evt);
            }
        });
        jPanel1.add(nadador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 70));

        piscina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/piscina.png"))); // NOI18N
        jPanel1.add(piscina, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 850, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 860, 440));

        jPanel2.setBackground(new java.awt.Color(233, 150, 122));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Seleccione nadadores ");
        jPanel2.add(jLabel2);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/llave1.png"))); // NOI18N
        jPanel2.add(jLabel1);

        nada1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/5.png"))); // NOI18N
        nada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nada1ActionPerformed(evt);
            }
        });
        jPanel2.add(nada1);

        nada2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/4.png"))); // NOI18N
        nada2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nada2ActionPerformed(evt);
            }
        });
        jPanel2.add(nada2);

        nada3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/3.png"))); // NOI18N
        nada3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nada3ActionPerformed(evt);
            }
        });
        jPanel2.add(nada3);

        nada4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/2.png"))); // NOI18N
        nada4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nada4ActionPerformed(evt);
            }
        });
        jPanel2.add(nada4);

        nada5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1.png"))); // NOI18N
        nada5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nada5ActionPerformed(evt);
            }
        });
        jPanel2.add(nada5);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        iniciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        iniciar.setText("INICIAR CARRERA");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        nueva.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nueva.setText("NUEVA CARRERA");
        nueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaActionPerformed(evt);
            }
        });

        txtR.setEditable(false);
        txtR.setColumns(20);
        txtR.setRows(5);
        jScrollPane1.setViewportView(txtR);

        time.setEditable(false);
        time.setBackground(new java.awt.Color(255, 255, 255));
        time.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        time.setText("00:00:00");
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("DURACION DE LA CARRERA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(nueva))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(iniciar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)))
                .addGap(56, 56, 56))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iniciar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nueva)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, 230, 310));

        jPanel4.setBackground(new java.awt.Color(233, 150, 122));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        eliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        eliminar.setText("Eliminar Nadador");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Seleccione el nadador que desea eliminar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(eliminar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(eliminar))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reporte.png"))); // NOI18N
        reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesActionPerformed(evt);
            }
        });
        getContentPane().add(reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 520, -1, 140));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Reportes");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 490, -1, -1));

        desempate.setText("jButton1");
        desempate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desempateActionPerformed(evt);
            }
        });
        getContentPane().add(desempate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, -1, -1));

        jButton1.setText("ganador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Timer t;
    private int m, s, cs;
    private ActionListener acciones = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {
            ++cs;
            if (cs == 90) {
                cs = 0;
                ++s;
            }
            if (s == 60) {
                s = 0;
                ++m;
            }
            actualizarLabel();
            if (tiempo1 == tiempo2) {
                t.stop();
                validarGanador();
                validarPerdedor();
                perdidoMasVeces();
                ganadoMasVeces();
                actualizarLabel();
                nueva.setEnabled(true);

            }
        }

    };

    private void actualizarLabel() {
        String tiempo = (m <= 9 ? "0" : "") + m + ":" + (s <= 9 ? "0" : "") + s + ":" + (cs <= 9 ? "0" : "") + cs;
        time.setText(tiempo);
    }

    public void validarGanador() {
        System.out.println("GANADOR: " + listacomp.get(0));
        if (listacomp.get(0) == "Nadador 1") {
            ganador1++;
        } else if (listacomp.get(0) == "Nadador 2") {
            ganador2++;
        } else if (listacomp.get(0) == "Nadador 3") {
            ganador3++;
        } else if (listacomp.get(0) == "Nadador 4") {
            ganador4++;
        } else if (listacomp.get(0) == "Nadador 5") {
            ganador5++;
        }
    }

    public void validarPerdedor() {
        System.out.println("PERDEDOR:" + listacomp.get(listacomp.size() - 1));
        if (listacomp.get(listacomp.size() - 1) == "Nadador 1") {
            perdedor1++;
        } else if (listacomp.get(listacomp.size() - 1) == "Nadador 2") {
            perdedor2++;
        } else if (listacomp.get(listacomp.size() - 1) == "Nadador 3") {
            perdedor3++;
        } else if (listacomp.get(listacomp.size() - 1) == "Nadador 4") {
            perdedor4++;
        } else if (listacomp.get(listacomp.size() - 1) == "Nadador 5") {
            perdedor5++;
        }

    }

    public void perdidoMasVeces() {
        if (perdedor1 > perdedor2 & perdedor1 > perdedor3 & perdedor1 > perdedor4 & perdedor1 > perdedor5) {
            perdidomas = "NADADOR 1";
        } else if (perdedor2 > perdedor1 & perdedor2 > perdedor3 & perdedor2 > perdedor4 & perdedor2 > perdedor5) {
            perdidomas = "NADADOR 2";
        } else if (perdedor3 > perdedor1 & perdedor3 > perdedor2 & perdedor3 > perdedor4 & perdedor3 > perdedor5) {
            perdidomas = "NADADOR 3";
        } else if (perdedor4 > perdedor1 & perdedor4 > perdedor3 & perdedor4 > perdedor2 & perdedor4 > perdedor5) {
            perdidomas = "NADADOR 4";
        } else if (perdedor5 > perdedor1 & perdedor5 > perdedor3 & perdedor5 > perdedor4 & perdedor5 > perdedor2) {
            perdidomas = "NADADOR 5";
        }
    }

    public void ganadoMasVeces() {
        if (ganador1 > ganador2 & ganador1 > ganador3 & ganador1 > ganador4 & ganador1 > ganador5) {
            ganadomas = "NADADOR 1";
        } else if (ganador2 > ganador1 & ganador2 > ganador3 & ganador2 > ganador4 & ganador2 > ganador5) {
            ganadomas = "NADADOR 2";
        } else if (ganador3 > ganador1 & ganador3 > ganador2 & ganador3 > ganador4 & ganador3 > ganador5) {
            ganadomas = "NADADOR 3";
        } else if (ganador4 > ganador1 & ganador4 > ganador3 & ganador4 > ganador2 & ganador4 > ganador5) {
            ganadomas = "NADADOR 4";
        } else if (ganador5 > ganador1 & ganador5 > ganador3 & ganador5 > ganador4 & ganador5 > ganador2) {
            ganadomas = "NADADOR 5";
        }
    }
    private void nada3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nada3ActionPerformed
        // TODO add your handling code here:
        nada3.setEnabled(false);
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/1.png"));
        JuegoPiscina.nadador3.setIcon(icono);
        bus = true;
        n3 = "3";
        eliminar.setEnabled(true);
        comboBox.addItem("Nadador 3");
        tiempo1++;

    }//GEN-LAST:event_nada3ActionPerformed

    private void nada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nada1ActionPerformed
        // TODO add your handling code here:
        nada1.setEnabled(false);
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/1.png"));
        JuegoPiscina.nadador1.setIcon(icono);
        bus = true;
        n1 = "1";
        eliminar.setEnabled(true);
        comboBox.addItem("Nadador 1");
        tiempo1++;
    }//GEN-LAST:event_nada1ActionPerformed

    private void nada2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nada2ActionPerformed
        // TODO add your handling code here:
        nada2.setEnabled(false);
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/1.png"));
        JuegoPiscina.nadador2.setIcon(icono);
        bus = true;
        n2 = "2";
        eliminar.setEnabled(true);
        comboBox.addItem("Nadador 2");
        tiempo1++;
    }//GEN-LAST:event_nada2ActionPerformed

    private void nada4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nada4ActionPerformed
        // TODO add your handling code here:
        nada4.setEnabled(false);
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/1.png"));
        JuegoPiscina.nadador4.setIcon(icono);
        bus = true;
        n4 = "4";
        eliminar.setEnabled(true);
        comboBox.addItem("Nadador 4");
        tiempo1++;
    }//GEN-LAST:event_nada4ActionPerformed

    private void nada5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nada5ActionPerformed
        // TODO add your handling code here:
        nada5.setEnabled(false);
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/1.png"));
        JuegoPiscina.nadador5.setIcon(icono);
        bus = true;
        n5 = "5";
        eliminar.setEnabled(true);
        comboBox.addItem("Nadador 5");
        tiempo1++;
    }//GEN-LAST:event_nada5ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if (comboBox.getItemAt(0) == null) {
            eliminar.setEnabled(false);
        }
        nueva.setEnabled(false);
        carrera.registrarNadador();
    }//GEN-LAST:event_formWindowOpened

    private void nuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaActionPerformed
        // TODO add your handling code here:
        nadador1.setIcon(null);
        nadador2.setIcon(null);
        nadador3.setIcon(null);
        nadador4.setIcon(null);
        nadador5.setIcon(null);
        nada1.setEnabled(true);
        nada2.setEnabled(true);
        nada3.setEnabled(true);
        nada4.setEnabled(true);
        nada5.setEnabled(true);
        iniciar.setEnabled(true);
        nueva.setEnabled(false);
        comboBox.removeAllItems();
        comboBox.setEnabled(true);
        eliminar.setEnabled(true);
        listacomp.clear();
        bus = false;
        n1 = "";
        n2 = "";
        n3 = "";
        n4 = "";
        n5 = "";
        t.stop();
        m = 0;
        s = 0;
        cs = 0;
        actualizarLabel();
    }//GEN-LAST:event_nuevaActionPerformed


    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        if (bus) {
            t.start();
            JuegoPiscina.txtR.setText("TIEMPO DE CADA NADADOR");
            carrera.iniciar(n1, n2, n3, n4, n5);
            contcarreras++;
            iniciar.setEnabled(false);
            nueva.setEnabled(false);
            comboBox.setEnabled(false);
            eliminar.setEnabled(false);
        }
    }//GEN-LAST:event_iniciarActionPerformed

    private void back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2ActionPerformed
        // TODO add your handling code here:
        Juegos2 ventana = new Juegos2();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_back2ActionPerformed

    private void cerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cerrar2ActionPerformed

    private void nadador5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nadador5MousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_nadador5MousePressed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:

        if ("Nadador 1".equals(comboBox.getSelectedItem().toString())) {
            nada1.setEnabled(true);
            n1 = "";
            comboBox.removeItem("Nadador 1");
            nadador1.setIcon(null);
            tiempo1--;
        } else {
            if ("Nadador 2".equals(comboBox.getSelectedItem().toString())) {
                nada2.setEnabled(true);
                n2 = "";
                comboBox.removeItem("Nadador 2");
                nadador2.setIcon(null);
                tiempo1--;
            } else {
                if ("Nadador 3".equals(comboBox.getSelectedItem().toString())) {
                    nada3.setEnabled(true);
                    n3 = "";
                    comboBox.removeItem("Nadador 3");
                    nadador3.setIcon(null);
                    tiempo1--;
                } else {
                    if ("Nadador 4".equals(comboBox.getSelectedItem().toString())) {
                        nada4.setEnabled(true);
                        n4 = "";
                        comboBox.removeItem("Nadador 4");
                        nadador4.setIcon(null);
                        tiempo1--;
                    } else {
                        if ("Nadador 5".equals(comboBox.getSelectedItem().toString())) {
                            nada5.setEnabled(true);
                            n5 = "";
                            comboBox.removeItem("Nadador 5");
                            nadador5.setIcon(null);
                            tiempo1--;
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    private void reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesActionPerformed
        Reportes reporte = new Reportes(contcarreras, ganador1, ganador2, ganador3, ganador4, ganador5, perdidomas, ganadomas, perdedor1, perdedor2, perdedor3, perdedor4, perdedor5);
        reporte.setVisible(true);
        reporte.setLocationRelativeTo(null);

    }//GEN-LAST:event_reportesActionPerformed

    private void desempateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desempateActionPerformed
        // TODO add your handling code here:
        miframe dados = new miframe();
        dados.setLocationRelativeTo(null);
        dados.setVisible(true);
    }//GEN-LAST:event_desempateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoPiscina.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoPiscina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back2;
    private javax.swing.JButton cerrar2;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JButton desempate;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton iniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblLinea;
    private javax.swing.JButton nada1;
    private javax.swing.JButton nada2;
    private javax.swing.JButton nada3;
    private javax.swing.JButton nada4;
    private javax.swing.JButton nada5;
    public static javax.swing.JLabel nadador1;
    public static javax.swing.JLabel nadador2;
    public static javax.swing.JLabel nadador3;
    public static javax.swing.JLabel nadador4;
    public static javax.swing.JLabel nadador5;
    private javax.swing.JButton nueva;
    public static javax.swing.JLabel piscina;
    private javax.swing.JButton reportes;
    public static javax.swing.JTextField time;
    public static javax.swing.JTextArea txtR;
    // End of variables declaration//GEN-END:variables
}
