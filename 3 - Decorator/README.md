## 1 - Coffee

### Contexto:

Temos uma cafeteria que serve diferentes tipos de café, além disso pode ser adicionado itens a mais.
Criar uma classe para representar cada combinação se torna desgastante, torna-se exponencial a medida que adicionamos mais itens. Portanto, o padrão Decorator se adequa a este problema.
O principal desafio é calcular o preço baseado nos cafés e itens adicionais incluídos.

### Aplicação do Padrão:

Definimos a abstração das bebidas:
**Beverage**: Representa as bebidas, logo é um classe abstrata.
**CondimentDecorator**: Representa os itens/funcões adicionais que as bebidas terão. Assim, esta classe herda _Beverage_ para ser compatível a ela;

Definimos as classes:
**Expresso**: Um classe concreta que herda* Beverage*, portanto é uma bebida real.
**Mocha**: Uma classe que herda* CondimentDecoratator*, portanto é um decorador concreto.

Desse modo conseguimos:

2. Criar qualquer tipo de combinação com as classes concretas existentes. Se quisermos adicionar um item a mais, não precisamos fazer todas as combinações possíveis.
3. Modificar a função _cost()_ em tempo de execução, fazendo com que todos os itens do café sejam somados.
