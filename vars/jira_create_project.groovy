// def request = libraryResource 'data.json'
import groovy.json.JsonSlurper 



@NonCPS
x(String data){
def jsonSlurper = new JsonSlurper() 
 def resultJson = jsonSlurper.parseText(request)
 println resultJson.name
// println resultJson.name
}
def call(){
 def request = libraryResource 'data.json'
 x(request)
}
