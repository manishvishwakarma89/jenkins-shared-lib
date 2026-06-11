def call(String imageName, String tag, String dockerHubUser){
    withCredentials([usernamePassword(
        credentialsId: 'dockerHubCreds',
        usernameVariable: 'USER',
        passwordVariable: 'PASS'
    )]){
        sh """
            echo ${PASS} | docker login -u ${USER} --password-stdin
            docker tag ${imageName}:${tag} ${dockerHubUser}/${imageName}:${tag}
            docker push ${dockerHubUser}/${imageName}:${tag}
        """
    }
}
