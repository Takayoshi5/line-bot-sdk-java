/*
 * Copyright 2016 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

apply(plugin = "org.springframework.boot")

dependencies {
    implementation(project(":line-bot-spring-boot"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.atilika.kuromoji:kuromoji-ipadic:0.9.0")
    implementation("org.jsoup:jsoup:1.15.2")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
