/*
 * Copyright 2014 Google Inc. All Rights Reserved.

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.skylight1.vrmapexplorer;

/**
 * Contains vertex, normal and color data.
 */
/**
 * Contains vertex, normal and color data.
 */
public final class WorldLayoutData {

    public static final float[] FLOOR_COORDS = new float[] {
            1000f, 0, -1000f,
            -1000f, 0, -1000f,
            -1000f, 0, 1000f,
            1000f, 0, -1000f,
            -1000f, 0, 1000f,
            1000f, 0, 1000f,
    };

    public static final float[] FLOOR_TEXTURE_COORDS = new float[] {
            1, 0,
            0, 0,
            0, 1,
            1, 0,
            0, 1,
            1, 1
    };
}
