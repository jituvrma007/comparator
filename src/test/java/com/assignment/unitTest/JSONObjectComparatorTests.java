package com.assignment.unitTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.assignment.util.JSONComparator;

public class JSONObjectComparatorTests  extends JSONComparator{
	
	@Test
    public void compareSimple() {
        String jsonOne = "{\n" + 
        		"  \"id\": 1,\n" + 
        		"  \"name\": \"Leanne Graham\",\n" + 
        		"  \"username\": \"Bret\",\n" + 
        		"  \"email\": \"Sincere@april.biz\",\n" + 
        		"  \"address\": {\n" + 
        		"    \"street\": \"Kulas Light\",\n" + 
        		"    \"suite\": \"Apt. 556\",\n" + 
        		"    \"city\": \"Gwenborough\",\n" + 
        		"    \"zipcode\": \"92998-3874\",\n" + 
        		"    \"geo\": {\n" + 
        		"      \"lat\": \"-37.3159\",\n" + 
        		"      \"lng\": \"81.1496\"\n" + 
        		"    },\n" + 
        		"    \"mgeo\": {\n" + 
        		"      \"lat\": \"-37.3159\",\n" + 
        		"      \"lng\": \"81.1496\"\n" + 
        		"    }\n" + 
        		"  },\n" + 
        		"  \"phone\": \"1-770-736-8031 x56442\",\n" + 
        		"  \"website\": \"hildegard.org\",\n" + 
        		"  \"company\": {\n" + 
        		"    \"name\": \"Romaguera-Crona\",\n" + 
        		"    \"catchPhrase\": \"Multi-layered client-server neural-net\",\n" + 
        		"    \"bs\": \"harness real-time e-markets\"\n" + 
        		"  },\n" + 
        		"  \"rockz\": \"Sincere@april.biz\"\n" + 
        		"}";
        String jsonTwo = "{\n" + 
        		"  \"id\": 1,\n" + 
        		"  \"name\": \"Leanne Graham\",\n" + 
        		"  \"username\": \"Bret\",\n" + 
        		"  \"email\": \"Sincere@april.biz\",\n" + 
        		"  \"address\": {\n" + 
        		"    \"street\": \"Kulas Light\",\n" + 
        		"    \"suite\": \"Apt. 556\",\n" + 
        		"    \"city\": \"Gwenborough\",\n" + 
        		"    \"zipcode\": \"92998-3874\",\n" + 
        		"    \"geo\": {\n" + 
        		"      \"lat\": \"-37.3159\",\n" + 
        		"      \"lng\": \"81.1496\"\n" + 
        		"    },\n" + 
        		"    \"mgeo\": {\n" + 
        		"      \"lat\": \"-37.3159\",\n" + 
        		"      \"lng\": \"81.1496\"\n" + 
        		"    }\n" + 
        		"  },\n" + 
        		"  \"phone\": \"1-770-736-8031 x56442\",\n" + 
        		"  \"website\": \"hildegard.org\",\n" + 
        		"  \"company\": {\n" + 
        		"    \"name\": \"Romaguera-Crona\",\n" + 
        		"    \"catchPhrase\": \"Multi-layered client-server neural-net\",\n" + 
        		"    \"bs\": \"harness real-time e-markets\"\n" + 
        		"  },\n" + 
        		"  \"rockz\": \"Sincere@april.biz\"\n" + 
        		"}";
        assertTrue(isResponseEqual(jsonOne, jsonTwo));
    }

	@Test
    public void compareSimple_negative() {
        String jsonOne = "{\n" + 
        		"  \"id\": 1,\n" + 
        		"  \"name\": \"Leanne Graham\",\n" + 
        		"  \"username\": \"Bret\",\n" + 
        		"  \"email\": \"Sincere@april.biz\",\n" + 
        		"  \"address\": {\n" + 
        		"    \"street\": \"Kulas Light\",\n" + 
        		"    \"suite\": \"Apt. 556\",\n" + 
        		"    \"city\": \"Gwenborough\",\n" + 
        		"    \"geo\": {\n" + 
        		"      \"lat\": \"-37.3159\",\n" + 
        		"      \"lng\": \"81.1496\"\n" + 
        		"    },\n" + 
        		"    \"mgeo\": {\n" + 
        		"      \"lat\": \"-37.3159\",\n" + 
        		"      \"lng\": \"81.1496\"\n" + 
        		"    }\n" + 
        		"  },\n" + 
        		"  \"phone\": \"1-770-736-8031 x56442\",\n" + 
        		"  \"website\": \"hildegard.org\",\n" + 
        		"  \"company\": {\n" + 
        		"    \"name\": \"Romaguera-Crona\",\n" + 
        		"    \"catchPhrase\": \"Multi-layered client-server neural-net\",\n" + 
        		"    \"bs\": \"harness real-time e-markets\"\n" + 
        		"  },\n" + 
        		"  \"rockz\": \"Sincere@april.biz\"\n" + 
        		"}";
        String jsonTwo = "{\n" + 
        		"  \"id\": 1,\n" + 
        		"  \"name\": \"Leanne Graham\",\n" + 
        		"  \"username\": \"Bret\",\n" + 
        		"  \"email\": \"Sincere@april.biz\",\n" + 
        		"  \"address\": {\n" + 
        		"    \"street\": \"Kulas Light\",\n" + 
        		"    \"suite\": \"Apt. 556\",\n" + 
        		"    \"city\": \"Gwenborough\",\n" + 
        		"    \"zipcode\": \"92998-3874\",\n" + 
        		"    \"geo\": {\n" + 
        		"      \"lat\": \"-37.3159\",\n" + 
        		"      \"lng\": \"81.1496\"\n" + 
        		"    },\n" + 
        		"    \"mgeo\": {\n" + 
        		"      \"lat\": \"-37.3159\",\n" + 
        		"      \"lng\": \"81.1496\"\n" + 
        		"    }\n" + 
        		"  },\n" + 
        		"  \"phone\": \"1-770-736-8031 x56442\",\n" + 
        		"  \"website\": \"hildegard.org\",\n" + 
        		"  \"company\": {\n" + 
        		"    \"name\": \"Romaguera-Crona\",\n" + 
        		"    \"catchPhrase\": \"Multi-layered client-server neural-net\",\n" + 
        		"    \"bs\": \"harness real-time e-markets\"\n" + 
        		"  },\n" + 
        		"  \"rockz\": \"Sincere@april.biz\"\n" + 
        		"}";
        assertFalse(isResponseEqual(jsonOne, jsonTwo));
    }
	
	
    @Test
    public void compareByFieldNotFound() {
        String jsonOne = "{\"!b\":\"val1\",\"a\":\"val2\"}";
        String jsonTwo = "{\"a\":\"val2\",\"c\":\"val1\"}";
        assertFalse(isResponseEqual(jsonOne, jsonTwo));
    }

