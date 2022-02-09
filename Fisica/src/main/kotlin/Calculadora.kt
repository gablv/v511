import kotlin.math.pow

class Calculadora {

    fun forcaPeso(massa: Float, gravidade: Float): Float {
        return massa * gravidade

    }

    fun forcaCentripeta(massa: Float, velocidade: Float, raio: Float): Float {
        return massa * (velocidade.pow(2) / raio)

    }

    fun impulso(forcaResultante: Float, intervaloDeTempo: Float): Float {
        return forcaResultante * intervaloDeTempo
    }

    fun forcaElastica(constanteElastica: Float, variacao: Float): Float {
        return constanteElastica * variacao
    }

    fun velocidadeMedia(distanciaPercorrida: Float, intervaloDeTempo: Float): Float {
        return distanciaPercorrida / intervaloDeTempo
    }

    fun mru(posicaoInicial: Float, velocidade: Float, intervaloDeTempo: Float): Float {
        return posicaoInicial + (velocidade * intervaloDeTempo)
    }

    fun mruv(posicao: Float, posicaoInicial: Float, velocidadeInicial: Float, tempo: Float, aceleracao: Float): Float {
        return posicaoInicial + (velocidadeInicial * tempo) + (aceleracao * tempo.pow(2) / 2)
    }


}