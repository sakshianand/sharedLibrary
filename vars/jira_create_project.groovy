// def request = libraryResource 'data.json'
import groovy.json.JsonSlurper 

x(String data){
 println("gg")
 
// println resultJson.name
}
def call(){
 def request = libraryResource 'data.json'
 def jsonSlurper = new JsonSlurper() 
 def resultJson = jsonSlurper.parseText(request)
 //println resultJson.name
 httpRequest authentication: 'jira_password', 
    customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json'], 
                    [maskValue: false, name: 'Accept', value: 'application/json']], 
    httpMode: 'POST', requestBody: '''{
    "key": "PIZ",
    "name": $resultJson.name,
    "projectTypeKey": "business",
    "projectTemplateKey": "com.atlassian.jira-core-project-templates:jira-core-project-management",
    "description": "Example Project description",
    "lead": "ashnim",
    "assigneeType": "PROJECT_LEAD"
}''', responseHandle: 'NONE', url: 'http://ec2-18-191-16-16.us-east-2.compute.amazonaws.com:8080/rest/api/2/project'
}
