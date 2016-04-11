package org.springframework.roo.application.config;

import java.util.List;
import java.util.Map;
import java.util.SortedSet;

/**
 * Provides an interface to {@link ApplicationConfigServiceImpl}.
 * 
 * @author Juan Carlos García
 * @author Paula Navarro
 * @since 2.0
 */
public interface ApplicationConfigService {

  /**
   * Adds some property to the application config file in all application modules.
   * 
   * @param moduleName module where configuration will be located. 
   * @param key string that identifies the property
   * @param value string with the value assigned to the property
   * @param profile string with profile where configuration will be located.
   * @param force boolean that indicates if is necessary to force operation
   */
  void addProperty(String moduleName, String key, String value, String profile, boolean force);

  /**
   * Adds some property to application config file in all application modules including given prefix
   * 
   * @param moduleName module where configuration will be located. 
   * @param prefix string that will be included as property prefix
   * @param key string that identifies the property
   * @param value string with the value assigned to the property
   * @param profile string with profile where configuration will be located.
   * @param force boolean that indicates if is necessary to force operation
   */
  void addProperty(String moduleName, String prefix, String key, String value, String profile,
      boolean force);

  /**
   * Adds the contents of the properties map to application config file in all application modules.
   * 
   * @param moduleName module where configuration will be located. 
   * @param properties the map of properties to add
   * @param profile string with profile where configuration will be located.
   * @param force boolean that indicates if is necessary to force operation
   */
  void addProperties(String moduleName, Map<String, String> properties, String profile,
      boolean force);

  /**
   * Adds the contents of the properties map to application config file in all application modules using
   * the same prefix to every properties included on map.
   * 
   * @param moduleName module where configuration will be located. 
   * @param prefix string that will be included as property prefix
   * @param properties the map of properties to add
   * @param profile string with profile where configuration will be located.
   * @param force boolean that indicates if is necessary to force operation
   */
  void addProperties(String moduleName, String prefix, Map<String, String> properties,
      String profile, boolean force);

  /**
   * Changes the specified property in all application modules.
   * 
   * @param moduleName module where configuration will be located. 
   * @param key the property key to update (required)
   * @param value the property value to set into the property key (required)
   * @param profile string with profile where configuration will be located.
   * @param force boolean that indicates if is necessary to force operation
   */
  void updateProperty(String moduleName, String key, String value, String profile, boolean force);

  /**
   * Changes the specified property in all application modules including prefix.
   * 
   * @param moduleName module where configuration will be located. 
   * @param prefix included on given property
   * @param key the property key to update (required)
   * @param value the property value to set into the property key (required)
   * @param profile string with profile where configuration will be located.
   * @param force boolean that indicates if is necessary to force operation
   */
  void updateProperty(String moduleName, String prefix, String key, String value, String profile,
      boolean force);

  /**
   * Update the contents of the properties map to application config file in all application modules.
   * 
   * @param moduleName module where configuration will be located. 
   * @param properties the map of properties to update
   * @param profile string with profile where configuration will be located.
   * @param force boolean that indicates if is necessary to force operation
   */
  void updateProperties(String moduleName, Map<String, String> properties, String profile,
      boolean force);

  /**
   * Adds the contents of the properties map to application config file in all application modules using
   * the same prefix to every properties included on map.
   * 
   * @param moduleName module where configuration will be located. 
   * @param prefix included for every properties
   * @param properties the map of properties to update
   * @param profile string with profile where configuration will be located.
   * @param force boolean that indicates if is necessary to force operation
   */
  void updateProperties(String moduleName, String prefix, Map<String, String> properties,
      String profile, boolean force);


  /**
   * Retrieves all property key/value pairs from the specified property file in a module,
   * throwing an exception if the file does not exist.
   * 
   * @param moduleName module where configuration will be located. 
   * @param profile string with profile where configuration will be located.
   *
   * @return the key/value pairs (may return null if the property file does
   *         not exist)
   */
  Map<String, String> getProperties(String moduleName, String profile);

