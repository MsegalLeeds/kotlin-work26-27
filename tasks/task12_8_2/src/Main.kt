// Task 12.8.2: program to manipulate playing cards
fun main(){
    val deck = mutableListOf<Card>()
    for (rank in Rank.entries){
        for (suit in Suit.entries){
            deck.add(Card(rank, suit))
        }
    }
    deck.shuffle()
    println(deck)
}