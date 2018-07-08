
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String

import org.openqa.selenium.WebElement


def static "com.commonkeyword.newKeyword.refreshBrowser"() {
    (new com.commonkeyword.newKeyword()).refreshBrowser()
}

def static "com.commonkeyword.newKeyword.switchWindow"() {
    (new com.commonkeyword.newKeyword()).switchWindow()
}

def static "com.commonkeyword.newKeyword.clickElement"(
    	TestObject to	) {
    (new com.commonkeyword.newKeyword()).clickElement(
        	to)
}

def static "com.commonkeyword.newKeyword.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new com.commonkeyword.newKeyword()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

def static "com.example.WebUICustomKeywords.isElementPresent"(
    	TestObject to	
     , 	int timeout	) {
    (new com.example.WebUICustomKeywords()).isElementPresent(
        	to
         , 	timeout)
}

def static "com.example.WebUICustomKeywords.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new com.example.WebUICustomKeywords()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

def static "com.example.WebUICustomKeywords.getHtmlTableColumns"(
    	WebElement row	
     , 	String tagName	) {
    (new com.example.WebUICustomKeywords()).getHtmlTableColumns(
        	row
         , 	tagName)
}
