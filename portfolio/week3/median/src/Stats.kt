// Task 7.7.1: statistics functions
fun median(floatList: List<Float>) = floatList.sorted().let {
    if (it.size == 0){
        throw IllegalArgumentException()
    }
    else if (it.size % 2 == 0) {
        ((it[it.size / 2] + it[(it.size - 1) / 2]) / 2)
    }
    else{
        it[it.size / 2]
    }
}