# 🌱 Projeto Sustentável — API RESTful em Spring Boot

### Global Solution — Domain Driven Design - FIAP • 2º Semestre de 2025

---

## 👥 Integrantes
- **Nicolas Lorenzo Ferreira da Silva — RM 557962**
- **Pedro Henrique Faim dos Santos — RM 557440**

---

## 📘 Descrição do Projeto

O **Projeto Sustentável** é uma aplicação completa desenvolvida utilizando **Spring Boot**, **Thymeleaf**, **Oracle Database (FIAP)** e estilização com **Bootstrap**.  
Seu objetivo é facilitar o **cadastro, acompanhamento e gestão** de iniciativas voltadas à sustentabilidade.

A solução aplica conceitos de **Domain Driven Design (DDD)** e organiza todo o sistema em camadas claras para manter boa escalabilidade, manutenção simplificada e uma arquitetura limpa.

---

## 🎯 Objetivos

- Desenvolver uma API RESTful completa utilizando **Java + Spring Boot**.
- Aplicar corretamente os padrões **DDD** e **MVC**.
- Integrar com banco de dados Oracle da FIAP.
- Criar um front-end funcional com **Thymeleaf + Bootstrap**.
- Implementar **CRUD** completo com validação nos DTOs.
- Publicar o deploy final no **Render.com**.

---

## 🏛 Arquitetura da Solução

A solução segue uma arquitetura modular organizada em camadas conforme boas práticas:

/src

├── model → Entidades JPA + Validações

├── repository → Interfaces de acesso ao BD Oracle

├── service → Regras de negócio

├── controller → Endpoints REST

└── view → Templates Thymeleaf + Bootstrap

---

## 🔗 Endpoints da API

| Método     | Endpoint         | Descrição                     |
|------------|------------------|-------------------------------|
| **GET**    | `/projetos`      | Lista todos os projetos       |
| **GET**    | `/projetos/{id}` | Retorna um projeto pelo ID    |
| **POST**   | `/projetos`      | Cria um novo projeto          |
| **PUT**    | `/projetos/{id}` | Atualiza um projeto existente |
| **DELETE** | `/projetos/{id}` | Remove um projeto por ID      |

---

## 🗄 Modelo de Dados (DER — Oracle)

**Tabelas principais:**
- `TB_USUARIOS`
- `TB_PROJETOS`
- `TB_CATEGORIAS`

> *(inserir imagem do DER aqui)*

---

## 🎨 Protótipos das Telas

> *(inserir aqui captura das telas ou mockups do front-end)*

---

## 📦 Deploy

A aplicação será disponibilizada no **Render.com**.
> *(adicionar aqui o link do deploy quando publicado)*

---

## 📁 Repositório no GitHub

> *(colocar aqui o link do seu repositório oficial da GS)*

---

## 📄 Documentação

### Toda a documentação completa está disponível no arquivo PDF incluído na entrega.

---