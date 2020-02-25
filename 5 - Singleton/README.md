## 1 - Chocolates

### Contexto:

Temos uma fábrica de chocolate que utiliza caldeiras para preparar chocolates. A caldeira funciona com o preenchimento de chocolate e leite, após isso entra em embulição e por fim a dranagem.

### Aplicação do Padrão:

O método construtor de _ChocolateBoiler_ se tornou privado. Para conseguirmos esse objeto temos que chamar uma função estática _getInstance()_, a qual nos retornará uma caldeira de chocolate.

Desse modo conseguimos obter apenas uma instância de um objeto, mesmo chamando esta função várias e várias vezes.

**E o que tem de mais nisso ?**
Conseguimos controlar precisamente a caldeira.
Imagine que alguém chame a função de ferver (_boil_) e em seguida uma pessoa chame a função de ferver novamente.
Como ambas apontam para a mesma instância a segunda chamada não provocará nenhuma operação na caldeira.
