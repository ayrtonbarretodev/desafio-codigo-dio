# Desafio Java Iniciante - Bootcamp Cognizant Developer

###  Desafio 01 - Tempo do Dobby

Desafio
Para dar conta de toda a fabricação dos presentes de Natal, por várias vezes os elfos precisam ficar até tarde trabalhando para que tudo possa ser terminado a tempo.

Para melhor gerenciar seus cronogramas, os elfos estipularam quantos minutos são necessários para fabricar cada presente.

Já está quase no final do expediente, e um dos elfos pediu sua ajuda.

Faltam N minutos para a hora de ir embora, e restam dois presentes para o elfo Dobby fabricar. Ajude-o a descobrir se ele conseguirá fabricar os dois ainda hoje, ou se deve deixar o trabalho para amanhã.

**Entrada** 
- Cada caso de teste inicia com um inteiro N, indicando quantos minutos faltam para o final do expediente (2 <= N <= 100).

- Em seguida haverá dois inteiros A e B, indicando quantos minutos são necessários para fabricar os dois presentes que Dobby precisa fabricar (1 <= A, B <= 100).

**Saída**
- Imprima uma linha, contendo a frase "Farei hoje!" caso seja possível fabricar os dois presentes antes do final do expediente, ou "Deixa para amanha!" caso contrário.

### Desafio 02 - DDD

Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:

| DDD | Destination    |
|-----|----------------|
| 61  | Brasilia       |
| 71  | Salvador       |
| 11  | Sao Paulo      |
| 21  | Rio de Janeiro |
| 32  | Juiz de Fora   |
| 19  | Campinas       |
| 27  | Vitoria        |
| 31  | Belo Horizonte |


Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
DDD nao cadastrado

**Entrada**
- A entrada consiste de um único valor inteiro.

**Saída**
- Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado.

| Exemplo de Entrada | Exemplo de Saída |
|--------------------|------------------|
| 11                 | Sao Paulo        |

### Desafio 03 - Visita na feira

Desafio
Você está na feira com a sua sacola e parou em uma banca. O feirante lhe entregou pimentões amarelos e vermelhos. Agora iremos somar os pimetões amarelos e vermelhos para descobrir o total de pimentões na sacola.  Você receberá 2 inteiros que devem ser lidos e armazenados nas variáveis A (pimentões amarelos) e B (pimentões vermelhos). Faça a soma de A e B atribuindo o seu resultado na variável X (total de pimentões). Apresente X como descrito na mensagem de exemplo abaixo. Não apresente outra mensagem além da mensagem especificada.

**Entrada**
- A entrada contém 2 valores inteiros, separados por um espaço.

**Saída**
- Imprimir a mensagem "X = " (sendo a letra X maiúscula) seguido pelo valor da variável X e pelo final de linha. Assegure que exista um espaço antes e depois do sinal de igualdade.

| Exemplo de Entrada | Exemplo de Saída |
|--------------------|------------------|
| 11 7               | X = 18           |
| -11 6              | X = -5           |
| 11 -2              | X = 9            |
