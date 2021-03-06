/*
 * Copyright (C) 2015, BMW Car IT GmbH
 *
 * Author: Sebastian Mattheis <sebastian.mattheis@bmw-carit.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in
 * writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package io.sharedstreets.barefoot.roadmap;

import io.sharedstreets.barefoot.topology.Cost;

/**
 * Distance cost function for routing in {@link RoadEdge} networks.
 */
public class Distance extends Cost<RoadEdge> {
    /**
     * Gets traveling distance for passing the road.
     *
     * @return Distance in meters for passing the road.
     */
    @Override
    public double cost(RoadEdge road) {
        return road.length();
    }
}
