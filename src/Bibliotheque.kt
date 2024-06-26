class Bibliotheque {
    private val emprunts: MutableList<Empruntable> = mutableListOf()

    fun emprunter(media: Empruntable) {
        media.emprunter()
        emprunts.add(media)
        println()
    }

    fun retourner(media: Empruntable) {
        media.retourner()
        emprunts.remove(media)
        println()
    }

    fun afficherEmprunts() {
        println("Emprunts en cours:")
        emprunts.forEach { println(it.titreMedia()) }
        println()
    }
}
