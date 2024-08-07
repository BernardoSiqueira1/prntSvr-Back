## Descrição:
> Um microsserviço simples construído em springboot com o objetivo de salvar e servir conteúdo estático.

## Rodando a aplicação:
* Abra o terminal
* Monte a imagem docker com:

> 'docker build printsaver-app .'

* Rode a imagem com:
  
> 'docker run -e SV_RESOURCE_LOCATION= /application/img/ -p 8000:8080 printsaver-app'

