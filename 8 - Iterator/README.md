## 1 - Restaurant

### Contexto:

Um restaurante possui dois menus, entretanto eles estão utilizando estruturas de dados distintas para armazenar os itens do cardápio. Temos que encontrar um jeito de implementar uma classe que consiga interagir com os cardápios de forma única, sem se importar em como aquele menu foi implementado.

### Aplicação do Padrão:

Para isso, o padrão _Iterator_ foi introduzido com o objetivo de criar uma interface comum de comunicação. Não vamos precisar alterar a lógica de como os itens estão armazenados, apenas criar iteradores que vão nos dizer como percorrer os elementos de forma única.

Portanto, foi criada a interface _Iterator_ que estabelece um modelo para acessar os itens do menu. As classes que implementam o _Iterator_ serão as responsáveis por informar a lógica de acesso às estruturas de dados. Portanto, quando quisermos percorrer a estrutura, apenas iremos utilizar as funções _hasNext()_ e _next()_

Após ter criado as classes que implementam o _Iterator_, foi implementado novas funções nas classes de Menu que retornam o iterador relacionado a ela. Por exemplo, na classe _DinnerMenu_ existe a função _createIterator()_ para retornar o iterador _DinnerMenuIterator()_, o qual consegue iteragir com aquela classe.
