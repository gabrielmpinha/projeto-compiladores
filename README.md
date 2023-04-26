# Projeto da Disciplina de Compiladores - 2022.2

- [Objetivo](#objetivo)
- [Comandos para Compilar](#comandos-para-compilar)
- [Como Usar](#como-usar)

## Objetivo
Criar um DSL para escrever JSON com o intuito de ajudar desenvolvedores que não possuem experiência com JSON.

## Comandos para Compilar

1. Compilar a descrição da linguagem fonte:

```
java -jar antlr.jar -o src-gen GerarJson.g4
```
O comando acima executa o gerador ANTLR que converte a descrição da gramática (GerarJson.g4) em
programas Java (Analisadores léxicos e sintáticos). Os códigos dos analisadores gerados serão armazendados na pasta src-gen.


2. Compilar programas em Java:


```
javac -cp antlr.jar:. -d classes src/*.java src-gen/*.java
```
O comando acima executa o compilador Java. O arquivo antlr.jar, que contem as bibliotecas
runtime utilizadas pelo código gerado pelo antlr são adicionadas ao CLASSPATH. O compilador
compila todos os arquivos java que estão no diretório "src" (arquivo escritos pelo programador)
e no diretório "src-gen" (arquivos gerados automáticamente). 

O arquivos binários compilados gerados pelo javac serão armazenados no diretório classes.


3. Executar o programa:

```
java -cp antlr.jar:classes Main
```

O comando acima executa a classe Main do compilador. Os arquivos binários das classes estão localizades no diretório "classes". Para a classe poder ser executada é necessário também incluir os arquivos do runtime do antlr.jar.


## Como usar
1. Criar um codespaces do projeto

2. Dentro do codespaces, abrir o arquivo input.exp e nele escrever o comando para a criação do json de acordo com a gramática descrita em GerarJson.g4

3. Executar o programa (escreva 'java -cp antlr.jar:classes Main' no terminal)

4. Seu código Json vai ser gerado e pode ser visualizado no terminal ou direto no arquivo 'arquivoGerado.json' do diretório principal


# Desenvolvedores
<table>
  <tr>
    <td align="center">
      <a href="https://github.com/gabrielmpinha">
        <img src="colaboradores/gabriel-pinheiro.png" width="100px;"/><br>
        <sub>
          <b>Gabriel Pinheiro</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/JoaoKern">
        <img src="colaboradores/joao-kern.jpg" width="100px;"/><br>
        <sub>
          <b>João Kern</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/Rafarinh0">
        <img src="colaboradores/rafael-marinho.jpg" width="100px;"/><br>
        <sub>
          <b>Rafael Marinho</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/Vinizik">
        <img src="colaboradores/vinicius-martins.jpg" width="100px;"/><br>
        <sub>
          <b>Vinícius Martins</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
