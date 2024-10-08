import javax.swing.*;
import java.awt.*;

public class Components {

    public static void main(String[] args) {

        // Criando o JFrame
        JFrame frame = new JFrame("Exemplo de JProgressBar");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Criando o JToolBar
        JToolBar toolBar = new JToolBar();
        JButton btnNovo = new JButton("Novo");
        JButton btnSalvar = new JButton("Salvar");
        JButton btnAbrir = new JButton("Abrir");
        toolBar.add(btnNovo);  // Adiciona o botão "Novo" na barra de ferramentas
        toolBar.add(btnSalvar); // Adiciona o botão "Salvar" na barra de ferramentas
        toolBar.add(btnAbrir);  // Adiciona o botão "Abrir" na barra de ferramentas

        // Adicionando a JToolBar ao topo do JFrame
        frame.add(toolBar, BorderLayout.NORTH);

        // Criando o JProgressBar
        JProgressBar progressBar = new JProgressBar(0, 100); // Valor mínimo 0, máximo 100
        progressBar.setValue(0); // Valor inicial do progresso
        progressBar.setStringPainted(true); // Exibe o percentual no progresso

        // Adicionando o JProgressBar ao JFrame
        frame.add(progressBar, BorderLayout.CENTER); // Colocando a barra de progresso no centro

        // Exibindo o JFrame
        frame.setVisible(true);

        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(50); // Atraso de 50ms para simular o progresso
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            progressBar.setValue(i); // Atualizando o valor da barra de progresso
        }
    }
}
