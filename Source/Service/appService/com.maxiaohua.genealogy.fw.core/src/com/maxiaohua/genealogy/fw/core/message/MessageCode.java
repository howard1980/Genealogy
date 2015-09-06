package com.maxiaohua.genealogy.fw.core.message;


public interface MessageCode {
    

    public final static String I_COM_SERVICE_INITIALIZED = "ICOMSYS002"; 
    
    public final static String I_DB2_CONNECT_TEST_SECCESSED = "IDB2SYS001"; 

    

    public final static String E_COM_JSON_DATA_NOT_CORRECT = "ECOMSYS002"; 
    public final static String E_COM_INVALID_SYSID = "ECOMSYS003"; 
    public final static String E_COM_SYSTEM_CONTEXT_INIT_FAILED = "ECOMSYS004"; 

    
    public final static String E_ARG_INVALID_SERVICEID = "EARGSYS001"; 
    public final static String E_ARG_INPUT_VALUE_ALLOWED = "EARGSYS002"; 
    public final static String E_ARG_INPUT_SAME_OR_LATER_DATE = "EARGSYS003"; 
    public final static String E_ARG_INPUT_SAME_OR_FORMER_DATE = "EARGSYS004"; 
    public final static String E_ARG_INPUT_LATER_DATE = "EARGSYS005"; 
    public final static String E_ARG_INPUT_FORMER_DATE = "EARGSYS006"; 
    public final static String E_ARG_INPUT_HALF_ALPHIBAT_NUMERIC = "EARGSYS007"; 
    public final static String E_ARG_INPUT_VALID_ZIPCODE = "EARGSYS008"; 
    public final static String E_ARG_INPUT_VALID_MOBILENO = "EARGSYS009"; 
    public final static String E_ARG_INPUT_TRUE_OR_FALSE = "EARGSYS010"; 
    public final static String E_ARG_INPUT_BYTE = "EARGSYS011"; 
    public final static String E_ARG_INPUT_CHARACTER = "EARGSYS012"; 
    public final static String E_ARG_INPUT_VALID_DATE = "EARGSYS013"; 

    public final static String E_ARG_INPUT_VALID_URL = "EARGSYS015"; 
    public final static String E_ARG_INPUT_LESS_NUMERIC = "EARGSYS016"; 
    public final static String E_ARG_INPUT_GREATER_NUMERIC = "EARGSYS017"; 
    public final static String E_ARG_INPUT_SAME_OR_GREATER_NUMERIC = "EARGSYS018"; 
    public final static String E_ARG_INPUT_VALID_MAIL = "EARGSYS019"; 
    public final static String E_ARG_INPUT_VALID_TELNO = "EARGSYS020"; 
    public final static String E_ARG_INPUT_UPPER_HALF_ALPHIBAT_NUMERIC = "EARGSYS021"; 
    public final static String E_ARG_INPUT_HALF_CHAR = "EARGSYS022"; 
    public final static String E_ARG_INPUT_HEX = "EARGSYS023"; 
    public final static String E_ARG_INPUT_INTEGER = "EARGSYS024"; 
    public final static String E_ARG_INPUT_SAME_OR_LESS_NUMERIC = "EARGSYS025"; 
    public final static String E_ARG_INPUT_VALID_MONEY = "EARGSYS026"; 
    public final static String E_ARG_ENSURE_ANYNOE_NOT_EMPTY = "EARGSYS027"; 
    public final static String E_ARG_ENSURE_NOT_EMPTY = "EARGSYS028"; 
    public final static String E_ARG_ENSURE_NO_CHAR_NOT_ALLOWED = "EARGSYS029"; 
    public final static String E_ARG_ENSURE_NOT_NULL = "EARGSYS030"; 
    public final static String E_ARG_ENSURE_NO_VALUE_NOT_ALLOWED = "EARGSYS031"; 
    public final static String E_ARG_INPUT_NUMERIC = "EARGSYS032"; 
    public final static String E_ARG_INPUT_WITH_PATTERN = "EARGSYS033"; 
    public final static String E_ARG_INPUT_WITHIN_SIZE = "EARGSYS034"; 
    public final static String E_ARG_INPUT_VALID_TIME = "EARGSYS035"; 
    public final static String E_ARG_INPUT_VALID_TIMESTAMP = "EARGSYS036"; 
    public final static String E_ARG_INPUT_FULLSIZE_CHAR = "EARGSYS037"; 
    public final static String E_ARG_INPUT_FULLSIZE_KANA = "EARGSYS038"; 
    public final static String E_ARG_INPUT_WITHIN_SIZE_BYTE = "EARGSYS039"; 
    public final static String E_ARG_INPUT_HALF_KANA = "EARGSYS040"; 
    public final static String E_ARG_ENSURE_PERMISSION_CHAR = "EARGSYS041"; 
    public final static String E_ARG_INPUT_LESS_EQUAL_NUMERIC = "EARGSYS042"; 
    public final static String E_ARG_INPUT_GREATER_EQUAL_NUMERIC = "EARGSYS043"; 
    public final static String E_ARG_INPUT_LESS_LONG = "EARGSYS044"; 
    public final static String E_ARG_INPUT_GREATER_LONG = "EARGSYS045"; 
    public final static String E_ARG_INPUT_LESS_EQUAL_LONG = "EARGSYS046"; 
    public final static String E_ARG_INPUT_GREATER_EQUAL_LONG = "EARGSYS047"; 
    public final static String E_ARG_INPUT_SAME_OR_LATER_TIME = "EARGSYS048"; 
    public final static String E_ARG_INPUT_SAME_OR_FORMER_TIME = "EARGSYS049"; 
    public final static String E_ARG_INPUT_LATER_TIME = "EARGSYS050"; 
    public final static String E_ARG_INPUT_FORMER_TIME = "EARGSYS051"; 
    public final static String E_ARG_INPUT_SAME_OR_LATER_TIMESTAMP = "EARGSYS052"; 
    public final static String E_ARG_INPUT_SAME_OR_FORMER_TIMESTAMP = "EARGSYS053"; 
    public final static String E_ARG_INPUT_LATER_TIMESTAMP = "EARGSYS054"; 
    public final static String E_ARG_INPUT_FORMER_TIMESTAMP = "EARGSYS055"; 

    

