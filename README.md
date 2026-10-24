

Missão 1 – Inicialização do sistema. 
Antes que o sistema da IT Solutions possa ser reconstruído, a equipe precisa verificar se o ambiente Java está funcionando corretamente. Seu primeiro desafio será desenvolver o módulo responsável pela identificação inicial do sistema. 
Atividade 
Crie um programa Java chamado: SistemaSuporte.java 
O programa deverá possuir o método main e armazenar as seguintes informações: 
* Nome do sistema. 
* Versão. 
* Nome de um técnico (utilize seu nome). 
* Quantidade de chamados abertos. 
* Status do sistema. 
Utilize variáveis de tipos adequados. Depois, apresente essas informações no console. O programa também deverá verificar a quantidade de chamados. Caso existam chamados abertos, deverá apresentar: 
* "Existem chamados aguardando atendimento". 
* Caso contrário: "Nenhum chamado pendente". 

 

INÍCIO 

public class SistemaSuporte { 

 

//O método MAIN, serve como o ponto de entrada da aplicação. 

 

    public static void main(String[] args)  

        String nomeSistema = "IT Solutions Support Suite"; 

        String versao = "1.0.0"; 

        String nomeTecnico = "Leandro Andrade";  

        int quantidadeChamados = 3;  

        boolean statusSistema = true; 

 

        System.out.println("Nome do Sistema: " + nomeSistema); 

        System.out.println("Versão:          " + versao); 

        System.out.println("Técnico:         " + nomeTecnico); 

        System.out.println("Chamados:        " + quantidadeChamados); 

        System.out.println("Status:          " + (statusSistema ? "Ativo" : "Inativo")); 

        if (quantidadeChamados > 0) { 

            System.out.println("Existem chamados aguardando atendimento"); 

        } else { 

            System.out.println("Nenhum chamado pendente"); 

        } 

} 

 

//Tipagem da dados foi usada para o armazenamento, com valores como String para texto, int para numeros inteiros, e booleanos para lógica dos estados binários (verdadeiro/Falso). Uma estrutura condicional IF e ELSE, (isso irá mudar com o Encapsulamento, qual veremos mais adiante). Sem essas informações a VM java não sabe por onde começar a execução do código, isso nos ajudará como guia para implementação do POO. 

 

 

Missão 2 – Transformando Dados em Objetos. 
O primeiro módulo funcionou, mas os desenvolvedores identificaram um problema. Manter todas as informações dentro do método main tornará o sistema difícil de organizar à medida que novos computadores forem cadastrados. A IT Solutions decidiu começar a utilizar Programação Orientada a Objetos. Sua missão agora será representar um equipamento como um objeto do mundo computacional. 
 
Atividade 
 
Crie uma classe chamada: Computador 
Ela deverá possuir pelo menos os seguintes atributos: 
* String patrimonio. 
* String modelo. 
* String sistemaOperacional. 
* boolean ligado. 
Crie também os métodos: 
* ligar() 
* desligar() 
* exibirInformacoes() 
Depois crie uma classe chamada 'Principal'. No método main, crie dois objetos da classe Computador, atribua valores diferentes aos seus atributos e execute seus métodos. 

 

 

 

 

 

 

 

//Computador.java 

 

public class Computador { 

    String patrimonio; 

    String modelo; 

    String sistemaOperacional; 

    boolean ligado; 

  

   public void ligar() { 

        ligado = true; 

        System.out.println("O computador " + patrimonio + " está ligando..."); 

    } 

  

    public void desligar() { 

        ligado = false; 

        System.out.println("O computador " + patrimonio + " está desligando..."); 

    } 

  

    public void exibirInformacoes()  

        System.out.println("Patrimônio: " + patrimonio); 

        System.out.println("Modelo: " + modelo); 

        System.out.println("S.O.: " + sistemaOperacional); 

        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado")); 

    } 

} 

  

 

 

//Principal.java 

public class Principal { 

    public static void main(String[] args) { 

 

        Computador comp1 = new Computador(); 

        comp1.patrimonio = "2026-001"; 

        comp1.modelo = "Dell Latitude"; 

        comp1.sistemaOperacional = "Windows 11 "; 

  

 

        Computador comp2 = new Computador(); 

        comp2.patrimonio = "2026-02"; 

        comp2.modelo = "ASUS"; 

        comp2.sistemaOperacional = "Windows 11"; 

  

 

        comp1.exibirInformacoes(); 

        comp1.ligar(); 

        comp1.exibirInformacoes(); 

  

        System.out.println(); 

  

        comp2.exibirInformacoes(); 

        comp2.ligar(); 

        comp2.desligar(); 

    } 

} 

 

Antes de entrarmos no Encapsulamento de fato, deveremos aplicar o conceito de Programação Orientada a Objetos (POO) 

