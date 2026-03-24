# Lista de 20 Exercícios – Java POOI

## Regras obrigatórias para todos os exercícios

1. Cada exercício deve ter **no mínimo 5 classes**.
2. **Todas as classes devem possuir construtores**.
3. Os atributos devem ser, preferencialmente, `private`.
4. Todas as classes devem possuir **getters e setters**.
5. Deve haver uso de:
    - criação de objetos
    - métodos
    - herança
    - sobrescrita com `@Override`
    - polimorfismo
6. Criar uma classe `Main` para testes.

---

---

## Exercício 1 – Sistema de Animais

Crie um sistema com as classes:

- `Animal`
- `Cachorro`
- `Gato`
- `Vaca`
- `Cavalo`

Requisitos:

- A classe `Animal` deve possuir no mínimo 3 atributos privados.
- Todas as classes devem ter construtores.
- Crie o método `emitirSom()`.
- Cada classe filha deve sobrescrever esse método.
- Na classe `Main`, crie objetos e teste o polimorfismo usando uma referência do tipo `Animal`.

---

## Exercício 2 – Sistema de Veículos

Crie um sistema com as classes:

- `Veiculo`
- `Carro`
- `Moto`
- `Bicicleta`
- `Onibus`

Requisitos:

- A classe `Veiculo` deve ter atributos como marca, modelo e ano.
- Todas as classes devem possuir construtores.
- Crie o método `mover()`.
- Cada veículo deve implementar esse método de forma diferente.
- Teste o polimorfismo no `Main`.

---

## Exercício 3 – Funcionários de Empresa

Crie um sistema com as classes:

- `Funcionario`
- `Gerente`
- `Vendedor`
- `Programador`
- `Designer`

Requisitos:

- Todos devem possuir atributos privados.
- Todas as classes devem ter construtores.
- Crie o método `trabalhar()`.
- Cada cargo deve ter uma implementação diferente.
- Crie também um método `calcularBonus()` e sobrescreva nas subclasses.

---

## Exercício 4 – Sistema Bancário

Crie um sistema com as classes:

- `ContaBancaria`
- `ContaCorrente`
- `ContaPoupanca`
- `ContaSalario`
- `Cliente`

Requisitos:

- Cada conta deve possuir construtor.
- Utilize atributos privados como número, saldo e titular.
- Crie métodos `depositar()`, `sacar()` e `consultarSaldo()`.
- Cada tipo de conta deve ter comportamento diferente para saque ou rendimento.
- Use polimorfismo no teste.

---

## Exercício 5 – Sistema Escolar

Crie um sistema com as classes:

- `Pessoa`
- `Aluno`
- `Professor`
- `Coordenador`
- `Turma`

Requisitos:

- Todas as classes com construtores.
- Atributos privados e encapsulados.
- Crie métodos como `apresentar()`, `calcularMedia()` ou `trabalhar()`.
- Professor e coordenador podem sobrescrever um método comum da classe `Pessoa`.

---

## Exercício 6 – Sistema de Produtos

Crie um sistema com as classes:

- `Produto`
- `Livro`
- `Eletronico`
- `Roupa`
- `Alimento`

Requisitos:

- Todas as classes devem possuir construtores.
- Crie atributos privados como nome, preço e quantidade.
- Crie o método `calcularPrecoFinal()`.
- Cada tipo de produto deve aplicar uma regra própria.

---

## Exercício 7 – Sistema de Formas Geométricas

Crie um sistema com as classes:

- `Forma`
- `Quadrado`
- `Retangulo`
- `Circulo`
- `Triangulo`

Requisitos:

- Todas as classes devem possuir construtores.
- Crie atributos privados.
- Crie o método `calcularArea()`.
- Cada forma deve sobrescrever esse método.
- Teste os objetos em um vetor ou `ArrayList`.

---

## Exercício 8 – Sistema de Pagamentos

Crie um sistema com as classes:

- `Pagamento`
- `CartaoCredito`
- `Pix`
- `Boleto`
- `Dinheiro`

Requisitos:

- Todas as classes com construtores.
- Atributos privados como valor, data e descrição.
- Crie o método `processarPagamento()`.
- Cada classe deve exibir uma forma diferente de pagamento.

---

## Exercício 9 – Personagens de Jogo

Crie um sistema com as classes:

- `Personagem`
- `Guerreiro`
- `Mago`
- `Arqueiro`
- `Paladino`

Requisitos:

- Todas as classes com construtores.
- Crie atributos privados como nome, vida e nível.
- Crie o método `atacar()`.
- Cada personagem deve atacar de forma diferente.
- Crie também o método `defender()`.

---

## Exercício 10 – Sistema de Transporte

Crie um sistema com as classes:

- `Transporte`
- `Taxi`
- `Uber`
- `Onibus`
- `Metro`

Requisitos:

- Todas as classes devem possuir construtores.
- Crie atributos privados como capacidade, empresa e tarifaBase.
- Crie o método `calcularTarifa()`.
- Cada transporte deve calcular a tarifa de forma diferente.

