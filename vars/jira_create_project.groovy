// def request = libraryResource 'data.json'
import groovy.json.JsonSlurper 




x(String data){
 println("gg")
 
// println resultJson.name
}
def call(){
 def request = libraryResource 'data.json'
 x("gg");
}
