package com.ebay.ejmask.api;

import javax.annotation.Nonnull;

/**
 * Copyright (c) 2023 eBay Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class PatternEntity {

    private String patternTemplate;

    private String replacementTemplate;

    public PatternEntity(@Nonnull String patternTemplate, @Nonnull String replacementTemplate) {
        this.patternTemplate = patternTemplate;
        this.replacementTemplate = replacementTemplate;
    }

    public String getPatternTemplate() {
        return patternTemplate;
    }

    public String getReplacementTemplate() {
        return replacementTemplate;
    }
}
