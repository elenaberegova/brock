class CategoryFilter {

    fun count(

        list: List<Technology>,

        category: String

    ) = list.count {

        it.category == category

    }

}
