def call(string url, string branch){
  echo 'This is cloning the code'
  git url: 'https://github.com/manishvishwakarma89/django-notes-app.git', branch: 'main'
  echo 'Code cloned successfully'
}
