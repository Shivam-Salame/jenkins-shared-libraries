def call(String url, String branch){
  echo "This is copying the code"
  git url: "${url}", branch: "${main}"
  echo "code cloned successfully"
}
