package datetimeformatting;

import java.util.Calendar;

public class CalendarEx {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2015,7,31);  //month 의 경우 0부터 시작하기 때문에 8월이면 7로 지정
    }
}
