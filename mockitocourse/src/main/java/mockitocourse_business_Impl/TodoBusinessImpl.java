package mockitocourse_business_Impl;

import java.util.ArrayList;
import java.util.List;

import mockitocourse_src.TodoService;

public class TodoBusinessImpl {
	private TodoService todoservice;


	public TodoBusinessImpl(TodoService todoservice) {
		super();
		this.todoservice = todoservice;
	}
	
	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String> allTodos = todoservice.retrieveTodos(user);
		for (String todo : allTodos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
	public void deleteTodosNotRelatedToSpring(String user) {
		List<String> allTodos = todoservice.retrieveTodos(user);
		for (String todo : allTodos) {
			if (!todo.contains("Spring")) {
				todoservice.deleteTodo(todo);
			}
}
	}
}
