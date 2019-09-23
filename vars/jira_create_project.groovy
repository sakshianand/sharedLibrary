// def request = libraryResource 'data.json'
import groovy.json.JsonSlurper 



@NonCPS
x(String data){
def jsonSlurper = new JsonSlurper() 
def resultJson = jsonSlurper.parseText(data)
def projectName = '"'+resultJson.name+'"'
def length = 3
def projLength = resultJson.name.size()
 if(length>=3){
  key=resultJson.name.substring(0, Math.min(projLength, length)).toUpperCase();
 }

 httpRequest authentication: 'jira_password', 
    customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json'], 
                    [maskValue: false, name: 'Accept', value: 'application/json']], 
    httpMode: 'POST', requestBody: """{
    "key": ${key},
    "name": ${projectName},
    "projectTypeKey": "business",
    "projectTemplateKey": "com.atlassian.jira-core-project-templates:jira-core-project-management",
    "description": "Example Project description",
    "lead": "ashnim",
    "assigneeType": "PROJECT_LEAD"
}""", responseHandle: 'NONE', url: 'http://ec2-18-191-16-16.us-east-2.compute.amazonaws.com:8080/rest/api/2/project'


 
}
def call(){
 def request = libraryResource 'data.json'
 x(request)
}
