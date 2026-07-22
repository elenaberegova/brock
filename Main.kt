fun main() {

    val repository =

        TechnologyRepository()

    val technologies =

        repository.load()

    val search =

        SearchEngine()

            .search(

                technologies,

                Config.SearchKeyword

            )

    Renderer()

        .render(

            technologies,

            search

        )

    Statistics()

        .print(

            technologies

        )

}
