import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJFrame {

	public static void main(String[] args) {

		// Criando o JFrame
		JFrame frame = new JFrame("Alo mundo!!");
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		// Criando o botão
		JButton botao = new JButton("Clique aqui!!");
		botao.setBounds(150, 100, 120, 40); // Definindo a posição e o tamanho do botão

		// Adicionando ação no botão
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				System.out.println("O botão foi clicado");
			}
		});

		// Adicionando o botão ao JFrame
		frame.add(botao);

		// Tornando a janela visível
		frame.setVisible(true);
	}
}
