# HireFlow - Applicant Tracking System (ATS)

## Objetivo

Desenvolver um sistema ATS (Applicant Tracking System) para gerenciamento de processos seletivos.

O sistema deve permitir que empresas publiquem vagas, candidatos se candidatem e recrutadores acompanhem todo o fluxo de contratação.

Este projeto tem como objetivo consolidar conhecimentos em:

* Java
* Spring Boot
* PostgreSQL
* React
* Docker
* Arquitetura de Software
* Segurança
* Modelagem de Dados
* Filas
* Cache
* Testes Automatizados

---

# Requisitos Funcionais

## RF001 - Autenticação

O sistema deve permitir:

* Cadastro de usuários
* Login
* Logout
* Recuperação de senha (opcional)

---

## RF002 - Controle de Acesso

Perfis:

### ADMIN

Pode:

* Gerenciar usuários
* Gerenciar empresas
* Gerenciar vagas
* Visualizar todos os candidatos

### RECRUITER

Pode:

* Criar vagas
* Gerenciar candidatos
* Atualizar status do processo seletivo

### CANDIDATE

Pode:

* Atualizar perfil
* Visualizar vagas
* Se candidatar a vagas

---

## RF003 - Gestão de Vagas

Cada vaga deve possuir:

* Título
* Descrição
* Requisitos
* Salário
* Modalidade
* Localização
* Status

Status:

* OPEN
* CLOSED
* DRAFT

---

## RF004 - Gestão de Candidatos

Cada candidato deve possuir:

* Nome
* Email
* Telefone
* LinkedIn
* GitHub
* Currículo PDF

---

## RF005 - Candidaturas

Um candidato pode se candidatar para uma vaga.

Uma vaga pode possuir várias candidaturas.

---

## RF006 - Pipeline de Recrutamento

Etapas:

* APPLIED
* SCREENING
* HR_INTERVIEW
* TECHNICAL_INTERVIEW
* OFFER
* HIRED
* REJECTED

O recrutador deve conseguir mover candidatos entre etapas.

---

## RF007 - Histórico de Alterações

Toda mudança de etapa deve ser registrada.

Informações:

* Usuário responsável
* Data
* Etapa anterior
* Nova etapa

---

## RF008 - Dashboard

Exibir:

* Quantidade de vagas abertas
* Quantidade de candidatos
* Quantidade de contratações
* Taxa de aprovação

---

## RF009 - Busca

Pesquisar:

* Nome do candidato
* Email
* Nome da vaga

---

## RF010 - Filtros

Filtrar candidatos por:

* Vaga
* Status
* Data

---

# Requisitos Não Funcionais

## RNF001

A API deve seguir padrão REST.

## RNF002

Todas as rotas protegidas devem exigir autenticação.

## RNF003

Senhas devem ser armazenadas com hash seguro.

## RNF004

A aplicação deve ser executável via Docker Compose.

## RNF005

O sistema deve possuir documentação Swagger/OpenAPI.

---

# Modelo Inicial de Entidades

## User

* id
* name
* email
* password
* role

## Role

* id
* name

## Company

* id
* name
* description

## Job

* id
* title
* description
* salary
* status

## Candidate

* id
* name
* email
* phone
* linkedin
* github

## Application

* id
* candidate
* job
* status

## Resume

* id
* filename
* path

## AuditLog

* id
* action
* createdAt

---

# Roadmap

## MVP

* Autenticação
* Roles
* CRUD de vagas
* CRUD de candidatos
* Aplicação em vagas
* Pipeline
* Dashboard

## V2

* Upload de currículos
* Logs
* Docker Compose
* Swagger
* Testes automatizados

## V3

* Redis
* Filas
* Notificações
* Extração de informações de currículo

---

# Tecnologias

Backend:

* Java 21
* Spring Boot
* Spring Security
* Spring Data JPA
* PostgreSQL

Frontend:

* React
* TypeScript
* React Router
* TanStack Query

Infraestrutura:

* Docker
* Docker Compose

---

# Critério de Sucesso

Ao final do projeto, o sistema deve ser capaz de suportar um fluxo completo de recrutamento:

Empresa cria vaga
↓
Candidato se cadastra
↓
Candidato aplica para vaga
↓
Recrutador analisa candidatura
↓
Candidato percorre pipeline
↓
Contratação ou rejeição
