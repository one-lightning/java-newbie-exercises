/**
 * Name: Cristina Moloman    
 * Date:  01/06/2019   
 * Exercise: #25
 * Purpose:  Flow control/CalendarMeeting
 */

package conditional;

public class CalendarMeeting {

	public static void main(String[] args) {

		short currentDay = 25;
		short currentMonth = 8;
		short currentYear = 2019;

		short scheduledDay = 21;
		short scheduledMonth = 8;
		short scheduledYear = 2019;

		boolean isDayPassed = (currentDay > scheduledDay);
		boolean isMonthPassed = (currentMonth > scheduledMonth);
		boolean isYearPassed = (currentYear > scheduledYear);
		boolean isScheduledMeetingPassed = (isDayPassed && isMonthPassed && isYearPassed);

		if ((isScheduledMeetingPassed)) {

			System.out.println("The meeting has already passed. You missed it.");
			return;
		}

		System.out.println("You have an upcoming meeting soon.");

	}

}
