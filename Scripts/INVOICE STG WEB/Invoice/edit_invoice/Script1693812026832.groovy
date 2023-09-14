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

WebUI.openBrowser('https://invoice.stg.mauju.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/APP INVOICE/USER/Login/input__email'), 'nav54867@gmail.com')

WebUI.setEncryptedText(findTestObject('APP INVOICE/USER/Login/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('APP INVOICE/USER/Login/button_Sign In'))

//WebUI.click(findTestObject('APP INVOICE/USER/Login/owner'))
//
//WebUI.navigateToUrl('https://invoice.stg.mauju.com/dashboard')
Mobile.delay(5)

WebUI.click(findTestObject('APP INVOICE/INVOICE/Edit Invoice/btn_invoice'))

WebUI.click(findTestObject('APP INVOICE/INVOICE/Edit Invoice/btn_list_invoice'))

WebUI.click(findTestObject('APP INVOICE/INVOICE/Edit Invoice/btn_edit_invoice'))

WebUI.click(findTestObject('APP INVOICE/INVOICE/Edit Invoice/btn_chage_client'))

WebUI.click(findTestObject('APP INVOICE/INVOICE/Edit Invoice/input__client-detail'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('APP INVOICE/INVOICE/Edit Invoice/li_WAHYU Musa'))

WebUI.click(findTestObject('APP INVOICE/INVOICE/Edit Invoice/btn_add_aline'))

WebUI.click(findTestObject('APP INVOICE/INVOICE/Edit Invoice/add_item'))

WebUI.click(findTestObject('APP INVOICE/INVOICE/Edit Invoice/btn_save_item'))

WebUI.click(findTestObject('APP INVOICE/INVOICE/Edit Invoice/btn_select_duedate'))

WebUI.click(findTestObject('APP INVOICE/INVOICE/Edit Invoice/btn_number_of_days'))

WebUI.setText(findTestObject('APP INVOICE/INVOICE/Edit Invoice/txt_number_of_day'), '10')

WebUI.setText(findTestObject('APP INVOICE/INVOICE/Edit Invoice/Page_Invoice - Mauju/txt_termss'), 'KeNdati awalnya bagus')

WebUI.scrollToPosition(1, 1)

WebUI.click(findTestObject('APP INVOICE/INVOICE/Edit Invoice/Page_Invoice - Mauju/button_Save'))

