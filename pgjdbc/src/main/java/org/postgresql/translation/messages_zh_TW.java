/* Automatically generated by GNU msgfmt.  Do not modify!  */
package org.materialize.translation;
public class messages_zh_TW extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[578];
    t[0] = "";
    t[1] = "Project-Id-Version: PostgreSQL JDBC Driver 8.3\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2008-01-21 16:50+0800\nLast-Translator: 郭朝益(ChaoYi, Kuo) <Kuo.ChaoYi@gmail.com>\nLanguage-Team: The PostgreSQL Development Team <Kuo.ChaoYi@gmail.com>\nLanguage: \nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nX-Poedit-Language: Chinese\nX-Poedit-Country: TAIWAN\nX-Poedit-SourceCharset: utf-8\n";
    t[6] = "Cannot call cancelRowUpdates() when on the insert row.";
    t[7] = "不能在新增的資料列上呼叫 cancelRowUpdates()。";
    t[8] = "The server requested password-based authentication, but no password was provided.";
    t[9] = "伺服器要求使用密碼驗證，但是密碼並未提供。";
    t[12] = "Detail: {0}";
    t[13] = "詳細：{0}";
    t[16] = "Can''t refresh the insert row.";
    t[17] = "無法重讀新增的資料列。";
    t[18] = "Connection has been closed.";
    t[19] = "Connection 已經被關閉。";
    t[24] = "Bad value for type {0} : {1}";
    t[25] = "不良的型別值 {0} : {1}";
    t[36] = "Truncation of large objects is only implemented in 8.3 and later servers.";
    t[37] = "大型物件的截斷(Truncation)僅被實作執行在 8.3 和後來的伺服器。";
    t[40] = "Cannot retrieve the name of an unnamed savepoint.";
    t[41] = "無法取得未命名儲存點(Savepoint)的名稱。";
    t[46] = "An error occurred while setting up the SSL connection.";
    t[47] = "進行 SSL 連線時發生錯誤。";
    t[50] = "suspend/resume not implemented";
    t[51] = "暫停(suspend)/再繼續(resume)尚未被實作。";
    t[60] = "{0} function takes one and only one argument.";
    t[61] = "{0} 函式取得一個且僅有一個引數。";
    t[62] = "Conversion to type {0} failed: {1}.";
    t[63] = "轉換型別 {0} 失敗：{1}。";
    t[66] = "Conversion of money failed.";
    t[67] = "money 轉換失敗。";
    t[70] = "A result was returned when none was expected.";
    t[71] = "傳回預期之外的結果。";
    t[80] = "This PooledConnection has already been closed.";
    t[81] = "這個 PooledConnection 已經被關閉。";
    t[84] = "Multiple ResultSets were returned by the query.";
    t[85] = "查詢傳回多個 ResultSet。";
    t[90] = "Not on the insert row.";
    t[91] = "不在新增的資料列上。";
    t[94] = "An unexpected result was returned by a query.";
    t[95] = "傳回非預期的查詢結果。";
    t[102] = "Internal Query: {0}";
    t[103] = "內部查詢：{0}";
    t[106] = "The array index is out of range: {0}";
    t[107] = "陣列索引超過許可範圍：{0}";
    t[112] = "Connection attempt timed out.";
    t[113] = "Connection 嘗試逾時。";
    t[114] = "Unable to find name datatype in the system catalogs.";
    t[115] = "在系統 catalog 中找不到名稱資料類型(datatype)。";
    t[116] = "Something unusual has occurred to cause the driver to fail. Please report this exception.";
    t[117] = "不明的原因導致驅動程式造成失敗，請回報這個例外。";
    t[120] = "The array index is out of range: {0}, number of elements: {1}.";
    t[121] = "陣列索引超過許可範圍：{0}，元素數量：{1}。";
    t[138] = "Invalid flags {0}";
    t[139] = "無效的旗標 {0}";
    t[146] = "Unexpected error writing large object to database.";
    t[147] = "將大型物件(large object)寫入資料庫時發生不明錯誤。";
    t[162] = "Query timeout must be a value greater than or equals to 0.";
    t[163] = "查詢逾時等候時間必須大於或等於 0。";
    t[170] = "Unknown type {0}.";
    t[171] = "不明的型別 {0}";
    t[174] = "The server''s standard_conforming_strings parameter was reported as {0}. The JDBC driver expected on or off.";
    t[175] = "這伺服器的 standard_conforming_strings 參數已回報為 {0}，JDBC 驅動程式已預期開啟或是關閉。";
    t[176] = "Invalid character data was found.  This is most likely caused by stored data containing characters that are invalid for the character set the database was created in.  The most common example of this is storing 8bit data in a SQL_ASCII database.";
    t[177] = "發現不合法的字元，可能的原因是欲儲存的資料中包含資料庫的字元集不支援的字碼，其中最常見例子的就是將 8 位元資料存入使用 SQL_ASCII 編碼的資料庫中。";
    t[178] = "The column index is out of range: {0}, number of columns: {1}.";
    t[179] = "欄位索引超過許可範圍：{0}，欄位數：{1}。";
    t[180] = "The connection attempt failed.";
    t[181] = "嘗試連線已失敗。";
    t[182] = "No value specified for parameter {0}.";
    t[183] = "未設定參數值 {0} 的內容。";
    t[190] = "Provided Reader failed.";
    t[191] = "提供的 Reader 已失敗。";
    t[194] = "Unsupported value for stringtype parameter: {0}";
    t[195] = "字串型別參數值未被支持：{0}";
    t[198] = "A CallableStatement was declared, but no call to registerOutParameter(1, <some type>) was made.";
    t[199] = "已經宣告 CallableStatement 函式，但是尚未呼叫 registerOutParameter (1, <some_type>) 。";
    t[204] = "Currently positioned before the start of the ResultSet.  You cannot call deleteRow() here.";
    t[205] = "不能在 ResultSet 的第一筆資料之前呼叫 deleteRow()。";
    t[214] = "The maximum field size must be a value greater than or equal to 0.";
    t[215] = "最大欄位容量必須大於或等於 0。";
    t[216] = "Fetch size must be a value greater to or equal to 0.";
    t[217] = "資料讀取筆數(fetch size)必須大於或等於 0。";
    t[220] = "PostgreSQL LOBs can only index to: {0}";
    t[221] = "PostgreSQL LOBs 僅能索引到：{0}";
    t[224] = "The JVM claims not to support the encoding: {0}";
    t[225] = "JVM 聲明並不支援編碼：{0} 。";
    t[226] = "Interval {0} not yet implemented";
    t[227] = "隔絕 {0} 尚未被實作。";
    t[238] = "Fastpath call {0} - No result was returned and we expected an integer.";
    t[239] = "Fastpath 呼叫 {0} - 沒有傳回值，且應該傳回一個整數。";
    t[246] = "ResultSets with concurrency CONCUR_READ_ONLY cannot be updated.";
    t[247] = "ResultSets 與並發同作(Concurrency) CONCUR_READ_ONLY 不能被更新。";
    t[250] = "This statement does not declare an OUT parameter.  Use '{' ?= call ... '}' to declare one.";
    t[251] = "這個 statement 未宣告 OUT 參數，使用 '{' ?= call ... '}' 宣告一個。";
    t[256] = "Cannot reference a savepoint after it has been released.";
    t[257] = "無法參照已經被釋放的儲存點。";
    t[260] = "Unsupported Types value: {0}";
    t[261] = "未被支持的型別值：{0}";
    t[266] = "Protocol error.  Session setup failed.";
    t[267] = "通訊協定錯誤，Session 初始化失敗。";
    t[274] = "Currently positioned after the end of the ResultSet.  You cannot call deleteRow() here.";
    t[275] = "不能在 ResultSet 的最後一筆資料之後呼叫 deleteRow()。";
    t[278] = "Internal Position: {0}";
    t[279] = "內部位置：{0}";
    t[280] = "Zero bytes may not occur in identifiers.";
    t[281] = "在標識識別符中不存在零位元組。";
    t[288] = "{0} function doesn''t take any argument.";
    t[289] = "{0} 函式無法取得任何的引數。";
    t[300] = "This statement has been closed.";
    t[301] = "這個 statement 已經被關閉。";
    t[318] = "Cannot establish a savepoint in auto-commit mode.";
    t[319] = "在自動確認事物交易模式無法建立儲存點(Savepoint)。";
    t[320] = "Position: {0}";
    t[321] = "位置：{0}";
    t[322] = "ResultSet is not updateable.  The query that generated this result set must select only one table, and must select all primary keys from that table. See the JDBC 2.1 API Specification, section 5.6 for more details.";
    t[323] = "不可更新的 ResultSet。用來產生這個 ResultSet 的 SQL 命令只能操作一個資料表，並且必需選擇所有主鍵欄位，詳細請參閱 JDBC 2.1 API 規格書 5.6 節。";
    t[330] = "This ResultSet is closed.";
    t[331] = "這個 ResultSet 已經被關閉。";
    t[338] = "Parameter of type {0} was registered, but call to get{1} (sqltype={2}) was made.";
    t[339] = "已註冊參數型別 {0}，但是又呼叫了get{1}(sqltype={2})。";
    t[342] = "Transaction isolation level {0} not supported.";
    t[343] = "不支援交易隔絕等級 {0} 。";
    t[344] = "Statement has been closed.";
    t[345] = "Sstatement 已經被關閉。";
    t[352] = "Server SQLState: {0}";
    t[353] = "伺服器 SQLState：{0}";
    t[354] = "No primary key found for table {0}.";
    t[355] = "{0} 資料表中未找到主鍵(Primary key)。";
    t[362] = "Cannot convert an instance of {0} to type {1}";
    t[363] = "無法轉換 {0} 到類型 {1} 的實例";
    t[364] = "DataSource has been closed.";
    t[365] = "DataSource 已經被關閉。";
    t[368] = "The column name {0} was not found in this ResultSet.";
    t[369] = "ResultSet 中找不到欄位名稱 {0}。";
    t[372] = "ResultSet not positioned properly, perhaps you need to call next.";
    t[373] = "查詢結果指標位置不正確，您也許需要呼叫 ResultSet 的 next() 方法。";
    t[378] = "Cannot update the ResultSet because it is either before the start or after the end of the results.";
    t[379] = "無法更新 ResultSet，可能在第一筆資料之前或最未筆資料之後。";
    t[380] = "Method {0} is not yet implemented.";
    t[381] = "這個 {0} 方法尚未被實作。";
    t[382] = "{0} function takes two or three arguments.";
    t[383] = "{0} 函式取得二個或三個引數。";
    t[384] = "The JVM claims not to support the {0} encoding.";
    t[385] = "JVM 聲明並不支援 {0} 編碼。";
    t[396] = "Unknown Response Type {0}.";
    t[397] = "不明的回應類型 {0}。";
    t[398] = "The parameter index is out of range: {0}, number of parameters: {1}.";
    t[399] = "參數索引超出許可範圍：{0}，參數總數：{1}。";
    t[400] = "Where: {0}";
    t[401] = "在位置：{0}";
    t[406] = "Cannot call deleteRow() when on the insert row.";
    t[407] = "不能在新增的資料上呼叫 deleteRow()。";
    t[414] = "{0} function takes four and only four argument.";
    t[415] = "{0} 函式取得四個且僅有四個引數。";
    t[416] = "Unable to translate data into the desired encoding.";
    t[417] = "無法將資料轉成目標編碼。";
    t[424] = "Can''t use relative move methods while on the insert row.";
    t[425] = "不能在新增的資料列上使用相對位置 move 方法。";
    t[434] = "Invalid stream length {0}.";
    t[435] = "無效的串流長度 {0}.";
    t[436] = "The driver currently does not support COPY operations.";
    t[437] = "驅動程式目前不支援 COPY 操作。";
    t[440] = "Maximum number of rows must be a value grater than or equal to 0.";
    t[441] = "最大資料讀取筆數必須大於或等於 0。";
    t[446] = "Failed to create object for: {0}.";
    t[447] = "為 {0} 建立物件失敗。";
    t[448] = "{0} function takes three and only three arguments.";
    t[449] = "{0} 函式取得三個且僅有三個引數。";
    t[450] = "Conversion of interval failed";
    t[451] = "隔絕(Interval)轉換失敗。";
    t[452] = "Cannot tell if path is open or closed: {0}.";
    t[453] = "無法得知 path 是開啟或關閉：{0}。";
    t[460] = "Provided InputStream failed.";
    t[461] = "提供的 InputStream 已失敗。";
    t[462] = "Invalid fetch direction constant: {0}.";
    t[463] = "無效的 fetch 方向常數：{0}。";
    t[472] = "Invalid protocol state requested. Attempted transaction interleaving is not supported. xid={0}, currentXid={1}, state={2}, flags={3}";
    t[473] = "事物交易隔絕(Transaction interleaving)未被實作。xid={0}, currentXid={1}, state={2}, flags={3}";
    t[474] = "{0} function takes two and only two arguments.";
    t[475] = "{0} 函式取得二個且僅有二個引數。";
    t[476] = "There are no rows in this ResultSet.";
    t[477] = "ResultSet 中找不到資料列。";
    t[478] = "Zero bytes may not occur in string parameters.";
    t[479] = "字串參數不能有 0 個位元組。";
    t[480] = "Cannot call updateRow() when on the insert row.";
    t[481] = "不能在新增的資料列上呼叫 deleteRow()。";
    t[482] = "Connection has been closed automatically because a new connection was opened for the same PooledConnection or the PooledConnection has been closed.";
    t[483] = "Connection 已自動結束，因為一個新的  PooledConnection 連線被開啟或者或 PooledConnection 已被關閉。";
    t[488] = "A CallableStatement function was executed and the out parameter {0} was of type {1} however type {2} was registered.";
    t[489] = "一個 CallableStatement 執行函式後輸出的參數型別為 {1} 值為 {0}，但是已註冊的型別是 {2}。";
    t[494] = "Cannot cast an instance of {0} to type {1}";
    t[495] = "不能轉換一個 {0} 實例到型別 {1}";
    t[498] = "Cannot retrieve the id of a named savepoint.";
    t[499] = "無法取得已命名儲存點的 id。";
    t[500] = "Cannot change transaction read-only property in the middle of a transaction.";
    t[501] = "不能在事物交易過程中改變事物交易唯讀屬性。";
    t[502] = "The server does not support SSL.";
    t[503] = "伺服器不支援 SSL 連線。";
    t[510] = "A connection could not be made using the requested protocol {0}.";
    t[511] = "無法以要求的通訊協定 {0} 建立連線。";
    t[512] = "The authentication type {0} is not supported. Check that you have configured the pg_hba.conf file to include the client''s IP address or subnet, and that it is using an authentication scheme supported by the driver.";
    t[513] = "不支援 {0} 驗證型別。請核對您已經組態 pg_hba.conf 檔案包含客戶端的IP位址或網路區段，以及驅動程式所支援的驗證架構模式已被支援。";
    t[514] = "Malformed function or procedure escape syntax at offset {0}.";
    t[515] = "不正確的函式或程序 escape 語法於 {0}。";
    t[516] = "The server''s DateStyle parameter was changed to {0}. The JDBC driver requires DateStyle to begin with ISO for correct operation.";
    t[517] = "這伺服器的 DateStyle 參數被更改成 {0}，JDBC 驅動程式請求需要 DateStyle 以 ISO 開頭以正確工作。";
    t[518] = "No results were returned by the query.";
    t[519] = "查詢沒有傳回任何結果。";
    t[520] = "Location: File: {0}, Routine: {1}, Line: {2}";
    t[521] = "位置：檔案：{0}，常式：{1}，行：{2}";
    t[526] = "Hint: {0}";
    t[527] = "建議：{0}";
    t[528] = "A CallableStatement was executed with nothing returned.";
    t[529] = "一個 CallableStatement 執行函式後沒有傳回值。";
    t[530] = "Unknown ResultSet holdability setting: {0}.";
    t[531] = "未知的 ResultSet 可適用的設置：{0}。";
    t[540] = "Cannot change transaction isolation level in the middle of a transaction.";
    t[541] = "不能在事務交易過程中改變事物交易隔絕等級。";
    t[544] = "The fastpath function {0} is unknown.";
    t[545] = "不明的 fastpath 函式 {0}。";
    t[546] = "Can''t use query methods that take a query string on a PreparedStatement.";
    t[547] = "在 PreparedStatement 上不能使用獲取查詢字串的查詢方法。";
    t[556] = "Operation requires a scrollable ResultSet, but this ResultSet is FORWARD_ONLY.";
    t[557] = "操作要求可捲動的 ResultSet，但此 ResultSet 是 FORWARD_ONLY。";
    t[564] = "Unknown Types value.";
    t[565] = "不明的型別值。";
    t[570] = "Large Objects may not be used in auto-commit mode.";
    t[571] = "大型物件無法被使用在自動確認事物交易模式。";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 289) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 287) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 578)
        idx -= 578;
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
  }
  public java.util.Enumeration getKeys () {
    return
      new java.util.Enumeration() {
        private int idx = 0;
        { while (idx < 578 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 578);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 578 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}
