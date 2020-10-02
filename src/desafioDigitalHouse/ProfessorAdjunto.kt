package desafioDigitalHouse

class ProfessorAdjunto(nome: String,
                       sobrenome: String,
                       tempoDeCasa: Int,
                       codigoProfessor: Int,
                       horasMonitoria: Int) : Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {
    init {
        println("Professor Adjunto Registrado com sucesso !!")
        println("Nome: $nome $sobrenome")
        println("Tempo de Casa: $tempoDeCasa")
        println(" Código: $codigoProfessor")
        println(" Quantidade de Horas de Monitoria: $horasMonitoria")
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        if (other !is Professor) return false

        if (codigoProfessor == other.codigoProfessor) return true

        return true
    }
}