## Sobre o projeto:
Se trata de um simples microsserviço, construído em SpringBoot, com o objetivo de guardar e servir mídias.

## Setup
Para rodar a aplicação basta abrir o terminal dentro do diretório da aplicação e digitar:
> 'docker build printsaver-app .'

> 'docker run -e SV_RESOURCE_LOCATION= /application/img/ -p 8000:8080 printsaver-app'

## To-do:
- [ ] Hostear a aplicação.
- [ ] Implementar uma task de limpeza a cada hora.
- [ ] Implementar uma interface para o usuário.
