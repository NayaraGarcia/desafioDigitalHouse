package desafioDigitalHouse

class Curso(var nome: String, var codigoCurso: Int) {

    var alunos = mutableMapOf<Int, Aluno>()
    var vagasDisponiveis: Int = 0
    var professoresAlocados = mutableMapOf<Int, Professor>()

    constructor(nome: String, codigoCurso: Int, _vagasDisponiveis: Int) : this(nome, codigoCurso) {
        vagasDisponiveis = _vagasDisponiveis
    }

    init {
        println("Curso registrado com sucesso !!")
        println("Nome do Curso: $nome")
        println("Código: $codigoCurso")

    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        if (other !is Curso) return false

        if (codigoCurso == other.codigoCurso) return true

        return true
    }


    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        when {
            vagasDisponiveis > 0 -> {
                alunos[umAluno.codigoAluno] = umAluno
                return ((vagasDisponiveis--) > 0)
            }
        }
        return false
    }

    // Esta dando erro

    fun excluirAluno(umAluno: Aluno) {
        alunos.remove(umAluno)
        println("Aluno ${umAluno.nome} ${umAluno.sobrenome} foi excluído. ")
        vagasDisponiveis++
    }

    fun alocaProfessores(professor: Professor) {
        professoresAlocados[professor.codigoProfessor] = professor
    }

}