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

// Inisialisasi Logger
KeywordLogger log = new KeywordLogger()
WebUI.openBrowser('https://invoice.stg.mauju.com/login')

// Jumlah pengulangan pengujian
def numberOfIterations = 3

// Fungsi untuk login ke situs web
def loginToWebsite(username, password) {
	// Masukkan skrip untuk login ke situs web di sini
	// Misalnya, mengisi formulir login, mengklik tombol login, dll.
	WebUI.setText(findTestObject('APP INVOICE/USER/Login/input__email'), 'nav54867@gmail.com')
	WebUI.setText(findTestObject('APP INVOICE/USER/Login/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')
	WebUI.click(findTestObject('APP INVOICE/USER/Login/button_Sign In'))
}

// Pengulangan pengujian
for (int i = 1; i <= numberOfIterations; i++) {
	// Inisialisasi Tes Kasus (Test Case) dan TestData jika diperlukan
	TestCase testCase = new TestCase()
	TestData testData = new TestData()

	// Nama pengujian yang akan ditampilkan dalam laporan
	String testName = "Login Pengujian ke-" + i

	// Username dan Password untuk login
	String username = "your_username_here"
	String password = "your_password_here"

	// Mulai eksekusi pengujian login
	log.logInfo("Mulai " + testName)
	try {
		// Eksekusi fungsi login
		loginToWebsite(username, password)

		// Verifikasi bahwa login berhasil
		// Misalnya, Anda dapat memverifikasi elemen di halaman setelah login berhasil

		// Contoh:
		WebUI.verifyElementVisible(findTestObject('Your/Welcome/Message'))
		
		// Login berhasil
		log.logInfo("Login " + testName + " Berhasil")
	} catch (Exception e) {
		// Tangani kesalahan jika login gagal
		log.logError("Login " + testName + " Gagal: " + e.getMessage())
	} finally {
		// Logout dari situs web setelah setiap pengujian
		// Anda perlu menambahkan skrip logout jika diperlukan
	}
}

// Akhir eksekusi pengujian
log.logInfo("Pengujian Login Selesai")
