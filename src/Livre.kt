class Livre(titre: String, val auteur: String) : Media(titre), Empruntable, Consultable {
    private var estEmprunte: Boolean = false

    override fun emprunter() {
        if (!estEmprunte) {
            estEmprunte = true
            println("Le livre '$titre' a été emprunté.")
        } else {
            println("Le livre '$titre' est déjà emprunté.")
        }
    }

    override fun retourner() {
        if (estEmprunte) {
            estEmprunte = false
            println("Le livre '$titre' a été retourné.")
        } else {
            println("Le livre '$titre' n'a pas été emprunté.")
        }
    }

    override fun consulter() {
        println("Consultation du livre '$titre' sur place.")
    }

    override fun titreMedia(): String {
        return titre
    }

    override fun afficher() {
        super.afficher()
        println("Auteur: $auteur")
    }
}
