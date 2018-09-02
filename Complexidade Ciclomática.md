# Complexidade Ciclomática

Complexidade ciclomática do campo da engenharia de Software e serve para medir a complexidade de um módulo como, por exemplo, um método.

Essa medida é definida a partir da contagem do número de fluxos que esse módulo contém.

Para se calcular, pode se usar a notação de um grafo de fluxo, um fluxograma ou uma análise estática do código (com automatização por software).

Usando um grafo de fluxo ou um fluxograma, existem três fórmulas para se calcular a complexidade ciclomática:

 1. **V(G) = R**  – onde ==R== é o número de regiões do grafo de fluxo. 
 2. **V(G) = E – N + 2**  – onde ==E== é o número de arestas (setas) e ==N== é o número de nós do grafo G.
 3. **V(G) = P + 1**  – onde ==P== é o número de nós-predicados contidos no grafo G (só funciona se os nós-predicado tiverem no máximo duas arestas saindo.)

**_Ps:_**  _Nós-predicado_ são àqueles que podem desviar o fluxo da execução: _if_, _while_, _switch_ etc.