//O conceito de ABSTRAÇÃO é aplicado a COMPUTADOR, estabelecendo características (ATRIBUTOS) e ações executáveis (MÉTODOS). 

 

Computador é a classe. Na classe Principal, quando escrevemos NEW Computador(), estamos alocando espaço na memória para criar objetos reais (comp1 e comp2). Cada um deles possui sua própria cópia independente dos atributos. 

 

  

 

 

 

 

Missão 3 – Protegendo os dados da IT Solutions. 
Durante os testes do sistema, um desenvolvedor alterou diretamente informações importantes de um equipamento. Por exemplo, foi possível modificar livremente o número de patrimônio de um computador. Isso representa um problema para a integridade dos dados. A equipe decidiu aplicar encapsulamento e criar relacionamentos entre as classes. 
 
Atividade 
 
Modifique a classe Computador. Seus atributos deverão agora utilizar o modificador 'private'. Crie os métodos get e set necessários para acessar e modificar os dados. 
 
Agora crie uma nova classe chamada: Tecnico 
 
Ela deverá possuir: 
* private String nome. 
* private String especialidade. 
 
Depois crie uma classe: Chamado 
 
Ela deverá possuir: 
* private int numero. 
* private String descricao. 
* private String status. 
* private Computador computador. 
* private Tecnico tecnico. 
 
A classe Chamado deverá, portanto, relacionar um chamado de suporte com: um computador e um técnico. 
 
No método main, crie: 
* Um objeto Computador. 
* Um objeto Tecnico. 
* Um objeto Chamado. 
Relacione os objetos. Exemplo conceitual: 
   chamado.setComputador(computador); 
   chamado.setTecnico(tecnico); 
Depois apresente as informações completas do chamado. 
  

 

// Arquivo: Computador.java 

public class Computador { 

    private String patrimonio; 

    private String modelo; 

    private String sistemaOperacional; 

    private boolean ligado; 

  

    // Métodos Get e Set para controle de acesso 

    public String getPatrimonio() { return patrimonio; } 

    public void setPatrimonio(String patrimonio) { this.patrimonio = patrimonio; } 

  

    public String getModelo() { return modelo; } 

    public void setModelo(String modelo) { this.modelo = modelo; } 

  

    public String getSistemaOperacional() { return sistemaOperacional; } 

    public void setSistemaOperacional(String sistemaOperacional) { this.sistemaOperacional = sistemaOperacional; } 

  

    public boolean isLigado() { return ligado; } 

    public void setLigado(boolean ligado) { this.ligado = ligado; } 

} 

  

// Arquivo: Tecnico.java 

public class Tecnico { 

    private String nome; 

    private String especialidade; 

  

    public String getNome() {  

return nome;  

    } 

    public void setNome(String nome) {  

this.nome = nome;  

   } 

    public String getEspecialidade() {  

return especialidade;  

   } 

    public void setEspecialidade(String especialidade) {  

this.especialidade = especialidade;  

   } 

} 

  

// Arquivo: Chamado.java 

public class Chamado { 

    private int numero; 

    private String descricao; 

    private String status; 

     

    // Relacionamento de Associação entre as classes 

    private Computador computador; 

    private Tecnico tecnico; 

  

    public void exibirInformacoesCompletas() { 

       

        System.out.println("Número: " + numero); 

        System.out.println("Descrição: " + descricao); 

        System.out.println("Status: " + status); 

        System.out.println("Patrimônio do Computador: " + computador.getPatrimonio()); 

        System.out.println("Técnico Alocado: " + tecnico.getNome()); 

    } 

  

    // Getters e Setters 

    public int getNumero() { 

 return numero;  

    } 

    public void setNumero(int numero) {  

this.numero = numero;  

    } 

  

    public String getDescricao() { 

 return descricao;  

    } 

    public void setDescricao(String descricao) {  

this.descricao = descricao;  

    } 

    public String getStatus() { 

 return status; 

 } 

    public void setStatus(String status) {  

this.status = status; 

    } 

  

    public Computador getComputador() {  

return computador; 

    } 

    public void setComputador(Computador computador) {  

this.computador = computador;  

    } 

  

    public Tecnico getTecnico() {  

return tecnico;  

    } 

    public void setTecnico(Tecnico tecnico) { 

 this.tecnico = tecnico;  

    } 

} 

  

Aqui criamos os modificadores de acesso (Private e Public) 

O encapsulamento é focado em blindar o estado interno de um objeto. O modificador private garante que nenhuma outra classe externa possa ler ou alterar o atributo diretamente. O acesso passa a ser mediado por métodos públicos (public), que funcionam como uma camada de validação e proteção dos dados. 

 O this é uma referência que o Java utiliza para apontar para o próprio objeto que está executando o método naquele instante. 

 Assim evitamos ambiguidade no programa. No trecho this.patrimonio = patrimonio;, enquanto o patrimonio (sem o prefixo) é o valor que veio de fora. 

 

 

