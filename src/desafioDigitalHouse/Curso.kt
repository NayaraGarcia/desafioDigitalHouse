package desafioDigitalHouse

class Curso(var nome: String,var codigoCurso: Int) {

    var alunos = mutableMapOf<Int, Aluno>()
    var vagasDisponiveis: Int = 0

    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        when {
            vagasDisponiveis > 0 -> {
                alunos[umAluno.codigoAluno] = umAluno
                return ((vagasDisponiveis--) > 0)
            }
        }
        return false
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        if (other !is Curso) return false

        if (codigoCurso == other.codigoCurso) return true

        return true
    }



}