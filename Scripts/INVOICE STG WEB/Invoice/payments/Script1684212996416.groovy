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

WebUI.openBrowser('https://invoice.stg.mauju.com/login')

WebUI.setText(findTestObject('Object Repository/APP INVOICE/USER/Login/input__email'), 'nav54867@gmail.com')

WebUI.setEncryptedText(findTestObject('APP INVOICE/USER/Login/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('APP INVOICE/USER/Login/button_Sign In'))

WebUI.click(findTestObject('APP INVOICE/USER/Login/owner'))

WebUI.navigateToUrl('https://invoice.stg.mauju.com/dashboard')

Mobile.delay(10)

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/div_Invoices'))

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/button_Payments'))

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/button_New Payment'))

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/input_drop'))

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/li_0000013'))

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/input_Client fullname_send_email_notification'))

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_t'), 'Tagihan Bulan Ini Ya')

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/svg_Client fullname_MuiSvgIcon-root MuiSvgI_1cf243'))

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/button_30'))

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/button_Save'))

WebUI.navigateToUrl('https://invoice.stg.mauju.com/login')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/input__email'), 'nav54867@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/button_Sign In'))

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/span_Invoices'))

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/p_Payments'))

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/button_New Payment'))

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/path'))

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/li_0000013'))

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/input_Client fullname_send_email_notification'))

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_T (1)'), 'T')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Ta (1)'), 'Ta')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Tag (1)'), 'Tag')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Tagi (1)'), 'Tagi')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Tagih (1)'), 'Tagih')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Tagiha (1)'), 'Tagiha')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Tagihan (1)'), 'Tagihan')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Tagihan_1 (1)'), 'Tagihan ')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Tagihan B'), 'Tagihan B')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Tagihan Bu'), 'Tagihan Bu')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Tagihan Bul'), 'Tagihan Bul')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Tagihan Bula'), 'Tagihan Bula')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Tagihan Bulan'), 'Tagihan Bulan')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Tagihan Bulan_1'), 'Tagihan Bulan ')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Tagihan Bulan I'), 'Tagihan Bulan I')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Tagihan Bulan In'), 'Tagihan Bulan In')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Tagihan Bulan Ini'), 'Tagihan Bulan Ini')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Tagihan Bulan Ini_1'), 'Tagihan Bulan Ini ')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Tagihan Bulan Ini Y'), 'Tagihan Bulan Ini Y')

WebUI.setText(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/textarea_Tagihan Bulan Ini Ya'), 'Tagihan Bulan Ini Ya')

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/svg_Client fullname_MuiSvgIcon-root MuiSvgI_1cf243'))

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/button_30'))

WebUI.click(findTestObject('Object Repository/AAAAA/Payments/Page_Mauju/button_Save'))

