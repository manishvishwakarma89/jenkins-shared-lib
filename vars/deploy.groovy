def call(){
    sh """
        docker stop notes-app || true
        docker rm notes-app || true
        docker run -d \
          --name notes-app \
          -p 8000:8000 \
          manishvishwa801/notes-app:latest
    """
}
