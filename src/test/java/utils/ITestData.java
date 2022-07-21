package utils;

import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;


public interface ITestData {

    @DataProvider(name = "Update address")
    static Object[][] inputForUpdateAddress() throws FileNotFoundException {

        return new Object[][]{
                {"314 Robinson Lane", "DE", "Delaware", "19805"},
                {"401 Magnetic Drive, Unit 2", "DM", "Iowa", "32104"},
                {"5 S.Main Street", "NJ", "New Jersey", "07726"}
        };
    }

}