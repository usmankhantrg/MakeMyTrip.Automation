import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('SauceDemo/ProductsPage/SelectProduct'), [('ProductName') : 'Sauce Labs Backpack\r\n'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SauceDemo/Cart Page/Checkout'))

WebUI.setText(findTestObject('SauceDemo/Checkout Page/FirstName'), 'John')

WebUI.setText(findTestObject('SauceDemo/Checkout Page/LastName'), 'Doe')

WebUI.setText(findTestObject('SauceDemo/Checkout Page/PostCode'), '12345')

WebUI.click(findTestObject('SauceDemo/Checkout Page/ContinueButton'))

WebUI.click(findTestObject('SauceDemo/Checkout_Overview/Finish'))

WebUI.click(findTestObject('SauceDemo/Checkout_Complete/BackToHome'))

WebUI.callTestCase(findTestCase('SauceDemo/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

