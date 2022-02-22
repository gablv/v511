
class Transportadora(
    var nome: String,
    var cnpj: String,
    var endereco: String,
    var telefoneComercial: String

    ) {
        override fun toString(): String {
            return "Nome da transportadora: $nome  Telefone: $telefoneComercial"
        }
    }