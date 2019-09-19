// def request = libraryResource 'data.json'
import groovy.json.JsonSlurperClassic 



    @NonCPS
def jsonParse(def json) {
    new groovy.json.JsonSlurperClassic().parseText(request)
}

def call(){
def request = libraryResource 'data.json'
def config =  jsonParse(request)

    def db = config["name"]
    println db
}
