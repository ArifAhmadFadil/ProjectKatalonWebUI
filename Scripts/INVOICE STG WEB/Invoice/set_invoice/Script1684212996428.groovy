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

WebUI.setText(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/input__email'), 'nav54867@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/button_Sign In'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/div_Invoices'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/span_0000022'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/svg_Edit Invoice_MuiSvgIcon-root MuiSvgIcon_419fe6'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/li_Download PDF'))

Mobile.delay(20)

WebUI.click(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/svg_Edit Invoice_MuiSvgIcon-root MuiSvgIcon_419fe6'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/li_Send Invoice'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/button_Send'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/button_Edit Invoice_MuiButtonBase-root MuiI_a17834'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/li_Share Link'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/button_Close'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/svg_Edit Invoice_MuiSvgIcon-root MuiSvgIcon_419fe6'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/li_Duplicate Invoice'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/duplicat_Save'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/button_Edit Invoice_MuiButtonBase-root MuiI_a17834'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/li_Delete Invoice'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/Set Invoice/Page_Mauju/button_Ok'))

WebUI.closeBrowser()

