package com.example.ObjectUtil;

import java.util.Arrays;
import java.util.List;
import org.springframework.util.StringUtils;

public class StringUtilities {
  public static List<String> constructListFromCommaSeparatedElement(String elementStr) {
    if (StringUtils.isEmpty(elementStr))
      return null; 
    return Arrays.asList(elementStr.split("\\s*,\\s*"));
  }
  
  public static String retrieveRejectionReason(String functionReturn, String prefix) {
    int prefixIndex = functionReturn.indexOf(prefix);
    if (prefixIndex == -1)
      return "01"; 
    int rejectStartIndex = prefixIndex + prefix.length();
    int rejectEndIndex = rejectStartIndex + 2;
    if (rejectStartIndex > 0 && rejectEndIndex > 0 && rejectStartIndex < rejectEndIndex && rejectEndIndex < functionReturn
      
      .length() - 1) {
      String rejectReason = functionReturn.substring(rejectStartIndex, rejectEndIndex);
      return rejectReason;
    } 
    return "01";
  }
}
