// Copyright 2021 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.devtools.build.skydoc.fakebuildapi.config;

import com.google.devtools.build.lib.analysis.config.transitions.PatchTransition;
import com.google.devtools.build.lib.analysis.config.transitions.TransitionFactory;
import com.google.devtools.build.lib.packages.RuleTransitionData;
import com.google.devtools.build.lib.starlarkbuildapi.config.ConfigurationTransitionApi;

/**
 * Fake callable implementation of the {@link
 * com.google.devtools.build.lib.rules.config.ConfigFeatureFlagTransitionFactory}.
 */
public class FakeConfigFeatureFlagTransitionFactory
    implements TransitionFactory<RuleTransitionData>, ConfigurationTransitionApi {

  @Override
  public PatchTransition create(RuleTransitionData ruleData) {
    return null;
  }

  @Override
  public TransitionType transitionType() {
    return TransitionType.RULE;
  }
}
