@NonCPS
createIssues(){
def projKey = '"'+key+'"'
 
 httpRequest authentication: 'jira_password', customHeaders: [[maskValue: false, name: 'Content-Type', value: 'application/json'], [maskValue: false, name: 'Accept', value: 'application/json']], httpMode: 'POST', requestBody: '''{
    "issueUpdates": [
{
"update":{},
"fields": {
"project":
{
 "key": "DEM"
},
"summary": "this is summary 1",
"description": "this is description",
"issuetype": {
	"name": "Task"
},
"assignee": {
	"name": "ashnim"
},
"reporter": {
	"name": "ashnim"
}

}
}
]
}''', responseHandle: 'NONE', url: 'http://ec2-18-191-16-16.us-east-2.compute.amazonaws.com:8080/rest/api/2/issue/bulk'

 

 

}

def call(){
 createIssues(request)
}
