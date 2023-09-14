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

WebUI.setText(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/Edit Discount-Delete/Page_Mauju/input__email'), 'nav54867@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/Edit Discount-Delete/Page_Mauju/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/Edit Discount-Delete/Page_Mauju/button_Sign In'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/Edit Discount-Delete/Page_Mauju/div_Items  Services'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/Edit Discount-Delete/Page_Mauju/button_New Item'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/Edit Discount-Delete/Page_Mauju/button_salep 51_MuiButtonBase-root MuiIconB_03a31f'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/Edit Discount-Delete/Page_Mauju/div_Discount Name_MuiInputBase-root MuiInpu_140d2e'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/Edit Discount-Delete/Page_Mauju/button_Save'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/Edit Discount-Delete/Page_Mauju/button_salep 51_MuiButtonBase-root MuiIconB_03a31f'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/Edit Discount-Delete/Page_Mauju/button_Cancel'))

