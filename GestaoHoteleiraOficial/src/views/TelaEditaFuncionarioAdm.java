package views;


import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import pessoa.Administrador;
import pessoa.Papel;
import pessoa.Recepcionista;



    public class TelaEditaFuncionarioAdm extends javax.swing.JInternalFrame {
        
//    ArrayList<Funcionario> ArrayListFuncionario  = new ArrayList<>();
        
//Atualizando de acordo com o exemplo do professor    
        ArrayList<Papel> listaPapel = new ArrayList<>(); 
        Papel papel;
        Administrador adm = new Administrador();
        Recepcionista recep = new Recepcionista();
        
        
        
        
    public TelaEditaFuncionarioAdm(ArrayList<Papel> listaPapel) {
//        this.ArrayListFuncionario  = funcionarios;

//Atualizando de acordo com o exemplo do professor    
        this.listaPapel = listaPapel; 
        initComponents();
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
        TableCellRenderer centerRendererHeader = jTable1.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) centerRendererHeader;
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //Columns center alignment
        DefaultTableCellRenderer centerRendererColumn = new DefaultTableCellRenderer();
        centerRendererColumn.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.setDefaultRenderer(String.class, centerRendererColumn);

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
        //E AGORA ??!! COMO EU CRIO A TABEL
       mostrar();
    }//GEN-LAST:event_btnRefreshActionPerformed


        
    /* 
        for (Iterator<Papel> iterator = listaPapel.iterator(); iterator.hasNext();) {
            Papel papel = iterator.next();
        
            if(papel.getTipo().equals("Administrador")){
                adm = (Administrador) papel;
                adm.getPessoa().getNome();
            }else if(papel.getTipo().equals("Recepicionista")){
                recep = (Recepcionista) papel;
                recep.getPessoa().getCpf();
            } 
        }
        */  
    
    /* OUTRO exemplo professor  (19/11/18)
    public void mostrar(){
        ArrayList<Papel> papeis = new ArrayList();
        
        Administrador a = new Administrador();
        a.setTipo("Administrador");
        papeis.add(a);
        
        Recepcionista r = new Recepcionista();
        r.setTipo("Recepicionista");
        papeis.add(r);
        
        for (Iterator<Papel> iterator = papeis.iterator(); iterator.hasNext();) {
            Papel papel = iterator.next();
        
            if(papel.getTipo().equals("Administrador")){
                a = (Administrador) papel;
                a.getPessoa().getNome();
            }else if(papel.getTipo().equals("Recepicionista")){
                r = (Recepcionista) papel;
                r.getPessoa().getCpf();
            } 
        }
 */      
    
    
 public void mostrar(){  
    if(papel.getTipo().equals("Administrador")){
       papel = (Administrador) papel;
         String matriz[][] = new String[listaPapel.size()][14];
        for(int i=0;i<listaPapel.size();i++){
              
              matriz[i][0]= listaPapel.get(i).getPessoa().getNome();
              matriz[i][1]= listaPapel.get(i).getTipo();
              matriz[i][2]= listaPapel.get(i).getPessoa().getData_nasc();
              matriz[i][3]= listaPapel.get(i).getPessoa().getSexo();
              matriz[i][5]= listaPapel.get(i).getPessoa().getCpf();
              matriz[i][4]= listaPapel.get(i).getPessoa().getRg();
              matriz[i][6]= listaPapel.get(i).getPessoa().getTelefone();
              matriz[i][7]= listaPapel.get(i).getPessoa().getEmail();
              matriz[i][8]= listaPapel.get(i).getPessoa().getPais();
              matriz[i][9]= listaPapel.get(i).getPessoa().getUf();
              matriz[i][10]= listaPapel.get(i).getPessoa().getCidade();
              matriz[i][11]= listaPapel.get(i).getPessoa().getBairro();
              matriz[i][12]= listaPapel.get(i).getPessoa().getCep();
              matriz[i][13]= listaPapel.get(i).getPessoa().getComplemento();
        }
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Nome","Cargo", "Data de Nascimento", "Sexo", "RG", "CPF", "Telefone", 
                "E-mail", "País", "Uf", "Cidade", "Bairro", "Cep", "Complemento"
            }
        )); 
        
    }else if(papel.getTipo().equals("Recepicionista")){
            papel = (Recepcionista) papel;
             String matriz[][] = new String[listaPapel.size()][14];
        for(int i=0;i<listaPapel.size();i++){
              
              matriz[i][0]= listaPapel.get(i).getPessoa().getNome();
              matriz[i][1]= listaPapel.get(i).getTipo();
              matriz[i][2]= listaPapel.get(i).getPessoa().getData_nasc();
              matriz[i][3]= listaPapel.get(i).getPessoa().getSexo();
              matriz[i][5]= listaPapel.get(i).getPessoa().getCpf();
              matriz[i][4]= listaPapel.get(i).getPessoa().getRg();
              matriz[i][6]= listaPapel.get(i).getPessoa().getTelefone();
              matriz[i][7]= listaPapel.get(i).getPessoa().getEmail();
              matriz[i][8]= listaPapel.get(i).getPessoa().getPais();
              matriz[i][9]= listaPapel.get(i).getPessoa().getUf();
              matriz[i][10]= listaPapel.get(i).getPessoa().getCidade();
              matriz[i][11]= listaPapel.get(i).getPessoa().getBairro();
              matriz[i][12]= listaPapel.get(i).getPessoa().getCep();
              matriz[i][13]= listaPapel.get(i).getPessoa().getComplemento();
        }
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Nome","Cargo", "Data de Nascimento", "Sexo", "RG", "CPF", "Telefone", 
                "E-mail", "País", "Uf", "Cidade", "Bairro", "Cep", "Complemento"
            }
        )); 
    } 
     
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


}
