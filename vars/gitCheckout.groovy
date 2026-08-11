// vars/gitCheckout.groovy
def call(String branch, String repository) {
    git branch: ${branch}, url: ${repository}
}