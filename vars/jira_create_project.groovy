// def request = libraryResource 'data.json'
import groovy.json.JsonSlurper 



@NonCPS
x(String data){
 println("gg")
 
// println resultJson.name
}
def call(){
 def request = libraryResource 'data.json'
 x("gg");
}
