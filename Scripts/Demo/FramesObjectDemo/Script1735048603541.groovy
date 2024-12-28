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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ui.vision/demo/webtest/frames/')

WebUI.click(findTestObject('Object Repository/Page_Frames - Web Automation Test/input_Frame1_mytext1'))

WebUI.click(findTestObject('Object Repository/Page_Frames - Web Automation Test/input_Frame1_mytext1'))

WebUI.click(findTestObject('Object Repository/Page_Frames - Web Automation Test/div_Form-filling and web testing with UI.Vision Selenium IDE commands'))

WebUI.click(findTestObject('Object Repository/Page_Frames - Web Automation Test/input_Frame4_mytext4'))

WebUI.click(findTestObject('Object Repository/Page_Frames - Web Automation Test/div_How do you plan to use the software_i21'))

WebUI.click(findTestObject('Object Repository/Page_Frames - Web Automation Test/span_Alege'))

WebUI.click(findTestObject('Object Repository/Page_Frames - Web Automation Test/span_Yes'))

WebUI.click(findTestObject('Object Repository/Page_Frames - Web Automation Test/input_Frame2_mytext2'))

