fun main() {
    val livre1 = Livre("Kotlin apprendre à programmer", "JetBrains")
    val livre2 = Livre("Notion avancer de Kotlin", "John Doe")
    val bibliotheque = Bibliotheque()

    bibliotheque.emprunter(livre1)

    bibliotheque.emprunter(livre2)

    bibliotheque.afficherEmprunts()

    bibliotheque.retourner(livre1)

    bibliotheque.afficherEmprunts()

    livre2.consulter()
}
