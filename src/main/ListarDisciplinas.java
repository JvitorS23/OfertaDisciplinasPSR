/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jvss2
 */
public class ListarDisciplinas extends javax.swing.JFrame {

    /**
     * Creates new form ListarDisciplinas
     */
    public ListarDisciplinas() throws FileNotFoundException, IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Listar Disciplinas");
    
        text_area.setLayout(null);
        text_area.setEditable(false);
        
        PrintStream outputPrintStream = new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                text_area.append(String.valueOf((char) b));
            }
        });
        System.setOut(outputPrintStream);      
        
        String[] disciplina = new String[5];
        ArrayList<Disciplina> disciplinas = new ArrayList();
        BufferedReader buffRead = new BufferedReader(new FileReader("disciplinas.txt"));
        String linha = "";
        while (true) {
            try {
                linha = buffRead.readLine();
            } catch (IOException ex) {
                Logger.getLogger(Disciplina.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (linha != null) {
                disciplina = linha.split(";");                
                Disciplina aux = new Disciplina(Integer.parseInt(disciplina[0]), disciplina[2], disciplina[1], Integer.parseInt(disciplina[3]), Boolean.parseBoolean(disciplina[4]));
                System.out.println("=============");  
                System.out.println("Nome: "+aux.getNome());
                System.out.println("Codigo: "+aux.getCodigo()+"\nCreditos: "+aux.getCreditos()+"\nSemestre obrigatorio: "+aux.getSemestreObrigatorio());
              
            }else
                break;
        }
        buffRead.close();        
        
    }

    ListarDisciplinas(boolean menu) throws IOException {
        
        initComponents();
        btn_menu.setVisible(menu);
        
        setTitle("Listar Disciplinas");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    
        text_area.setLayout(null);
        text_area.setEditable(false);
        
        PrintStream outputPrintStream = new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                text_area.append(String.valueOf((char) b));
            }
        });
        System.setOut(outputPrintStream);      
        
        String[] disciplina = new String[5];
        ArrayList<Disciplina> disciplinas = new ArrayList();
        BufferedReader buffRead = new BufferedReader(new FileReader("disciplinas.txt"));
        String linha = "";
        while (true) {
            try {
                linha = buffRead.readLine();
            } catch (IOException ex) {
                Logger.getLogger(Disciplina.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (linha != null) {
                disciplina = linha.split(";");                
                Disciplina aux = new Disciplina(Integer.parseInt(disciplina[0]), disciplina[2], disciplina[1], Integer.parseInt(disciplina[3]), Boolean.parseBoolean(disciplina[4]));
                System.out.println("=============");  
                System.out.println("Nome: "+aux.getNome());
                System.out.println("Codigo: "+aux.getCodigo()+"\nCreditos: "+aux.getCreditos()+"\nSemestre obrigatorio: "+aux.getSemestreObrigatorio());
              
            }else
                break;
        }
        buffRead.close();  
        
        
        
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
        lbl_listar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_area = new javax.swing.JTextArea();
        btn_menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_listar.setText("Listagem de Disciplinas ");

        text_area.setColumns(20);
        text_area.setRows(5);
        jScrollPane1.setViewportView(text_area);

        btn_menu.setText("Menu");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 309, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_listar)
                                .addGap(312, 312, 312))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_menu)
                                .addGap(327, 327, 327))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbl_listar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_menu)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Inicio().setVisible(true);
    }//GEN-LAST:event_btn_menuActionPerformed

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
            java.util.logging.Logger.getLogger(ListarDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ListarDisciplinas().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ListarDisciplinas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_menu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_listar;
    private javax.swing.JTextArea text_area;
    // End of variables declaration//GEN-END:variables
}