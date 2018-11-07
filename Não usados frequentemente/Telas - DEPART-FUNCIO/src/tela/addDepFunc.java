/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Departamento;
import logica.Funcionario;

/**
 *
 * @author Davi
 */
public class addDepFunc extends javax.swing.JFrame {
      ArrayList<Funcionario> ListaFunc;

    String modoFunc;
    

    public void LoadCBDep(){
    cb_func_deps.removeAllItems();
    cb_func_deps.addItem("Selecione");
    
    
    for(int i=0;i<ListaDep.size();i++){
        cb_func_deps.addItem(ListaDep.get(i).getNome());
    }   
    }
     
    public void LoadTableFunc(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Matrícula","Nome","Departamento"},0);
    
    for(int i=0;i<ListaFunc.size();i++){
        Object linha[] = new Object[]{ListaFunc.get(i).getMatricula(),
                                    ListaFunc.get(i).getNome(),
                                    ListaFunc.get(i).getDep().getNome()};
        modelo.addRow(linha);
        }
    
        tbl_func_funcs.setModel(modelo);
        tbl_func_funcs.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbl_func_funcs.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbl_func_funcs.getColumnModel().getColumn(2).setPreferredWidth(100);
        
    }
    /**
     * Creates new form TelaPrincipal
     */
    public addDepFunc() {
        initComponents();
        setLocationRelativeTo(null);
        ListaDep = new ArrayList();
        ListaFunc = new ArrayList();
        modoDep= "Navegar";
        modoFunc= "Navegar";
        ManipulaInterfaceDep();
        ManipulaInterfaceFunc();
    }

