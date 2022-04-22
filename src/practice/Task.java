package practice;

import java.time.LocalDate;

//public class Task {
//	public class Dates{
////		日付（LocalDate型）
//		List<LocalDate> dates = new ArrayList<>();
//	}
//	
//	public class Contents{
////		タスク内容（String型）
//		List<String> taskContents = new ArrayList<>();
//	}
//}


public class Task {
	  private LocalDate date;
	  private String action;
	  
	  public Task(LocalDate date, String action) {
		  this.date = date;
		  this.action = action;
	  }
	  public LocalDate getDate() {
		  return this.date;
	  }
	  
	  public String getAction() {
		  return this.action;
	  }
}