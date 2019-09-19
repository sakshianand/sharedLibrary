httpRequest authentication: 'jira_password', customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json'], [maskValue: false, name: 'Accept', value: 'application/json']], httpMode: 'POST', requestBody: '''{
    "key": "ARP",
    "name": "arpita",
    "projectTypeKey": "business",
    "projectTemplateKey": "com.atlassian.jira-core-project-templates:jira-core-project-management",
    "description": "Example Project description",
    "lead": "ashnim",
    "assigneeType": "PROJECT_LEAD"
}''', responseHandle: 'NONE', url: 'http://ec2-18-191-16-16.us-east-2.compute.amazonaws.com:8080/rest/api/2/project'
