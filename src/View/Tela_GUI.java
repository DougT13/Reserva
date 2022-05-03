/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
/**
 *
 * @author manager
 */
public class Tela_GUI extends javax.swing.JFrame {
    String [] diasDisponiveis = {"25/3","26/03","28/3","01/04","02/04"};
    String [] horariosDisponiveiSala1 = {"12h30min", "14h25min", "16h30min","18h"};
    String [] horariosDisponiveiSala4 = {"12h30min", "14h25min", "16h30min","18h"};
    String [] horariosDisponiveiAuditorio = {"09h", "12h30min", "16h30min","18h30min"};
    int opcao = 0;
    
    /**
     * Creates new form Tela_GUI
     */
    public Tela_GUI() {
        initComponents();
        sala1.setVisible(false);
        sala2.setVisible(false);
        sala3.setVisible(false);
        sala4.setVisible(false);
        auditorio.setVisible(false);
        verde.setVisible(false);
        vermelho.setVisible(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Sala1 = new javax.swing.JButton();
        Sala2 = new javax.swing.JButton();
        Sala3 = new javax.swing.JButton();
        Sala4 = new javax.swing.JButton();
        Auditorio = new javax.swing.JButton();
        Fechar = new javax.swing.JButton();
        verde = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vermelho = new javax.swing.JLabel();
        auditorio = new javax.swing.JLabel();
        sala1 = new javax.swing.JLabel();
        sala3 = new javax.swing.JLabel();
        sala4 = new javax.swing.JLabel();
        sala2 = new javax.swing.JLabel();
        Reservar = new javax.swing.JButton();

        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sala2.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(null);

        Titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Titulo.setText("Sistema de Reserva");
        jPanel2.add(Titulo);
        Titulo.setBounds(10, 11, 224, 28);

        Sala1.setText("Sala 1");
        Sala1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sala1ActionPerformed(evt);
            }
        });
        jPanel2.add(Sala1);
        Sala1.setBounds(110, 60, 75, 22);

        Sala2.setText("Sala 2");
        Sala2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sala2ActionPerformed(evt);
            }
        });
        jPanel2.add(Sala2);
        Sala2.setBounds(210, 60, 75, 22);

        Sala3.setText("Sala 3");
        Sala3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sala3ActionPerformed(evt);
            }
        });
        jPanel2.add(Sala3);
        Sala3.setBounds(300, 60, 75, 22);

        Sala4.setText("Sala 4");
        Sala4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sala4ActionPerformed(evt);
            }
        });
        jPanel2.add(Sala4);
        Sala4.setBounds(390, 60, 75, 22);

        Auditorio.setText("Auditório");
        Auditorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuditorioActionPerformed(evt);
            }
        });
        jPanel2.add(Auditorio);
        Auditorio.setBounds(480, 60, 80, 22);

        Fechar.setText("Fechar");
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });
        jPanel2.add(Fechar);
        Fechar.setBounds(620, 310, 72, 22);

        verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verde.png"))); // NOI18N
        jPanel2.add(verde);
        verde.setBounds(320, 330, 40, 40);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(539, 360, 0, 0);

        vermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/red.png"))); // NOI18N
        jPanel2.add(vermelho);
        vermelho.setBounds(320, 330, 40, 40);

        auditorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/auditorio.jpg"))); // NOI18N
        jPanel2.add(auditorio);
        auditorio.setBounds(190, 120, 310, 200);

        sala1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sala2.png"))); // NOI18N
        jPanel2.add(sala1);
        sala1.setBounds(190, 120, 310, 200);

        sala3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sala3.jpg"))); // NOI18N
        jPanel2.add(sala3);
        sala3.setBounds(190, 120, 310, 200);

        sala4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sala4.jpg"))); // NOI18N
        jPanel2.add(sala4);
        sala4.setBounds(190, 120, 310, 200);

        sala2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sala1.png"))); // NOI18N
        jPanel2.add(sala2);
        sala2.setBounds(190, 120, 310, 200);

        Reservar.setText("Reservar");
        Reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarActionPerformed(evt);
            }
        });
        jPanel2.add(Reservar);
        Reservar.setBounds(95, 300, 80, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(716, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_FecharActionPerformed

    private void Sala1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sala1ActionPerformed
        opcao = 1;
        sala2.setVisible(false);
        sala3.setVisible(false);
        sala4.setVisible(false);
        auditorio.setVisible(false);
        sala1.setVisible(true);
        verde.setVisible(true);
        vermelho.setVisible(false);
    }//GEN-LAST:event_Sala1ActionPerformed

    private void ReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarActionPerformed
        switch (opcao) {
            case 0:
                JOptionPane.showMessageDialog(null, "Digite uma sala primeiro!");
                break;
            case 1: 
                JOptionPane.showInputDialog(null, "Nome do reservista:");
                JOptionPane.showOptionDialog(null,"Escolha um dos dias disponíveis:","Dias-",0,1,null,diasDisponiveis,"");
                JOptionPane.showOptionDialog(null,"Escolha um dos horários:","Horários-",0,1,null,horariosDisponiveiSala1,"");
                JOptionPane.showMessageDialog(null,"Reservado!","Reserva feita com sucesso!",2);
                verde.setVisible(false);
                vermelho.setVisible(true);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Todos os horários já foram reservados","Sala Esgotada",0);
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Todos os horários já foram reservados","Sala Esgotada",0);
                break;
            case 4:
                JOptionPane.showInputDialog(null, "Nome do reservista:");
                JOptionPane.showOptionDialog(null,"Escolha um dos dias disponíveis:","Dias-",0,1,null,diasDisponiveis,"");
                JOptionPane.showOptionDialog(null,"Escolha um dos horários:","Horários-",0,1,null,horariosDisponiveiSala4,"");
                JOptionPane.showMessageDialog(null,"Reservado!","Reserva feita com sucesso!",2);
                verde.setVisible(false);
                vermelho.setVisible(true);
                break;
            case 5: 
                JOptionPane.showInputDialog(null, "Nome do reservista:");
                JOptionPane.showOptionDialog(null,"Escolha um dos dias disponíveis:","Dias-",0,1,null,diasDisponiveis,"");
                JOptionPane.showOptionDialog(null,"Escolha um dos horários:","Horários-",0,1,null,horariosDisponiveiAuditorio,"");
                JOptionPane.showMessageDialog(null,"Reservado!","Reserva feita com sucesso!",2);
                verde.setVisible(false);
                vermelho.setVisible(true);
                break;
        }
    }//GEN-LAST:event_ReservarActionPerformed

    private void Sala2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sala2ActionPerformed
        opcao = 2;
        sala2.setVisible(true);
        sala1.setVisible(false);
        sala3.setVisible(false);
        sala4.setVisible(false);
        auditorio.setVisible(false);
        verde.setVisible(false);
        vermelho.setVisible(true);
        
    }//GEN-LAST:event_Sala2ActionPerformed

    private void Sala3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sala3ActionPerformed
        opcao = 3;
        sala3.setVisible(true);
        sala1.setVisible(false);
        sala2.setVisible(false);
        sala4.setVisible(false);
        auditorio.setVisible(false);
        verde.setVisible(false);
        vermelho.setVisible(true);
    }//GEN-LAST:event_Sala3ActionPerformed

    private void Sala4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sala4ActionPerformed
        opcao = 4;
        sala4.setVisible(true);
        sala1.setVisible(false);
        sala2.setVisible(false);
        sala3.setVisible(false);
        auditorio.setVisible(false);
        verde.setVisible(true);
        vermelho.setVisible(false);
    }//GEN-LAST:event_Sala4ActionPerformed

    private void AuditorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuditorioActionPerformed
        opcao = 5;
        auditorio.setVisible(true);
        verde.setVisible(true);
        vermelho.setVisible(false);
    }//GEN-LAST:event_AuditorioActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Auditorio;
    private javax.swing.JButton Fechar;
    private javax.swing.JButton Reservar;
    private javax.swing.JButton Sala1;
    private javax.swing.JButton Sala2;
    private javax.swing.JButton Sala3;
    private javax.swing.JButton Sala4;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel auditorio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel sala1;
    private javax.swing.JLabel sala2;
    private javax.swing.JLabel sala3;
    private javax.swing.JLabel sala4;
    private javax.swing.JLabel verde;
    private javax.swing.JLabel vermelho;
    // End of variables declaration//GEN-END:variables
}
