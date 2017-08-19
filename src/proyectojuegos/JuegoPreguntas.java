/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojuegos;

import Cronometro.Tempo;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;

/**
 *
 * @author jenni
 */
public final class JuegoPreguntas extends javax.swing.JFrame {

    /**
     * Creates new form JuegoPreguntas
     */
    public static int filas = 8;
    public static int columnas = 5;
    public static Labels[][] labels;
    Border border = LineBorder.createBlackLineBorder();
    public static int x = 0; //row
    public static int y = 0; //column
    int puntosGanados = 0;
    int puntosPerdidos = 0;
    int movimientos = 0;
    boolean bus = false;
    boolean busempezar = false; 
    Integer[][] Matlog = new Integer[8][5];//object of the logic matrix
    AudioClip alert;

    public JuegoPreguntas() {
        initComponents();
        x = 0;
        y = 0;
        puntosGanados = 0;//gotten points 
        puntosPerdidos = 0;//lost points 
        movimientos = 0;
        bus = false;
        busempezar = false;
        back.setBorder(null);
        back.setContentAreaFilled(false);
        cerrar.setBorder(null);
        cerrar.setContentAreaFilled(false);
        labels();
        matrizLogica();
        jPanel1.setBackground(Color.gray);
    }

    public void labels() {
        int x = 20;
        int y = 20;
        labels = new Labels[filas][columnas];
        for (int fila = 0; fila < filas; fila++) {//this generate the matrix with 8 rows and 5 columns
            for (int columna = 0; columna < columnas; columna++) {
                labels[fila][columna] = new Labels(x, y, 100, 80);// size of the square
                labels[fila][columna].setBorder(border);
                labels[fila][columna].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo.jpg")));//add an icon
                jPanel1.add(labels[fila][columna], null);//create a matrix on panel
                Matlog[fila][columna] = 1;//value of the position where the questions are going to be

                x += 100;
            }
            y += 80;
            x = 20;

        }
        labels[0][0].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/frente.jpg")));//icon of the gamer
        Matlog[0][0] = 3;//value of the gamer
        labels[filas - 1][columnas - 1].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/meta.jpg")));//icon of the final position
        Matlog[filas - 1][columnas - 1] = 4;//value of the final position

    }

    private class ButtonController implements MouseListener {