A classe CHAMADO não guarda apenas textos repetidos sobre o computador, mas sim uma referência direta para toda a estrutura e comportamento do objeto Computador criado na memória. Essa interação é chamada de ASSOCIAÇÃO, onde uma classe "tem um" objeto de outra classe como atributo). 

Quando um objeto está associado a outro, podemos acessar as informações do objeto interno invocando seus métodos através da referência guardada. O objeto Chamado delega ao objeto Computador a responsabilidade de dizer qual é o seu próprio patrimônio, mantendo a integridade do sistema. 

 

 

// Arquivo: Principal.java 

public class Principal { 

    public static void main(String[] args) { 

        Computador computador = new Computador(); 

        computador.setPatrimonio("IT-2026-995"); 

        computador.setModelo("ThinkPad T14"); 

  

        Tecnico tecnico = new Tecnico(); 

        tecnico.setNome("Carlos Eduardo"); 

  

        Chamado chamado = new Chamado(); 

        chamado.setNumero(1001); 

        chamado.setDescricao("Falha de conexão com a rede."); 

        chamado.setStatus("ABERTO"); 

  

        // Relacionando os objetos criados 

        chamado.setComputador(computador); 

        chamado.setTecnico(tecnico); 

  

        // Apresentação das informações completas 

        chamado.exibirInformacoesCompletas(); 

    } 

} 

Missão 4 – Criando Uma Equipe Especializada 
O sistema está crescendo. Agora a IT Solutions possui diferentes tipos de funcionários responsáveis pelo suporte: técnicos de hardware e técnicos de software. Embora todos sejam técnicos, cada profissional executa o atendimento de maneira diferente. Duplicar todo o código em várias classes não seria uma boa solução. A equipe decidiu utilizar herança, interfaces e polimorfismo. 
 
Atividade 
 
Transforme Tecnico em uma classe base. Crie duas subclasses: TecnicoHardware e TecnicoSoftware. As duas deverão herdar de Tecnico. 
 
Agora crie uma interface chamada: Atendimento 
* Ela deverá possuir: void realizarAtendimento(). 
* As classes TecnicoHardware e TecnicoSoftware deverão implementar essa interface. Contudo, cada uma deverá apresentar um comportamento diferente. 
* Na classe Principal, demonstre o polimorfismo utilizando uma referência da classe pai e execute os métodos dos objetos. 

 

 

// Arquivo: Atendimento.java (Interface) 

public interface Atendimento { 

    void realizarAtendimento(); 

} 

  

// Arquivo: Tecnico.java (Classe Base) 

public class Tecnico { 

    private String nome; 

  

    public String getNome() {  

return nome;  

    } 

    public void setNome(String nome) { 

 this.nome = nome;  

    } 

 

} 

  

// Arquivo: TecnicoHardware.java (Subclasse) 

public class TecnicoHardware extends Tecnico implements Atendimento { 

    @Override 

    public void realizarAtendimento() { 

        System.out.println("Atendimento do técnico em Hardware, feito por: " + getNome()); 

        System.out.println("Ação: Substituição de componentes físicos e testes de circuito."); 

    } 

} 

  

// Arquivo: TecnicoSoftware.java (Subclasse) 

public class TecnicoSoftware extends Tecnico implements Atendimento { 

    @Override 

    public void realizarAtendimento() { 

        System.out.println(" Atendimento do técnico em Software, feito por: " + getNome()); 

        System.out.println(" Ação: Depuração de código, atualização de segurança."); 

    } 

} 

  

// Arquivo: Principal.java 

public class Principal { 

    public static void main(String[] args) { 

        TecnicoHardware tecnicoHardware = new TecnicoHardware(); 

        tecnicoHardware.setNome("Tecnico1"); 

  

        TecnicoSoftware tecnicoSoftware = new TecnicoSoftware(); 

        tecnicoSoftware.setNome("Tecnico2"); 

  

 

 

        // Polimorfismo utilizando referências da classe interface pai 

        Atendimento atendente1 = tecnicoHardware; 

        Atendimento atendente2 = tecnicoSoftware; 

  

        atendente1.realizarAtendimento(); 

         

        System.out.println(); 

         

        atendente2.realizarAtendimento(); 

    } 

} 

 

 Herança (extends) 

É o pilar que permite que uma classe (subclasse) adquira os atributos e métodos de outra classe (superclasse). Isso promove o reuso de código e estabelece uma relação do tipo "é um". 

Quando declaramos public class TecnicoHardware extends Tecnico, poupamos o trabalho de reescrever as variáveis. O técnico de hardware automaticamente é um técnico e herda toda a estrutura interna definida em Tecnico. 

Interfaces (implements) 

