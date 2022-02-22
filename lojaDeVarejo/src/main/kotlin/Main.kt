

fun main() {
    val cliente = Cliente(
        nome = "Jessica Azevedo",
        idade = 35,
        cpf = "00000000000",
        enderecoResidencial = "Rua Alberto Bins, 665 - Porto Alegre/RS",
        telefoneCelular = "(51) 40028922"
    )
    println(cliente)

    val fornecedor = Fornecedor(
        nome = "AZEVEDO",
        cnpj = "11111111111",
        endereco = "Rua Antonio de Carvalho, 170 - Porto Alegre/RS",
        telefoneComercial = "(51)00000000"
    )
    println(fornecedor)

    val produto = Produto(
        nome = "Notebook Gamer",
        preco = 5600.99f,
        categoria = "Eletrônicos",
        peso = 4f,
        tamanho = "17 Polegadas"
    )
    println(produto)

    val transportadora = Transportadora(
        nome = "Easy Operações Logísticas",
        cnpj = "22222222222",
        endereco = "Rua Sérgio Jungblut Dieterich, 900 - Porto Alegre/RS",
        telefoneComercial = "(51)777777777"
    )
    println(transportadora)

    val venda = Venda(
        modoPagamento = "Crédito",
        numeroCartao = "014785236914",
        nomeTitularCartao = "Jessica Azevedo"
    )
    println(venda)

    val vendedor = Vendedor(
        nome = "Jessica Azevedo",
        sexo = "Feminino",
        cpf = "02442624190",
        idade = 34,
        enderecoResidencial = "Rua Alberto Bins, 665 - Porto Alegre/RS",
        telefoneCelular = "(51)666666666",
        salario = 1500.66f
    )
    println(vendedor)
}
