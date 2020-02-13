/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


/**
 *
 * @author jvss2
 */
public class ConfigOferta extends javax.swing.JFrame {

    /**
     * Creates new form ConfigOferta
     */
    public ConfigOferta() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Configuração da Oferta");
        
        disciplinas_cadastradas = Disciplina.retornaDisciplinas();
        professores_cadastrados = Professor.retornaProfessores(); 
        String[] itens = new String[10];
        itens[0]= "1";
        itens[1]= "2";
        itens[2]= "3";
        itens[3]= "4";
        itens[4]= "5";
        itens[5]= "6";
        itens[6]= "7";
        itens[7]= "8";
        itens[8]= "8";
        itens[9]= "10";                   
        DefaultComboBoxModel model = new DefaultComboBoxModel(itens);
        select_semestre.setModel(model);
        
        int semestre = select_semestre.getSelectedIndex()+1; 
        try {
            obrigatorias = Disciplina.disciplinasSemestre(semestre);
        } catch (IOException ex) {
            Logger.getLogger(ConfigOferta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String label_obrig = "";
        for(int i=0; i<obrigatorias.size(); i++){
            label_obrig = label_obrig +obrigatorias.get(i).getCodigo()+" "; 
            
            
        }
        
        lbl_obrigatorias.setText(label_obrig);
        
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
        lbl_config = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        select_semestre = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        edt_professores = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbl_disciplinas = new javax.swing.JLabel();
        edt_disciplinas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_obrigatorias = new javax.swing.JLabel();
        btn_menu = new javax.swing.JButton();
        btn_iniciar_oferta = new javax.swing.JButton();
        btn_disc = new javax.swing.JButton();
        btn_prof = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_config.setText("Configuração da Oferta");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Semestre da oferta");

        select_semestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        select_semestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_semestreActionPerformed(evt);
            }
        });

        jLabel3.setText("As disciplinas obrigatórias do semestre são adicionadas automáticamente.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(select_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(select_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Professores da Oferta");

        jLabel4.setText("Neste campo são colocadas as matrículas dos professores.");

        jLabel5.setText("Ex: 123, 456, 789");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edt_professores)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edt_professores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_disciplinas.setText("Disciplinas da oferta");

        edt_disciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_disciplinasActionPerformed(evt);
            }
        });

        jLabel6.setText("Neste campo são colocados os códigos das disciplinas que serão ofertadas.");

        jLabel7.setText("As disciplinas obrigatórias do semestre são adicionadas automaticamente.");

        jLabel8.setText("Ex: COMP789, COMP456");

        jLabel9.setText("Obrigatórias desse semestre:");

        lbl_obrigatorias.setForeground(new java.awt.Color(255, 0, 0));
        lbl_obrigatorias.setText("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edt_disciplinas)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_disciplinas)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addComponent(lbl_obrigatorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_disciplinas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edt_disciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_obrigatorias)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btn_menu.setText("Menu");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        btn_iniciar_oferta.setText("Nova Oferta");
        btn_iniciar_oferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciar_ofertaActionPerformed(evt);
            }
        });

        btn_disc.setText("Disciplinas");
        btn_disc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_discActionPerformed(evt);
            }
        });

        btn_prof.setText("Professores");
        btn_prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_profActionPerformed(evt);
            }
        });

        jLabel10.setText("Visualizar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lbl_config)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel10))
                                    .addComponent(btn_prof, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(btn_disc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_iniciar_oferta, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_config)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_prof)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_disc)
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_iniciar_oferta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_menu)
                .addGap(18, 18, 18))
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

    private void edt_disciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_disciplinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_disciplinasActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Inicio().setVisible(true);
        
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_iniciar_ofertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciar_ofertaActionPerformed
        // TODO add your handling code here:
        boolean val_disc=true;
        String disc = edt_disciplinas.getText().replaceAll(" ","");
        String[] disc_list = disc.split(",");
        for(int i=0; i<disc_list.length; i++){
            for(int j=0; j<obrigatorias.size();j++){
                if(disc_list[i].equals(obrigatorias.get(j).getCodigo())){
                    JOptionPane.showMessageDialog(this.rootPane, "Não podem existir duas turmas da mesma disciplina!");
                    val_disc=false; 
                    break;
                }
            }        
        }
        boolean val_cad_disc = true; 
        boolean achou;
        for(int i=0; i<disc_list.length; i++){
            achou = false; 
            for(int j=0; j<disciplinas_cadastradas.size();j++){
                if(disc_list[i].equals(disciplinas_cadastradas.get(j).getCodigo())){
                    achou = true;                 
                }
                if(j==disciplinas_cadastradas.size()-1 && achou==false && !disc_list[i].equals("")){
                    JOptionPane.showMessageDialog(this.rootPane, disc_list[i]+" Não cadastrada!");
                    val_cad_disc = false; 
                    break;                    
                }                
            }             
        }
        
        boolean val_prof = true; 
        String prof = edt_professores.getText().replaceAll(" ","");
        String[] prof_list = prof.split(",");
      
        for(int i=0; i<prof_list.length; i++){
            achou = false; 
            for(int j=0; j<professores_cadastrados.size();j++){
                if(prof_list[i].equals(professores_cadastrados.get(j).getMatricula())){
                    achou = true;                 
                }
                if(j==professores_cadastrados.size()-1 && achou==false && !prof_list[i].equals("")){
                    JOptionPane.showMessageDialog(this.rootPane, prof_list[i]+" Não cadastrado!");
                    val_prof = false;
                    break;                    
                }                
            }             
        }
        
        if(val_disc && val_cad_disc && val_prof && !edt_professores.getText().replaceAll(" ","").equals("")){
            String[] todas_disc = new String[disc_list.length+obrigatorias.size()];      
            for(int i=0; i<disc_list.length; i++){
                todas_disc[i] = disc_list[i];
            }
            for(int i=0; i<obrigatorias.size(); i++){
                todas_disc[i+disc_list.length] = obrigatorias.get(i).getCodigo();
            }
            
            for(int i=0; i<disc_list.length+obrigatorias.size(); i++){
                System.out.println(todas_disc[i]);
            }
            System.out.println("\n");
            
        }else{
            if(edt_professores.getText().replaceAll(" ","").equals("")){
                JOptionPane.showMessageDialog(this.rootPane, " Digite pelo menos um professor!");                   
            }
                    
        }  
        
        
        
    }//GEN-LAST:event_btn_iniciar_ofertaActionPerformed

    private void select_semestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_semestreActionPerformed
        int semestre = select_semestre.getSelectedIndex()+1; 
        try {
            obrigatorias = Disciplina.disciplinasSemestre(semestre);
        } catch (IOException ex) {
            Logger.getLogger(ConfigOferta.class.getName()).log(Level.SEVERE, null, ex);
        }        
        String label_obrig = "";
        for(int i=0; i<obrigatorias.size(); i++)
            label_obrig = label_obrig +obrigatorias.get(i).getCodigo()+" ";
        lbl_obrigatorias.setText(label_obrig);        
    }//GEN-LAST:event_select_semestreActionPerformed

    private void btn_profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_profActionPerformed
        try {
            
            // TODO add your handling code here:
            new ListarProfessores(false).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(ConfigOferta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_profActionPerformed

    private void btn_discActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_discActionPerformed
        // TODO add your handling code here:
        
       
        try {
            new ListarDisciplinas(false).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(ConfigOferta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_discActionPerformed

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
            java.util.logging.Logger.getLogger(ConfigOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ConfigOferta().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ConfigOferta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    private  ArrayList<Disciplina> disciplinas_cadastradas; 
    private  ArrayList<Professor> professores_cadastrados; 
    private  ArrayList<Disciplina> obrigatorias; 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_disc;
    private javax.swing.JButton btn_iniciar_oferta;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_prof;
    private javax.swing.JTextField edt_disciplinas;
    private javax.swing.JTextField edt_professores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_config;
    private javax.swing.JLabel lbl_disciplinas;
    private javax.swing.JLabel lbl_obrigatorias;
    private javax.swing.JComboBox<String> select_semestre;
    // End of variables declaration//GEN-END:variables
}
