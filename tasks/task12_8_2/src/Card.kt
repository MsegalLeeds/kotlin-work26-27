// Task 12.8.2: class to represent playing cards
class Card(
    val rank: Rank,
    val suit: Suit
){
    override fun toString() = "$rank$suit"
}
