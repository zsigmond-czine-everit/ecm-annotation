/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.osgi.ecm.annotation.attribute;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * The priority of the attribute when the configuration display is rendered. Smaller number means
 * higher priority. The attributes with higher priority will be rendered first on the configuration
 * screen.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface AttributePriority {

  /**
   * Default priority for attributes where it is not defined otherwise.
   */
  float DEFAULT_ATTRIBUTE_PRIORITY = 1000;

  /**
   * Id of attribute that this display priority belongs to.
   */
  String attributeId();

  /**
   * The priority of the attribute. Smaller number means higher priority. The attributes with higher
   * priority will be rendered first on the configuration screen.
   */
  float priority();
}
