package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object G_Timeout
     
    /**
     * <p></p>
     */
    public static Object G_SiteURL
     
    /**
     * <p></p>
     */
    public static Object G_ShortTimeOut
     
    /**
     * <p></p>
     */
    public static Object Name
     
    /**
     * <p></p>
     */
    public static Object Browser
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['G_Timeout' : 10, 'G_SiteURL' : 'http://demoaut.katalon.com', 'G_ShortTimeOut' : 5, 'Name' : 'http://demoaut.katalon.com111'])
        allVariables.put('Test', allVariables['default'] + ['G_Timeout' : 30, 'G_SiteURL' : 'http://demoaut.katalon.com', 'G_ShortTimeOut' : 5])
        allVariables.put('UAT', allVariables['default'] + ['Browser' : 'Chrome'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        G_Timeout = selectedVariables['G_Timeout']
        G_SiteURL = selectedVariables['G_SiteURL']
        G_ShortTimeOut = selectedVariables['G_ShortTimeOut']
        Name = selectedVariables['Name']
        Browser = selectedVariables['Browser']
        
    }
}
