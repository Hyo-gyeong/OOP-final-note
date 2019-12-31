public class Date  {
	private int year; 
	private int month; 
	private int day;
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public Date() {
		this(1900, 1, 1);
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	
	public static int compareDate(Date x, Date y) {
		if (x.year > y.year) {
			return 1;
		}
		else if (x.year == y.year){
			if (x.month > y.month) {
				return 1;
			}
			else if (x.month == y.month){
				if (x.day > y.day) {
					return 1;
				}
				else if (x.day == y.day){
					return 0;
				}
				else {
					return -1;
				}
			}
			else {
				return -1;
			}
		}
		else {
			return -1;
		}
	}
	
	public String toString() {
		return getYear()+"�� "+getMonth()+"�� "+getDay()+"��";
	} 
}