package desafioDigitalHouse

class ProfessorAdjunto(nome: String,
                       sobrenome: String,
                       tempoDeCasa: Int,
                       codigoProfessor: Int,
                       horasMonitoria: Int) : Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {


    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        if (other !is Professor) return false

        if (codigoProfessor == other.codigoProfessor) return true

        return true
    }
}