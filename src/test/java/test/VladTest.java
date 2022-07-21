package test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dto.UsersList;
import org.testng.annotations.Test;
import utils.ITestConstants;
import utils.ITestData;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class VladTest implements ITestData, ITestConstants {

    @Test(description = "Check that address can be updated", dataProvider = "Update address", dataProviderClass = ITestData.class)
    public void dataProvidedTest(String address, String city, String state, String zipCode) {

        System.out.println(address + "\n" + city + "\n" + state + "\n" + zipCode);
    }

    @Test
    public void testDatInJson() throws FileNotFoundException {

        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();

        UsersList expectedList;
        expectedList = gson.fromJson(new FileReader("src/test/java/test_data/expectedList.json"), UsersList.class);

        for (var user : expectedList.getData()) {
            System.out.println(user);
        }
    }
}
