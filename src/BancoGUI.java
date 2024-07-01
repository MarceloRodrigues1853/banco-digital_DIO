import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BancoGUI extends JFrame {

    private JTextField nomeClienteField;
    private JTextArea extratoArea;
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;

    public BancoGUI() {
        setTitle("Banco Digital");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel nomeClienteLabel = new JLabel("Nome do Cliente:");
        nomeClienteField = new JTextField();
        JButton criarContasButton = new JButton("Criar Contas");
        JButton exibirExtratosButton = new JButton("Exibir Extratos");

        panel.add(nomeClienteLabel);
        panel.add(nomeClienteField);
        panel.add(criarContasButton);
        panel.add(exibirExtratosButton);

        add(panel, BorderLayout.NORTH);

        extratoArea = new JTextArea();
        add(new JScrollPane(extratoArea), BorderLayout.CENTER);

        criarContasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarContas();
            }
        });

        exibirExtratosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exibirExtratos();
            }
        });
    }

    private void criarContas() {
        String nomeCliente = nomeClienteField.getText();
        Cliente cliente = new Cliente();
        cliente.setNome(nomeCliente);
        contaCorrente = new ContaCorrente(cliente);
        contaPoupanca = new ContaPoupanca(cliente);
        extratoArea.setText("Contas criadas para " + nomeCliente + "\n");
    }

    private void exibirExtratos() {
        extratoArea.append("\n=== Extrato Conta Corrente ===\n");
        extratoArea.append("Titular: " + contaCorrente.cliente.getNome() + "\n");
        extratoArea.append("Agencia: " + contaCorrente.getAgencia() + "\n");
        extratoArea.append("Numero: " + contaCorrente.getNumero() + "\n");
        extratoArea.append("Saldo: " + contaCorrente.getSaldo() + "\n");

        extratoArea.append("\n=== Extrato Conta Poupança ===\n");
        extratoArea.append("Titular: " + contaPoupanca.cliente.getNome() + "\n");
        extratoArea.append("Agencia: " + contaPoupanca.getAgencia() + "\n");
        extratoArea.append("Numero: " + contaPoupanca.getNumero() + "\n");
        extratoArea.append("Saldo: " + contaPoupanca.getSaldo() + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BancoGUI().setVisible(true);
            }
        });
    }
}
