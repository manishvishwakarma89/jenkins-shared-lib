def call(String imageName, String tag, String dockerHubUser){
    withCredentials([usernamePassword(
        credentialsId: 'dockerHubCreds',
        usernameVariable: 'USER',
        passwordVariable: 'PASS'
    )]){
        sh """
            docker login -u ${USER} -p ${PASS}
            docker tag ${imageName}:${tag} ${dockerHubUser}/${imageName}:${tag}
            docker push ${dockerHubUser}/${imageName}:${tag}
        """
    }
}