    public void ManipulaInterfaceDep(){
        switch(modoDep){
            case "Navegar":
                    btn_dep_salvar.setEnabled(false);
                    btn_dep_cancelar.setEnabled(false);
                    c_dep_codigo.setEnabled(false);
                    c_dep_nome.setEnabled(false);  
                    btn_dep_novo.setEnabled(true);
                    btn_dep_editar.setEnabled(false);
                    btn_dep_excluir.setEnabled(false);
                    cb_func_deps.setEnabled(false);
                break;
            case "Novo":
                    btn_dep_salvar.setEnabled(true);
                    btn_dep_cancelar.setEnabled(true);
                    c_dep_codigo.setEnabled(true);
                    cb_func_deps.setEnabled(true);
                    c_dep_nome.setEnabled(true);

                    btn_dep_editar.setEnabled(false);
                    btn_dep_excluir.setEnabled(false);
                break;
            case "Editar":
                    btn_dep_salvar.setEnabled(true);
                    btn_dep_cancelar.setEnabled(true);
                    c_dep_codigo.setEnabled(true);
                    c_dep_nome.setEnabled(true);
                    cb_func_deps.setEnabled(true);
                    btn_dep_novo.setEnabled(true);
                    btn_dep_editar.setEnabled(false);
                    btn_dep_excluir.setEnabled(false);
                break;
            case "Excluir":
                    btn_dep_salvar.setEnabled(true);
                    btn_dep_cancelar.setEnabled(true);
                    c_dep_codigo.setEnabled(false);
                    cb_func_deps.setEnabled(false);
                    c_dep_nome.setEnabled(false);
                    btn_dep_novo.setEnabled(true);
                    btn_dep_editar.setEnabled(false);
                    btn_dep_excluir.setEnabled(false);                
                break;
            case "Selecao":
                    btn_dep_salvar.setEnabled(false);
                    btn_dep_cancelar.setEnabled(false);
                    c_dep_codigo.setEnabled(false);
                    c_dep_nome.setEnabled(false);
                    cb_func_deps.setEnabled(false);
                    btn_dep_novo.setEnabled(true);
                    btn_dep_editar.setEnabled(true);
                    btn_dep_excluir.setEnabled(true);                     
                break;
            
            default: System.out.println("Modo Inválido");
        }
    }
    public void ManipulaInterfaceFunc(){
        switch(modoFunc){
            case "Navegar":
                    btn_func_salvar.setEnabled(false);
                    btn_func_cancelar.setEnabled(false);
                    c_func_mat.setEnabled(false);
                    c_func_nome.setEnabled(false);  
                    btn_func_novo.setEnabled(true);
                    btn_func_editar.setEnabled(false);
                    btn_func_excluir.setEnabled(false);
                    cb_func_deps.setEnabled(false);
                break;
            case "Novo":
                    btn_func_salvar.setEnabled(true);
                    btn_func_cancelar.setEnabled(true);
                    c_func_mat.setEnabled(true);
                    c_func_nome.setEnabled(true);  
                    btn_func_novo.setEnabled(true);
                    btn_func_editar.setEnabled(false);
                    btn_func_excluir.setEnabled(false);
                    cb_func_deps.setEnabled(true);
                break;
            case "Editar":
                    btn_func_salvar.setEnabled(true);
                    btn_func_cancelar.setEnabled(true);
                    c_func_mat.setEnabled(true);
                    c_func_nome.setEnabled(true);  
                    btn_func_novo.setEnabled(true);
                    btn_func_editar.setEnabled(false);
                    btn_func_excluir.setEnabled(false);
                    cb_func_deps.setEnabled(true);
                break;
            case "Excluir":
                    btn_func_salvar.setEnabled(false);
                    btn_func_cancelar.setEnabled(false);
                    c_func_mat.setEnabled(false);
                    c_func_nome.setEnabled(false);  
                    btn_func_novo.setEnabled(true);
                    btn_func_editar.setEnabled(false);
                    btn_func_excluir.setEnabled(false);
                    cb_func_deps.setEnabled(false);               
                break;
            case "Selecao":
                    btn_func_salvar.setEnabled(false);
                    btn_func_cancelar.setEnabled(false);
                    c_func_mat.setEnabled(false);
                    c_func_nome.setEnabled(false);  
                    btn_func_novo.setEnabled(true);
                    btn_func_editar.setEnabled(true);
                    btn_func_excluir.setEnabled(true);
                    cb_func_deps.setEnabled(false);                  
                break;
            
            default: System.out.println("Modo Inválido");
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btn_func_novo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_func_funcs = new javax.swing.JTable();
        btn_func_editar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        c_func_mat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        c_func_nome = new javax.swing.JTextField();
        btn_func_salvar = new javax.swing.JButton();
        btn_func_cancelar = new javax.swing.JButton();
        btn_func_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_func_novo.setText("Novo");
        btn_func_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_novoActionPerformed(evt);
            }
        });

        tbl_func_funcs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Departamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_func_funcs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_func_funcsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_func_funcs);
        if (tbl_func_funcs.getColumnModel().getColumnCount() > 0) {
            tbl_func_funcs.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_func_funcs.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbl_func_funcs.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        btn_func_editar.setText("Editar");
        btn_func_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_editarActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Departamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel3.setText("Matrícula:");

        jLabel4.setText("Nome:");

        btn_func_salvar.setText("Salvar");
        btn_func_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_salvarActionPerformed(evt);
            }
        });

        btn_func_cancelar.setText("Cancelar");
        btn_func_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_func_mat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(btn_func_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                            .addComponent(btn_func_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(c_func_nome, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(c_func_mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_func_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_func_salvar)
                    .addComponent(btn_func_cancelar))
                .addContainerGap())
        );

        btn_func_excluir.setText("Excluir");
        btn_func_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_func_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(btn_func_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btn_func_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_func_novo)
                    .addComponent(btn_func_editar)
                    .addComponent(btn_func_excluir))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Funcionarios", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_func_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_excluirActionPerformed
        int index = tbl_func_funcs.getSelectedRow();
        if(index>=0 && index<ListaFunc.size()){
            ListaFunc.remove(index);
        }

        LoadTableFunc();

        modoFunc="Excluir";
        ManipulaInterfaceFunc();
    }//GEN-LAST:event_btn_func_excluirActionPerformed

    private void btn_func_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_cancelarActionPerformed
        modoFunc="Navegar";
        ManipulaInterfaceFunc();
    }//GEN-LAST:event_btn_func_cancelarActionPerformed

    private void btn_func_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_salvarActionPerformed
        int index = cb_func_deps.getSelectedIndex();
        if(index==0){
            JOptionPane.showMessageDialog(this,"Selecione Dep");
        } else{
            Funcionario F = new Funcionario();
            F.setMatricula(Integer.parseInt(c_func_mat.getText()));
            F.setNome(c_func_nome.getText());
            F.setDep(ListaDep.get(index-1));
            ListaDep.get(index-1).addFunc(F);
            ListaFunc.add(F);

        }
        modoFunc="Navegar";
        LoadTableFunc();
        ManipulaInterfaceFunc();
    }//GEN-LAST:event_btn_func_salvarActionPerformed

    private void btn_func_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_editarActionPerformed
        modoFunc="Editar";
        ManipulaInterfaceFunc();
    }//GEN-LAST:event_btn_func_editarActionPerformed

    private void tbl_func_funcsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_func_funcsMouseClicked
        modoFunc="Selecao";
        ManipulaInterfaceFunc();
    }//GEN-LAST:event_tbl_func_funcsMouseClicked

    private void btn_func_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_novoActionPerformed
        modoFunc="Novo";
        ManipulaInterfaceFunc();

    }//GEN-LAST:event_btn_func_novoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addDepFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addDepFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addDepFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addDepFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDepFunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_func_cancelar;
    private javax.swing.JButton btn_func_editar;
    private javax.swing.JButton btn_func_excluir;
    private javax.swing.JButton btn_func_novo;
    private javax.swing.JButton btn_func_salvar;
    private javax.swing.JTextField c_func_mat;
    private javax.swing.JTextField c_func_nome;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_func_funcs;
    // End of variables declaration//GEN-END:variables
}
