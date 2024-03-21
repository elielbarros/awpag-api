O que é REST?

- É uma especificação que define a forta de comunicação entre componentes de
  software na web, independente da linguagem
  de programação usada.
- Conjunto de melhores praticas e regras pra desenvolvimento de Web Services
- Essas melhores praticas sao chamadas de constraints
- Rest API é uma API que segue regras especificadas por Roy Field

Vantagem

- Separação entre cliente e servidor
- Escalabilidade, qualquer maquina servidora pode atender qualquer requisição
- Rest API é independente de linguagem de programação
- As APIs podem iteragir entre si
- Demanda de mercado por utilização de Rest API

Constraints

- cliente-servidor : Precisa de um cliente enviando requisições para um
  servidor. O cliente e o servidor podem evoluir
  separadamente, sem dependencia. O cliente e o servidor podem ser substituidos
  desde que a interface nao mude.
- Stateless : A aplicação nao deve possuir estado. A requisição feita para a
  API tem que conter tudo devidamente para
  que a informação seja processada. Servidor nao pode manter sessão.
- Cache : API pode fazer cache de respostas das requisições, especialmente dos
  dados que não mudam frequentemente.
- Interface uniforme : conjunto de operações bem definidas no sistema.
  Identificar recursos do sistema usando URIs
  inserindo um padrao. Usar padrao de protocolo de comunicação para iteragir
  com a API, geralmente protocolo HTTP. A
  resposta de uma requisição deve ser padronizada.
- Sistema em camadas : Camadas de segurança, cache e etc. O cliente nao deve
  conhecer as camadas que possuem no meio
  entre o cliente e o servidor.
- Codigo sob demanda : Servidor enviar codigo que pode ser executado no cliente

Protocolo HTTP

- Protocolo Requisição Resposta
- Composição da Requisição
    - [METODO] [URI] HTTP/[VERSAO] [CABECALHOS] [CORPO/PAYLOAD]
    - Metodo tambem pode ser chamado de verbo HTTP
    - METODO : Conjunto de metodos definidos para realizar uma ação.
    - URI : Caminho que identifica o que queremos dentro do servidor
    - VERSAO : Versao do HTTP
    - CABECALHOS : Chaves e valores que podem ser usados pelo servidor para
      interpretar a requisiçao e executar a
      alteração
- Composição da Resposta
    - HTTP/[Versao] [STATUS] [Cabeçalhos] [CORPO]
    - VERSAO : Indica a versao do protocolo HTTP
    - STATUS : Descreve o resultado de processamento da requisição
    - CABECALHOS : Chaves e Valores que podem ser usadas pelo software
      consumidor para interpretar a resposta.
    - CORPO : Conteudo da resposta, é opcional.

Recursos REST

- Um recurso eh como uma instancia de um objeto de determinada classe
- Um recurso que representa uma unica coisa é conhecido por Singleton
  Resource (Recurso unico)
- O recurso pode ser agrupado em coleções, conhecido como Collection Resource (
  Recurso de coleção). Uma coleção de
  recursos, pode ser considerado um recurso.
- Identificando Recursos
    - REST usa URIs para identificar recursos.
    - URI significa: Uniform Resource Identifier/Identificador de Recurso
      Uniforme. Eh um conjunto de caracteres que tem
      como objetivo dar um endereço para um recurso de forma nao ambigua.
    - URI vs URL: URL é um tipo de URI. URL significa Uniform Resource Locator,
      ou localizador de recurso uniforme. Ela
      especifica um identificar e a localização do recurso tambem.
    - A URI deve se referir a uma coisa, ou seja, a um substantivo, nao um
      verbo ou uma ação, pq coisas possuem
      propriedades, verbos nao possuem.
    - Exemplo: /produtos SIM /listarProdutos NAO
    - Exemplo: /produto/{codigo-produto} -> produto/331 -> O ideal eh ter uma
      interface uniforome e dessa forma nao
      estah uniforme, pois o recurso de coleção foi identificado com /produtos
      e o recurso unico foi identificado com
      /produto/{codigo}. O ideal e eh consenso no mercado é utilizar os nomes
      sempre no plural.

Spring Rest

O que é Spring Rest ?

- Spring Rest não existe, é apenas um termo.
- Spring seria um conjunto de projetos que resolvem varios problemas do dia a
  dia de um programador java.
- Spring ajuda a criar aplicações com simplicidade e flexibilidade.
- Spring ajuda a focar no desenvolvimento das regras de negocio e nao perder
  tempo desenvolvendo codigo de
  infraestrutura da aplicação.

Por que usar Spring?

- Resolve vários problemas de desenvolvimento de software
    - Gerenciamento de objetos
    - Injeção de dependência
    - Acesso a diferentes fontes de dados: sql, nosql
    - Criação de projetos web
    - Rest API
    - Segurança da aplicação
    - MAIS
- É simples
- É uma tecnologia madura e usada em produção pelas maiores empresas do mundo
- Modularidade:
    - pode ser organizado por projetos e até subprojetos
    - pode se escolher qual deles resolver os problemas.
    - É possível até usar spring junto com outras tecnologias que não são do
      mesmo ecossistema.
- Evolução constante
- Código Open Source
    - Significa que qualquer pessoa pode contribuir com a tecnologia e corrigir
      qualquer problema.
- A comunidade de Spring é grande e tem muita ajuda disponivel, documentações,
  foruns e etc.
- É muito popular
- Empregabilidade alta

Documentação dos projetos Spring

- Doc disponivel aqui: https://spring.io/projects

O que é Spring Data?

- Projeto guarda-chuva que agrupa varios outros projetos relacionados a acesso
  a dado.

O que é Spring Data JPA?

- Será um projeto usado no curso.
- Ajuda a implementar repositorio JPA de forma simples
- Conhecido por Jackarta Persistance (JPA) é uma especificação de persistencia
  de dados pra Java
- Tecnologia que ajuda com acesso e operações com banco de dados relacional +
  java.
- Spring data vai ajudar no sentidoo de quando é necessário programar coisas
  que se tornam repetitivas, isso é chamado de Código Boilerplate, um código
  que precisa ser escrito varias vezes dentro do mesmo projeto com poucas
  variações.

O que é Spring Boot?

- Projeto que se auto configura seguindo convenções com visão opinativa
- Quer dizer que o Spring Boot decide como configurar o projeto de acordo com
  uma opinião propria dos desenvolvedores dele. Ou seja, de acordo com
  convenções que eles acham que são as melhores.
- Então não precisa se preocupar com a maioria das configurações.
- O Spring Boot tambem pode configurar bibliotecas terceiras que pode ser usado
  pelo projeto.
- O Spring Boot não substitui outros projetos do ecossistema.