package br.ufjf.dcc.poo.controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.ufjf.dcc.poo.model.Cliente;

public class Principal {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		try {
			
			ConexaoMySQL conexaoMySQL = new ConexaoMySQL();
			Connection con = conexaoMySQL.criarConexao();
			
			 Cliente cliente = new Cliente();
			 cliente.setCod_cliente(JOptionPane.showInputDialog(null,"Entre com o codigo")); 
			 cliente.setNome(JOptionPane.showInputDialog(null,"Entre com o nome"));
			 cliente.setEnd_rua(JOptionPane.showInputDialog(null,"Entre com a rua"));
			 cliente.setEnd_numero(Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com o numero")));
			 cliente.setEnd_complemento(JOptionPane.showInputDialog(null,"Entre com o complemento"));
			 
			 String sql = "";
			 sql = "INSERT INTO clientes (cod_cliente, nome, end_rua, end_numero, end_complemento) Values('"
					 +cliente.getCod_cliente() + "', '"
					 +cliente.getNome() + "', '"
					 +cliente.getEnd_rua() + "', "
					 +cliente.getEnd_numero() + ", '"
					 +cliente.getEnd_complemento() + "')";
			 if(conexaoMySQL.operacaoBanco(con, sql) == 0) {
				 JOptionPane.showMessageDialog(null,"Ocorreu um erro", "Erro", 0 ,null);
			 }else {
				 JOptionPane.showMessageDialog(null,"Operacao executada com sucesso", "Sucesso", 0 ,null);
			 }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,"Ocorreu um erro","Erro",0,null);
			e.printStackTrace();
		}finally {
			JOptionPane.showMessageDialog(null,"Fim do programa","Erro",0,null);
		}
	}

}
