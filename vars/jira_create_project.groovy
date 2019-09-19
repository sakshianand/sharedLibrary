// def request = libraryResource 'data.json'
import groovy.json.JsonSlurper 

x(String data){
 println("gg")
 
// println resultJson.name
}
def call(){
 def request = libraryResource 'data.json'
 def jsonSlurper = new JsonSlurper() 
 def resultJson = jsonSlurper.parseText(request)
 println resultJson.name
 //x(request)
}
