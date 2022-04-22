package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//タスク内容（String型）
//		Task t1 = new Task();
//		Task.Contents tc = t1.new Contents();
//		tc.taskContents.add("牛乳を買う");
//		tc.taskContents.add("○○社面談。");
//		tc.taskContents.add("手帳を買う");
//		tc.taskContents.add("散髪に行く。");
//		tc.taskContents.add("スクールの課題を解く。");
//		
//		//日付（LocalDate型）
//		Task t2 = new Task();
//		Task.Dates td = t2.new Dates();
//		LocalDate date1 = LocalDate.of(2021, 10, 21);
//		LocalDate date2 = LocalDate.of(2021, 9, 15);
//		LocalDate date3 = LocalDate.of(2021, 12, 4);
//		LocalDate date4 = LocalDate.of(2021, 8, 10);
//		LocalDate date5 = LocalDate.of(2021, 11, 9);
//		td.dates.add(date1);
//		td.dates.add(date2);
//		td.dates.add(date3);
//		td.dates.add(date4);
//		td.dates.add(date5);
//		
//		//日付とタスク内容をまとめたコレクション
//		List<String> plan = new ArrayList<>();
//		//for文でplanコレクションに代入
//		for(int i = 0; i<td.dates.size(); i++) {
//			plan.add(td.dates.get(i).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日")) + ":" + tc.taskContents.get(i));
//		}
//		//日付順に並び替える処理
//		Collections.sort(plan);
//		//コレクションの中身を出力
//		for(String test : plan) {
//			System.out.println(test);
//		}
		
		
		List<Task> history = new ArrayList();
		history.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う"));
		history.add(new Task(LocalDate.of(2021, 9, 15), "○○社面談。"));
		history.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う。"));
		history.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く。"));
		history.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く。"));
		
		Collections.sort(history, (a,b)->a.getDate().compareTo(b.getDate()));
		for(Task task: history) {
			System.out.println(task.getDate().format(DateTimeFormatter.ofPattern("yyyy年MM月dd日")) + ":" + task.getAction());
		}
		
		
		
		
		
		
		
	}

}
