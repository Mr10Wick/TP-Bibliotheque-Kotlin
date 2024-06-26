abstract class Media(val titre: String) {
    companion object {
        private var quantiteMedias: Int = 0
    }

    init {
        quantiteMedias++
    }

    open fun afficher() {
        println("Titre: $titre")
    }
}

