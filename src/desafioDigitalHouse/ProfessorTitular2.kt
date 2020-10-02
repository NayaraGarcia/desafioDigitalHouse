package desafioDigitalHouse

class ProfessorTitular2 (nome: String,
                         sobrenome: String,
                         tempoDeCasa: Int,
                         codigoProfessor: Int,
                         especialidade: String) : Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {

    init{
        println("Professor Titular registrado com sucesso !!")
        println("Nome: $nome $sobrenome\"")
        println("Tempo de Casa: $tempoDeCasa")
        println("Código: $codigoProfessor")
        println("Especialidade: $especialidade")
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        if (other !is Professor) return false

        if (codigoProfessor == other.codigoProfessor) return true

        return true
    }}