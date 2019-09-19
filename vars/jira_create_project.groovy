// def request = libraryResource 'data.json'
import groovy.json.JsonSlurper 


def call(){
def request = libraryResource 'data.json'
def jsonSlurper = new JsonSlurper()
def object = jsonSlurper.parseText(request)

println object.name
}
