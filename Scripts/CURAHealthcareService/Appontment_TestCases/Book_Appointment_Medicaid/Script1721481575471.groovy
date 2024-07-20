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

WebUI.callTestCase(findTestCase('CURAHealthcareService/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('CURAHealthcareService/AppointmentPageObjects/Select_Facility'), 'Seoul CURA Healthcare Center', 
    false)

WebUI.click(findTestObject('CURAHealthcareService/AppointmentPageObjects/Select_Healthcare_Program_Medicaid'))

WebUI.setText(findTestObject('CURAHealthcareService/AppointmentPageObjects/Visit_Date'), '20/07/2024')

WebUI.click(findTestObject('CURAHealthcareService/AppointmentPageObjects/Comment'))

WebUI.setText(findTestObject('CURAHealthcareService/AppointmentPageObjects/Comment'), 'Medicaid Test')

WebUI.click(findTestObject('CURAHealthcareService/AppointmentPageObjects/Book_Appointment_Button'))

WebUI.callTestCase(findTestCase('CURAHealthcareService/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()
