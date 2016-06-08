package useful;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Reminder {

	public static void main(String[] args) {
		new Reminder().newEvent(2016, 06, 06, 19, 50, "Code more");

	}

	@SuppressWarnings("deprecation")
	public void newEvent(int year, int month, int day, int hour, int min,
			String reminder) {
		String input = year + "/0" + month + "/0" + day + " " + hour + ":"
				+ min + ":" + "00";
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		Date date = new Date();
		date.setSeconds(0);
		System.out.println("The current date is " + dateFormat.format(date));
		System.out.println("You will be reminded on " + input);

	//	while (dateFormat.format(date) != input) {
			if (dateFormat.format(date).equals(input)) {
				JOptionPane.showMessageDialog(null, reminder);
			}
		}
	}

//}
