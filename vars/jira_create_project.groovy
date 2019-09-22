// def request = libraryResource 'data.json'
import groovy.json.JsonSlurper 



@NonCPS
x(String data){
def jsonSlurper = new JsonSlurper() 
def resultJson = jsonSlurper.parseText(data)
def projectName = '"'+resultJson.name+'"'
println projectName
def length = resultJson.size()
println resultJson


 
}
def call(){
 def request = libraryResource 'data.json'
 x(request)
}
