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

WebUI.setText(findTestObject('Object Repository/APP INVOICE/SETTINGS/Billing/Page_Mauju/input__email'), 'nav54867@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/APP INVOICE/SETTINGS/Billing/Page_Mauju/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Billing/Page_Mauju/button_Sign In'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Billing/Page_Mauju/div_Settings'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Billing/Page_Mauju/div_Billing  Upgrade Account'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Billing/Page_Mauju/div_premium 8.99  monthlyAccess to all feat_bf98a2'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Billing/Page_Mauju/button_Buy Now'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Billing/Page_Mauju/Buy Now'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Billing/Page_Mauju/button_Delete  Continue'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Billing/Page_Mauju/button_Ok'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Billing/Page_Mauju/dropdown_payment'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Billing/Page_Mauju/li_E-Wallet'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Billing/Page_Mauju/input__rc'))

WebUI.setText(findTestObject('Object Repository/APP INVOICE/SETTINGS/Billing/Page_Mauju/input__rd'), '85856585598')

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Billing/Page_Mauju/button_Confirm  Pay'))

Mobile.delay(5)

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Billing/Page_Mauju/p_Check Payment Status'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Billing/Page_Mauju/p_Back to home'))

Mobile.delay(20)

WebUI.closeBrowser()

