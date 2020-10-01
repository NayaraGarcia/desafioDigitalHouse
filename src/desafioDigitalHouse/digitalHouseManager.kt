package desafioDigitalHouse

class digitalHouseManager(var alunos: MutableMap<Int, Aluno>,
                          var professores: MutableMap<Int, Professor>,
                          var cursos: MutableMap<Int, Curso>,
                          var matriculas: MutableMap<Curso, Matricula>) {
}