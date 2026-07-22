class Timeline {

    fun build(

        list: List<Technology>

    ) =

        list.sortedBy {

            it.year

        }

}
