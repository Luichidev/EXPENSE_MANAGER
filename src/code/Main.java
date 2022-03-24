package code;

import java.sql.Date;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Expense expense = new Expense("Rest. ca la pagesa", 100, new Date(2010-1900, 1,1));
		expense.addPayer("Luis", 50);
		expense.addPayer("Enric", 50);
			
		User user = new User("Luis", "luichidev@gmail.com", null);	
		Trip newtrip = new Trip(null, new Date(2021-1900, 4, 7), "Viaje a las Canarias");
		newtrip.addUser(user);
		newtrip.addExpense(expense);
		
		AppManager m = new AppManager();
		m.AddTrip(newtrip);
		
		String s = m.toString();
		final String styles = "<html><body style='width: %1spx'>%1s";
		JOptionPane.showMessageDialog(null, String.format(styles, 200, s));
		
	}
}
