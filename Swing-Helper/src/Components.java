import javax.swing.*;
import java.awt.*;

public class Components {

    public static void main(String[] args) {

        // Criando o JFrame
        JFrame frame = new JFrame("Exemplo de JProgressBar");
        frame.setSize(500, 300);
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
        //frame.add(progressBar, BorderLayout.CENTER); // Colocando a barra de progresso no centro

        // Painel esquerdo com a barra de progresso
        JPanel painelEsquerdo = new JPanel();
        painelEsquerdo.setLayout(new BorderLayout());
        painelEsquerdo.add(progressBar, BorderLayout.CENTER);
        painelEsquerdo.add(new JLabel("Painel Esquerdo"), BorderLayout.NORTH);

        // Painel direito com uma área de texto
        JPanel painelDireito = new JPanel();
        painelDireito.setLayout(new BorderLayout());
        JTextArea areaTexto = new JTextArea("Aqui você pode adicionar texto.");
        painelDireito.add(new JScrollPane(areaTexto), BorderLayout.CENTER);
        painelDireito.add(new JLabel("Painel Direito"), BorderLayout.NORTH);

        // Criando o JSplitPane para dividir os dois painéis
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, painelEsquerdo, painelDireito);
        splitPane.setDividerLocation(250); // Posição inicial do divisor (em pixels)

        // Adicionando o JSplitPane ao JFrame
        frame.add(splitPane, BorderLayout.CENTER);

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
