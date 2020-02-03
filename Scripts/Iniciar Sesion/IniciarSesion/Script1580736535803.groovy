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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Iniciar Sesion/AbrirNavegador'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/IniciarSesion/input_Iniciar sesin_loginfmt'), 'ltorocat@contratista.epm.co')

WebUI.click(findTestObject('Object Repository/IniciarSesion/input_Iniciar sesin_idSIButton9'))

WebUI.click(findTestObject('Object Repository/IniciarSesion/div_Llevndole a la pgina de inicio de sesin_692239'))

WebUI.setEncryptedText(findTestObject('Object Repository/IniciarSesion/input_Inicie sesin mediante su cuenta organ_874196'), 
    'l5bzzAfgsSs9mWQKAHtXLw==')

WebUI.click(findTestObject('Object Repository/IniciarSesion/span_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/IniciarSesion/input_No volver a mostrar_idBtn_Back'))

WebUI.refresh()

WebUI.navigateToUrl('https://epmco.sharepoint.com/sites/EPMJD-UAT/SitePages/Home.aspx')

WebUI.verifyElementClickable(findTestObject('Object Repository/IniciarSesion/img'))

