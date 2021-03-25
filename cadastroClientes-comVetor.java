package Turismo;

import javax.swing.JOptionPane;

public class cadastroClientes {

	public static void main(String[] args) {
		cliente vetor_cliente[] = new cliente[5];
		viagem vetor_viagem[] = new viagem[5];
		for (int i = 0; i <vetor_cliente.length; i++) {
			JOptionPane.showMessageDialog(null, "Informe Seus Dados para a Viagem:", "Cadastro de clientes",
					JOptionPane.INFORMATION_MESSAGE);
			String nome = JOptionPane.showInputDialog(null, "informe seu nome completo:", "Cadastro de clientes",
					JOptionPane.INFORMATION_MESSAGE);
			float cpf = Float.parseFloat(JOptionPane.showInputDialog(null, "informe seu cpf:", "Cadastro de clientes",
					JOptionPane.INFORMATION_MESSAGE));

			int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "informe sua idade:", "Cadastro de clientes",
					JOptionPane.INFORMATION_MESSAGE));

			String endereco = JOptionPane.showInputDialog(null, "informe seu endereço  completo:",
					"Cadastro de clientes", JOptionPane.INFORMATION_MESSAGE);

			int tel = Integer.parseInt(JOptionPane.showInputDialog(null, "informe seu telefone completo:",
					"Cadastro de clientes", JOptionPane.INFORMATION_MESSAGE));
			vetor_cliente[i] = new cliente(nome, cpf, idade, endereco, tel);
			JOptionPane.showMessageDialog(null, vetor_cliente[i].toString());

			JOptionPane.showMessageDialog(null,
					"Escolha um destino para Viajar \nIlhabela \nFernando de Noronha \nUbatuba \nPraia do Rosa \nPraia da Pipa",
					"Cadastro de Destino Escolhido:", JOptionPane.INFORMATION_MESSAGE);
			String destino = JOptionPane.showInputDialog(null, "informe seu destino:", "Cadastro de Destino Escolhido:",
					JOptionPane.INFORMATION_MESSAGE);
			int qtdeDeDias = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos dias deseja ficar",
					"Cadastro de Destino Escolhido", JOptionPane.INFORMATION_MESSAGE));
			vetor_viagem[i] = new viagem(destino,qtdeDeDias);
			vetor_viagem[i].escolhaDestino(destino, qtdeDeDias);
			JOptionPane.showMessageDialog(null, vetor_viagem[i].toString());
		}

		// sem vetor
		/*
		 * JOptionPane.showMessageDialog(null, "Informe Seus Dados para a Viagem:");
		 * 
		 * String nome = JOptionPane.showInputDialog(null,
		 * "informe seu nome completo:");
		 * 
		 * float cpf = Float.parseFloat(JOptionPane.showInputDialog(null,
		 * "informe seu cpf:"));
		 * 
		 * int idade = Integer.parseInt(JOptionPane.showInputDialog(null,
		 * "informe sua idade:"));
		 * 
		 * String endereco = JOptionPane.showInputDialog(null,
		 * "informe seu endereço  completo:");
		 * 
		 * int tel = Integer.parseInt(JOptionPane.showInputDialog(null,
		 * "informe seu telefone completo:")); cliente cliente = new cliente(nome, cpf,
		 * idade, endereco, tel); JOptionPane.showMessageDialog(null, cliente);
		 * 
		 */
	}

}
