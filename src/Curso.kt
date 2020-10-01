import javax.naming.InitialContext

class Curso( var nome: String, var codigoCurso: Int, var quantidadeMaxAluno :Int) {


       override fun equals(other: Any?): Boolean {
        if (this === other) return true

        if (other !is Curso) return false

        if (codigoCurso == other.codigoCurso) return true

        return true
    }
}