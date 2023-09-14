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

WebUI.navigateToUrl('https://invoice.stg.mauju.com/login')

WebUI.setText(findTestObject('Object Repository/APP INVOICE/SETTINGS/Currency_Language/Page_Mauju/input__email'), 'nav54867@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/APP INVOICE/SETTINGS/Currency_Language/Page_Mauju/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.sendKeys(findTestObject('Object Repository/APP INVOICE/SETTINGS/Currency_Language/Page_Mauju/input__password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Currency_Language/Page_Mauju/div_Settings'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Currency_Language/Page_Mauju/div_Currency  Language'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Currency_Language/Page_Mauju/button_Change'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Currency_Language/Page_Mauju/body_You need to enable JavaScript to run t_54153a'))

WebUI.click(findTestObject('APP INVOICE/SETTINGS/Currency_Language/Page_Mauju/div_English'))

WebUI.click(findTestObject('APP INVOICE/SETTINGS/Currency_Language/Page_Mauju/li_Indonesia'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Currency_Language/Page_Mauju/button_Save'))

Mobile.delay(20)

WebUI.closeBrowser()