def call(String imageName, String imageTag = "latest") {
    sh """
        docker build -t ${imageName}:${imageTag} .
    """
}
