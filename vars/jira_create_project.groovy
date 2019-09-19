// def request = libraryResource 'data.json'
import groovy.json.JsonSlurper 

@NonCPS
def getJSONData(String json) { 
   json.each {
      print “${it.name}”
   }
   return a
}
def call(){
 def request = libraryResource 'data.json'
 def jsonSlurper = new JsonSlurper() 
 def resultJson = jsonSlurper.parseText(request)
 def x = getJSONData(resultJson)

println object.name
}
