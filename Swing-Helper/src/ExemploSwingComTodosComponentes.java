import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ExemploSwingComTodosComponentes {

    public static void main(String[] args) {
        // Criando o JFrame
        JFrame frame = new JFrame("Exemplo com 20 Componentes Swing");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // 1. Criando o JToolBar com botões
        JToolBar toolBar = new JToolBar();
        JButton btnNovo = new JButton("Novo");
        JButton btnSalvar = new JButton("Salvar");
        JButton btnAbrir = new JButton("Abrir");
        toolBar.add(btnNovo);
        toolBar.add(btnSalvar);
        toolBar.add(btnAbrir);
        frame.add(toolBar, BorderLayout.NORTH);

        // 2. Criando o JPanel esquerdo com JProgressBar e JLabel
        JPanel painelEsquerdo = new JPanel(new BorderLayout());
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(50);
        progressBar.setStringPainted(true);
        JLabel labelEsquerdo = new JLabel("Painel Esquerdo");
        painelEsquerdo.add(labelEsquerdo, BorderLayout.NORTH);
        painelEsquerdo.add(progressBar, BorderLayout.CENTER);

        // 3. Criando o JPanel direito com JTextArea
        JPanel painelDireito = new JPanel(new BorderLayout());
        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        painelDireito.add(new JLabel("Painel Direito"), BorderLayout.NORTH);
        painelDireito.add(scrollPane, BorderLayout.CENTER);

        // 4. Criando o JSplitPane para dividir os dois painéis
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, painelEsquerdo, painelDireito);
        splitPane.setDividerLocation(300);
        frame.add(splitPane, BorderLayout.CENTER);

        // 5. Criando componentes adicionais no painel inferior
        JPanel painelInferior = new JPanel(new GridLayout(5, 4));

        // JTextField e JPasswordField
        painelInferior.add(new JLabel("Texto:"));
        JTextField textField = new JTextField();
        painelInferior.add(textField);

        painelInferior.add(new JLabel("Senha:"));
        JPasswordField passwordField = new JPasswordField();
        painelInferior.add(passwordField);

        // JCheckBox e JRadioButton
        painelInferior.add(new JCheckBox("Opção 1"));
        painelInferior.add(new JCheckBox("Opção 2"));

        ButtonGroup radioGroup = new ButtonGroup();
        JRadioButton radio1 = new JRadioButton("Radio 1");
        JRadioButton radio2 = new JRadioButton("Radio 2");
        radioGroup.add(radio1);
        radioGroup.add(radio2);
        painelInferior.add(radio1);
        painelInferior.add(radio2);

        // JComboBox e JList
        String[] comboItems = {"Item 1", "Item 2", "Item 3"};
        JComboBox<String> comboBox = new JComboBox<>(comboItems);
        painelInferior.add(comboBox);

        String[] listItems = {"Item A", "Item B", "Item C"};
        JList<String> list = new JList<>(listItems);
        painelInferior.add(new JScrollPane(list));

        // JTable
        String[] columnNames = {"Coluna 1", "Coluna 2"};
        Object[][] data = {
                {"Dado 1", "Dado 2"},
                {"Dado 3", "Dado 4"}
        };
        JTable table = new JTable(new DefaultTableModel(data, columnNames));
        painelInferior.add(new JScrollPane(table));

        // JSlider
        JSlider slider = new JSlider(0, 100, 50);
        painelInferior.add(slider);

        // JButton
        JButton btnOK = new JButton("OK");
        painelInferior.add(btnOK);

        // JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", new JPanel());
        tabbedPane.addTab("Tab 2", new JPanel());
        painelInferior.add(tabbedPane);

        // JMenuBar com menus
        JMenuBar menuBar = new JMenuBar();
        JMenu menuArquivo = new JMenu("Arquivo");
        JMenuItem menuAbrir = new JMenuItem("Abrir");
        JMenuItem menuSalvar = new JMenuItem("Salvar");
        menuArquivo.add(menuAbrir);
        menuArquivo.add(menuSalvar);
        menuBar.add(menuArquivo);
        frame.setJMenuBar(menuBar);

        // JSpinner
        painelInferior.add(new JLabel("Spinner:"));
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(1, 0, 10, 1));
        painelInferior.add(spinner);

        // JTree
        JTree tree = new JTree();
        painelInferior.add(new JScrollPane(tree));

        // JColorChooser e JFileChooser (normalmente não exibidos diretamente)
        JButton btnEscolherCor = new JButton("Escolher Cor");
        btnEscolherCor.addActionListener((ActionEvent e) -> {
            JColorChooser.showDialog(frame, "Escolha uma cor", Color.WHITE);
        });
        painelInferior.add(btnEscolherCor);

        JButton btnAbrirArquivo = new JButton("Abrir Arquivo");
        btnAbrirArquivo.addActionListener((ActionEvent e) -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(frame);
        });
        painelInferior.add(btnAbrirArquivo);

        // Adicionando o painel inferior ao frame
        frame.add(painelInferior, BorderLayout.SOUTH);

        // Exibindo o JFrame
        frame.setVisible(true);
    }
}
