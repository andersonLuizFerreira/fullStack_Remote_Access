# ETAPA 01 - Fundacao do Backend

## Estrutura Criada

Foi criada a base do projeto Maven em `backend/simuldiesel-remote-backend` com a organizacao inicial de codigo, recursos, testes e documentacao.

## Motivo de Cada Pasta

- `src/main/java/com/simuldiesel/remote`: pacote raiz da aplicacao.
- `controller`: reservado para futuros endpoints REST.
- `service`: reservado para regras de negocio e orquestracao.
- `dto`: reservado para objetos de transferencia de dados.
- `entity`: reservado para entidades persistentes.
- `repository`: reservado para acesso a dados.
- `config`: reservado para configuracoes da aplicacao.
- `exception`: reservado para tratamento padronizado de erros.
- `enums`: reservado para enumeracoes de dominio e suporte.
- `src/main/resources`: configuracoes e arquivos estaticos da aplicacao.
- `src/test/java/com/simuldiesel/remote`: base para testes automatizados futuros.
- `docs`: documentacao tecnica incremental por etapa.

## Stack Adotada

- Java 21
- Maven
- Spring Boot 3
- Spring Web
- Spring Data JPA
- Bean Validation
- H2 Database
- Spring Boot Test

## Proximos Passos - ETAPA 02

Os proximos passos naturais para a ETAPA 02 sao:

- definir convencoes de arquitetura e padrao de resposta
- criar camada inicial de configuracao e tratamento global de excecoes
- iniciar primeiros contratos tecnicos do backend sem acoplar regra de negocio complexa
- preparar a base para introducao controlada das entidades e persistencia
