import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExemploJFrame {

	public static void main(String[] args) {

		// Criando o JFrame
		JFrame frame = new JFrame("Exemplo JFrame com JButton e JLabel");
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null); // Layout nulo para posicionamento absoluto

		// Criando o JLabel
		JLabel label = new JLabel("Clique no botão abaixo:");
		label.setBounds(140, 50, 200, 30); // Definindo a posição e tamanho do label
		// Definindo a fonte do JLabel (nome da fonte, estilo, tamanho)
		label.setFont(new Font("Arial", Font.BOLD, 14));

		// Criando o botão
		JButton botao = new JButton("Clique aqui!!");
		botao.setBounds(150, 80, 120, 40); // Definindo a posição e o tamanho do botão
		// Definindo a fonte do JButton (nome da fonte, estilo, tamanho)
		botao.setFont(new Font("Verdana", Font.PLAIN, 14));

		// Criando JpopupMenu (Menu flutuante)
		JPopupMenu popupMenu = new JPopupMenu();

		// Criando itens do menu
		JMenuItem item1 = new JMenuItem("Opção 1");
		JMenuItem item2 = new JMenuItem("Opção 2");
		JMenuItem item3 = new JMenuItem("Opção 3");

		// Adicionando ação no botão
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				System.out.println("O botão foi clicado");
			}
		});

		item1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				System.out.println("Opção 1 selecionada!");
			}
		});

		item2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				System.out.println("Opção 2 selecionada!");
			}
		});

		item3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				System.out.println("Opção 3 selecionada!");
			}
		});

		// Adicionando itens ao popupMenu
		popupMenu.add(item1);
		popupMenu.add(item2);
		popupMenu.add(item3);

		label.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					popupMenu.show(e.getComponent(), e.getX(), e.getY());
				}
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					popupMenu.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});

		// Adicionando o label e o botão ao JFrame
		frame.add(label);
		frame.add(botao);

		// Tornando a janela visível
		frame.setVisible(true);
	}
}
