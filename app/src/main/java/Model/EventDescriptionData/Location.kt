package Model.EventDescriptionData

data class Location(
    val address: String,
    val city: String,
    val coordinates: List<Float>,
    val country: String
)