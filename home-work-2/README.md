# Home Work 2

0. Create private project repository at GitLab (repo name could be something like **hw2**)
1. Create group with list of mentors 
2. Grant access to your project for created group (access right at least Reporter)
3. Push downloaded project **WITHOUT ANY CHANGES** to remote repository  
`git init`                
`git remote add origin git@gitlab.com:your_account_name/hw2.git`  
`git add .`  
`git commit -m "Initial commit"`  
`git push -u origin master`  

4. Create local branch of this project on your computer  (create it from **master** branch and name it like **fix_tests**) 
5. Complete home work by implementing logic described in tests:  
`src/test/java/pm/academy/hw2/ArraysTest.java`  
`src/test/java/pm/academy/hw2/OopTest.java`  
_Implement necessary functionality at ArraysHomeWorkClass.java. Rewrite methods at class to pass tests from ArraysTest.java. 
Desired behavior of each method is described at HomeWorkClassTest.java at corresponding test.  
!!! Do not edit ArraysTest.java and OopTest.java   
!!! Do not change methods signature at ArraysHomeWorkClass.java
Read comments in tests carefully  
Run test with ctrl+shift+F10   
Your goal is fix code and to make all tests "green"_

6. Make these changes only in your new branch, commit and push changes in this branch to GitLab, do not merge it to **master** locally

7. Now, when changes are pushed to GitLab, you have yo create Merge request.
Open Merge request tab in **your** project on GitLab

8. Click on **New merge request** button

9. In new window on the left: choose name of your project and **your last branch**, on the right, the same name of project and **master** branch, click on **Compare branches and continue** button

10. On the next page scroll down and click on **Create merge request ** button, it will redirect you to page of your merge request

11. Copy link of this page, and upload it to LMS. **!!!!!! Please do not click on _MERGE_ button !!!!!!**
