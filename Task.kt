import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

fun task1(today: MyDate): MyDate = today.addTimeIntervals(YEAR, 1)
                                        .addTimeIntervals(WEEK, 1)

fun task2(today: MyDate): MyDate = today.addTimeIntervals( YEAR, 2)
                                        .addTimeIntervals( WEEK, 3)
                                        .addTimeIntervals( DAY, 5)
