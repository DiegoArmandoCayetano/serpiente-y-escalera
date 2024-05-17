
package EscaleraSerpientes;
 

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Tablero10x10 extends javax.swing.JFrame {
private JLabel[][] casillas;
    private Map<Integer, Integer> serpientes;
    private Map<Integer, Integer> escaleras;
    private int[] posicionesJugadores;
    public Tablero10x10() {
        
         casillas = new JLabel[10][10];
  // Inicialización de las serpientes y escaleras
        serpientes = new HashMap<>();
        serpientes.put(16, 6); // Si el jugador llega a la posición 16, retrocede a la posición 6
        escaleras = new HashMap<>();
        escaleras.put(4, 15); // Si el jugador llega a la posición 4, avanza a la posición 15

        // Creación de los JLabels y configuración inicial
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                casillas[i][j] = new JLabel();
                casillas[i][j].setHorizontalAlignment(SwingConstants.CENTER);
                casillas[i][j].setOpaque(true);
                casillas[i][j].setBackground(Color.WHITE);
                add(casillas[i][j]);
            }
        }
        
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

      // Método para mover un jugador a una nueva posición
    public void moverJugador(int jugador, int nuevaPosicion) {
        // Verificar si hay una serpiente o escalera en la nueva posición
        if (serpientes.containsKey(nuevaPosicion)) {
            // Si hay una serpiente, el jugador retrocede
            posicionesJugadores[jugador] = serpientes.get(nuevaPosicion);
        } else if (escaleras.containsKey(nuevaPosicion)) {
            // Si hay una escalera, el jugador avanza
            posicionesJugadores[jugador] = escaleras.get(nuevaPosicion);
        } else {
            // Si no hay serpiente ni escalera, el jugador avanza normalmente
            posicionesJugadores[jugador] = nuevaPosicion;
        }

        // Actualizar la posición del jugador en el tablero
        actualizarTablero();
    }

    // Método para actualizar la posición de los jugadores en el tablero
    private void actualizarTablero() {
        // Limpiar el tablero
        limpiarTablero();

        // Colocar a los jugadores en sus nuevas posiciones
        for (int jugador = 0; jugador < posicionesJugadores.length; jugador++) {
            int fila = 9 - posicionesJugadores[jugador] / 10;
            int columna;
            if (fila % 2 == 9 % 2) {
                columna = posicionesJugadores[jugador] % 10;
            } else {
                columna = 9 - posicionesJugadores[jugador] % 10;
            }
            casillas[fila][columna].setText("J" + (jugador + 1));
        }
    }

    // Método para limpiar el tablero
    private void limpiarTablero() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                casillas[i][j].setText("");
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jD = new javax.swing.JLabel();
        jA = new javax.swing.JLabel();
        jB = new javax.swing.JLabel();
        jC = new javax.swing.JLabel();
        jE = new javax.swing.JLabel();
        jF = new javax.swing.JLabel();
        jG = new javax.swing.JLabel();
        jH = new javax.swing.JLabel();
        jI = new javax.swing.JLabel();
        jJ = new javax.swing.JLabel();
        jU = new javax.swing.JLabel();
        jT = new javax.swing.JLabel();
        jS = new javax.swing.JLabel();
        jQ = new javax.swing.JLabel();
        jP = new javax.swing.JLabel();
        jO = new javax.swing.JLabel();
        jN = new javax.swing.JLabel();
        jM = new javax.swing.JLabel();
        jL = new javax.swing.JLabel();
        jK = new javax.swing.JLabel();
        jV = new javax.swing.JLabel();
        jW = new javax.swing.JLabel();
        jX = new javax.swing.JLabel();
        jY = new javax.swing.JLabel();
        jZ = new javax.swing.JLabel();
        jA1 = new javax.swing.JLabel();
        jB1 = new javax.swing.JLabel();
        jC1 = new javax.swing.JLabel();
        jD1 = new javax.swing.JLabel();
        jE1 = new javax.swing.JLabel();
        jO1 = new javax.swing.JLabel();
        jN1 = new javax.swing.JLabel();
        jM1 = new javax.swing.JLabel();
        jL1 = new javax.swing.JLabel();
        jK1 = new javax.swing.JLabel();
        jJ1 = new javax.swing.JLabel();
        jI1 = new javax.swing.JLabel();
        jH1 = new javax.swing.JLabel();
        jG1 = new javax.swing.JLabel();
        jF1 = new javax.swing.JLabel();
        jP1 = new javax.swing.JLabel();
        jQ1 = new javax.swing.JLabel();
        jS1 = new javax.swing.JLabel();
        jT1 = new javax.swing.JLabel();
        jU1 = new javax.swing.JLabel();
        jV1 = new javax.swing.JLabel();
        jW1 = new javax.swing.JLabel();
        jX1 = new javax.swing.JLabel();
        jY1 = new javax.swing.JLabel();
        jZ1 = new javax.swing.JLabel();
        jJ2 = new javax.swing.JLabel();
        jI2 = new javax.swing.JLabel();
        jH2 = new javax.swing.JLabel();
        jG2 = new javax.swing.JLabel();
        jF2 = new javax.swing.JLabel();
        jE2 = new javax.swing.JLabel();
        jD2 = new javax.swing.JLabel();
        jC2 = new javax.swing.JLabel();
        jB2 = new javax.swing.JLabel();
        jA2 = new javax.swing.JLabel();
        jK2 = new javax.swing.JLabel();
        jL2 = new javax.swing.JLabel();
        jM2 = new javax.swing.JLabel();
        jN2 = new javax.swing.JLabel();
        jO2 = new javax.swing.JLabel();
        jP2 = new javax.swing.JLabel();
        jQ2 = new javax.swing.JLabel();
        jS2 = new javax.swing.JLabel();
        jT2 = new javax.swing.JLabel();
        jU2 = new javax.swing.JLabel();
        jE3 = new javax.swing.JLabel();
        jD3 = new javax.swing.JLabel();
        jC3 = new javax.swing.JLabel();
        jB3 = new javax.swing.JLabel();
        jA3 = new javax.swing.JLabel();
        jZ2 = new javax.swing.JLabel();
        jY2 = new javax.swing.JLabel();
        jX2 = new javax.swing.JLabel();
        jW2 = new javax.swing.JLabel();
        jV2 = new javax.swing.JLabel();
        jF3 = new javax.swing.JLabel();
        jG3 = new javax.swing.JLabel();
        jH3 = new javax.swing.JLabel();
        jI3 = new javax.swing.JLabel();
        jJ3 = new javax.swing.JLabel();
        jK3 = new javax.swing.JLabel();
        jL3 = new javax.swing.JLabel();
        jM3 = new javax.swing.JLabel();
        jN3 = new javax.swing.JLabel();
        jO3 = new javax.swing.JLabel();
        jZ3 = new javax.swing.JLabel();
        jY3 = new javax.swing.JLabel();
        jX3 = new javax.swing.JLabel();
        jW3 = new javax.swing.JLabel();
        jV3 = new javax.swing.JLabel();
        jU3 = new javax.swing.JLabel();
        jT3 = new javax.swing.JLabel();
        jS3 = new javax.swing.JLabel();
        jQ3 = new javax.swing.JLabel();
        jP3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlPrimer = new javax.swing.JLabel();
        jlSegundo = new javax.swing.JLabel();
        jlTercer = new javax.swing.JLabel();
        jlCuarto = new javax.swing.JLabel();
        btnDado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtnVolver = new javax.swing.JButton();
        txtMostrarJugador1Tablero10x10 = new javax.swing.JTextField();
        txtMostrarJugador3Tablero10x10 = new javax.swing.JTextField();
        txtMostrarJugador4Tablero10x10 = new javax.swing.JTextField();
        txtMostrarJugador2Tablero10x10 = new javax.swing.JTextField();

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setOpaque(true);

        jLabel83.setBackground(new java.awt.Color(255, 255, 255));
        jLabel83.setOpaque(true);

        jLabel84.setBackground(new java.awt.Color(255, 255, 255));
        jLabel84.setOpaque(true);

        jLabel85.setBackground(new java.awt.Color(255, 255, 255));
        jLabel85.setOpaque(true);

        jLabel86.setBackground(new java.awt.Color(255, 255, 255));
        jLabel86.setOpaque(true);

        jLabel87.setBackground(new java.awt.Color(255, 255, 255));
        jLabel87.setOpaque(true);

        jLabel88.setBackground(new java.awt.Color(255, 255, 255));
        jLabel88.setOpaque(true);

        jLabel89.setBackground(new java.awt.Color(255, 255, 255));
        jLabel89.setOpaque(true);

        jLabel90.setBackground(new java.awt.Color(255, 255, 255));
        jLabel90.setOpaque(true);

        jLabel91.setBackground(new java.awt.Color(255, 255, 255));
        jLabel91.setOpaque(true);

        jLabel92.setBackground(new java.awt.Color(255, 255, 255));
        jLabel92.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TABLERO");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jD.setBackground(new java.awt.Color(255, 255, 255));
        jD.setText("4");
        jD.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jD.setOpaque(true);

        jA.setBackground(new java.awt.Color(0, 204, 255));
        jA.setText("1");
        jA.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jA.setOpaque(true);

        jB.setBackground(new java.awt.Color(255, 255, 255));
        jB.setText("2");
        jB.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jB.setOpaque(true);

        jC.setBackground(new java.awt.Color(0, 204, 255));
        jC.setText("3");
        jC.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jC.setOpaque(true);

        jE.setBackground(new java.awt.Color(0, 204, 255));
        jE.setText("5");
        jE.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jE.setOpaque(true);

        jF.setBackground(new java.awt.Color(255, 255, 255));
        jF.setText("6");
        jF.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jF.setOpaque(true);

        jG.setBackground(new java.awt.Color(0, 204, 255));
        jG.setText("7");
        jG.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jG.setOpaque(true);

        jH.setBackground(new java.awt.Color(255, 255, 255));
        jH.setText("8");
        jH.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jH.setOpaque(true);

        jI.setBackground(new java.awt.Color(0, 204, 255));
        jI.setText("9");
        jI.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jI.setOpaque(true);

        jJ.setBackground(new java.awt.Color(255, 255, 255));
        jJ.setText("10");
        jJ.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jJ.setOpaque(true);

        jU.setBackground(new java.awt.Color(255, 255, 255));
        jU.setText("20");
        jU.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jU.setOpaque(true);

        jT.setBackground(new java.awt.Color(0, 204, 255));
        jT.setText("19");
        jT.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jT.setOpaque(true);

        jS.setBackground(new java.awt.Color(255, 255, 255));
        jS.setText("18");
        jS.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jS.setOpaque(true);

        jQ.setBackground(new java.awt.Color(0, 204, 255));
        jQ.setText("17");
        jQ.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jQ.setOpaque(true);

        jP.setBackground(new java.awt.Color(255, 255, 255));
        jP.setText("16");
        jP.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jP.setOpaque(true);

        jO.setBackground(new java.awt.Color(0, 204, 255));
        jO.setText("15");
        jO.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jO.setOpaque(true);

        jN.setBackground(new java.awt.Color(255, 255, 255));
        jN.setText("14");
        jN.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jN.setOpaque(true);

        jM.setBackground(new java.awt.Color(0, 204, 255));
        jM.setText("13");
        jM.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jM.setOpaque(true);

        jL.setBackground(new java.awt.Color(255, 255, 255));
        jL.setText("12");
        jL.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jL.setOpaque(true);

        jK.setBackground(new java.awt.Color(0, 204, 255));
        jK.setText("11");
        jK.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jK.setOpaque(true);

        jV.setBackground(new java.awt.Color(51, 204, 255));
        jV.setText("21");
        jV.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jV.setOpaque(true);

        jW.setBackground(new java.awt.Color(255, 255, 255));
        jW.setText("22");
        jW.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jW.setOpaque(true);

        jX.setBackground(new java.awt.Color(51, 204, 255));
        jX.setText("23");
        jX.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jX.setOpaque(true);

        jY.setBackground(new java.awt.Color(255, 255, 255));
        jY.setText("24");
        jY.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jY.setOpaque(true);

        jZ.setBackground(new java.awt.Color(51, 204, 255));
        jZ.setText("25");
        jZ.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jZ.setOpaque(true);

        jA1.setBackground(new java.awt.Color(255, 255, 255));
        jA1.setText("26");
        jA1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jA1.setOpaque(true);

        jB1.setBackground(new java.awt.Color(51, 204, 255));
        jB1.setText("27");
        jB1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jB1.setOpaque(true);

        jC1.setBackground(new java.awt.Color(255, 255, 255));
        jC1.setText("28");
        jC1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jC1.setOpaque(true);

        jD1.setBackground(new java.awt.Color(51, 204, 255));
        jD1.setText("29");
        jD1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jD1.setOpaque(true);

        jE1.setBackground(new java.awt.Color(255, 255, 255));
        jE1.setText("30");
        jE1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jE1.setOpaque(true);

        jO1.setBackground(new java.awt.Color(255, 255, 255));
        jO1.setText("40");
        jO1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jO1.setOpaque(true);

        jN1.setBackground(new java.awt.Color(51, 204, 255));
        jN1.setText("39");
        jN1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jN1.setOpaque(true);

        jM1.setBackground(new java.awt.Color(255, 255, 255));
        jM1.setText("38");
        jM1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jM1.setOpaque(true);

        jL1.setBackground(new java.awt.Color(51, 204, 255));
        jL1.setText("37");
        jL1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jL1.setOpaque(true);

        jK1.setBackground(new java.awt.Color(255, 255, 255));
        jK1.setText("36");
        jK1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jK1.setOpaque(true);

        jJ1.setBackground(new java.awt.Color(51, 204, 255));
        jJ1.setText("35");
        jJ1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jJ1.setOpaque(true);

        jI1.setBackground(new java.awt.Color(255, 255, 255));
        jI1.setText("34");
        jI1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jI1.setOpaque(true);

        jH1.setBackground(new java.awt.Color(51, 204, 255));
        jH1.setText("33");
        jH1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jH1.setOpaque(true);

        jG1.setBackground(new java.awt.Color(255, 255, 255));
        jG1.setText("32");
        jG1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jG1.setOpaque(true);

        jF1.setBackground(new java.awt.Color(51, 204, 255));
        jF1.setText("31");
        jF1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jF1.setOpaque(true);

        jP1.setBackground(new java.awt.Color(51, 204, 255));
        jP1.setText("41");
        jP1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jP1.setOpaque(true);

        jQ1.setBackground(new java.awt.Color(255, 255, 255));
        jQ1.setText("42");
        jQ1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jQ1.setOpaque(true);

        jS1.setBackground(new java.awt.Color(51, 204, 255));
        jS1.setText("43");
        jS1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jS1.setOpaque(true);

        jT1.setBackground(new java.awt.Color(255, 255, 255));
        jT1.setText("44");
        jT1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jT1.setOpaque(true);

        jU1.setBackground(new java.awt.Color(51, 204, 255));
        jU1.setText("45");
        jU1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jU1.setOpaque(true);

        jV1.setBackground(new java.awt.Color(255, 255, 255));
        jV1.setText("46");
        jV1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jV1.setOpaque(true);

        jW1.setBackground(new java.awt.Color(51, 204, 255));
        jW1.setText("47");
        jW1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jW1.setOpaque(true);

        jX1.setBackground(new java.awt.Color(255, 255, 255));
        jX1.setText("48");
        jX1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jX1.setOpaque(true);

        jY1.setBackground(new java.awt.Color(51, 204, 255));
        jY1.setText("49");
        jY1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jY1.setOpaque(true);

        jZ1.setBackground(new java.awt.Color(255, 255, 255));
        jZ1.setText("50");
        jZ1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jZ1.setOpaque(true);

        jJ2.setBackground(new java.awt.Color(255, 255, 255));
        jJ2.setText("60");
        jJ2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jJ2.setOpaque(true);

        jI2.setBackground(new java.awt.Color(51, 204, 255));
        jI2.setText("59");
        jI2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jI2.setOpaque(true);

        jH2.setBackground(new java.awt.Color(255, 255, 255));
        jH2.setText("58");
        jH2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jH2.setOpaque(true);

        jG2.setBackground(new java.awt.Color(51, 204, 255));
        jG2.setText("57");
        jG2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jG2.setOpaque(true);

        jF2.setBackground(new java.awt.Color(255, 255, 255));
        jF2.setText("56");
        jF2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jF2.setOpaque(true);

        jE2.setBackground(new java.awt.Color(51, 204, 255));
        jE2.setText("55");
        jE2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jE2.setOpaque(true);

        jD2.setBackground(new java.awt.Color(255, 255, 255));
        jD2.setText("54");
        jD2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jD2.setOpaque(true);

        jC2.setBackground(new java.awt.Color(51, 204, 255));
        jC2.setText("53");
        jC2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jC2.setOpaque(true);

        jB2.setBackground(new java.awt.Color(255, 255, 255));
        jB2.setText("52");
        jB2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jB2.setOpaque(true);

        jA2.setBackground(new java.awt.Color(51, 204, 255));
        jA2.setText("51");
        jA2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jA2.setOpaque(true);

        jK2.setBackground(new java.awt.Color(51, 204, 255));
        jK2.setText("61");
        jK2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jK2.setOpaque(true);

        jL2.setBackground(new java.awt.Color(255, 255, 255));
        jL2.setText("62");
        jL2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jL2.setOpaque(true);

        jM2.setBackground(new java.awt.Color(51, 204, 255));
        jM2.setText("63");
        jM2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jM2.setOpaque(true);

        jN2.setBackground(new java.awt.Color(255, 255, 255));
        jN2.setText("64");
        jN2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jN2.setOpaque(true);

        jO2.setBackground(new java.awt.Color(51, 204, 255));
        jO2.setText("65");
        jO2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jO2.setOpaque(true);

        jP2.setBackground(new java.awt.Color(255, 255, 255));
        jP2.setText("66");
        jP2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jP2.setOpaque(true);

        jQ2.setBackground(new java.awt.Color(51, 204, 255));
        jQ2.setText("67");
        jQ2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jQ2.setOpaque(true);

        jS2.setBackground(new java.awt.Color(255, 255, 255));
        jS2.setText("68");
        jS2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jS2.setOpaque(true);

        jT2.setBackground(new java.awt.Color(51, 204, 255));
        jT2.setText("69");
        jT2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jT2.setOpaque(true);

        jU2.setBackground(new java.awt.Color(255, 255, 255));
        jU2.setText("70");
        jU2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jU2.setOpaque(true);

        jE3.setBackground(new java.awt.Color(255, 255, 255));
        jE3.setText("80");
        jE3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jE3.setOpaque(true);

        jD3.setBackground(new java.awt.Color(51, 204, 255));
        jD3.setText("79");
        jD3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jD3.setOpaque(true);

        jC3.setBackground(new java.awt.Color(255, 255, 255));
        jC3.setText("78");
        jC3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jC3.setOpaque(true);

        jB3.setBackground(new java.awt.Color(51, 204, 255));
        jB3.setText("77");
        jB3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jB3.setOpaque(true);

        jA3.setBackground(new java.awt.Color(255, 255, 255));
        jA3.setText("76");
        jA3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jA3.setOpaque(true);

        jZ2.setBackground(new java.awt.Color(51, 204, 255));
        jZ2.setText("75");
        jZ2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jZ2.setOpaque(true);

        jY2.setBackground(new java.awt.Color(255, 255, 255));
        jY2.setText("74");
        jY2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jY2.setOpaque(true);

        jX2.setBackground(new java.awt.Color(51, 204, 255));
        jX2.setText("73");
        jX2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jX2.setOpaque(true);

        jW2.setBackground(new java.awt.Color(255, 255, 255));
        jW2.setText("72");
        jW2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jW2.setOpaque(true);

        jV2.setBackground(new java.awt.Color(51, 204, 255));
        jV2.setText("71");
        jV2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jV2.setOpaque(true);

        jF3.setBackground(new java.awt.Color(51, 204, 255));
        jF3.setText("81");
        jF3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jF3.setOpaque(true);

        jG3.setBackground(new java.awt.Color(255, 255, 255));
        jG3.setText("82");
        jG3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jG3.setOpaque(true);

        jH3.setBackground(new java.awt.Color(51, 204, 255));
        jH3.setText("83");
        jH3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jH3.setOpaque(true);

        jI3.setBackground(new java.awt.Color(255, 255, 255));
        jI3.setText("84");
        jI3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jI3.setOpaque(true);

        jJ3.setBackground(new java.awt.Color(51, 204, 255));
        jJ3.setText("85");
        jJ3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jJ3.setOpaque(true);

        jK3.setBackground(new java.awt.Color(255, 255, 255));
        jK3.setText("86");
        jK3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jK3.setOpaque(true);

        jL3.setBackground(new java.awt.Color(51, 204, 255));
        jL3.setText("87");
        jL3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jL3.setOpaque(true);

        jM3.setBackground(new java.awt.Color(255, 255, 255));
        jM3.setText("88");
        jM3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jM3.setOpaque(true);

        jN3.setBackground(new java.awt.Color(51, 204, 255));
        jN3.setText("89");
        jN3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jN3.setOpaque(true);

        jO3.setBackground(new java.awt.Color(255, 255, 255));
        jO3.setText("90");
        jO3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jO3.setOpaque(true);

        jZ3.setBackground(new java.awt.Color(255, 255, 255));
        jZ3.setText("100");
        jZ3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jZ3.setOpaque(true);

        jY3.setBackground(new java.awt.Color(51, 204, 255));
        jY3.setText("99");
        jY3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jY3.setOpaque(true);

        jX3.setBackground(new java.awt.Color(255, 255, 255));
        jX3.setText("98");
        jX3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jX3.setOpaque(true);

        jW3.setBackground(new java.awt.Color(51, 204, 255));
        jW3.setText("97");
        jW3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jW3.setOpaque(true);

        jV3.setBackground(new java.awt.Color(255, 255, 255));
        jV3.setText("96");
        jV3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jV3.setOpaque(true);

        jU3.setBackground(new java.awt.Color(51, 204, 255));
        jU3.setText("95");
        jU3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jU3.setOpaque(true);

        jT3.setBackground(new java.awt.Color(255, 255, 255));
        jT3.setText("94");
        jT3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jT3.setOpaque(true);

        jS3.setBackground(new java.awt.Color(51, 204, 255));
        jS3.setText("93");
        jS3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jS3.setOpaque(true);

        jQ3.setBackground(new java.awt.Color(255, 255, 255));
        jQ3.setText("92");
        jQ3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jQ3.setOpaque(true);

        jP3.setBackground(new java.awt.Color(51, 204, 255));
        jP3.setText("91");
        jP3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jP3.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jZ3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jY3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jX3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jW3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jV3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jU3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jT3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jS3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jQ3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jP3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jG, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jJ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jU, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jQ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jW, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jZ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jA1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jC1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jD1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jE1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jO1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jN1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jM1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jL1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jK1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jI1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jH1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jG1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jF1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jS1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jT1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jU1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jV1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jW1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jX1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jY1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jK2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jM2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jN2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jO2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jP2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jS2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jT2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jU2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jI2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jH2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jG2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jF2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jE2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jD2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jC2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jA2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jE3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jD3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jC3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jA3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jY2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jX2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jW2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jV2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jF3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jG3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jH3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jI3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jK3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jL3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jM3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jN3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jO3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jZ3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jW3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jY3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jX3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jV3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jU3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQ3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jS3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jP3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jF3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jI3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jG3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jH3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jJ3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jK3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jN3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jM3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jO3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jE3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jD3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jC3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jA3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jZ2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jW2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jY2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jX2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jV2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jK2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jN2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jM2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jO2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jP2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQ2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jS2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jU2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jJ2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jG2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jI2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jH2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jF2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jE2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jD2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jC2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jA2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jP1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQ1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jS1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jU1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jV1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jY1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jW1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jX1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jZ1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jO1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jN1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jM1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jK1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jJ1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jG1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jI1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jH1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jF1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jW, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jZ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jD1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jC1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jE1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jJ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        jlPrimer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlPrimer.setText("JUGADOR:");

        jlSegundo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlSegundo.setText("JUGADOR:");

        jlTercer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlTercer.setText("JUGADOR:");

        jlCuarto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlCuarto.setText("JUGADOR:");

        btnDado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDado.setText("DADO");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setOpaque(true);

        jbtnVolver.setText("VOLVER");
        jbtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jlPrimer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMostrarJugador1Tablero10x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jlSegundo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMostrarJugador2Tablero10x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jlTercer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMostrarJugador3Tablero10x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jlCuarto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMostrarJugador4Tablero10x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtnVolver))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnDado))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jbtnVolver)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPrimer)
                    .addComponent(txtMostrarJugador1Tablero10x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSegundo)
                    .addComponent(txtMostrarJugador2Tablero10x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTercer)
                    .addComponent(txtMostrarJugador3Tablero10x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCuarto)
                    .addComponent(txtMostrarJugador4Tablero10x10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDado)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVolverActionPerformed
        SeleccionarJuego abrirSeleccionador= new SeleccionarJuego();
        abrirSeleccionador.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Tablero10x10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero10x10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero10x10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero10x10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero10x10().setVisible(true);
                  }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDado;
    private javax.swing.JLabel jA;
    private javax.swing.JLabel jA1;
    private javax.swing.JLabel jA2;
    private javax.swing.JLabel jA3;
    private javax.swing.JLabel jB;
    private javax.swing.JLabel jB1;
    private javax.swing.JLabel jB2;
    private javax.swing.JLabel jB3;
    private javax.swing.JLabel jC;
    private javax.swing.JLabel jC1;
    private javax.swing.JLabel jC2;
    private javax.swing.JLabel jC3;
    private javax.swing.JLabel jD;
    private javax.swing.JLabel jD1;
    private javax.swing.JLabel jD2;
    private javax.swing.JLabel jD3;
    private javax.swing.JLabel jE;
    private javax.swing.JLabel jE1;
    private javax.swing.JLabel jE2;
    private javax.swing.JLabel jE3;
    private javax.swing.JLabel jF;
    private javax.swing.JLabel jF1;
    private javax.swing.JLabel jF2;
    private javax.swing.JLabel jF3;
    private javax.swing.JLabel jG;
    private javax.swing.JLabel jG1;
    private javax.swing.JLabel jG2;
    private javax.swing.JLabel jG3;
    private javax.swing.JLabel jH;
    private javax.swing.JLabel jH1;
    private javax.swing.JLabel jH2;
    private javax.swing.JLabel jH3;
    private javax.swing.JLabel jI;
    private javax.swing.JLabel jI1;
    private javax.swing.JLabel jI2;
    private javax.swing.JLabel jI3;
    private javax.swing.JLabel jJ;
    private javax.swing.JLabel jJ1;
    private javax.swing.JLabel jJ2;
    private javax.swing.JLabel jJ3;
    private javax.swing.JLabel jK;
    private javax.swing.JLabel jK1;
    private javax.swing.JLabel jK2;
    private javax.swing.JLabel jK3;
    private javax.swing.JLabel jL;
    private javax.swing.JLabel jL1;
    private javax.swing.JLabel jL2;
    private javax.swing.JLabel jL3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jM;
    private javax.swing.JLabel jM1;
    private javax.swing.JLabel jM2;
    private javax.swing.JLabel jM3;
    private javax.swing.JLabel jN;
    private javax.swing.JLabel jN1;
    private javax.swing.JLabel jN2;
    private javax.swing.JLabel jN3;
    private javax.swing.JLabel jO;
    private javax.swing.JLabel jO1;
    private javax.swing.JLabel jO2;
    private javax.swing.JLabel jO3;
    private javax.swing.JLabel jP;
    private javax.swing.JLabel jP1;
    private javax.swing.JLabel jP2;
    private javax.swing.JLabel jP3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jQ;
    private javax.swing.JLabel jQ1;
    private javax.swing.JLabel jQ2;
    private javax.swing.JLabel jQ3;
    private javax.swing.JLabel jS;
    private javax.swing.JLabel jS1;
    private javax.swing.JLabel jS2;
    private javax.swing.JLabel jS3;
    private javax.swing.JLabel jT;
    private javax.swing.JLabel jT1;
    private javax.swing.JLabel jT2;
    private javax.swing.JLabel jT3;
    private javax.swing.JLabel jU;
    private javax.swing.JLabel jU1;
    private javax.swing.JLabel jU2;
    private javax.swing.JLabel jU3;
    private javax.swing.JLabel jV;
    private javax.swing.JLabel jV1;
    private javax.swing.JLabel jV2;
    private javax.swing.JLabel jV3;
    private javax.swing.JLabel jW;
    private javax.swing.JLabel jW1;
    private javax.swing.JLabel jW2;
    private javax.swing.JLabel jW3;
    private javax.swing.JLabel jX;
    private javax.swing.JLabel jX1;
    private javax.swing.JLabel jX2;
    private javax.swing.JLabel jX3;
    private javax.swing.JLabel jY;
    private javax.swing.JLabel jY1;
    private javax.swing.JLabel jY2;
    private javax.swing.JLabel jY3;
    private javax.swing.JLabel jZ;
    private javax.swing.JLabel jZ1;
    private javax.swing.JLabel jZ2;
    private javax.swing.JLabel jZ3;
    private javax.swing.JButton jbtnVolver;
    private javax.swing.JLabel jlCuarto;
    private javax.swing.JLabel jlPrimer;
    private javax.swing.JLabel jlSegundo;
    private javax.swing.JLabel jlTercer;
    public static javax.swing.JTextField txtMostrarJugador1Tablero10x10;
    public static javax.swing.JTextField txtMostrarJugador2Tablero10x10;
    public static javax.swing.JTextField txtMostrarJugador3Tablero10x10;
    public static javax.swing.JTextField txtMostrarJugador4Tablero10x10;
    // End of variables declaration//GEN-END:variables
}
