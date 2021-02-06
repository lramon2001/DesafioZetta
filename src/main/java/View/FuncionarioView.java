
package View;

/**
 *
 * @author Lucas Ramon
 */
import Controller.FuncionarioControl;
import TableModel.FuncionarioTM;
import javax.swing.JOptionPane;

        
public class FuncionarioView extends javax.swing.JFrame {
    FuncionarioTM Modelo;
    
    public void CarregaTabela(){
        
        Modelo = new FuncionarioTM(FuncionarioControl.getFuncionarios());
        
        Tabela_funcionarios.setModel(Modelo);
        
        Tabela_funcionarios.getColumnModel().getColumn(0).setPreferredWidth(50);
        Tabela_funcionarios.getColumnModel().getColumn(1).setPreferredWidth(50);
        Tabela_funcionarios.getColumnModel().getColumn(2).setPreferredWidth(50);
        Tabela_funcionarios.getColumnModel().getColumn(3).setPreferredWidth(50);
        Tabela_funcionarios.getColumnModel().getColumn(4).setPreferredWidth(50);              
    }
    
    public void Botoes(boolean A,boolean B,boolean C,boolean D,boolean E){
        Botao_funcionarios_novo.setEnabled(A);
        Botao_funcionarios_editar.setEnabled(B);
        Botao_funcionarios_excluir.setEnabled(C);
        Botao_funcionarios_salvar.setEnabled(D);
        Botao_funcionarios_cancelar.setEnabled(E);
        
    }
    
