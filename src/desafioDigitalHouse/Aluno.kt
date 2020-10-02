package desafioDigitalHouse

class Aluno(val nome: String, var sobrenome: String, val codigoAluno: Int) {
    init{
        println("Aluno registrado com sucesso !!")
        println("Nome: $nome $sobrenome")
        println("Código: $codigoAluno")
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        if (other !is Aluno) return false

        if (codigoAluno == other.codigoAluno) return true

        return true
    }
}