    public final static String E_AUT_PWD_NOT_CORRECT = "EAUTSYS002"; 
    public final static String E_AUT_PWD_EXPIRED = "EAUTSYS003"; 
    public final static String E_AUT_NO_ACCESS_AUTHORITY = "EAUTSYS004"; 
    public final static String E_AUT_OLD_PWD_NOT_CORRECT = "EAUTSYS005"; 


    public final static String E_AUT_NOT_SIGNED_IN = "EAUTSYS008"; 
    public final static String E_AUT_SESSION_TIMEOUT = "EAUTSYS009"; 
    public final static String E_AUT_ACCESS_KEY_NOT_CORRECT = "EAUTSYS010"; 

    
    public final static String E_DB2_CONNECT_FAILED = "EDB2SYS001"; 
    public final static String E_DB2_RECORD_NOT_EXIST = "EDB2SYS002"; 

    public final static String E_DB2_OPTIMISTIC_LOCK = "EDB2SYS004"; 

    
    public final static String E_EXR_UNKNOWN_ERROR_DURING_UPLOAD = "EEXRSYS001"; 

    
    public final static String E_OTH_UNKNOWN_ERROR = "EOTHSYS001"; 


    
    public static final String M10010CM = "M10010CM";

    
    public static final String M10020CM = "M10020CM";

    
    public static final String M10030CM = "M10030CM";

    
    public static final String M10040CM = "M10040CM";

    
    public static final String M10050CM = "M10050CM";

    
    public static final String M10060CM = "M10060CM";

    
    public static final String M10070CM = "M10070CM";

    
    public static final String M10080CM = "M10080CM";

    
    public static final String M10090CM = "M10090CM";

    
    public static final String M10100CM = "M10100CM";

    
    public static final String M10110CM = "M10110CM";

    
    public static final String M10120CM = "M10120CM";

    
    public static final String M10130CM = "M10130CM";

    
    public static final String M10140CM = "M10140CM";

    
    public static final String M10150CM = "M10150CM";

    
    public static final String M10160CM = "M10160CM";

    
    public static final String M10170CM = "M10170CM";

    
    public static final String M10180CM = "M10180CM";

    
    public static final String M10190CM = "M10190CM";

    
    public static final String M10200CM = "M10200CM";

    
    public static final String M10210CM = "M10210CM";

    
    public static final String M10220CM = "M10220CM";

    
    public static final String M10230CM = "M10230CM";

    
    public static final String M10240CM = "M10240CM";

    
    public static final String M10250CM = "M10250CM";

    
    public static final String M10260CM = "M10260CM";

    
    public static final String M10270CM = "M10270CM";

    
    public static final String M10280CM = "M10280CM";

    
    public static final String M10290CM = "M10290CM";

    
    public static final String M10300CM = "M10300CM";

    
    public static final String M10310CM = "M10310CM";

    
    public static final String M10320CM = "M10320CM";

    
    public static final String M10330CM = "M10330CM";

    
    public static final String M10340CM = "M10340CM";

    
    public static final String M10350CM = "M10350CM";

    
    public static final String M10360CM = "M10360CM";

    
    public static final String M10370CM = "M10370CM";

    
    public static final String M10380CM = "M10380CM";

    
    public static final String M10390CM = "M10390CM";

    
    public static final String M10400CM = "M10400CM";

    
    public static final String M10410CM = "M10410CM";

    
    public static final String M10420CM = "M10420CM";

    
    public static final String M10430CM = "M10430CM";

    
    public static final String M10440CM = "M10440CM";

    
    public static final String M10450CM = "M10450CM";

    
    public static final String M10460CM = "M10460CM";

    
    public static final String M10470CM = "M10470CM";

    
    public static final String M10480CM = "M10480CM";

    
    public static final String M10490CM = "M10490CM";

    
    public static final String M10500CM = "M10500CM";

    
    public static final String M10510CM = "M10510CM";

    
    public static final String M10520CM = "M10520CM";

    
    public static final String M10530CM = "M10530CM";

    
    public static final String M10540CM = "M10540CM";

    
    public static final String M10550CM = "M10550CM";

    
    public static final String M10560CM = "M10560CM";

    
    public static final String M10570CM = "M10570CM";

    
    public static final String M10580CM = "M10580CM";

    
    public static final String M10590CM = "M10590CM";

    
    public static final String M10600CM = "M10600CM";

    
    public static final String M10610CM = "M10610CM";

    
    public static final String M10620CM = "M10620CM";

    
    public static final String M10630CM = "M10630CM";

    
    public static final String M10640CM = "M10640CM";

    
    public static final String M10650CM = "M10650CM";

    public static final String M10104WC = "M10104WC";
    
    public static final String M11001WC = "M11001WC";
    
    public static final String M11002WC = "M11002WC";
    
    public static final String M11101WC = "M11101WC";
    
    public static final String M11102WC = "M11102WC";
}