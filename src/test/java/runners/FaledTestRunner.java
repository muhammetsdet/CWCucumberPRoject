package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",//Scenario steplerini konsola renkli yazdırır.
                "html:target/reports/hmtl-reports;/default-cucumber-reports.html", //html formatında rapor için
                "json:target/reports/json-reports/cucumbet1.json",  //json formatında rapor için
                "junit:target/reports/xml-reports/cucumber1.xml", //xml formatında rapor için
                "rerun:target/failedScenarios.txt"
                //Fail olan scenarioların kaydıı alır ve sadeve bu testlerin koşulmasına yardımcı olur. Ancak yeni bir runner ekleyeceğiz çünkü tag'ını bilmiyoruz


        },

        features = "src/test/resources/features",//Feature dosyalarının yolu buraya belirtilmelidir
        glue = "stepdefinitions",//Çalıştırılacak Java classlarının yolu buraya belirtilmelidir
        tags = "@FailedScenario",//Özel olarak çalıştırılacak Scenario yada Feature Tag'i buraya belirtilir
        dryRun = false//dryRun = true --> Testi çalıştırmaz, eksik step definitionları tespit eder.

                )
public class Runner {


}
