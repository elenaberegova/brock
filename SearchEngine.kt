class SearchEngine {

    fun search(

        list: List<Technology>,

        keyword: String

    ) = list.filter {

        it.name.contains(

            keyword,

            true

        )

    }

}
