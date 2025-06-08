package com.mycompany.pontodelivery;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;

public class CadastroProdutoView extends javax.swing.JFrame {

    private ConexaoBD conexaoBD;
    private Connection conexao;
    private AtendimentoView atendimentoView; // Referência para a tela de atendimento

    public CadastroProdutoView(AtendimentoView atendimentoView) {
        initComponents();
        this.atendimentoView = atendimentoView; // Armazena a referência
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        conexaoBD = new ConexaoBD();
        try {
            conexao = conexaoBD.abrirConexao(); // Abre a conexão
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco: " + e.getMessage(), "Erro de Conexão", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblSubtituloCadastro = new javax.swing.JLabel();
        lblNomeProduto = new javax.swing.JLabel();
        lblPrecoProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        txtEstoqueProduto = new javax.swing.JTextField();
        btnCancelarCadastro = new javax.swing.JButton();
        btnSalvarProduto = new javax.swing.JButton();
        lblTituloLogin1 = new javax.swing.JLabel();
        txtPrecoProduto = new javax.swing.JTextField();
        lblEstoqueProduto = new javax.swing.JLabel();
        btnAbrirRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSubtituloCadastro.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblSubtituloCadastro.setText("CADASTRO DE PRODUTO");

        lblNomeProduto.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblNomeProduto.setText("NOME:");

        lblPrecoProduto.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblPrecoProduto.setText("PREÇO: R$");

        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        txtEstoqueProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstoqueProdutoActionPerformed(evt);
            }
        });

        btnCancelarCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelarCadastro.setText("CANCELAR ");
        btnCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadastroActionPerformed(evt);
            }
        });

        btnSalvarProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvarProduto.setText("SALVAR ");
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });

        lblTituloLogin1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblTituloLogin1.setText("SR. MANOEL PIZZARIA");

        txtPrecoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoProdutoActionPerformed(evt);
            }
        });

        lblEstoqueProduto.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblEstoqueProduto.setText("ESTOQUE:");

        btnAbrirRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAbrirRelatorio.setText("ABRIR RELATÓRIO");
        btnAbrirRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(lblSubtituloCadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(lblTituloLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 92, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPrecoProduto)
                                .addComponent(lblEstoqueProduto, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(lblNomeProduto)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalvarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstoqueProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNomeProduto)
                            .addComponent(txtPrecoProduto))
                        .addGap(134, 134, 134))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCancelarCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrirRelatorio)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblTituloLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSubtituloCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProduto)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecoProduto)
                    .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstoqueProduto))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarProduto)
                    .addComponent(btnCancelarCadastro)
                    .addComponent(btnAbrirRelatorio))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void txtEstoqueProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstoqueProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstoqueProdutoActionPerformed

    private void btnCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja cancelar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            this.dispose();
        }

    }//GEN-LAST:event_btnCancelarCadastroActionPerformed

    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
        try {
            if (conexao == null || conexao.isClosed()) {
                JOptionPane.showMessageDialog(this, "Conexão com o banco não está disponível");
                return;
            }
            String nome = txtNomeProduto.getText();
            String precoStr = txtPrecoProduto.getText();
            String estoqueStr = txtEstoqueProduto.getText();
            String categoria = JOptionPane.showInputDialog(this, "Informe a categoria do produto:");
            if (nome.isEmpty() || precoStr.isEmpty() || estoqueStr.isEmpty() || categoria == null || categoria.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
                return;
            }
            try {
                double preco = Double.parseDouble(precoStr);
                int estoque = Integer.parseInt(estoqueStr);
                String sql = "INSERT INTO produtos (nome, preco, estoque, categoria) VALUES (?, ?, ?, ?)";
                var stmt = conexao.prepareStatement(sql);
                stmt.setString(1, nome);
                stmt.setDouble(2, preco);
                stmt.setInt(3, estoque);
                stmt.setString(4, categoria);
                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Produto salvo com sucesso!");
                    txtNomeProduto.setText("");
                    txtPrecoProduto.setText("");
                    txtEstoqueProduto.setText("");

                    // Atualiza a tabela de produtos na tela de atendimento
                    if (atendimentoView != null) {
                        atendimentoView.atualizarTabelaProdutos();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao salvar o produto");
                }
                stmt.close();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Preço e estoque devem ser números válidos!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar no banco: " + e.getMessage());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);


    }    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    private void txtPrecoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoProdutoActionPerformed

    private void btnAbrirRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirRelatorioActionPerformed
        if (conexao != null) {
            RelatórioFinanceiroView relatorio = new RelatórioFinanceiroView();
            relatorio.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Conexão com o banco não está disponível", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAbrirRelatorioActionPerformed

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new CadastroProdutoView(new AtendimentoView()).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirRelatorio;
    private javax.swing.JButton btnCancelarCadastro;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEstoqueProduto;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblPrecoProduto;
    private javax.swing.JLabel lblSubtituloCadastro;
    private javax.swing.JLabel lblTituloLogin1;
    private javax.swing.JTextField txtEstoqueProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPrecoProduto;
    // End of variables declaration//GEN-END:variables
}
