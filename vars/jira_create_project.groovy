// def request = libraryResource 'data.json'
import groovy.json.JsonSlurper 

@NonCPS
createIssues(String x){
 println x
}



@NonCPS
createProject(String data){
def jsonSlurper = new JsonSlurper() 
def resultJson = jsonSlurper.parseText(data)
def projectName = '"'+resultJson.name+'"'
def length = 3
def projLength = resultJson.name.size()
 if(projLength>=3){
  key=resultJson.name.substring(0, Math.min(projLength, length)).toUpperCase();
 }
 else {
   def appendStr = "";
   int currentLength=length;
   int len = currentLength%projLength;
   int repeat = currentLength/projLength;
   for (int i=0;i<repeat;i++) {
    appendStr = appendStr + resultJson.name;
   }
   appendStr=appendStr+resultJson.name.substring(0, Math.min(projectName.length(), len));
   key=appendStr.toUpperCase();
 }
 def projKey = '"'+key+'"'
 



createIssues(projKey)

 
}
def call(){
 def request = libraryResource 'data.json'
 createProject(request)
}
