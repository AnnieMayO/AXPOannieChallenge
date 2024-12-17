***Project_Name: AXPOannieChallenge ***

    ··This project is automated using USER INTERFACE (UI) WITH JAVA, Selenium WebDriver and RestAssured, following a Page Object Model pattern in BDD format.

    ··As regards in testing the browser, it can be run in chrome,firefox, ie, edge and safari.

··TO DO SO:

    ->Just go to configuration.properties and change the browser equivalent into whatever operation system you prefer using the choices above.

ex:

    browser=chrome (to run it in chrome browser)

    browser=edge (to run it in edge browser)

Pre-requisites:

    ->Have at least Java 17 SDK installed
    ->IntelliJ IDE (any IDE is fine) or Maven
    ->Browser drivers are fetching automatically from bonigarcia dependency, so no need to identify the browser version

Installation:
       https://github.com/AnnieMayO/AXPOannieChallenge.git
          
clone: https://github.com/AnnieMayO/AXPOannieChallenge.git

Running:

    =Maven in terminal
        -> mvn clean
        -> mvn validate
        -> mvn compile
        -> mvn verify (to run all the codes)
        
    =CukesRunner
        ->Click CukesRunner button to run feature file with one click

    =SignUp.feature
        ->Have the option to run for scenario or for feature file

    =Intellij IDE


NOTES:

    Running through mvn verify, automatically creates a report in the Target file.
    If any test case (TC) failS during test; the framework keeps TC in a rerun.txt file in the target folder,
    Once the test is done it is running the failed test case automatically with FailedTestRunner to make sure that the problem is not environmental.(PLS REFER TO TARGET FILES)