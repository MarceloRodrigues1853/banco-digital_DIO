import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ContaTest {

    private Cliente cliente;
    private Conta contaCorrente;
    private Conta contaPoupanca;

    @Before
    public void setUp() {
        cliente = new Cliente();
        cliente.setNome("Teste Cliente");
        contaCorrente = new ContaCorrente(cliente);
        contaPoupanca = new ContaPoupanca(cliente);
    }

    @Test
    public void testDepositar() {
        contaCorrente.depositar(200);
        assertEquals(200, contaCorrente.getSaldo(), 0);
    }

    @Test
    public void testSacar() {
        contaCorrente.depositar(200);
        contaCorrente.sacar(50);
        assertEquals(150, contaCorrente.getSaldo(), 0);
    }

    @Test
    public void testTransferir() {
        contaCorrente.depositar(200);
        contaCorrente.transferir(100, contaPoupanca);
        assertEquals(100, contaCorrente.getSaldo(), 0);
        assertEquals(100, contaPoupanca.getSaldo(), 0);
    }

    @Test
    public void testEmprestar() {
        contaCorrente.emprestar(300);
        assertEquals(300, contaCorrente.getSaldo(), 0);
    }
}
