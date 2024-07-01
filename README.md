# banco-digital_DIO
Este projeto implementa um banco digital utilizando conceitos de Programação Orientada a Objetos (POO) em Java. O objetivo é reforçar o conhecimento em POO através de uma aplicação prática que envolve criação de contas bancárias, depósitos, saques, transferências, e outras funcionalidades adicionais.

## Funcionalidades Implementadas
- Criação de contas correntes e poupança.
- Depósito em contas.
- Saque de contas.
- Transferência entre contas.
- Empréstimo para contas.
- Interface gráfica simples para interação com o banco.
- Testes unitários utilizando JUnit.

## Estrutura do Projeto

src/ ├── main/ 
     │ ├── java/ 
     │ │ ├── Banco.java 
     │ │ ├── Cliente.java 
     │ │ ├── Conta.java 
     │ │ ├── ContaCorrente.java 
     │ │ ├── ContaPoupanca.java 
     │ │ ├── IConta.java 
     │ │ ├── Main.java 
     │ │ └── BancoGUI.java 
     └── test/ 
       ├── java/ 
       │ └── ContaTest.java
     
## Configuração do Ambiente

### Requisitos
- JDK 8 ou superior
- IntelliJ IDEA (ou outra IDE de sua preferência)
- Maven (opcional, mas recomendado)

### Configuração do IntelliJ IDEA para PT-BR
1. Vá para `File` > `Settings` > `Plugins`.
2. Pesquise por "Localization" e instale o plugin de idioma PT-BR.
3. Reinicie o IntelliJ IDEA.

### Dependências
Se você estiver utilizando Maven, adicione a dependência do JUnit no seu arquivo `pom.xml`:
```Java
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
</dependency>
```
## Executando o Projeto

### Passo 1: Clonar o Repositório

Clone o repositório do projeto do GitHub:

```
bash
Copiar código
git clone https://github.com/MarceloRodrigues1853/banco-digital_DIO.git
```

### Passo 2: Importar o Projeto no IntelliJ IDEA

1. Abra o IntelliJ IDEA.
2. Selecione `File` > `Open` e escolha a pasta do projeto clonado.
3. Aguarde a IDE configurar o projeto.

### Passo 3: Executar a Aplicação

1. Navegue até a classe `Main.java`.
2. Clique com o botão direito e selecione `Run 'Main.main()'`.

### Passo 4: Utilizar a Interface Gráfica

1. Navegue até a classe `BancoGUI.java`.
2. Clique com o botão direito e selecione `Run 'BancoGUI.main()'`.

## Executando Testes

### Passo 1: Criar a Classe de Teste

Os testes estão localizados na pasta `src/test/java`.

### Passo 2: Executar os Testes

1. Clique com o botão direito na classe `ContaTest.java`.
2. Selecione `Run 'ContaTest'`.

## Exemplo de Testes Unitários

Aqui estão alguns exemplos de testes unitários adicionados:

```java
javaCopiar códigoimport static org.junit.Assert.assertEquals;

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
```

## 
## Melhorias Futuras

- Implementação de taxas e tarifas.
- Melhorar a interface gráfica.
- Adicionar mais testes unitários para cobrir todos os casos de uso.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para fazer um fork do projeto e enviar pull requests.
