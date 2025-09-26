# 📏 Programa de Alturas em Vetor (Java)

> 💡 *Exercício proposto no curso **Java COMPLETO** do professor [Nélio Alves].*

Este programa em Java lê os dados de **N pessoas** (nome, idade e altura) e realiza alguns cálculos estatísticos simples:

- Calcula a **altura média** das pessoas.  
- Determina a **porcentagem de pessoas com menos de 16 anos**.  
- Lista os **nomes das pessoas com menos de 16 anos**, caso existam.  

---

## 🚀 Como funciona

1. O programa pergunta **quantas pessoas serão digitadas**.  
2. Para cada pessoa, o usuário informa:
   - Nome  
   - Idade  
   - Altura  
3. Após a coleta dos dados:
   - A altura média é calculada somando todas as alturas e dividindo pelo número total de pessoas.  
   - A porcentagem de pessoas com menos de 16 anos é calculada com base na contagem dessas idades em relação ao total.  
   - Caso haja pessoas com menos de 16 anos, seus nomes são exibidos.  

---

## 📂 Estrutura do Código

- **Vetores utilizados:**
  -  → armazena os nomes.  
  -  → armazena as idades.  
  -  → armazena as alturas.  

- **Principais etapas:**
  - Entrada de dados com .  
  - Cálculo da soma das alturas.  
  - Contagem de pessoas com idade < 16.  
  - Impressão dos resultados formatados.  

---

## 🖥️ Exemplo de execução 
<img width="607" height="521" alt="execucao" src="https://github.com/user-attachments/assets/7b4b399b-ed9c-494d-9e57-ca4b1cd6fa19" />


---

## 🛠️ Tecnologias utilizadas
- **Java** (versão 8 ou superior)  
- **Scanner** para entrada de dados  
- **Locale.US** para padronizar separador decimal com ponto (`.`)  

---

## ▶️ Como compilar e executar

### Pré-requisitos
- Ter o **Java JDK** instalado (versão 8 ou superior).  
- Verificar se o `javac` e o `java` estão configurados no **PATH** do sistema.  

Para confirmar, execute no terminal:
`java -version`
`javac -version`

**Passo 1: Salvar o código**

Salve o código em um arquivo chamado

`AlturasVetor.java`

**Passo 2: Compilar o programa**

No terminal, navegue até a pasta onde o arquivo foi salvo e execute:


`javac AlturasVetor.java`

Isso irá gerar o arquivo AlturasVetor.class (bytecode do Java).

**Passo 3: Executar o programa**

Ainda no terminal, rode:
`java AlturasVetor`