---

## Exercício 11 – Sistema de Dispositivos Eletrônicos

Crie um sistema com as classes:

- `Dispositivo`
- `Computador`
- `Smartphone`
- `Tablet`
- `Televisao`

Requisitos:

- Todas as classes com construtores.
- Use atributos privados.
- Crie métodos como `ligar()`, `desligar()` e `executarFuncao()`.
- Cada dispositivo deve responder de forma diferente.

---

## Exercício 12 – Sistema de Profissões

Crie um sistema com as classes:

- `Profissao`
- `Medico`
- `Professor`
- `Advogado`
- `Engenheiro`

Requisitos:

- Todas as classes devem possuir construtores.
- Crie atributos privados como nome, área e salário.
- Crie o método `executarTrabalho()`.
- Cada profissão deve sobrescrever esse método.

---

## Exercício 13 – Sistema de Notificações

Crie um sistema com as classes:

- `Notificacao`
- `Email`
- `SMS`
- `WhatsApp`
- `Push`

Requisitos:

- Todas as classes com construtores.
- Crie atributos privados como destinatário, mensagem e data.
- Crie o método `enviar()`.
- Cada tipo deve enviar de uma forma diferente.

---

## Exercício 14 – Sistema de Mídia

Crie um sistema com as classes:

- `Midia`
- `Musica`
- `Filme`
- `Podcast`
- `Audiolivro`

Requisitos:

- Todas as classes com construtores.
- Atributos privados como título, duração e autor.
- Crie o método `reproduzir()`.
- Cada mídia deve exibir uma mensagem diferente.

---

## Exercício 15 – Sistema de Restaurante

Crie um sistema com as classes:

- `ItemCardapio`
- `Pizza`
- `Hamburguer`
- `Bebida`
- `Sobremesa`

Requisitos:

- Todas as classes com construtores.
- Crie atributos privados como nome, preço e descrição.
- Crie o método `preparar()`.
- Cada item deve sobrescrever esse método.
- Crie também `calcularPreco()`.

---

## Exercício 16 – Sistema Hospitalar

Crie um sistema com as classes:

- `Pessoa`
- `Paciente`
- `Medico`
- `Enfermeiro`
- `Consulta`

Requisitos:

- Todas as classes devem possuir construtores.
- Atributos privados com getters e setters.
- Crie métodos como `realizarAtendimento()`, `exibirDados()` e `agendarConsulta()`.
- Utilize polimorfismo entre os profissionais.

---

## Exercício 17 – Sistema de Biblioteca

Crie um sistema com as classes:

- `ItemBiblioteca`
- `Livro`
- `Revista`
- `Jornal`
- `DVD`

Requisitos:

- Todas as classes com construtores.
- Crie atributos privados como título, código e disponibilidade.
- Crie o método `emprestar()`.
- Cada item pode ter regra específica.
- Crie também `devolver()`.

---

## Exercício 18 – Sistema de Imóveis

Crie um sistema com as classes:

- `Imovel`
- `Casa`
- `Apartamento`
- `Terreno`
- `SalaComercial`

Requisitos:

- Todas as classes com construtores.
- Atributos privados como endereço, preço e metragem.
- Crie o método `calcularImposto()`.
- Cada imóvel deve ter regra própria.

---

## Exercício 19 – Sistema de Cursos

Crie um sistema com as classes:

- `Curso`
- `CursoPresencial`
- `CursoOnline`
- `CursoTecnico`
- `CursoLivre`

Requisitos:

- Todas as classes devem possuir construtores.
- Atributos privados como nome, cargaHoraria e valor.
- Crie o método `exibirInformacoes()`.
- Crie também `calcularMensalidade()` com comportamentos diferentes.

---

## Exercício 20 – Sistema de Zoológico

Crie um sistema com as classes:

- `Animal`
- `Leao`
- `Macaco`
- `Elefante`
- `Papagaio`

Requisitos:

- Todas as classes com construtores.
- Atributos privados como nome, idade e peso.
- Crie métodos `emitirSom()`, `alimentar()` e `movimentar()`.
- Cada animal deve apresentar comportamento próprio.
- Teste o polimorfismo com um vetor de `Animal`.

---

# Desafio geral para todos os exercícios

Em todos os exercícios, além do que foi pedido, o aluno deve obrigatoriamente:

- criar os atributos com `private`
- gerar getters e setters
- criar construtor vazio e construtor com parâmetros
- instanciar objetos na `Main`
- demonstrar herança
- demonstrar sobrescrita de método
- demonstrar polimorfismo
- organizar as classes em arquivos separados

---

# Sugestão de estrutura para os alunos

## Estrutura mínima esperada

- 1 classe base
- 4 classes filhas
- 1 classe `Main`
- mínimo de 3 atributos por classe
- todos os métodos devidamente implementados
- todos os construtores criados
