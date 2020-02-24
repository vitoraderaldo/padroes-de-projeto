## 1 - Pizza

### Contexto:

Temos uma pizzaria que serve diferentes tipos de pizzas, porém todas elas seguem o padrão de preparar, assar, cortar e embalar. Para evitar a duplicação de código temos que isolar o código de criação de pizzas para uma classe específica. Ou seja, separei o que pode vir a mudar no futuro. Para isso, foi criada uma classe abstrata para que seja possível termos diversas regras de criação de pizzas.

### Aplicação do Padrão:

A construção dos objetos ficou sendo responsabilidade das classes que herdam _PizzaStore_.

Com essas classes é possível obter um objeto pizza, passando apenas um parametro que identifique o tipo da pizza.

_SimplePizzaStore_ é um exemplo de classe que contém a lógica de criação dos objetos pizzas, através da herança da classe _PizzaStore_.

Se quisermmos adicionar novos tipos de pizzas no cardápio que atendam apenas alguns lugares, é só criar outra derivação de _PizzaStore_, que é caso de _LondrinaPizzaStore_.

Ou seja, os objetos _SimplePizzaStore_ e _LondrinaPizzaStore_ são fabricas de objetos.
