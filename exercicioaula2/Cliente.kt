class Cliente(
    var nome: String,
    var idade: Byte,
    var cpf: String,
    var telefoneCelular: String,
    var enderecoResidencial: String
) {
    override fun toString(): String {
        return "Nome do cliente: $nome  CPF: $cpf  Telefone para contato: $telefoneCelular"
    }
}

