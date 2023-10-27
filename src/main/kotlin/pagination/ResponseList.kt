package pagination

data class ResponseList<T>(
    val list:List<T>,
    val page: Page
)
