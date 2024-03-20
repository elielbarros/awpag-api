O que é REST?
- É uma especificação que define a forta de comunicação entre componentes de software na web, independente da linguagem de programação usada.
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
- cliente-servidor : Precisa de um cliente enviando requisições para um servidor. O cliente e o servidor podem evoluir separadamente, sem dependencia. O cliente e o servidor podem ser substituidos desde que a interface nao mude.
- Stateless : A aplicação nao deve possuir estado. A requisição feita para a API tem que conter tudo devidamente para que a informação seja processada. Servidor nao pode manter sessão.
- Cache : API pode fazer cache de respostas das requisições, especialmente dos dados que não mudam frequentemente.
- Interface uniforme : conjunto de operações bem definidas no sistema. Identificar recursos do sistema usando URIs inserindo um padrao. Usar padrao de protocolo de comunicação para iteragir com a API, geralmente protocolo HTTP. A resposta de uma requisição deve ser padronizada.
- Sistema em camadas : Camadas de segurança, cache e etc. O cliente nao deve conhecer as camadas que possuem no meio entre o cliente e o servidor.
- Codigo sob demanda : Servidor enviar codigo que pode ser executado no cliente



Protocolo HTTP
- Protocolo Requisição Resposta
- Composição da Requisição
	- [METODO] [URI] HTTP/[VERSAO] [CABECALHOS] [CORPO/PAYLOAD]
	- Metodo tambem pode ser chamado de verbo HTTP
	- METODO : Conjunto de metodos definidos para realizar uma ação.
	- URI : Caminho que identifica o que queremos dentro do servidor
	- VERSAO : Versao do HTTP
	- CABECALHOS : Chaves e valores que podem ser usados pelo servidor para interpretar a requisiçao e executar a alteração
- Composição da Resposta
	- HTTP/[Versao] [STATUS] [Cabeçalhos] [CORPO]
	- VERSAO : Indica a versao do protocolo HTTP
	- STATUS : Descreve o resultado de processamento da requisição
	- CABECALHOS : Chaves e Valores que podem ser usadas pelo software consumidor para interpretar a resposta.
	- CORPO : Conteudo da resposta, é opcional.
	
	
	
Recursos REST
- Um recurso eh como uma instancia de um objeto de determinada classe
- Um recurso que representa uma unica coisa é conhecido por Singleton Resource (Recurso unico)
- O recurso pode ser agrupado em coleções, conhecido como Collection Resource (Recurso de coleção). Uma coleção de recursos, pode ser considerado um recurso.
- Identificando Recursos
	- REST usa URIs para identificar recursos.
	- URI significa: Uniform Resource Identifier/Identificador de Recurso Uniforme. Eh um conjunto de caracteres que tem como objetivo dar um endereço para um recurso de forma nao ambigua.
	- URI vs URL: URL é um tipo de URI. URL significa Uniform Resource Locator, ou localizador de recurso uniforme. Ela especifica um identificar e a localização do recurso tambem. 
	- A URI deve se referir a uma coisa, ou seja, a um substantivo, nao um verbo ou uma ação, pq coisas possuem propriedades, verbos nao possuem.
	- Exemplo: /produtos SIM /listarProdutos NAO
	- Exemplo: /produto/{codigo-produto} -> produto/331 -> O ideal eh ter uma interface uniforome e dessa forma nao estah uniforme, pois o recurso de coleção foi identificado com /produtos e o recurso unico foi identificado com /produto/{codigo}. O ideal e eh consenso no mercado é utilizar os nomes sempre no plural.
