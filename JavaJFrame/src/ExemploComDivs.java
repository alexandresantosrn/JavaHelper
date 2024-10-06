import javax.swing.*;
import java.awt.*;

public class ExemploComDivs {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Exemplo com JPanel (divs)");
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLayout(new BorderLayout()); // Definindo o layout principal como Border Layout
		frame.setLayout(null);
		
		// Criando o terceiro JPanel (Div 1)
		JPanel div1 = new JPanel();
		div1.setBackground(Color.LIGHT_GRAY); // Cor de fundo para visualização
		div1.setBounds(50, 50, 200, 100);
		div1.add(new JLabel("Div 1")); // Adicionando label dentro da div 1

		// Criando o terceiro JPanel (Div 2)
		JPanel div2 = new JPanel();
		div2.setBackground(Color.CYAN); // Cor de fundo para visualização
        div2.setBounds(50, 180, 150, 80);
		div2.add(new JLabel("Div 2")); // Adicionando label dentro da div 2

		// Criando o terceiro JPanel (Div 3)
		JPanel div3 = new JPanel();
		div3.setBackground(Color.PINK); // Cor de fundo para visualização
        div3.setBounds(300, 100, 150, 150);
		div3.add(new JLabel("Div 3")); // Adicionando label dentro da div 3

		// Adicionando os painéis (divs) ao JFrame
		//frame.add(div1, BorderLayout.NORTH); // Div 1 no topo
		//frame.add(div2, BorderLayout.CENTER); // Div 2 no centro
		//frame.add(div3, BorderLayout.SOUTH); // Div 3 na parte inferior

        // Adicionando os painéis (divs) ao JFrame
        frame.add(div1);
        frame.add(div2);
        frame.add(div3);

		// Tornando a janela visível
		frame.setVisible(true);
	}
}
