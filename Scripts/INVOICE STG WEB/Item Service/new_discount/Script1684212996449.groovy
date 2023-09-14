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

WebUI.setText(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/New Discount/Page_Mauju/input__email'), 'nav54867@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/New Discount/Page_Mauju/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/New Discount/Page_Mauju/button_Sign In'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/New Discount/Page_Mauju/div_Items  Services'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/New Discount/Page_Mauju/button_New Item'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/New Discount/Page_Mauju/div_Discount Add Discount'))

WebUI.click(findTestObject('APP INVOICE/ITEMSERVICE/New Discount/Page_Mauju/p_Add Discount'))

WebUI.setText(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/New Discount/Page_Mauju/input_Rate_rate'), '20')

WebUI.setText(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/New Discount/Page_Mauju/input_Discount Name_discount_name'), 'Akhir Bulan')

WebUI.setText(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/New Discount/Page_Mauju/input_Description (optional)_description'), 'potongan harga')

WebUI.click(findTestObject('APP INVOICE/ITEMSERVICE/New Discount/Page_Mauju/button_Save'))

Mobile.delay(10)

WebUI.closeBrowser()

