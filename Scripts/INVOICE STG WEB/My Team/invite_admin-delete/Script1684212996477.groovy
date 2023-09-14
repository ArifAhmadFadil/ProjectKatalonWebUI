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

WebUI.openBrowser('https://invoice.stg.mauju.com/login')

WebUI.setText(findTestObject('Object Repository/APP INVOICE/USER/Login/input__email'), 'nav54867@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/APP INVOICE/USER/Login/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/APP INVOICE/USER/Login/button_Sign In'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/USER/Login/owner'))

WebUI.navigateToUrl('https://invoice.stg.mauju.com/dashboard')

WebUI.click(findTestObject('Object Repository/AAAAA/MY TEAM/btn_span_myteam'))

Mobile.delay(5)

WebUI.click(findTestObject('Object Repository/AAAAA/MY TEAM/btn_invite'))

WebUI.setText(findTestObject('Object Repository/AAAAA/MY TEAM/txt_frist_name'), 'AGUS')

WebUI.setText(findTestObject('Object Repository/AAAAA/MY TEAM/txt_last_name'), 'HOLI')

WebUI.setText(findTestObject('Object Repository/AAAAA/MY TEAM/txt_email'), 'nav@gmail.com')

WebUI.click(findTestObject('Object Repository/AAAAA/MY TEAM/button_Save'))

WebUI.click(findTestObject('Object Repository/AAAAA/Page_My Team - Mauju/btn_del'))

WebUI.click(findTestObject('Object Repository/AAAAA/Page_My Team - Mauju/button_Ok'))

WebUI.click(findTestObject('APP INVOICE/MY TEAM/btn_restore'))

WebUI.click(findTestObject('APP INVOICE/MY TEAM/btn_rest'))

WebUI.closeBrowser()

