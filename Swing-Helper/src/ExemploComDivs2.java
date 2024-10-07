import javax.swing.*;
import java.awt.*;

public class ExemploComDivs2 {

    public static void main(String[] args) {

        // Criando o JFrame
        JFrame frame = new JFrame("Exemplo com JPanel (divs)");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Layout nulo para posicionamento absoluto

        // Criando o primeiro JPanel (Div1)
        JPanel div1 = new JPanel();
        div1.setBackground(Color.LIGHT_GRAY);
        div1.setBounds(50, 50, 200, 100);
        div1.add(new JLabel("Div 1"));

        // Criando o primeiro JPanel (Div2)
        JPanel div2 = new JPanel();
        div2.setBackground(Color.CYAN);
        div2.setBounds(50, 180, 150, 80);
        div2.add(new JLabel("Div 2"));

        // Criando o primeiro JPanel (Div3)
        JPanel div3 = new JPanel();
        div3.setBackground(Color.PINK);
        div3.setBounds(300, 100, 150, 150);
        div3.add(new JLabel("Div 2"));

        // Adicionando os painéis (divs) ao JFrame
        frame.add(div1);
        frame.add(div2);
        frame.add(div3);

        // Tornando a janela visível
        frame.setVisible(true);
    }

}
