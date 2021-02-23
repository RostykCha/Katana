package Tasks

class Task1_LeapYears {
    fun verifyLeapYear(year: Int): Boolean {
        var result = false
        if (year < 0) {
            throw Error("year has invalid data: $year")
        }
        if (year % 4 == 0) {
            result = true
        } else if (year % 100 == 0) {
            result = false
        } else if (year % 400 == 0) {
            result = true
        }
        return result
    }
}