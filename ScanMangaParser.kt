fun main() {
    val mangaUrl = "https://m.scan-manga.com/manga/one-piece"

    val chapters = ScanMangaParser.getChapters(mangaUrl)
    println("Chapitre(s) trouvés :")
    chapters.forEach { println("${it.title} -> ${it.url}") }

    if (chapters.isNotEmpty()) {
        val images = ScanMangaParser.getImages(chapters.first().url)
        println("\nImages du premier chapitre :")
        images.forEach { println(it) }
    }
}
