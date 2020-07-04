import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Holiday {
	public boolean isXmas(){
		//100 lines code here...
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd");
		LocalDate localDate = getNow();
		//100 lines code here...
		return dtf.format(localDate).equals("12/25");
	}

	protected LocalDate getNow() {
		return LocalDate.now();
	}

}
