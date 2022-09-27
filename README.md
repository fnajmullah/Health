# Health
this is java health system


Git global setup
git config --global user.name "Test test"
git config --global user.email "test@test.com"

Create a new repository
git clone urlgit
cd projectfolder
git switch -c main
touch README.md
git add README.md
git commit -m "add README"
git push -u origin main


Push an existing folder
cd existing_folder
git init --initial-branch=main
git remote add origin urlgit
git add .
git commit -m "Initial commit"
git push -u origin master


Push an existing Git repository
cd existing_repo
git remote rename origin old-origin
git remote add origin urlgit
git push -u origin --all
git push -u origin --tags
