class Renderer {

    fun render(

        all: List<Technology>,

        search: List<Technology>

    ) {

        println(

            "Loading archive...\n"

        )

        println(

            "Entries: ${all.size}\n"

        )

        println(

            "Search: DOS\n"

        )

        search.forEach {

            println(it.name)

            println(

                "Released: ${it.year}"

            )

            println()

            println(

                "Category: ${it.category}"

            )

            println()

        }

        println("Timeline\n")

        Timeline()

            .build(all)

            .forEach {

                println(

                    "${it.year} ${it.name}"

                )

            }

    }

}
