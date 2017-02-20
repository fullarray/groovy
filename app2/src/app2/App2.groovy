package app2
import groovy.json.*;

class App2 {
	static main(args) {
	    def output = JsonOutput.toJson([ 
			new Employee (name: 'John Doe', ID: 1, salary:3000.00),
			new Employee(name: 'Mark Smith', ID:1, salary:4000.00)]);
		println(output);
	}
}
