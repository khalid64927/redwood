/*
 * Copyright (C) 2021 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package app.cash.treehouse.schema.generator

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeVariableName
import com.squareup.kotlinpoet.UNIT

internal val eventType = ClassName("app.cash.treehouse.protocol", "Event")
internal val eventSink = ClassName("app.cash.treehouse.protocol", "EventSink")
internal val propertyDiff = ClassName("app.cash.treehouse.protocol", "PropertyDiff")

internal val protocolWidget = ClassName("app.cash.treehouse.protocol.widget", "ProtocolWidget")
internal val protocolWidgetFactory = protocolWidget.nestedClass("Factory")

internal val widgetChildren = ClassName("app.cash.treehouse.widget", "WidgetChildren")
internal val mutableListChildren = ClassName("app.cash.treehouse.widget", "MutableListChildren")

internal val protocolApplier = ClassName("app.cash.treehouse.compose", "ProtocolApplier")
internal val protocolNode = ClassName("app.cash.treehouse.compose", "ProtocolNode")
internal val syntheticChildren = MemberName("app.cash.treehouse.compose", "\$SyntheticChildren")

internal val applier = ClassName("androidx.compose.runtime", "Applier")
internal val composable = ClassName("androidx.compose.runtime", "Composable")
internal val composeNode = MemberName("androidx.compose.runtime", "ComposeNode")

internal val composableLambda = LambdaTypeName.get(returnType = UNIT)
  .copy(
    annotations = listOf(
      AnnotationSpec.builder(composable).build(),
    )
  )

internal val ae = ClassName("kotlin", "AssertionError")
internal val iae = ClassName("kotlin", "IllegalArgumentException")

internal val typeVariableT = TypeVariableName("T", listOf(ANY))
internal val childrenOfT = widgetChildren.parameterizedBy(typeVariableT)
