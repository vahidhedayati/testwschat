package testwschat

import grails.converters.JSON
import grails.web.JSONBuilder
import groovy.json.JsonBuilder

class TestController {

	def server() { }
	
	def client() { }
	
    def index() { }
	def index2() { }
	def newPage() {}
	def eventPage() {
		def myJson = new JsonBuilder()
		myJson {
				delegate.clearPage "true"
				delegate.myProcess "default"
		}

		[myJson: myJson]

	}
	def eventPage2() {
		

	}
}
