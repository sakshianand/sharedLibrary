
def call(){
  httpRequest authentication: 'jira_password', customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json'], [maskValue: false, name: 'Accept', value: 'application/json']], httpMode: 'POST', requestBody: '''{
    "key": "EX",
    "name": "Example",
    "projectTypeKey": "business",
    "projectTemplateKey": "com.atlassian.jira-core-project-templates:jira-core-project-management",
    "description": "Example Project description",
    "lead": "ashnim"
    "assigneeType": "PROJECT_LEAD"
}''', responseHandle: 'NONE', url: 'https://github.com/sakshianand/sharedLibrary.git'
}
