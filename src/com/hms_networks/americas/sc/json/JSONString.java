package com.hms_networks.americas.sc.json;

/**
 * The <code>JSONString</code> interface allows a <code>toJSONString()</code> method so that a class
 * can change the behavior of <code>JSONObject.toString()</code>, <code>JSONArray.toString()</code>,
 * and <code>JSONWriter.value(</code>Object<code>)</code>. The <code>toJSONString</code> method will
 * be used instead of the default behavior of using the Object's <code>toString()</code> method and
 * quoting the result.
 *
 * @author JSON.org
 * @version 2
 * @since 1.0
 */
public interface JSONString {

  /**
   * The <code>toJSONString</code> method allows a class to produce its own JSON serialization.
   *
   * @return A strictly syntactically correct JSON text.
   */
  String toJSONString();
}
