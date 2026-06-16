# Sistema Bancário Simples ☕🏦

Este é um projeto de simulação de sistema bancário desenvolvido em **Java**, como parte dos desafios de fixação de Orientação a Objetos (POO) do **Bootcamp Santander 2026** em parceria com a **DIO (Digital Innovation One)**.

O objetivo principal foi aplicar conceitos práticos de encapsulamento, estruturas condicionais de repetição, interatividade via console e regras de negócio simulando cenários reais de uma conta bancária.

---

## 🛠️ Funcionalidades Implementadas

* **Autenticação de Conta:** O sistema exige a validação do número da conta antes de liberar o menu de operações.
* **Menu Interativo:** Construído com estrutura `while(true)` e `switch/case` para navegação contínua.
* **Cálculo Automático de Limite:** No momento da criação da conta, o limite do Cheque Especial é definido com base no saldo inicial:
    * Saldos até R$ 500,00 recebem R$ 50,00 de limite fixo.
    * Saldos acima de R$ 500,00 recebem 20% do valor do saldo inicial como limite.
* **Operações Bancárias Basicas:**
    * Consulta de Saldo Total (Saldo Real + Cheque Especial).
    * Depósito em conta com verificação automática de pendências.
    * Saque e Pagamento de Boletos.
* **Cobrança de Taxa Automatizada:** Aplicação de uma taxa de 20% sobre o valor utilizado do cheque especial, disparada dinamicamente antes de novos depósitos caso o saldo esteja negativo.

---

## 🏗️ Conceitos de POO Aplicados

* **Encapsulamento:** Atributos protegidos por modificadores de acesso `private` e manipulados com segurança via métodos específicos (getters/setters adaptados).
* **Construtores:** Utilizados para inicializar o estado do objeto `pessoa` e definir regras de negócio estáticas logo no nascimento da conta.
* **Imutabilidade:** Uso do modificador `final` para dados que não devem sofrer alterações após a abertura da conta (como nome do titular e número da conta).

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
* Java JDK 17 ou superior instalado.
* IDE de sua preferência (recomendado: IntelliJ IDEA ou VS Code).

### Passo a passo
1. Clone o repositório:
   ```bash
   git clone [https://github.com/Rodrigoyu/exercicioDeFixa-oBanco.git](https://github.com/Rodrigoyu/exercicioDeFixa-oBanco.git)
   
2. Abra o projeto na sua IDE.
3. Execute a classe Main.java.
4. No terminal, utilize o número da conta cadastrado no código (Exemplo padrão: 678) para destravar o menu.

## 📝 Licença
Este projeto é de fins estritamente didáticos e está livre para cópia, estudos e modificações.