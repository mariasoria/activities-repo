## Activities Repo

This app it is a repository of activities to do with kids. You can add new activities or edit the created ones. 
Before the installation it is necessary to add the entries to the database. There are some examples in the folder src/main/resources/dbExamples.

To run the app is necessary:
1. Start mysql server: `mysql.server start`
2. Create a configuration:
    
    * New configuration: `Spring boot`
    * As main class: `es.mariasoria.activitiesrepo.ActivitiesrepoApplication`
    * Before lunch: add `build`
3. Open browser in: `http://localhost:8090/activities/index`

