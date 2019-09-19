// def request = libraryResource 'data.json'
import groovy.json.JsonSlurper 



@NonCPS
x(String data){
def jsonSlurper = new JsonSlurper() 
def resultJson = jsonSlurper.parseText(data)
 print '"'+resultJson.name+'"'
 
}
def call(){
 def request = libraryResource 'data.json'
 x(request)
}
