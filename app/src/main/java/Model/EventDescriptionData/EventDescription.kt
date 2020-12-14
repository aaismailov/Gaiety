package Model.EventDescriptionData

import Model.EventData.Event

data class EventDescription(
    val access_status: String,
    val ad_partner_percent: Int,
    val age_limit: String,
    val categories: List<Category>,
    val created_at: String,
    val description_html: String,
    val description_short: String,
    val ends_at: String,
    val id: Int,
    val is_sending_free_tickets: Boolean,
    val locale: String,
    val location: Location,
    val moderation_status: String,
    val name: String,
    val organization: Organization,
    val personal_link_title: String,
    val personal_links: List<String>,
    val poster_image: PosterImage,
    val properties: List<String>,
    val questions: List<Question>,
    val registration_data: RegistrationData,
    val reservation_period: Int,
    val starts_at: String,
    val status: String,
    val ticket_types: List<TicketType>,
    val tickets_limit: Int,
    val url: String
)