    public FuncionarioView() {
        initComponents();
        CarregaTabela();
        Botoes(true,false,false,false,false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Selo_funcionarios = new javax.swing.JLabel();
        Painel_funcionarios_registro = new javax.swing.JPanel();
        Botao_funcionarios_salvar = new javax.swing.JButton();
        Botao_funcionarios_cancelar = new javax.swing.JButton();
        Selo_funcionarios_Nome = new javax.swing.JLabel();
        Selo_funcionarios_Cpf = new javax.swing.JLabel();
        Selo_funcionarios_DataNasc = new javax.swing.JLabel();
        Selo_funcionarios_Sexo = new javax.swing.JLabel();
        Selo_funcionarios_Cargo = new javax.swing.JLabel();
        Campo_funcionarios_Nome = new javax.swing.JTextField();
        Campo_funcionarios_Cpf = new javax.swing.JTextField();
        Campo_funcionarios_DataNasc = new javax.swing.JTextField();
        Campo_funcionarios_Sexo = new javax.swing.JTextField();
        Campo_funcionarios_Cargo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_funcionarios = new javax.swing.JTable();
        Botao_funcionarios_novo = new javax.swing.JButton();
        Botao_funcionarios_excluir = new javax.swing.JButton();
        Botao_funcionarios_editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Selo_funcionarios.setText("****QUADRO DE FUNCIONÁRIOS ZETTA****");

        Painel_funcionarios_registro.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO"));

        Botao_funcionarios_salvar.setText("Salvar");
        Botao_funcionarios_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_funcionarios_salvarActionPerformed(evt);
            }
        });

        Botao_funcionarios_cancelar.setText("Cancelar");
        Botao_funcionarios_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_funcionarios_cancelarActionPerformed(evt);
            }
        });

        Selo_funcionarios_Nome.setText("Nome:");

        Selo_funcionarios_Cpf.setText("CPF:");

        Selo_funcionarios_DataNasc.setText("Data Nascimento:");

        Selo_funcionarios_Sexo.setText("Sexo:");

        Selo_funcionarios_Cargo.setText("Cargo:");

        javax.swing.GroupLayout Painel_funcionarios_registroLayout = new javax.swing.GroupLayout(Painel_funcionarios_registro);
        Painel_funcionarios_registro.setLayout(Painel_funcionarios_registroLayout);
        Painel_funcionarios_registroLayout.setHorizontalGroup(
            Painel_funcionarios_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_funcionarios_registroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_funcionarios_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_funcionarios_registroLayout.createSequentialGroup()
                        .addComponent(Selo_funcionarios_Cargo)
                        .addGap(162, 162, 162)
                        .addComponent(Botao_funcionarios_salvar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_funcionarios_cancelar))
                    .addGroup(Painel_funcionarios_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(Painel_funcionarios_registroLayout.createSequentialGroup()
                            .addComponent(Selo_funcionarios_Nome)
                            .addGap(18, 18, 18)
                            .addComponent(Campo_funcionarios_Nome))
                        .addGroup(Painel_funcionarios_registroLayout.createSequentialGroup()
                            .addComponent(Selo_funcionarios_Cpf)
                            .addGap(26, 26, 26)
                            .addComponent(Campo_funcionarios_Cpf))
                        .addGroup(Painel_funcionarios_registroLayout.createSequentialGroup()
                            .addComponent(Selo_funcionarios_DataNasc)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Campo_funcionarios_DataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Painel_funcionarios_registroLayout.createSequentialGroup()
                            .addComponent(Selo_funcionarios_Sexo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(Painel_funcionarios_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Campo_funcionarios_Cargo)
                                .addComponent(Campo_funcionarios_Sexo)))))
                .addContainerGap())
        );
        Painel_funcionarios_registroLayout.setVerticalGroup(
            Painel_funcionarios_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_funcionarios_registroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_funcionarios_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Selo_funcionarios_Nome)
                    .addComponent(Campo_funcionarios_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_funcionarios_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Selo_funcionarios_Cpf)
                    .addComponent(Campo_funcionarios_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Painel_funcionarios_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Selo_funcionarios_DataNasc)
                    .addComponent(Campo_funcionarios_DataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_funcionarios_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Selo_funcionarios_Sexo)
                    .addComponent(Campo_funcionarios_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_funcionarios_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Selo_funcionarios_Cargo)
                    .addComponent(Campo_funcionarios_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(Painel_funcionarios_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_funcionarios_salvar)
                    .addComponent(Botao_funcionarios_cancelar)))
        );

        Tabela_funcionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Data de Nascimento", "Sexo", "Cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabela_funcionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_funcionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela_funcionarios);

        Botao_funcionarios_novo.setText("Novo");
        Botao_funcionarios_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_funcionarios_novoActionPerformed(evt);
            }
        });

        Botao_funcionarios_excluir.setText("Excluir");
        Botao_funcionarios_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_funcionarios_excluirActionPerformed(evt);
            }
        });

        Botao_funcionarios_editar.setText("Editar");
        Botao_funcionarios_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_funcionarios_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Selo_funcionarios)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Botao_funcionarios_novo)
                        .addGap(81, 81, 81)
                        .addComponent(Botao_funcionarios_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Botao_funcionarios_excluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Painel_funcionarios_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Selo_funcionarios)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_funcionarios_novo)
                    .addComponent(Botao_funcionarios_excluir)
                    .addComponent(Botao_funcionarios_editar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Painel_funcionarios_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tabela_funcionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_funcionariosMouseClicked
        Botoes(true,true,true,false,false);
        int index = Tabela_funcionarios.getSelectedRow();
         if(index>=0 && index<Modelo.getRowCount()){
             String passg[]=Modelo.getFuncionario(index);
            Campo_funcionarios_Nome.setText(passg[0]);
            Campo_funcionarios_Cpf.setText(passg[1]);
            Campo_funcionarios_DataNasc.setText(passg[2]);
            Campo_funcionarios_Sexo.setText(passg[3]);
            Campo_funcionarios_Cargo.setText(passg[4]);
         }
        
    }//GEN-LAST:event_Tabela_funcionariosMouseClicked

    private void Botao_funcionarios_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_funcionarios_novoActionPerformed
        Botoes(false,false,false,true,true);
    }//GEN-LAST:event_Botao_funcionarios_novoActionPerformed

    private void Botao_funcionarios_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_funcionarios_editarActionPerformed
        Botoes(false,false,false,true,true);
    }//GEN-LAST:event_Botao_funcionarios_editarActionPerformed

    private void Botao_funcionarios_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_funcionarios_excluirActionPerformed
        Botoes(true,false,false,false,false);
    }//GEN-LAST:event_Botao_funcionarios_excluirActionPerformed

    private void Botao_funcionarios_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_funcionarios_cancelarActionPerformed
        Botoes(true,false,false,false,false);
    }//GEN-LAST:event_Botao_funcionarios_cancelarActionPerformed

    private void Botao_funcionarios_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_funcionarios_salvarActionPerformed
        if(FuncionarioControl.SalvarFuncionario(Campo_funcionarios_Nome.getText(),Campo_funcionarios_Cpf.getText(),Campo_funcionarios_DataNasc.getText(),Campo_funcionarios_Sexo.getText(),Campo_funcionarios_Cargo.getText() )){
            this.CarregaTabela();
              JOptionPane.showMessageDialog(this, "Funcionario registrado");
        }else
            JOptionPane.showMessageDialog(this, "Erro");
       
        Botoes(true,false,false,false,false);
    }//GEN-LAST:event_Botao_funcionarios_salvarActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_funcionarios_cancelar;
    private javax.swing.JButton Botao_funcionarios_editar;
    private javax.swing.JButton Botao_funcionarios_excluir;
    private javax.swing.JButton Botao_funcionarios_novo;
    private javax.swing.JButton Botao_funcionarios_salvar;
    private javax.swing.JTextField Campo_funcionarios_Cargo;
    private javax.swing.JTextField Campo_funcionarios_Cpf;
    private javax.swing.JTextField Campo_funcionarios_DataNasc;
    private javax.swing.JTextField Campo_funcionarios_Nome;
    private javax.swing.JTextField Campo_funcionarios_Sexo;
    private javax.swing.JPanel Painel_funcionarios_registro;
    private javax.swing.JLabel Selo_funcionarios;
    private javax.swing.JLabel Selo_funcionarios_Cargo;
    private javax.swing.JLabel Selo_funcionarios_Cpf;
    private javax.swing.JLabel Selo_funcionarios_DataNasc;
    private javax.swing.JLabel Selo_funcionarios_Nome;
    private javax.swing.JLabel Selo_funcionarios_Sexo;
    private javax.swing.JTable Tabela_funcionarios;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
