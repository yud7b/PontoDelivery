package com.mycompany.pontodelivery;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class relatorio {

    public static void mostrarRelatorio(Connection conexao) {
        try {
            // 1. Verifica se a conexão está válida
            if (conexao == null || conexao.isClosed()) {
                throw new Exception("Conexão com o banco inválida");
            }

            // 2. Cria um relatório mínimo em memória
            String jrxml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                    + "<jasperReport xmlns=\"http://jasperreports.sourceforge.net/jasperreports\" name=\"RelatorioSimples\">"
                    + "  <title>"
                    + "    <band height=\"50\">"
                    + "      <staticText>"
                    + "        <reportElement x=\"0\" y=\"0\" width=\"500\" height=\"50\"/>"
                    + "        <text><![CDATA[Relatório Funcionando!]]></text>"
                    + "      </staticText>"
                    + "    </band>"
                    + "  </title>"
                    + "</jasperReport>";

            // 3. Compila e exibe
            JasperReport report = JasperCompileManager.compileReport(
                    new java.io.ByteArrayInputStream(jrxml.getBytes())
            );

            JasperPrint print = JasperFillManager.fillReport(report, new HashMap<>(), conexao);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Falha ao gerar relatório: " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}