        public void actionPerformed(ActionEvent e) {
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            while (bus) {//Until the person has removed the obstacle it stops realizing this condition
                for (int i = 0; i < filas; i++) {
                    for (int k = 0; k < columnas; k++) {
                        if (e.getSource().equals(labels[i][k]) & Matlog[i][k] == 2){//When the person selects the wildcard
                            labels[i][k].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo.jpg")));//change the background
                            Matlog[i][k] = 1;//It changes the value of the wildcard 
                            bus = false;//this line makes the action not to happen again
                            busempezar = true;//enable the play button
                            Tempo temporizador = new Tempo();//open the wildcard window
                            temporizador.setVisible(true);
                            temporizador.setLocationRelativeTo(null);
                        } else if (e.getSource().equals(labels[i][k]) & Matlog[i][k] == 0) {//When the person selects
                            labels[i][k].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo.jpg")));//change the background
                            Matlog[i][k] = 1;//It changes the value of the obstacle
                            bus = false;//this line makes the action not to happen again
                            busempezar = true;//enable the play button
                        }
                    }
                }
            }
            for (int n = 0; n < Matlog.length; n++) {
                for (int o = 0; o < Matlog[n].length; o++) {
                    System.out.print(Matlog[n][o]);
                }
                System.out.println("");
            }
            System.out.println("");

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    public void matrizLogica() {
        int p = 0;
        int l = 1;
        while (l <= 10) {
            int w = (int) (Math.random() * 8) + 0;//generte a random for take a impedimentum position
            int i = (int) (Math.random() * 5) + 0;
            if (w != 0 || i != 1) {
                if (w != 1 || i != 0) {
                    if (Matlog[w][i] == 1) {
                        ButtonController bt = new ButtonController();//method that make labels action
                        labels[w][i].addMouseListener(bt);//add mouse action
                        Matlog[w][i] = 0;//value of impedimentum
                        labels[w][i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/obsta.jpg")));//and add icon for each one of them
                        l = l + 1;
                    }
                }
            }
        }
        while (p < 1) {
            int z = (int) (Math.random() * 8) + 0;
            int v = (int) (Math.random() * 5) + 0;//generte a random for take a wildcard position

            if (z != 0 || v != 1) {
                if (z != 1 || v != 0) {
                    if (Matlog[z][v] == 1) {
                        ButtonController bt = new ButtonController();//method that make labels action
                        labels[z][v].addMouseListener(bt);//add mouse action
                        Matlog[z][v] = 2;//value of wildcard
                        labels[z][v].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comodin.jpg")));//add icon for it
                        p++;
                    }
                }
            }
        }

        for (int n = 0; n < Matlog.length; n++) {
            for (int o = 0; o < Matlog[n].length; o++) {
                System.out.print(Matlog[n][o]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void preguntas() {
        int a = 0;
        String respuesta = "";
        int posi = (int) (Math.random() * 33);
        System.out.println(posi);
        Icon imagen = new ImageIcon(getClass().getResource("/icon/signointerrogacion.png"));
        int seleccion = JOptionPane.showOptionDialog(
                null,
                Preguntas.preguntas[posi],
                "Selector de opciones",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                imagen, // null para icono por defecto.
                new Object[]{"True", "False"}, // null para YES, NO y CANCEL
                "");

        if (seleccion != -1) {
            if ((seleccion + 1) == 1) {
                System.out.println("True");
                respuesta = "true";
            } else {
                System.out.println("False");
                respuesta = "false";
            }
        }
        if (Respuestas.respuestas[posi].equals(respuesta)) {
            puntosGanados++;
            ganados.setText(String.valueOf(puntosGanados));
            bus = true;////enable the MouseEvent
            busempezar = false;//disable the play button
            JOptionPane.showMessageDialog(null, "A acertado la pregunta, elimine un obstáculo\npara continuar respondiendo");
        } else {
            puntosPerdidos++;
            perdidos.setText(String.valueOf(puntosPerdidos));
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
            while (a < 1) {
                int v = (int) (Math.random() * 5) + 0;//generte a random for take a wildcard position
                int z = (int) (Math.random() * 8) + 0;
                if (Matlog[z][v] == 1) {
                    ButtonController bt = new ButtonController();//method that make labels action
                    labels[z][v].addMouseListener(bt);//add mouse action
                    Matlog[z][v] = 0;//value of wildcard
                    labels[z][v].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/obsta.jpg")));//add icon for it
                    a++;
                }
            }
            bus = false;//disable the MouseEvent
            //en medio de 4 obstaculos
            
            
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ganados = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        perdidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        move = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        playagain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PUNTOS GANADOS");

        ganados.setEditable(false);
        ganados.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("PUNTOS PERDIDOS");

        perdidos.setEditable(false);
        perdidos.setBackground(new java.awt.Color(255, 255, 255));
        perdidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perdidosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("MOVIMIENTOS");

        move.setEditable(false);
        move.setBackground(new java.awt.Color(255, 255, 255));
        move.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ganados, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(perdidos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(move, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ganados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perdidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(move, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(85, 85, 85))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton1.setText("Jugar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha-hacia-la-izquierda.png"))); // NOI18N
        back.setFocusable(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        cerrar.setFocusable(false);
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        playagain.setText("Volver a Jugar");
        playagain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playagainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jButton1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(playagain)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jButton1))
                            .addComponent(cerrar))
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(back))
                .addGap(18, 18, 18)
                .addComponent(playagain)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void perdidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perdidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perdidosActionPerformed

    private void moveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moveActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        
        //open the window to the quiz game and close the last window
        Juegos2 ventana = new Juegos2();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cerrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        busempezar = true;//enable the play button

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        if (busempezar) {
            switch (evt.getExtendedKeyCode()) {
                case KeyEvent.VK_UP:
                    if (labels[x][y] == labels[0][y]) {

                        break;
                    } else {
                        if (Matlog[x - 1][y] == 1) {
                            movimientos++;
                            move.setText(String.valueOf(movimientos));
                            labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo.jpg")));
                            Matlog[x][y] = 1;
                            x--;
                            labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/des.jpg")));
                            Matlog[x][y] = 3;
                            preguntas();
                            break;
                        } else if (Matlog[x - 1][y] == 0) {
                            break;
                        } else if (Matlog[x - 1][y] == 2) {
                            break;
                        }

                    }

                case KeyEvent.VK_DOWN:
                    if (labels[x][y] == labels[filas - 1][y]) {

                        break;
                    } else {
                        if (Matlog[x + 1][y] == 1) {
                            movimientos++;
                            move.setText(String.valueOf(movimientos));
                            labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo.jpg")));
                            Matlog[x][y] = 1;
                            x++;
                            labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/frente.jpg")));
                            Matlog[x][y] = 3;
                            preguntas();
                            break;
                        } else if (Matlog[x + 1][y] == 0) {

                            break;
                        } else if (Matlog[x + 1][y] == 2) {
                            break;
                        } else if (Matlog[x + 1][y] == 4) {
                            movimientos++;
                            move.setText(String.valueOf(movimientos));
                            labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo.jpg")));
                            x++;
                            if (puntosGanados > puntosPerdidos) {
                                int puntosextra = puntosGanados - puntosPerdidos;
                                if (puntosextra >= 3) {
                                    labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/triunfo.jpg")));
                                    Icon imagen = new ImageIcon(getClass().getResource("/imagenes/premio.png"));
                                    busempezar = false;
                                    JOptionPane.showMessageDialog(null, "GANASTE", "MENSAJE", JOptionPane.INFORMATION_MESSAGE, imagen);
                                    break;
                                }
                                break;
                            } else {
                                labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/triste.png")));
                                Icon imagen = new ImageIcon(getClass().getResource("/icon/gameover.png"));
                                busempezar = false;
                                JOptionPane.showMessageDialog(null, "PERDIÓ", "MENSAJE", JOptionPane.INFORMATION_MESSAGE, imagen);

                            }
                            break;
                        }
                    }

                case KeyEvent.VK_RIGHT:
                    if (labels[x][y] == labels[x][columnas - 1]) {

                        break;
                    } else {
                        if (Matlog[x][y + 1] == 1) {
                            movimientos++;
                            move.setText(String.valueOf(movimientos));
                            labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo.jpg")));
                            Matlog[x][y] = 1;
                            y++;
                            labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/derecho.jpg")));
                            Matlog[x][y] = 3;
                            preguntas();
                            break;
                        } else if (Matlog[x][y + 1] == 0) {

                            break;
                        } else if (Matlog[x][y + 1] == 2) {
                            break;
                        } else if (Matlog[x][y + 1] == 4) {
                            movimientos++;
                            move.setText(String.valueOf(movimientos));
                            labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo.jpg")));
                            y++;
                            if (puntosGanados > puntosPerdidos) {
                                int puntosextra = puntosGanados - puntosPerdidos;
                                if (puntosextra >= 3) {
                                    labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/triunfo.jpg")));
                                    Icon imagen = new ImageIcon(getClass().getResource("/imagenes/premio.png"));
                                    busempezar = false;
                                    JOptionPane.showMessageDialog(null, "GANASTE", "MENSAJE", JOptionPane.INFORMATION_MESSAGE, imagen);
                                    break;
                                }
                                break;
                            } else {
                                labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/triste.png")));
                                Icon imagen = new ImageIcon(getClass().getResource("/icon/gameover.png"));
                                busempezar = false;
                                JOptionPane.showMessageDialog(null, "PERDIÓ", "MENSAJE", JOptionPane.INFORMATION_MESSAGE, imagen);

                            }
                            break;
                        }
                    }

                case KeyEvent.VK_LEFT:
                    if (labels[x][y] == labels[x][0]) {
                        break;
                    } else {
                        if (Matlog[x][y - 1] == 1) {
                            movimientos++;
                            move.setText(String.valueOf(movimientos));
                            labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fondo.jpg")));
                            Matlog[x][y] = 1;
                            y--;
                            labels[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/izquierda.jpg")));
                            Matlog[x][y] = 3;
                            preguntas();
                            break;
                        } else if (Matlog[x][y - 1] == 0) {

                            break;
                        } else if (Matlog[x][y - 1] == 2) {
                            break;
                        }
                    }
            }
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void playagainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playagainActionPerformed
        // TODO add your handling code here:
        JuegoPreguntas preguntas = new JuegoPreguntas();
        preguntas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
        preguntas.setLocationRelativeTo(null);
        preguntas.setVisible(true);

    }//GEN-LAST:event_playagainActionPerformed

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
            java.util.logging.Logger.getLogger(JuegoPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoPreguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton cerrar;
    private javax.swing.JTextField ganados;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField move;
    private javax.swing.JTextField perdidos;
    private javax.swing.JButton playagain;
    // End of variables declaration//GEN-END:variables
}
