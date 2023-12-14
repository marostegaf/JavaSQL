INSERT
Pessoa -> nome, num_residencia
Residencia -> numero, rua, bairro
Item -> nome, preco
ItemPessoa -> transacao, pessoa, item

SELECT
PessoaReisdencia -> nome, rua, bairro
Transacao -> transacao, pessoa, item, preco

Aplicativo em Java desenvolvido para fazer alterações no banco de dados MySQL, onde existe uma database chamada loja com 4 tabelas, pessoa, item, residencia e pessoa_item.

Conexão criada através JDBC (Java Database Connectivity).

Pessoa = armazena dados da pessoa e a sua residência sendo chave estrangeira.
Residencia = armazena dados da residência da pessoa.
Item = armazena dados do da compra, ou seja, do item.
pessoa_item = Tabela criada através de uma relação N-N para armazenar uma compra realizada pela pessoa.

Além dessas tabelas também exite 2 views criadas que foram utilizadas pelos comandos SELECT e 1 Procedure
criada para facilitar quando houver uma compra
