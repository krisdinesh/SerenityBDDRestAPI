#Author: Dinesh Krishnaswamy
#Email: dinesh.krishnaswamy@toyota.com

Feature: Verify Student Rest API CRUD

  Scenario: Create Student using Rest API should get the response 201
    When Create Student using Rest API should get the response 201
      | firstName | lastName | programme        | email               |
      | Dinesh    | Kris     | Computer Science | test12345@gmail.com |
      | TestFN    | Kris     | Computer Science | test54320@gmail.com |
      | TestFA    | Kris     | Computer Science | test54321@gmail.com |
      | TestFB    | Kris     | Computer Science | test54322@gmail.com |
      | TestFC    | Kris     | Computer Science | test54323@gmail.com |
      | TestFD    | Kris     | Computer Science | test54324@gmail.com |
      | TestFE    | Kris     | Computer Science | test54325@gmail.com |
      | TestFF    | Kris     | Computer Science | test54326@gmail.com |
      | TestFG    | Kris     | Computer Science | test54327@gmail.com |
      | TestFH    | Kris     | Computer Science | test54328@gmail.com |

  Scenario: Update Student using Rest API should get the response 200
    When Update Student using Rest API should get the response 200
    
   Scenario: Delete Student and search the same Student using Rest API should get the response 404
    When Delete Student and search the same Student using Rest API should get the response 404
