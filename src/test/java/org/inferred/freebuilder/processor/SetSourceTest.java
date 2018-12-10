/*
 * Copyright 2015 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.inferred.freebuilder.processor;

import static com.google.common.truth.Truth.assertThat;
import static org.inferred.freebuilder.processor.GenericTypeElementImpl.newTopLevelGenericType;
import static org.inferred.freebuilder.processor.util.ClassTypeImpl.STRING;
import static org.inferred.freebuilder.processor.util.FunctionalType.consumer;
import static org.inferred.freebuilder.processor.util.WildcardTypeImpl.wildcardSuper;

import com.google.common.base.Joiner;
import com.google.common.base.Optional;

import org.inferred.freebuilder.processor.GenericTypeElementImpl.GenericTypeMirrorImpl;
import org.inferred.freebuilder.processor.Metadata.Property;
import org.inferred.freebuilder.processor.util.CompilationUnitBuilder;
import org.inferred.freebuilder.processor.util.QualifiedName;
import org.inferred.freebuilder.processor.util.SourceBuilder;
import org.inferred.freebuilder.processor.util.SourceStringBuilder;
import org.inferred.freebuilder.processor.util.feature.Feature;
import org.inferred.freebuilder.processor.util.feature.GuavaLibrary;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.lang.model.type.TypeMirror;

@RunWith(JUnit4.class)
public class SetSourceTest {

  @Test
  public void test_guava_j8() {
    Metadata metadata = createMetadata(true);

    String source = generateSource(metadata, GuavaLibrary.AVAILABLE);
    assertThat(source).isEqualTo(Joiner.on('\n').join(
        "/** Auto-generated superclass of {@link Person.Builder}, "
            + "derived from the API of {@link Person}. */",
        "abstract class Person_Builder {",
        "",
        "  /** Creates a new builder using {@code value} as a template. */",
        "  public static Person.Builder from(Person value) {",
        "    return new Person.Builder().mergeFrom(value);",
        "  }",
        "",
        "  private Set<String> name = ImmutableSet.of();",
        "",
        "  /**",
        "   * Adds {@code element} to the set to be returned from {@link Person#getName()}. "
            + "If the set",
        "   * already contains {@code element}, then {@code addName} has no effect "
            + "(only the previously added",
        "   * element is retained).",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code element} is null",
        "   */",
        "  public Person.Builder addName(String element) {",
        "    if (name instanceof ImmutableSet) {",
        "      name = new LinkedHashSet<>(name);",
        "    }",
        "    name.add(Objects.requireNonNull(element));",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Adds each element of {@code elements} to the set to be returned from "
            + "{@link Person#getName()},",
        "   * ignoring duplicate elements (only the first duplicate element is added).",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code elements} is null or contains a null element",
        "   */",
        "  public Person.Builder addName(String... elements) {",
        "    return addAllName(Arrays.asList(elements));",
        "  }",
        "",
        "  /**",
        "   * Adds each element of {@code elements} to the set to be returned from "
            + "{@link Person#getName()},",
        "   * ignoring duplicate elements (only the first duplicate element is added).",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code elements} is null or contains a null element",
        "   */",
        "  public Person.Builder addAllName(Spliterator<? extends String> elements) {",
        "    elements.forEachRemaining(this::addName);",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Adds each element of {@code elements} to the set to be returned from "
            + "{@link Person#getName()},",
        "   * ignoring duplicate elements (only the first duplicate element is added).",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code elements} is null or contains a null element",
        "   */",
        "  public Person.Builder addAllName(BaseStream<? extends String, ?> elements) {",
        "    return addAllName(elements.spliterator());",
        "  }",
        "",
        "  /**",
        "   * Adds each element of {@code elements} to the set to be returned from "
            + "{@link Person#getName()},",
        "   * ignoring duplicate elements (only the first duplicate element is added).",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code elements} is null or contains a null element",
        "   */",
        "  public Person.Builder addAllName(Iterable<? extends String> elements) {",
        "    elements.forEach(this::addName);",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Removes {@code element} from the set to be returned from {@link Person#getName()}. "
            + "Does nothing",
        "   * if {@code element} is not a member of the set.",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code element} is null",
        "   */",
        "  public Person.Builder removeName(String element) {",
        "    if (name instanceof ImmutableSet) {",
        "      name = new LinkedHashSet<>(name);",
        "    }",
        "    name.remove(Objects.requireNonNull(element));",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Applies {@code mutator} to the set to be returned from {@link Person#getName()}.",
        "   *",
        "   * <p>This method mutates the set in-place. {@code mutator} is a void consumer, "
            + "so any value",
        "   * returned from a lambda will be ignored. Take care not to call pure functions, "
            + "like {@link",
        "   * Collection#stream()}.",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code mutator} is null",
        "   */",
        "  public Person.Builder mutateName(Consumer<? super Set<String>> mutator) {",
        "    if (name instanceof ImmutableSet) {",
        "      name = new LinkedHashSet<>(name);",
        "    }",
        "    // If addName is overridden, this method will be updated to delegate to it",
        "    mutator.accept(name);",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Clears the set to be returned from {@link Person#getName()}.",
        "   *",
        "   * @return this {@code Builder} object",
        "   */",
        "  public Person.Builder clearName() {",
        "    if (name instanceof ImmutableSet) {",
        "      name = ImmutableSet.of();",
        "    } else {",
        "      name.clear();",
        "    }",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Returns an unmodifiable view of the set that will be returned by "
            + "{@link Person#getName()}.",
        "   * Changes to this builder will be reflected in the view.",
        "   */",
        "  public Set<String> getName() {",
        "    if (name instanceof ImmutableSet) {",
        "      name = new LinkedHashSet<>(name);",
        "    }",
        "    return Collections.unmodifiableSet(name);",
        "  }",
        "",
        "  /** Sets all property values using the given {@code Person} as a template. */",
        "  public Person.Builder mergeFrom(Person value) {",
        "    if (value instanceof Person_Builder.Value && name == ImmutableSet.<String>of()) {",
        "      name = ImmutableSet.copyOf(value.getName());",
        "    } else {",
        "      addAllName(value.getName());",
        "    }",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Copies values from the given {@code Builder}. "
            + "Does not affect any properties not set on the",
        "   * input.",
        "   */",
        "  public Person.Builder mergeFrom(Person.Builder template) {",
        "    // Upcast to access private fields; otherwise, oddly, we get an access violation.",
        "    Person_Builder base = template;",
        "    addAllName(base.name);",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /** Resets the state of this builder. */",
        "  public Person.Builder clear() {",
        "    clearName();",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /** Returns a newly-created {@link Person} based on the contents of the "
            + "{@code Builder}. */",
        "  public Person build() {",
        "    return new Person_Builder.Value(this);",
        "  }",
        "",
        "  /**",
        "   * Returns a newly-created partial {@link Person} for use in unit tests. "
            + "State checking will not",
        "   * be performed.",
        "   *",
        "   * <p>Partials should only ever be used in tests. "
            + "They permit writing robust test cases that won't",
        "   * fail if this type gains more application-level constraints "
            + "(e.g. new required fields) in",
        "   * future. If you require partially complete values in production code, "
            + "consider using a Builder.",
        "   */",
        "  @VisibleForTesting()",
        "  public Person buildPartial() {",
        "    return new Person_Builder.Partial(this);",
        "  }",
        "",
        "  private static final class Value extends Person {",
        "    private final Set<String> name;",
        "",
        "    private Value(Person_Builder builder) {",
        "      this.name = ImmutableSet.copyOf(builder.name);",
        "    }",
        "",
        "    @Override",
        "    public Set<String> getName() {",
        "      return name;",
        "    }",
        "",
        "    @Override",
        "    public boolean equals(Object obj) {",
        "      if (!(obj instanceof Person_Builder.Value)) {",
        "        return false;",
        "      }",
        "      Person_Builder.Value other = (Person_Builder.Value) obj;",
        "      return Objects.equals(name, other.name);",
        "    }",
        "",
        "    @Override",
        "    public int hashCode() {",
        "      return Objects.hash(name);",
        "    }",
        "",
        "    @Override",
        "    public String toString() {",
        "      return \"Person{name=\" + name + \"}\";",
        "    }",
        "  }",
        "",
        "  private static final class Partial extends Person {",
        "    private final Set<String> name;",
        "",
        "    Partial(Person_Builder builder) {",
        "      this.name = ImmutableSet.copyOf(builder.name);",
        "    }",
        "",
        "    @Override",
        "    public Set<String> getName() {",
        "      return name;",
        "    }",
        "",
        "    @Override",
        "    public boolean equals(Object obj) {",
        "      if (!(obj instanceof Person_Builder.Partial)) {",
        "        return false;",
        "      }",
        "      Person_Builder.Partial other = (Person_Builder.Partial) obj;",
        "      return Objects.equals(name, other.name);",
        "    }",
        "",
        "    @Override",
        "    public int hashCode() {",
        "      return Objects.hash(name);",
        "    }",
        "",
        "    @Override",
        "    public String toString() {",
        "      return \"partial Person{name=\" + name + \"}\";",
        "    }",
        "  }",
        "}\n"));
  }

  @Test
  public void test_noGuava_j8() {
    Metadata metadata = createMetadata(true);

    assertThat(generateSource(metadata)).isEqualTo(Joiner.on('\n').join(
        "/** Auto-generated superclass of {@link Person.Builder}, "
            + "derived from the API of {@link Person}. */",
        "abstract class Person_Builder {",
        "",
        "  /** Creates a new builder using {@code value} as a template. */",
        "  public static Person.Builder from(Person value) {",
        "    return new Person.Builder().mergeFrom(value);",
        "  }",
        "",
        "  private final LinkedHashSet<String> name = new LinkedHashSet<>();",
        "",
        "  /**",
        "   * Adds {@code element} to the set to be returned from {@link Person#getName()}. "
            + "If the set",
        "   * already contains {@code element}, then {@code addName} has no effect "
            + "(only the previously added",
        "   * element is retained).",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code element} is null",
        "   */",
        "  public Person.Builder addName(String element) {",
        "    name.add(Objects.requireNonNull(element));",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Adds each element of {@code elements} to the set to be returned from "
            + "{@link Person#getName()},",
        "   * ignoring duplicate elements (only the first duplicate element is added).",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code elements} is null or contains a null element",
        "   */",
        "  public Person.Builder addName(String... elements) {",
        "    return addAllName(Arrays.asList(elements));",
        "  }",
        "",
        "  /**",
        "   * Adds each element of {@code elements} to the set to be returned from "
            + "{@link Person#getName()},",
        "   * ignoring duplicate elements (only the first duplicate element is added).",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code elements} is null or contains a null element",
        "   */",
        "  public Person.Builder addAllName(Spliterator<? extends String> elements) {",
        "    elements.forEachRemaining(this::addName);",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Adds each element of {@code elements} to the set to be returned from {@link Person#getName()},",
        "   * ignoring duplicate elements (only the first duplicate element is added).",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code elements} is null or contains a null element",
        "   */",
        "  public Person.Builder addAllName(BaseStream<? extends String, ?> elements) {",
        "    return addAllName(elements.spliterator());",
        "  }",
        "",
        "  /**",
        "   * Adds each element of {@code elements} to the set to be returned from {@link Person#getName()},",
        "   * ignoring duplicate elements (only the first duplicate element is added).",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code elements} is null or contains a null element",
        "   */",
        "  public Person.Builder addAllName(Iterable<? extends String> elements) {",
        "    elements.forEach(this::addName);",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Removes {@code element} from the set to be returned from {@link Person#getName()}. "
            + "Does nothing",
        "   * if {@code element} is not a member of the set.",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code element} is null",
        "   */",
        "  public Person.Builder removeName(String element) {",
        "    name.remove(Objects.requireNonNull(element));",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Applies {@code mutator} to the set to be returned from {@link Person#getName()}.",
        "   *",
        "   * <p>This method mutates the set in-place. {@code mutator} is a void consumer, so any "
            + "value",
        "   * returned from a lambda will be ignored. Take care not to call pure functions, like "
            + "{@link",
        "   * Collection#stream()}.",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code mutator} is null",
        "   */",
        "  public Person.Builder mutateName(Consumer<? super Set<String>> mutator) {",
        "    // If addName is overridden, this method will be updated to delegate to it",
        "    mutator.accept(name);",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Clears the set to be returned from {@link Person#getName()}.",
        "   *",
        "   * @return this {@code Builder} object",
        "   */",
        "  public Person.Builder clearName() {",
        "    name.clear();",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Returns an unmodifiable view of the set that will be returned by "
            + "{@link Person#getName()}.",
        "   * Changes to this builder will be reflected in the view.",
        "   */",
        "  public Set<String> getName() {",
        "    return Collections.unmodifiableSet(name);",
        "  }",
        "",
        "  /** Sets all property values using the given {@code Person} as a template. */",
        "  public Person.Builder mergeFrom(Person value) {",
        "    addAllName(value.getName());",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Copies values from the given {@code Builder}. "
            + "Does not affect any properties not set on the",
        "   * input.",
        "   */",
        "  public Person.Builder mergeFrom(Person.Builder template) {",
        "    // Upcast to access private fields; otherwise, oddly, we get an access violation.",
        "    Person_Builder base = template;",
        "    addAllName(base.name);",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /** Resets the state of this builder. */",
        "  public Person.Builder clear() {",
        "    clearName();",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /** Returns a newly-created {@link Person} based on the contents of the "
            + "{@code Builder}. */",
        "  public Person build() {",
        "    return new Person_Builder.Value(this);",
        "  }",
        "",
        "  /**",
        "   * Returns a newly-created partial {@link Person} for use in unit tests. "
            + "State checking will not",
        "   * be performed.",
        "   *",
        "   * <p>Partials should only ever be used in tests. "
            + "They permit writing robust test cases that won't",
        "   * fail if this type gains more application-level constraints "
            + "(e.g. new required fields) in",
        "   * future. If you require partially complete values in production code, "
            + "consider using a Builder.",
        "   */",
        "  public Person buildPartial() {",
        "    return new Person_Builder.Partial(this);",
        "  }",
        "",
        "  private static final class Value extends Person {",
        "    private final Set<String> name;",
        "",
        "    private Value(Person_Builder builder) {",
        "      this.name = immutableSet(builder.name);",
        "    }",
        "",
        "    @Override",
        "    public Set<String> getName() {",
        "      return name;",
        "    }",
        "",
        "    @Override",
        "    public boolean equals(Object obj) {",
        "      if (!(obj instanceof Person_Builder.Value)) {",
        "        return false;",
        "      }",
        "      Person_Builder.Value other = (Person_Builder.Value) obj;",
        "      return Objects.equals(name, other.name);",
        "    }",
        "",
        "    @Override",
        "    public int hashCode() {",
        "      return Objects.hash(name);",
        "    }",
        "",
        "    @Override",
        "    public String toString() {",
        "      return \"Person{name=\" + name + \"}\";",
        "    }",
        "  }",
        "",
        "  private static final class Partial extends Person {",
        "    private final Set<String> name;",
        "",
        "    Partial(Person_Builder builder) {",
        "      this.name = immutableSet(builder.name);",
        "    }",
        "",
        "    @Override",
        "    public Set<String> getName() {",
        "      return name;",
        "    }",
        "",
        "    @Override",
        "    public boolean equals(Object obj) {",
        "      if (!(obj instanceof Person_Builder.Partial)) {",
        "        return false;",
        "      }",
        "      Person_Builder.Partial other = (Person_Builder.Partial) obj;",
        "      return Objects.equals(name, other.name);",
        "    }",
        "",
        "    @Override",
        "    public int hashCode() {",
        "      return Objects.hash(name);",
        "    }",
        "",
        "    @Override",
        "    public String toString() {",
        "      return \"partial Person{name=\" + name + \"}\";",
        "    }",
        "  }",
        "",
        "  private static <E> Set<E> immutableSet(Set<E> elements) {",
        "    switch (elements.size()) {",
        "      case 0:",
        "        return Collections.emptySet();",
        "      case 1:",
        "        return Collections.singleton(elements.iterator().next());",
        "      default:",
        "        return Collections.unmodifiableSet(new LinkedHashSet<>(elements));",
        "    }",
        "  }",
        "}\n"));
  }

  @Test
  public void test_prefixless() {
    Metadata metadata = createMetadata(false);

    String source = generateSource(metadata, GuavaLibrary.AVAILABLE);
    assertThat(source).isEqualTo(Joiner.on('\n').join(
        "/** Auto-generated superclass of {@link Person.Builder}, "
            + "derived from the API of {@link Person}. */",
        "abstract class Person_Builder {",
        "",
        "  /** Creates a new builder using {@code value} as a template. */",
        "  public static Person.Builder from(Person value) {",
        "    return new Person.Builder().mergeFrom(value);",
        "  }",
        "",
        "  private Set<String> name = ImmutableSet.of();",
        "",
        "  /**",
        "   * Adds {@code element} to the set to be returned from {@link Person#name()}. "
            + "If the set already",
        "   * contains {@code element}, then {@code addName} has no effect "
            + "(only the previously added element",
        "   * is retained).",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code element} is null",
        "   */",
        "  public Person.Builder addName(String element) {",
        "    if (name instanceof ImmutableSet) {",
        "      name = new LinkedHashSet<>(name);",
        "    }",
        "    name.add(Objects.requireNonNull(element));",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Adds each element of {@code elements} to the set to be returned from "
            + "{@link Person#name()},",
        "   * ignoring duplicate elements (only the first duplicate element is added).",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code elements} is null or contains a null element",
        "   */",
        "  public Person.Builder addName(String... elements) {",
        "    return addAllName(Arrays.asList(elements));",
        "  }",
        "",
        "  /**",
        "   * Adds each element of {@code elements} to the set to be returned from "
            + "{@link Person#name()},",
        "   * ignoring duplicate elements (only the first duplicate element is added).",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code elements} is null or contains a null element",
        "   */",
        "  public Person.Builder addAllName(Spliterator<? extends String> elements) {",
        "    elements.forEachRemaining(this::addName);",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Adds each element of {@code elements} to the set to be returned from "
            + "{@link Person#name()},",
        "   * ignoring duplicate elements (only the first duplicate element is added).",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code elements} is null or contains a null element",
        "   */",
        "  public Person.Builder addAllName(BaseStream<? extends String, ?> elements) {",
        "    return addAllName(elements.spliterator());",
        "  }",
        "",
        "  /**",
        "   * Adds each element of {@code elements} to the set to be returned from "
            + "{@link Person#name()},",
        "   * ignoring duplicate elements (only the first duplicate element is added).",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code elements} is null or contains a null element",
        "   */",
        "  public Person.Builder addAllName(Iterable<? extends String> elements) {",
        "    elements.forEach(this::addName);",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Removes {@code element} from the set to be returned from {@link Person#name()}. "
            + "Does nothing if",
        "   * {@code element} is not a member of the set.",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code element} is null",
        "   */",
        "  public Person.Builder removeName(String element) {",
        "    if (name instanceof ImmutableSet) {",
        "      name = new LinkedHashSet<>(name);",
        "    }",
        "    name.remove(Objects.requireNonNull(element));",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Applies {@code mutator} to the set to be returned from {@link Person#name()}.",
        "   *",
        "   * <p>This method mutates the set in-place. {@code mutator} is a void consumer, "
            + "so any value",
        "   * returned from a lambda will be ignored. Take care not to call pure functions, "
            + "like {@link",
        "   * Collection#stream()}.",
        "   *",
        "   * @return this {@code Builder} object",
        "   * @throws NullPointerException if {@code mutator} is null",
        "   */",
        "  public Person.Builder mutateName(Consumer<? super Set<String>> mutator) {",
        "    if (name instanceof ImmutableSet) {",
        "      name = new LinkedHashSet<>(name);",
        "    }",
        "    // If addName is overridden, this method will be updated to delegate to it",
        "    mutator.accept(name);",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Clears the set to be returned from {@link Person#name()}.",
        "   *",
        "   * @return this {@code Builder} object",
        "   */",
        "  public Person.Builder clearName() {",
        "    if (name instanceof ImmutableSet) {",
        "      name = ImmutableSet.of();",
        "    } else {",
        "      name.clear();",
        "    }",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Returns an unmodifiable view of the set that will be returned by "
            + "{@link Person#name()}. Changes",
        "   * to this builder will be reflected in the view.",
        "   */",
        "  public Set<String> name() {",
        "    if (name instanceof ImmutableSet) {",
        "      name = new LinkedHashSet<>(name);",
        "    }",
        "    return Collections.unmodifiableSet(name);",
        "  }",
        "",
        "  /** Sets all property values using the given {@code Person} as a template. */",
        "  public Person.Builder mergeFrom(Person value) {",
        "    if (value instanceof Person_Builder.Value && name == ImmutableSet.<String>of()) {",
        "      name = ImmutableSet.copyOf(value.name());",
        "    } else {",
        "      addAllName(value.name());",
        "    }",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /**",
        "   * Copies values from the given {@code Builder}. "
            + "Does not affect any properties not set on the",
        "   * input.",
        "   */",
        "  public Person.Builder mergeFrom(Person.Builder template) {",
        "    // Upcast to access private fields; otherwise, oddly, we get an access violation.",
        "    Person_Builder base = template;",
        "    addAllName(base.name);",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /** Resets the state of this builder. */",
        "  public Person.Builder clear() {",
        "    clearName();",
        "    return (Person.Builder) this;",
        "  }",
        "",
        "  /** Returns a newly-created {@link Person} based on the contents of the "
            + "{@code Builder}. */",
        "  public Person build() {",
        "    return new Person_Builder.Value(this);",
        "  }",
        "",
        "  /**",
        "   * Returns a newly-created partial {@link Person} for use in unit tests. "
            + "State checking will not",
        "   * be performed.",
        "   *",
        "   * <p>Partials should only ever be used in tests. "
            + "They permit writing robust test cases that won't",
        "   * fail if this type gains more application-level constraints "
            + "(e.g. new required fields) in",
        "   * future. If you require partially complete values in production code, "
            + "consider using a Builder.",
        "   */",
        "  @VisibleForTesting()",
        "  public Person buildPartial() {",
        "    return new Person_Builder.Partial(this);",
        "  }",
        "",
        "  private static final class Value extends Person {",
        "    private final Set<String> name;",
        "",
        "    private Value(Person_Builder builder) {",
        "      this.name = ImmutableSet.copyOf(builder.name);",
        "    }",
        "",
        "    @Override",
        "    public Set<String> name() {",
        "      return name;",
        "    }",
        "",
        "    @Override",
        "    public boolean equals(Object obj) {",
        "      if (!(obj instanceof Person_Builder.Value)) {",
        "        return false;",
        "      }",
        "      Person_Builder.Value other = (Person_Builder.Value) obj;",
        "      return Objects.equals(name, other.name);",
        "    }",
        "",
        "    @Override",
        "    public int hashCode() {",
        "      return Objects.hash(name);",
        "    }",
        "",
        "    @Override",
        "    public String toString() {",
        "      return \"Person{name=\" + name + \"}\";",
        "    }",
        "  }",
        "",
        "  private static final class Partial extends Person {",
        "    private final Set<String> name;",
        "",
        "    Partial(Person_Builder builder) {",
        "      this.name = ImmutableSet.copyOf(builder.name);",
        "    }",
        "",
        "    @Override",
        "    public Set<String> name() {",
        "      return name;",
        "    }",
        "",
        "    @Override",
        "    public boolean equals(Object obj) {",
        "      if (!(obj instanceof Person_Builder.Partial)) {",
        "        return false;",
        "      }",
        "      Person_Builder.Partial other = (Person_Builder.Partial) obj;",
        "      return Objects.equals(name, other.name);",
        "    }",
        "",
        "    @Override",
        "    public int hashCode() {",
        "      return Objects.hash(name);",
        "    }",
        "",
        "    @Override",
        "    public String toString() {",
        "      return \"partial Person{name=\" + name + \"}\";",
        "    }",
        "  }",
        "}\n"));
  }

  private static String generateSource(Metadata metadata, Feature<?>... features) {
    SourceBuilder sourceBuilder = SourceStringBuilder.simple(features);
    new CodeGenerator().writeBuilderSource(sourceBuilder, metadata);
    return CompilationUnitBuilder.formatSource(sourceBuilder.toString());
  }

  /**
   * Returns a {@link Metadata} instance for a FreeBuilder type with a single property, name, of
   * type {@code Set<String>}, with no override on the add method.
   */
  private static Metadata createMetadata(boolean bean) {
    GenericTypeElementImpl set = newTopLevelGenericType("java.util.Set");
    GenericTypeMirrorImpl setString = set.newMirror(STRING);
    QualifiedName person = QualifiedName.of("com.example", "Person");
    QualifiedName generatedBuilder = QualifiedName.of("com.example", "Person_Builder");
    Property name = new Property.Builder()
        .setAllCapsName("NAME")
        .setBoxedType(setString)
        .setCapitalizedName("Name")
        .setFullyCheckedCast(true)
        .setGetterName(bean ? "getName" : "name")
        .setName("name")
        .setType(setString)
        .setUsingBeanConvention(bean)
        .build();
    Metadata metadata = new Metadata.Builder()
        .setBuilder(person.nestedType("Builder").withParameters())
        .setExtensible(true)
        .setBuilderFactory(BuilderFactory.NO_ARGS_CONSTRUCTOR)
        .setBuilderSerializable(false)
        .setGeneratedBuilder(generatedBuilder.withParameters())
        .setInterfaceType(false)
        .setPartialType(generatedBuilder.nestedType("Partial").withParameters())
        .addProperties(name)
        .setPropertyEnum(generatedBuilder.nestedType("Property").withParameters())
        .setType(person.withParameters())
        .setValueType(generatedBuilder.nestedType("Value").withParameters())
        .build();
    return metadata.toBuilder()
        .clearProperties()
        .addProperties(name.toBuilder()
            .setCodeGenerator(new SetProperty(
                metadata,
                name,
                STRING,
                Optional.<TypeMirror>absent(),
                consumer(wildcardSuper(setString)),
                false,
                false,
                false))
            .build())
        .build();
  }

}
