// Copyright 2014 The Java Client for Google Maps Services Authors. All Rights Reserved.
//
//
// Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
// file except in compliance with the License. You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software distributed under
// the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF
// ANY KIND, either express or implied. See the License for the specific language governing
// permissions and limitations under the License.

package com.google.maps.errors;

/**
 * Indicates that no results were returned.
 *
 * <p>In some cases, this will be treated as a success
 * state and you will only see an empty array. For time zone data, it means that no time zone
 * information could be found for the specified position or time. Confirm that the request is for
 * a location on land, and not over water.
 */
public class ZeroResultsException extends ApiException {

  public ZeroResultsException(String errorMessage) {
    super(errorMessage);
  }
}
