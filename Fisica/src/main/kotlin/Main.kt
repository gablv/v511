fun main() {
    val calculadora = Calculadora()



    println("Vamos calcular força peso.")
    println("Informe o valor da massa: ")
    val massa: Float = readLine()!!.toFloat()
    println("Informe o valor da gravidade: ")
    val gravidade: Float = readLine()!!.toFloat()


    val forcaPeso = calculadora.forcaPeso(massa, gravidade)

    println("O resultado da força peso é $forcaPeso")


    println("Vamos calcular força centrípeta.")
    println("Informe o valor da massaCentripeta: ")
    val massaCentripeta: Float = readLine()!!.toFloat()
    println("Informe o valor da velocidade:")
    val velocidade: Float = readLine()!!.toFloat()
    println("Informe o valor do raio:")
    val raio: Float = readLine()!!.toFloat()

    val forcaCentripeta = calculadora.forcaCentripeta(massaCentripeta, velocidade, raio)

    println("O resultado da força centrípeta é $forcaCentripeta")


    println("Vamos calcular força impulso")
    println("Informe o valor da força resultante: ")
    val forcaResultante: Float = readLine()!!.toFloat()
    println("Informe o valor do intervalo de tempo: ")
    val intervaloDeTempo: Float = readLine()!!.toFloat()

    val impulso = calculadora.impulso(forcaResultante, intervaloDeTempo)

    println("O resultado da força impulso é $impulso")


    println("Vamos calcular força elástica.")
    println("Informe o valor da constante elástica:")
    val constanteElastica: Float = readLine()!!.toFloat()
    println("Informe o valor da variação: ")
    val variacao: Float = readLine()!!.toFloat()

    val forcaElastica = calculadora.forcaElastica(constanteElastica, variacao)

    println("O resultado da força elástica é $forcaElastica")


    println("Vamos calcular velocidade média.")
    println("Informe a distância percorrida: ")
    val distanciaPercorrida: Float = readLine()!!.toFloat()
    println("Informe o intervalo de tempo: ")
    val intervaloDeTempoVM: Float = readLine()!!.toFloat()

    val velocidadeMedia = calculadora.velocidadeMedia(distanciaPercorrida, intervaloDeTempoVM)

    println("O resultado da velocidade média é: ")


    println("Vamos calcular Movimento Retilíneo Uniformemente.")
    println("Informe o valor da posição inicial: ")
    val posicaoInicial: Float = readLine()!!.toFloat()
    println("Informe o valor da velocidade: ")
    val velocidadeMRU: Float = readLine()!!.toFloat()
    println("Informe o valor do intervalo de tempo: ")
    val intervaloDeTempoMRU: Float = readLine()!!.toFloat()

    val mru = calculadora.mru(posicaoInicial, velocidadeMRU, intervaloDeTempoMRU)

    println("O resultado do MRU é: ")


    println("Vamos calcular Movimento Retilíneo Uniformemente Variado")
    println("Informe o valor da posicao:  ")
    val posicao: Float = readLine()!!.toFloat()
    println("Informe o valor da posição inicial: ")
    val posicaoInicialMRUV: Float = readLine()!!.toFloat()
    println("Informe o valor da velocidade inicial: ")
    val velocidadeInicial: Float = readLine()!!.toFloat()
    println("informe o valor de tempo: ")
    val tempoMRUV: Float = readLine()!!.toFloat()
    println("Informe o valor da aceleração: ")
    val aceleracao: Float = readLine()!!.toFloat()

    val mruv = calculadora.mruv(posicao, posicaoInicialMRUV, velocidadeInicial, tempoMRUV, aceleracao)

    println("O resultado do MRUV é:")


}
