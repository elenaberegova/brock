class Statistics {

    fun print(

        list: List<Technology>

    ) {

        val filter =

            CategoryFilter()

        println()

        println("Statistics\n")

        println(

            "Languages : " +

            filter.count(

                list,

                "Programming Language"

            )

        )

        println(

            "Operating Systems : " +

            filter.count(

                list,

                "Operating System"

            )

        )

        println(

            "Formats : " +

            filter.count(

                list,

                "File Format"

            )

        )

    }

}
