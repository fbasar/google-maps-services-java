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

package com.google.maps.model;

import com.google.maps.internal.PolylineEncoding;

import java.util.List;

/**
 * Encoded Polylines are used by the API to represent paths.
 *
 * <p>See {@url https://developers.google.com/maps/documentation/utilities/polylinealgorithm} for
 * more detail on the protocol.
 */
public class EncodedPolyline {
  private String points;

  /**
   * @param encodedPath A string representation of a path, encoded with the Polyline Algorithm.
   */
  public EncodedPolyline(String encodedPoints) {
    this.points = encodedPoints;
  }

  /**
   * @param points A path as a collection of {@code LatLng} points.
   */
  public EncodedPolyline(List<LatLng> points) {
    this.points = PolylineEncoding.encode(points);
  }

  public String getEncodedPath() {
    return points;
  }

  public List<LatLng> decodePath() {
    return PolylineEncoding.decode(points);
  }
}
