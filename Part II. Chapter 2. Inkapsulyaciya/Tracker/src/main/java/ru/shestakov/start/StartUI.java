package ru.shestakov.start;

import ru.shestakov.models.*;

public class StartUI {
	
	public static void main(String[] args) {
		
		Tracker tracker = new Tracker();
		
		// add
		
		Task task1 = new Task("first task", "first desc", System.nanoTime());
		tracker.add(task1);
		
		Task task2 = new Task("second task", "second desc", System.nanoTime());
		tracker.add(task2);
		
		Task task3 = new Task("third task", "third desc", System.nanoTime());
		tracker.add(task3);
		
		Task task4 = new Task("forth task", "forth desc", System.nanoTime());
		tracker.add(task4);
		
		// update
		
		Task task5 = new Task("fifth task", "fifth desc", System.nanoTime());
		task5.setId(task2.getId());
		tracker.update(task5);
		
		// delete
		
		tracker.delete(task1);
		
		// find by description
		
		System.out.println("founded task is: " + tracker.findByName("third task"));
		
		// find by name
		
		System.out.println("founded task is: " + tracker.findByDesc("forth desc"));
		
		// find by create
		
		System.out.println("founded task is: " + tracker.findByCreate(271545279656360L));
		
		// add comment
		
		Comment comment = new Comment(task3.getId(), "Some kind of comment");
		tracker.addComment(comment);
		for (Comment nextComment : task3.getComments()) {
			if(nextComment != null) {
				System.out.println("task comment is: " + nextComment);
			}
		}
				
		// print all
		
		for (Item item : tracker.getAll()) {
			if(item != null) {
				System.out.println(item.getName());
			}
		}
		
	}
	
}