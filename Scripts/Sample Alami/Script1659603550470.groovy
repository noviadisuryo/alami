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

WebUI.navigateToUrl('https://dev.p2p.alamisharia.co.id/register')

'Assert ALAMI LOGO \r\n'
WebUI.verifyElementVisible(findTestObject('Page_ALAMI Daftar  ALAMI Peer-to-Peer Lending Syariah/img'))

'Assert Pemberi Dana Element Visible\r\n'
WebUI.verifyElementVisible(findTestObject('Page_ALAMI Daftar  ALAMI Peer-to-Peer Lending Syariah/div_Pemberi Dana'))

'Assert Penerima Dana Element Visible'
WebUI.verifyElementVisible(findTestObject('Page_ALAMI Daftar  ALAMI Peer-to-Peer Lending Syariah/div_Penerima Dana                                     Gabung sebagaipenerima Pembiayaan'))

WebUI.click(findTestObject('Object Repository/Sample/Page_ALAMI Daftar  ALAMI Peer-to-Peer Lendi_33cbd2/img'))

WebUI.setText(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Nama Lengkap_name'), 
    'noviadi')

WebUI.setText(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Email_email'), 
    'noviadisuryox@mailinator.com')

WebUI.setText(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_No. Handphone_phone'), 
    '084373829392382')

WebUI.setEncryptedText(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Password_password'), 
    'imKFKCOIsaMQnz1TDE8yhA==')

WebUI.click(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/label_Individual'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/select_-- Silahkan Pilih --                _9f24ad'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/button_Lanjutkan'), 
    FailureHandling.STOP_ON_FAILURE)

// Email Randomizer Start //

String Ms = WebUI.verifyTextPresent('Email Sudah digunakan', false)
if (Ms.equals('true')) {
	int RN

	RN = ((Math.random() * 500) as int)

	WebUI.setText(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Email_email'),
		('noviadisuryox' + RN + '@mailinator.com'))

	WebUI.click(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/button_Lanjutkan'))
}

// Email Randomizer End //


WebUI.click(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/p_Plaza 89'))

WebUI.dragAndDropByOffset(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/p_Plaza 89'), 
    0, 0)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ARROW_DOWN))

WebUI.click(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/input_Saya tertarik update info terbaru ALAMI. (Opsional)_langganan'))

WebUI.click(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Saya sudah membaca dan setuju dengan__c3b002'))

WebUI.click(findTestObject('Object Repository/Sample/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/button_Lanjutkan_1'))

