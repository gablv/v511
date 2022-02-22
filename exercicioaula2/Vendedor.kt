
class Vendedor(
var nome: String,
var sexo: String,
var idade: Byte,
var cpf: String,
var salario: Float,
var telefoneCelular: String,
var enderecoResidencial: String
    ) {
    override fun toString(): String {
        return "Nome do vendedor: $nome  Telefone: $telefoneCelular"
    }
}