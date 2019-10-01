package teste;
import java.io.File;
import java.io.FileReader;

import javax.swing.*;

public class TesteJanela {
	
	public void exibeAlerta() {
		JOptionPane.showMessageDialog(null, "Mensagem alerta de teste");
	}
	
	public void escolheArquivo() {
		JFileChooser escolhedorDeArquivos = new JFileChooser();
		
		int recebiArquivo = escolhedorDeArquivos.showOpenDialog(null);
		
		if(recebiArquivo == JFileChooser.APPROVE_OPTION) {
			File arquivoEscolhido = escolhedorDeArquivos.getSelectedFile();
			JOptionPane.showMessageDialog(null, "Um arquivo foi selecionado \nPossui o nome: "+ arquivoEscolhido.getName());
		}else {
			JOptionPane.showMessageDialog(null, "Nenhum arquivo valido foi selecionado");
		}
	}
	
	public void criandoBotao() {
		//nao funciona sozinho deve ter pelo menos um JPanel
		JButton botao = new JButton("Teste Boatão");
		JButton btSair = new JButton("Sair");
		
		JPanel painel = new JPanel();
		
		painel.add(botao);
		painel.add(btSair);
		
		JFrame janela = new JFrame();
		
		janela.add(painel);
		//janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.pack();//organiza os componentes do frame
		
		janela.setVisible(true);
		
		
		
		
		
	}
}