  /**
   * Retrieves all property keys from the specified property in all application modules, throwing an
   * exception if the file does not exist.
   * 
   * @param moduleName module where configuration will be located. 
   * @param includeValues if true, appends (" = theValue") to each returned
   *            string
   * @param profile string with profile where configuration will be located.
   * 
   * @return the keys (may return null if the property file does not exist)
   */
  SortedSet<String> getPropertyKeys(String moduleName, boolean includeValues, String profile);

  /**
   * Retrieves all property keys from the specified property in all application modules, throwing an
   * exception if the file does not exist.
   * 
   * @param moduleName module where configuration will be located. 
   * @param prefix string that identifies property prefix. (if defined, only 
   *        properties that starts with it will be returned)
   * @param includeValues if true, appends (" = theValue") to each returned
   *            string
   * @param profile string with profile where configuration will be located.
   * 
   * @return the keys (may return null if the property file does not exist)
   */
  SortedSet<String> getPropertyKeys(String moduleName, String prefix, boolean includeValues,
      String profile);

  /**
   * Retrieves the specified property, returning null if the property or file
   * does not exist. This property is the first instance found in any application module.
   *
   * @param moduleName module where configuration will be located. 
   * @param key the property key to retrieve (required)
   * @param profile string with profile where configuration will be located.
   * 
   * @return the property value (may return null if the property file or
   *         requested property does not exist)
   */
  String getProperty(String moduleName, String key, String profile);

  /**
   * Retrieves the specified property, returning null if the property
   * does not exist. This property is the first instance found in any application module.
   * 
   * @param moduleName module where configuration will be located. 
   * @param prefix included on given property
   * @param key the property key to retrieve (required)
   * @param profile string with profile where configuration will be located.
   * 
   * @return the property value (may return null if the property file or
   *         requested property does not exist)
   */
  String getProperty(String moduleName, String prefix, String key, String profile);

  /**
   * Removes the specified property in all application modules.
   * 
   * @param moduleName module where configuration will be located. 
   * @param profile string with profile where configuration will be located.
   * @param key the property key to remove (required)
   */
  void removeProperty(String moduleName, String key, String profile);

  /**
   * Removes the specified property in all application modules including prefix.
   * 
   * @param moduleName module where configuration will be located. 
   * @param prefix included on given property key
   * @param profile string with profile where configuration will be located.
   * @param key the property key to remove (required)
   */
  void removeProperty(String moduleName, String prefix, String key, String profile);

  /**
   * Removes the specified properties in all application modules.
   * 
   * @param moduleName module where configuration will be located. 
   * @param keys list of property keys to remove (required)
   * @param profile string with profile where configuration will be located.
   */
  void removeProperties(String moduleName, List<String> keys, String profile);

  /**
   * Removes the specified properties in all application modules.
   * 
   * @param moduleName module where configuration will be located. 
   * @param prefix that identifies property to be removed
   * @param profile string with profile where configuration will be located.
   */
  void removePropertiesByPrefix(String moduleName, String prefix, String profile);

  /**
   * Method that returns current location of Spring Config file of a module
   * (if user has not modified it should return src/main/resources/application.properties)
   * 
   * @param moduleName module where configuration will be located. 
   *
   * @return string with current location of Spring Config file
   */
  String getSpringConfigLocation(String moduleName);

  /**
   * Method that returns current location of Spring Config file of a module
   * (if user has not modified it should return src/main/resources/application-profile.properties)
   * 
   * @param moduleName module where configuration will be located. 
   * @param profile string with profile where configuration will be located.
   *
   * @return string with current location of Spring Config file
   */
  String getSpringConfigLocation(String moduleName, String profile);

  /**
   * Method that checks if Spring config file exists in a module. Uses getSpringConfigLocation method to
   * obtain location.
   * 
   * @param moduleName module where configuration will be located. 
   *
   * @return boolean true if exists
   */
  boolean existsSpringConfigFile(String moduleName);

  /**
   * Method that checks if Spring config file exists for an existing profile in a module. Uses 
   * getSpringConfigLocation method to obtain location.
   * 
   * @param moduleName module where configuration will be located. 
   * @param profile string with profile where configuration will be located.
   * 
   * @return boolean true if exists
   */
  boolean existsSpringConfigFile(String moduleName, String profile);
}