    @Test
    public void compareByFieldNotFound_Negative() {
        String jsonOne = "{\"!b\":\"val1\",\"a\":\"val2\"}";
        String jsonTwo = "{\"a\":\"val2\",\"b\":\"val1\"}";
        assertFalse(isResponseEqual(jsonOne, jsonTwo));
    }

    @Test
    public void compareWithNumbers() {
        String jsonOne = "{\"b\":1,\"a\":2}";
        String jsonTwo = "{\"a\":2,\"b\":1}";
        assertTrue(isResponseEqual(jsonOne, jsonTwo));
    }

    @Test
    public void compareWithFloatNumbers() {
        String jsonOne = "{\"b\":-10.54325,\"a\":10.429318549148632}";
        String jsonTwo = "{\"a\":10.429318549148632,\"b\":-10.54325}";
        assertTrue(isResponseEqual(jsonOne, jsonTwo));
    }

    @Test
    public void compareWithjsonTwoStringRepresentedNumbers_negative() {
        String jsonOne = "{\"b\":1,\"a\":2}";
        String jsonTwo = "{\"a\":\"2\",\"b\":1}";
        assertTrue(isResponseEqual(jsonOne, jsonTwo));
    }

    @Test
    public void deepCompareJson() {
        String jsonOne =
                "{\"a\":{\"z\":\"val4\",\"t\":\"val3\"},\"b\":{\"y\":\"val2\",\"x\":\"val1\"}}";
        String jsonTwo =
                "{\"b\":{\"x\":\"val1\",\"y\":\"val2\"},\"a\":{\"t\":\"val3\",\"z\":\"val4\"}}";
        assertTrue(isResponseEqual(jsonOne, jsonTwo));
    }

    @Test
    public void deepCompareJson_negative() {
        String jsonOne =
                "{\"b\":{\"x\":\"val1\",\"y\":\"val2\"},\"a\":{\"t\":\"val3\",\"z\":\"val3\"}}";
        String jsonTwo =
                "{\"a\":{\"t\":\"val3\",\"z\":\"notval3\"},\"b\":{\"x\":\"val1\",\"y\":\"val2\"}}";
        assertFalse(isResponseEqual(jsonOne, jsonTwo));
    }

    @Test
    public void compareForExtraFields() {
        String jsonOne = "{\"b\":\"val1\",\"a\":\"val2\",\".*\":\".*\"}";
        String jsonTwo = "{\"a\":\"val2\",\"b\":\"val1\",\"c\":\"val3\",\"d\":\"val4\"}";
        assertFalse(isResponseEqual(jsonOne, jsonTwo));
    }

    @Test
    public void compareForExtraFields_negative1() {
        String jsonOne = "{\"b\":\"val1\",\"a\":\"val2\",\".*\":\".*\"}";
        String jsonTwo = "{\"a\":\"val2\",\"b\":\"val1\",\"c\":{\"a\":0}}";
        assertFalse(isResponseEqual(jsonOne, jsonTwo));
    }

    @Test
    public void compareForExtraFields_negative2() {
        String jsonOne = "{\"b\":\"val1\",\"a\":\"val2\",\".*\":\".*\"}";
        String jsonTwo = "{\"a\":\"val2\",\"b\":\"val1\"}";
        assertFalse(isResponseEqual(jsonOne, jsonTwo));
    }

    @Test
    public void compareForExtraFields_negative3() {
        String jsonOne = "{\"b\":\"val1\",\"a\":\"val2\",\"!.*\":\".*\"}";
        String jsonTwo = "{\"a\":\"val2\",\"b\":\"val1\"}";
        assertFalse(isResponseEqual(jsonOne, jsonTwo));
    }

    @Test
    public void compareForExtraFields_negative4() {
        String jsonOne = "{\"b\":\"val1\",\"a\":\"val2\",\"!.*\":\".*\"}";
        String jsonTwo = "{\"a\":\"val2\",\"b\":\"val1\",\"c\":\"val3\"}";
        assertFalse(isResponseEqual(jsonOne, jsonTwo));
    }

}