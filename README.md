# springjenkinsdocker

this is basic springboot application 
we have integrated this application to docker via jenkins pipeline
jenkins will create docker image and push to docker to docker hub and this process will be done by jenkins .
we juz need to create docker file and push to git hub 
we need to integrate github to jenkins by creating new job and need to run the job 
![image](https://user-images.githubusercontent.com/115841974/211711934-b4ab4527-b128-4f92-8fcb-519f6aadff23.png)

![image](https://user-images.githubusercontent.com/115841974/211712031-708fefc5-f8c3-464d-b1cd-7e28c8a1daf9.png)
the above output is before docker plugins added 
next we need to install docker plugin in our configured job  under build section 
![image](https://user-images.githubusercontent.com/115841974/211712218-92d34675-56c4-47ad-908c-4000954f6931.png)
and need to give docker credentials
and save 
and build now 
![image](https://user-images.githubusercontent.com/115841974/211712323-64edd265-6955-4c4e-893d-6285b22b3d39.png)

![image](https://user-images.githubusercontent.com/115841974/211712363-2f857234-f8ea-4326-8b3a-cf547da86b17.png)
jenkins will craete docker and push to docker hub 


we can see docker images 
![image](https://user-images.githubusercontent.com/115841974/211712470-4c2d091b-484d-4eb4-a0bf-d0090678fbd2.png)

and we can run docker image by below command 
 docker run -p 9090:8080 sindhujaalladi/springdocker
![image](https://user-images.githubusercontent.com/115841974/211712750-cf6b6a9b-5bc5-4414-a1c9-4299a199d35a.png)
application will start 
![image](https://user-images.githubusercontent.com/115841974/211712908-c2b94ab8-2678-4aac-9b88-217e0dbe471f.png)

