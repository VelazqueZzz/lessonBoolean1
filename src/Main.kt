const val ALL_TABLES = 13

fun main() {
    val todayReservation = 13 - ALL_TABLES
    val tomorrowReservation = ALL_TABLES - 9

    val accessToday: Boolean = todayReservation > 0
    val accessTomorrow: Boolean = tomorrowReservation > 0

    println("Доступность столиков на сегодня: $accessToday,\nДоступность столиков на завтра: $accessTomorrow")


}