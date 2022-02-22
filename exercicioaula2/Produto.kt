class Produto(
    var nome: String,
    var preco: Float,
    var tamanho: String,
    var peso: Float,
    var categoria: String
    ) {

        override fun toString(): String {
            return "Nome do produto: $nome  Preço: $preco Tamanho: $tamanho Peso: $peso Categoria: $categoria"
        }
}