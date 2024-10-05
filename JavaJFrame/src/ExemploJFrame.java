import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJFrame {

	public static void main(String[] args) {

		// Criando o JFrame
		JFrame frame = new JFrame("Exemplo JFrame com JButton e JLabel");
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		// Criando o JLabel
		JLabel label = new JLabel("Clique no botão abaixo:");
		label.setBounds(140, 50, 200, 30); // Definindo a posição e tamanho do label
		// Definindo a fonte do JLabel (nome da fonte, estilo, tamanho)
		label.setFont(new Font("Arial", Font.BOLD, 16));

		// Criando o botão
		JButton botao = new JButton("Clique aqui!!");
		botao.setBounds(150, 80, 120, 40); // Definindo a posição e o tamanho do botão
		// Definindo a fonte do JButton (nome da fonte, estilo, tamanho)
		label.setFont(new Font("Verdana", Font.PLAIN, 14));

		// Adicionando ação no botão
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				System.out.println("O botão foi clicado");
			}
		});

		// Adicionando o label e o botão ao JFrame
		frame.add(label);
		frame.add(botao);

		// Tornando a janela visível
		frame.setVisible(true);
	}
}