Uma interface funciona como um contrato ou um protocolo padrão. Ela dita o que uma classe deve fazer, mas deixa para a classe decidir como fazer. Java permite que uma classe implemente múltiplas interfaces. 

A interface Atendimento obriga qualquer classe que a assine a fornecer o método realizarAtendimento(). Isso garante que, independentemente do tipo de técnico criado no futuro, todos saberão iniciar um atendimento. 

Polimorfismo 

É a capacidade de um objeto ser referenciado de várias formas. Em termos práticos, permite que usemos uma referência genérica (como a classe interface) para disparar métodos em objetos específicos, e o Java decidirá qual comportamento exato invocar. 

Anotação @Override 

Avisa ao compilador que o programador está intencionalmente substituindo (sobrescrevendo) o comportamento de um método herdado ou de uma interface. 

Usamos @Override nas subclasses para reescrever a lógica padrão de adaptando-a à realidade de cada especialidade. 

 

 

Missão 5 – Protocolo de Segurança do Sistema. 
O sistema da IT Solutions já está quase pronto. Entretanto, durante os testes finais, foram identificadas situações capazes de interromper sua execução. Um usuário, por exemplo, pode digitar um valor inválido ao informar o número de um chamado. Além disso, a empresa precisa controlar automaticamente quantos chamados foram cadastrados. Sua missão final será tornar o sistema mais robusto e seguro. 
 
Atividade 
 
Na classe Chamado, crie um atributo estático: private static int totalChamados = 0; 
 
Sempre que um novo objeto Chamado for criado, esse contador deverá aumentar. Crie também um método estático para totalChamados. Depois, permita que o usuário informe pelo teclado o número de um chamado. Utilize Scanner e implemente tratamento de exceções utilizando try e catch. Crie pelo menos três chamados no programa e apresente ao final o total de chamados cadastrados. 

 

// Arquivo: Chamado.java 

public class Chamado { 

    private static int totalChamados = 0; 

  

    private int numero; 

    private String descricao; 

 

    public Chamado() { 

        totalChamados++; 

    } 

    public static int getTotalChamados() { 

        return totalChamados; 

    } 

  

    public int getNumero() { 

 return numero;  

    } 

    public void setNumero(int numero) {  

this.numero = numero;  

    } 

  

    public String getDescricao() {  

return descricao;  

    } 

    public void setDescricao(String descricao) {  

this.descricao = descricao;  

   } 

} 

 

 

 

 

 

 

 

 

 

 

 

 

 

// Arquivo: Principal.java 

import java.util.InputMismatchException; 

import java.util.Scanner; 

 public class Principal { 

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

         

        for (int i = 1; i <= 3; i++) { 

            boolean entradaValida = false; 

             

            while (!entradaValida) { 

                try { 

                    Chamado chamado = new Chamado(); 

                    System.out.print("Informe o número do chamado " + i + ": "); 

                    int num = scanner.nextInt(); 

                    scanner.nextLine();  

                     

                    System.out.print("Informe a descrição do chamado " + i + ": "); 

                    String desc = scanner.nextLine(); 

                     

                    chamado.setNumero(num); 

                    chamado.setDescricao(desc); 

                    System.out.println(" Chamado registrado.\n"); 

                    entradaValida = true; 

              } catch (InputMismatchException e) { 

                    System.out.println(" Entrada Inválida: Digite apenas números inteiros.\n"); 

                    scanner.nextLine();  

                } 

            } 

        } 

 

        System.out.println("Total de chamados cadastrados: " + Chamado.getTotalChamados()); 

        scanner.close(); 

    } 

} 

Atributos e Métodos Estáticos (static) 

A palavra-chave static indica que o membro pertence à Classe em si, e não às suas instâncias (objetos). Enquanto cada chamado tem o seu próprio número e sua própria descrição, a variável totalChamados é única e compartilhada na memória global daquela classe. Métodos estáticos só podem acessar diretamente variáveis que também sejam estáticas. 

 Tratamento de Exceções (try e catch) 

Exceções são eventos anômalos que quebram o fluxo normal do programa, geralmente levando ao travamento (crash). O bloco try delimita o código que pode falhar, e o bloco catch captura a exceção específica disparada e define um plano de contingência amigável para o usuário. 

Se o usuário digitasse "vinte" quando o sistema esperava o número 20, o Java dispararia uma InputMismatchException. Sem o try-catch, o sistema fecharia abruptamente com uma tela de erro vermelha. Com a captura do erro, exibimos uma mensagem amigável explicativa e reiniciamos a tentativa através do laço while. 

 Ciclo de Vida do Objeto e Construtores 

O método construtor possui o mesmo nome da classe e não define tipo de retorno. Ele determina o comportamento padrão obrigatório que o Java deve executar na exata fração de segundo em que um objeto é instanciado na memória. 
