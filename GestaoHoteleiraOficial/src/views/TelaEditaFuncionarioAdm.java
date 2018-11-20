package views;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import pessoa.Administrador;
import pessoa.Papel;
import pessoa.Pessoa;
import pessoa.Recepcionista;



    public class TelaEditaFuncionarioAdm extends javax.swing.JInternalFrame {
        
//    ArrayList<Funcionario> ArrayListFuncionario  = new ArrayList<>();
        
//Atualizando de acordo com o exemplo do professor    
        ArrayList<Papel> listaPapel = new ArrayList<>(); 
     
   public TelaEditaFuncionarioAdm(ArrayList<Papel> listaPapel) {
//        this.ArrayListFuncionario  = funcionarios;
  
        this.listaPapel = listaPapel; 
        
        initComponents();
    }
    
       public void limparLinhas() {

        DefaultTableModel jTable = (DefaultTableModel) jTable1.getModel();

        while (jTable .getRowCount() > 0) {
            jTable .setRowCount(0);
        } 
    }
       
       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setClosable(true);
        setTitle("Editar Funcionários (ADM)");

        jScrollPane3.setBorder(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Funcionários Registrados"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cargo", "Data de Nascimento", "Sexo", "RG", "CPF", "Telefone", "E-mail", "País", "Uf", "Cidade", "Bairro", "Cep", "Complemento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        //

        //header center alignment
        /*
        TableCellRenderer centerRendererHeader = jTable1.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) centerRendererHeader;
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //Columns center alignment
        DefaultTableCellRenderer centerRendererColumn = new DefaultTableCellRenderer();
        centerRendererColumn.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.setDefaultRenderer(String.class, centerRendererColumn);
        */

        //
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
            jTable1.getColumnModel().getColumn(10).setResizable(false);
            jTable1.getColumnModel().getColumn(11).setResizable(false);
            jTable1.getColumnModel().getColumn(12).setResizable(false);
            jTable1.getColumnModel().getColumn(13).setResizable(false);
            jTable1.getColumnModel().getColumn(13).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jPanel1);

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        //E AGORA ??!! COMO EU CRIO A TABELA
        mostrar();
        DefaultTableModel jTable = (DefaultTableModel) jTable1.getModel();
            
        for (Iterator<Papel> iterator = listaPapel.iterator(); iterator.hasNext();) {
            Papel papel = iterator.next();
                
                Object[] dados = {
                papel.getPessoa().getNome(),    
                papel.getTipo(),
                papel.getPessoa().getData_nasc(), 
                papel.getPessoa().getSexo(),
                papel.getPessoa().getRg(),        
                papel.getPessoa().getCpf(),
                papel.getPessoa().getTelefone(),  
                papel.getPessoa().getEmail(),
                papel.getPessoa().getPais(),     
                papel.getPessoa().getUf(),  
                papel.getPessoa().getCidade(),    
                papel.getPessoa().getBairro(),
                papel.getPessoa().getCep(), 
                papel.getPessoa().getComplemento()};
                jTable.addRow(dados);
            }
       
                
    }//GEN-LAST:event_btnRefreshActionPerformed
    
    void mostrar(){
    
      
        Administrador adm =  new Administrador();
        adm.setTipo("Administrador");  
        listaPapel.add(adm);
        
        Recepcionista recep = new Recepcionista();
        recep.setTipo("Recepicionista");
        listaPapel.add(adm);
        
        for (Iterator<Papel> iterator = listaPapel.iterator(); iterator.hasNext();) {
            Papel papel = iterator.next();
        
            if(papel.getTipo().equals("Administrador")){
               adm = (Administrador) papel;
               
                adm.getPessoa().getNome();    
                adm.getTipo();
                adm.getPessoa().getData_nasc(); 
                adm.getPessoa().getSexo();
                adm.getPessoa().getRg();        
                adm.getPessoa().getCpf();
                adm.getPessoa().getTelefone();  
                adm.getPessoa().getEmail();
                adm.getPessoa().getPais();       
                adm.getPessoa().getUf();  
                adm.getPessoa().getCidade();    
                adm.getPessoa().getBairro();
                adm.getPessoa().getCep(); 
                adm.getPessoa().getComplemento();
            }else if(papel.getTipo().equals("Recepicionista")){
                recep = (Recepcionista) papel;
                
                recep.getPessoa().getNome();
                recep.getTipo();
                recep.getPessoa().getData_nasc(); 
                recep.getPessoa().getSexo();
                recep.getPessoa().getRg();        
                recep.getPessoa().getCpf();
                recep.getPessoa().getTelefone();  
                recep.getPessoa().getEmail();
                recep.getPessoa().getPais();       
                recep.getPessoa().getUf();  
                recep.getPessoa().getCidade();    
                recep.getPessoa().getBairro();
                recep.getPessoa().getCep(); 
                recep.getPessoa().getComplemento();
            }  
        }
    }
/* 
    void mostrar(){
        
        DefaultTableModel jTable = (DefaultTableModel) jTable1.getModel();

        for (Papel papel  : listaPapel) {
           
            for (Iterator<Papel> iterator = papel.getPessoa().getListaPapel().iterator(); iterator.hasNext();) {
                    Papel papel1 = iterator.next();
                    
                    Object[] dados = {papel.getPessoa().getNome(), papel.getTipo(),papel.getPessoa().getData_nasc(), papel.getPessoa().getSexo(),
                    papel.getPessoa().getRg(), papel.getPessoa().getCpf(), papel.getPessoa().getTelefone(), papel.getPessoa().getEmail(),
                    papel.getPessoa().getPais(), papel.getPessoa().getUf(), papel.getPessoa().getCidade(), papel.getPessoa().getBairro(),
                    papel.getPessoa().getCep(), papel.getPessoa().getComplemento()};
                    jTable.addRow(dados);
            }
        }
    }
*/       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


}
