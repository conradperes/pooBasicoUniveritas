package classesAvancadasGabarito;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Semana {
	private int weeknr;
	private int year;

	public Semana(int weeknr, int year) {
		this.weeknr = weeknr;
		this.year = year;
	}

	public Iterator getDays() {
		return new DayIterator(this);
	}

	public int getWeeknr() {
		return weeknr;
	}

	public int getYear() {
		return year;
	}

	public static class DayIterator implements Iterator {
		private int index = 0;
		private Calendar cal = null;

		DayIterator(Semana aWeek) {
			cal = new GregorianCalendar();
			cal.clear();
			cal.set(Calendar.YEAR, aWeek.getYear());
			cal.set(Calendar.WEEK_OF_YEAR, aWeek.getWeeknr());
		}

		public boolean hasNext() {
			return index < 7;
		}

		public Object next() {
			cal.set(Calendar.DAY_OF_WEEK, index++);
			return cal.getTime();
		}

		public void remove() {
			// not implemented
		}
	}

	public static void main(String[] args) {
		// list the days of the week
		try {
			String mes = JOptionPane.showInputDialog("Digite o numero de dias da senana:", null);
			String ano = JOptionPane.showInputDialog("Digite o ano:", null);
			int weeknr = Integer.parseInt(mes);
			int year = Integer.parseInt(ano);
			Semana wk = new Semana(weeknr, year);
			StringBuilder sb = new StringBuilder();
			for (Iterator i = wk.getDays(); i.hasNext();) {
				//System.err.println(i.next());
				sb.append(i.next()+"\n");
			}
			
			JOptionPane.showMessageDialog(null, sb.toString(), "sa??da do programa", 1);
		} catch (NumberFormatException x) {
			System.err.println("Illegal week or year");
		}
	}

}
