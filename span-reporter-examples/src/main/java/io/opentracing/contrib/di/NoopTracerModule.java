/**
 * Copyright 2017 The OpenTracing Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package io.opentracing.contrib.di;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import io.opentracing.Tracer;
import io.opentracing.noop.NoopTracerFactory;

import javax.inject.Named;
import javax.inject.Singleton;

public class NoopTracerModule extends AbstractModule {
    @Override
    protected void configure() {

    }
    @Provides
    @Singleton
    @Named("backend")
    protected Tracer tracer() {
        return NoopTracerFactory.create();
    }
}
