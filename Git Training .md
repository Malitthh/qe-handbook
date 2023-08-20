# Git Training

### Cloning a Repository to Local

1. Install Git: Ensure that Git is installed on your system.
2. Create Folder Structure: Create a folder structure named "Source/Repos/Project" to organize your repositories.
3. Open Git Bash: Navigate to the "Project" folder and open Git Bash there.
4. Copy Clone URL: Obtain the URL of the repository you want to clone (usually provided by the repository hosting service like GitHub, GitLab, or Bitbucket).
5. Clone Repository: In Git Bash, use the command git clone <repository_url> to clone the repository to your local machine.
6. Switch Branch: Use git checkout <branch_name> to switch to the desired branch (replace <branch_name> with the actual branch name).

### Committing Your Changes
1. Check Status: Use git status to see the status of your local branch and the main/master branch.
2. Pull from Main/Master: Run git pull origin main (or master) to update your local branch with the latest changes from the main/master branch.
3. Add Files: Use git add * to stage all changes, or git add <file_name> to stage specific files.
4. Commit Changes: Commit staged changes using git commit -m "commit message" with an appropriate commit message explaining your changes.
5. Pull Again: Perform another git pull origin main to ensure your branch is up-to-date before pushing.
6. Push Changes: Use git push to send your committed changes to the remote repository.
7. Pull Requests (PRs): If your workflow includes pull requests, this step might involve creating a PR for code review.
8. Pull Again: After PR review, do another git pull origin main to incorporate any final changes before proceeding.
9. Check Status: Use git status again to check the status after the pull.

### Commit Message Format
Commit messages should follow a standard format to convey the purpose of the commit. 
You've provided various message types like "feat," "fix," "docs," etc., which help categorize the changes. 
For example:
* feat: for feature additions
* fix: for bug fixes
* docs: for documentation changes
* style: for code style changes
* refactor: for code refactoring
* perf: for performance improvements
* test: for adding tests
* build: for build-related changes
* ci: for CI/CD related changes
* revert: for reverting changes

git commit -m "docs: Correct README formatting"

Each commit message should be concise yet informative.

Remember that the provided instructions are just one approach, and Git workflows can vary based on team practices and project requirements. 
It's essential to understand Git concepts and tailor your workflow accordingly.
