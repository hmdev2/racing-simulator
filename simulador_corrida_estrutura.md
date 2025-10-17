# 🏗️ Visão geral do projeto

Você vai implementar um simulador de corrida entre dois veículos, usando Java.  
A corrida acontece em "rodadas", onde:

- Cada veículo sorteia uma velocidade aleatória (1, 2 ou 3);
- Essa velocidade é acumulada na distância percorrida;
- O programa exibe visualmente o progresso de cada carro na pista;
- A corrida termina quando um dos carros atinge ou ultrapassa a distância final.

---

## 📁 Estrutura de pastas e arquivos

Sugerido para um projeto simples em Java (sem frameworks):

```
corrida-simulador/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── br/com/corrida/
│   │           ├── Main.java                # Ponto de entrada do programa
│   │           ├── model/
│   │           │   ├── Veiculo.java         # Classe representando um veículo
│   │           │   └── Corrida.java         # Classe que controla a lógica da corrida
│   │           ├── view/
│   │           │   └── CorridaView.java     # Responsável por exibir o estado da corrida
│   │           └── util/
│   │               └── Randomizador.java    # Classe utilitária para gerar velocidades aleatórias
│   │
│   └── test/
│       └── br/com/corrida/
│           └── CorridaTest.java             # Testes de unidade
│
├── README.md                               # Explicação do projeto
└── .gitignore                              # (se usar Git)
```

---

## 🧩 Explicação das principais partes

### 1. Veiculo (model)

Representa um carro na corrida.  
**Atributos principais:**

- nome (Carro 1, Carro 2)
- velocidadeAtual
- distanciaPercorrida

**Responsabilidades:**

- Sortear uma nova velocidade
- Atualizar a distância
- Retornar dados sobre o veículo

---

### 2. Corrida (model)

Gerencia o andamento da corrida.  
**Atributos principais:**

- distanciaMaxima
- veiculo1, veiculo2
- terminou (boolean)

**Responsabilidades:**

- Rodar cada rodada da simulação
- Verificar se a corrida terminou
- Determinar o vencedor (ou empate)

---

### 3. CorridaView (view)

Responsável apenas por exibir o estado da corrida no console.  
Mostra visualmente algo como:

```
---------------------------------------------------
   # (Carro 1)
---------------------------------------------------
     # (Carro 2)
---------------------------------------------------
```

E ao final:

```
O carro 1 venceu a corrida!
```

---

### 4. Randomizador (util)

Classe simples que gera a velocidade (1, 2 ou 3).  
Serve para deixar o código mais limpo e testável.

---

### 5. Main

Ponto de entrada do programa:

- Cria os objetos (Corrida, Veiculo, etc.)
- Executa a simulação
- Chama o método da CorridaView para exibir a corrida passo a passo

---

## 👥 Divisão de tarefas (para 4 pessoas)

| Pessoa | Responsabilidade | Complexidade | Entregáveis |
|---------|------------------|---------------|--------------|
| Pessoa 1 | Criar a classe Veiculo | Média | Métodos de velocidade, distância e toString |
| Pessoa 2 | Criar a classe Corrida | Alta | Lógica principal da corrida (loop, verificação de vitória, controle de rodada) |
| Pessoa 3 | Criar a classe CorridaView | Média | Impressão visual, espaçamento, mensagens e resultado final |
| Pessoa 4 | Criar Main + Randomizador + testes | Média | Inicialização, integração das classes, testes básicos e README |

---

## ⚙️ Fluxo geral da execução

1. O `Main` cria dois objetos `Veiculo` e um objeto `Corrida`.
2. O `Main` chama um método tipo `corrida.iniciar()`.
3. Dentro do loop da corrida:
   - Cada `Veiculo` sorteia uma velocidade.
   - Atualiza a distância.
   - A `CorridaView` imprime o estado atual.
4. O loop continua até um carro atingir a distância máxima.
5. Ao final, o vencedor é exibido.

---

## 🧠 Sugestões de boas práticas

- Use constantes para a distância máxima (ex: `private static final int DISTANCIA_MAXIMA = 50;`)
- Mantenha o código modular e testável (cada classe faz apenas o que deve)
- Adicione pequenos delays (`Thread.sleep`) para dar efeito de simulação visual
- Use métodos de utilidade separados para sorteios ou impressão
