package app1
import groovy.json.*;

class App1 {
	static main(args) {
		def jsonSlurper = new JsonSlurper();
		def object = jsonSlurper.parseText('{ "name": "John", "ID" : "1"}');

		println(object.name);
		println(object.ID);
	}
}
