/**
 * This file is part of Everit - Component Annotations.
 *
 * Everit - Component Annotations is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Everit - Component Annotations is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Everit - Component Annotations.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.osgi.component.annotation;

/**
 * Cardinality for any attribute annotation.
 */
public enum Cardinality {
    /**
     * The attribute is mandatory and multiple. That is, the attribute has a cardinality of {@code 1..n}.
     */
    AT_LEAST_ONE("1..n"),

    /**
     * The attribute is mandatory and unary. That is, the attribute has a cardinality of {@code 1..1}.
     */
    MANDATORY("1..1"),

    /**
     * The attribute is optional and multiple. That is, the attribute has a cardinality of {@code 0..n}.
     */
    MULTIPLE("0..n"),

    /**
     * The attribute is optional and unary. That is, the attribute has a cardinality of {@code 0..1}.
     */
    OPTIONAL("0..1");

    private final String value;

    Cardinality(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
