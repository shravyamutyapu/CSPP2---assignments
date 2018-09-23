// import java.util.*;
// import java.io.*;
// public class Todoist {
// 	static Task[] array;
// 	int size;
// 	Todoist() {
// 		final int n = 10;
// 		size = 0;
// 		array = new Task[n];
// 	}
// 	public void add(final Task obj) {
// 		if (Todoist.array.length == size) {
// 			array = resize();
// 		}
// 		array[size++] = obj;

// 	}
// 	public Task[] resize() {
// 		return Arrays.copyOf(array, 2 * array.length);
// 	}


// public String toString() {
// 	for (Task t : array ) {
// 		System.out.println(Task.toString());
// 	}
// }
// public Task getNextTask(String nameOfThePerson) {
// 	for (Task i : array) {
// 		if (nameOfThePerson.equals(Task[i].person) && Task[i].status.equals("todo")) {
// 			return Task[i];
// 		}
// 	}
// 	return null;
// }
// public getNextTask(String name3,int taskcount){
// 	return
// }
// }
