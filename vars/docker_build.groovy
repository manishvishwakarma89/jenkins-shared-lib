def call(String imageName, String imageTag = "latest") {
    echo "Building image ${imageName}:${imageTag}"

    sh """
        docker build \
        -t ${imageName}:${imageTag} \
        .
    """
}
