package pagination

data class Page(
    val pageNumber: Int,
    val size: Int,
    val totalPages: Int
)
