# Shell Sort
***
O Shell Sort funciona dividindo a lista em sublistas menores e aplicando o Insertion Sort em cada uma delas.
As sublistas são criadas usando um intervalo (ou "gap") que diminui gradualmente até se tornar 1.
Quando o gap é 1, o algoritmo se comporta como um Insertion Sort tradicional,
mas como a lista já está parcialmente ordenada, o Insertion Sort funciona de forma mais eficiente.
Passo a Passo do Exemplo:

Vamos usar a lista [64, 25, 12, 22, 11, 34, 90, 8] como exemplo:

 ### Gap inicial: 4 (tamanho da lista dividido por 2).

        Sublistas:

            [64, 11]

            [25, 34]

            [12, 90]

            [22, 8]

        Aplica o Insertion Sort em cada sublista:

            [11, 64]

            [25, 34]

            [12, 90]

            [8, 22]

        Lista após o primeiro passo: [11, 25, 12, 8, 64, 34, 90, 22].

    Gap reduzido: 2.

        Sublistas:

            [11, 12, 64, 90]

            [25, 8, 34, 22]

        Aplica o Insertion Sort em cada sublista:

            [11, 12, 64, 90]

            [8, 22, 25, 34]

        Lista após o segundo passo: [11, 8, 12, 22, 64, 25, 90, 34].

    Gap reduzido: 1.

        Aplica o Insertion Sort na lista completa:

            Lista final ordenada: [8, 11, 12, 22, 25, 34, 64, 90].

Complexidade do Shell Sort:

    Complexidade de tempo:

        Depende da sequência de gaps utilizada.

        Para a sequência de Knuth, a complexidade é O(n^(3/2)).

        No pior caso, pode ser O(n²), mas na prática é mais eficiente que Insertion Sort.

    Complexidade de espaço:

        O(1), pois o algoritmo é in-place (não usa espaço adicional significativo).

Vantagens:

    Mais eficiente que Insertion Sort para listas maiores.

    Fácil de implementar.

    Não requer memória adicional.

Desvantagens:

    A complexidade de tempo ainda pode ser alta dependendo da sequência de gaps.

    Não é estável (pode alterar a ordem de elementos iguais).

O Shell Sort é uma boa escolha para listas de tamanho moderado ou quando se deseja um algoritmo simples mas mais eficiente que o Insertion Sort. Para listas muito grandes, algoritmos como Merge Sort ou Quick Sort são mais recomendados. 🚀
