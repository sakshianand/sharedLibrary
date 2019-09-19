// def request = libraryResource 'data.json'
import groovy.json.JsonSlurper 


def call(){
def request = libraryResource 'data.json'
def config =  jsonParse(request)

    def db = config["name"]
    println db
}
