// def request = libraryResource 'data.json'
import groovy.json.JsonSlurper 



@NonCPS
x(String data){
def jsonSlurper = new JsonSlurper() 
def resultJson = jsonSlurper.parseText(data)
def projectName = '"'+resultJson.name+'"'
def length = resultJson.name.size()
 if(length>=3){
  key=resultJson.name.substring(0, Math.min(resultJson.name.length(), length)).toUpperCase();
 }
 println key



 
}
def call(){
 def request = libraryResource 'data.json'
 x(request)
}
