# DevSuperior - Desafio Validação e Segurança

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/EraldoCunha/ds-desafio-validacao-e-seguranca/blob/main/LICENSE)

## Sobre o desafio
Implemente as funcionalidades necessárias para que os testes do projeto abaixo passem (assista o vídeo explicativo e baixe o projeto no conteúdo anexo ao vídeo).

Este é um sistema de eventos e cidades com uma relação N-1 entre eles:

![Modelo Conceitual](https://github.com/EraldoCunha/assets/blob/main/ds-desafio-validacao-e-seguranca/Modelo%20de%20dom%C3%ADnio.PNG)

---

### Regras de controle de acesso:

-	Somente rotas de leitura (GET) de eventos e cidades são públicas (não requer login).
-	Usuários CLIENT e/ou ADMIN podem inserir novos eventos (POST).
-	Os demais acessos são permitidos apenas a usuários ADMIN.

### Regras de validação de City:
-	Nome não pode ser vazio

### Regras de validação de Event:
-	Nome não pode ser vazio
-	Data não pode ser passada
-	Cidade não pode ser nula

### Mínimo para aprovação: 10/12

---

# Tecnologias utilizadas

- **Java**
- **Spring Boot**
- **Spring Starter Web**
- **Spring Tests (JUnit 5)**
- **Spring Security**
- **OAuth2**
- **JPA / Hibernate**
- **H2 Database**
- **Maven**
- **Postman**

# Autor

Eraldo José de Almeida Cunha

<a href="https://www.linkedin.com/in/eraldojacunha/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>
