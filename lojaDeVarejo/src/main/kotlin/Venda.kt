class Venda(
    var modoPagamento: String,
    var numeroCartao: String,
    var nomeTitularCartao: String

    ) {
        override fun toString(): String {
            return "Modo de pagamento: $modoPagamento"
        }
    }

}