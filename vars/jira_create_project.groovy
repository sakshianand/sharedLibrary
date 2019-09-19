// def request = libraryResource 'data.json'
import groovy.json.JsonSlurper 

@NonCPS
def getJSONData(String json) { 
   def jsonSlurper = new JsonSlurper() 
   def resultJson = jsonSlurper.parseText(request)
   resultJson.each {
      print “${it.name}”
   }
}
def call(){
 def request = libraryResource 'data.json'
 getJSONData(request)

println object.name
}
