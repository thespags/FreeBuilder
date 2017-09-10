// Autogenerated code. Do not modify.
package org.inferred.freebuilder.processor;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.util.EnumSet;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Generated;
import org.inferred.freebuilder.processor.util.Excerpt;
import org.inferred.freebuilder.processor.util.Type;
import org.inferred.freebuilder.processor.util.TypeClass;

/**
 * Auto-generated superclass of {@link BuildableType.Builder}, derived from the API of {@link
 * BuildableType}.
 */
@Generated("org.inferred.freebuilder.processor.Processor")
abstract class BuildableType_Builder {

  /** Creates a new builder using {@code value} as a template. */
  public static BuildableType.Builder from(BuildableType value) {
    return new BuildableType.Builder().mergeFrom(value);
  }

  private enum Property {
    TYPE("type"),
    BUILDER_TYPE("builderType"),
    TYPE_CLASS("typeClass"),
    TYPE_CLASS_BUILDER("typeClassBuilder"),
    MERGE_BUILDER("mergeBuilder"),
    PARTIAL_TO_BUILDER("partialToBuilder"),
    BUILDER_FACTORY("builderFactory"),
    SUPPRESS_UNCHECKED("suppressUnchecked"),
    ;

    private final String name;

    private Property(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return name;
    }
  }

  private Type type;
  private Type builderType;
  private TypeClass typeClass;
  private Type typeClassBuilder;
  private BuildableType.MergeBuilderMethod mergeBuilder;
  private BuildableType.PartialToBuilderMethod partialToBuilder;
  private BuilderFactory builderFactory;
  private Excerpt suppressUnchecked;
  private final EnumSet<Property> _unsetProperties = EnumSet.allOf(Property.class);

  /**
   * Sets the value to be returned by {@link BuildableType#type()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code type} is null
   */
  public BuildableType.Builder type(Type type) {
    this.type = Objects.requireNonNull(type);
    _unsetProperties.remove(Property.TYPE);
    return (BuildableType.Builder) this;
  }

  /**
   * Replaces the value to be returned by {@link BuildableType#type()} by applying {@code mapper} to
   * it and using the result.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mapper} is null or returns null
   * @throws IllegalStateException if the field has not been set
   */
  public BuildableType.Builder mapType(UnaryOperator<Type> mapper) {
    Objects.requireNonNull(mapper);
    return type(mapper.apply(type()));
  }

  /**
   * Returns the value that will be returned by {@link BuildableType#type()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public Type type() {
    Preconditions.checkState(!_unsetProperties.contains(Property.TYPE), "type not set");
    return type;
  }

  /**
   * Sets the value to be returned by {@link BuildableType#builderType()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code builderType} is null
   */
  public BuildableType.Builder builderType(Type builderType) {
    this.builderType = Objects.requireNonNull(builderType);
    _unsetProperties.remove(Property.BUILDER_TYPE);
    return (BuildableType.Builder) this;
  }

  /**
   * Replaces the value to be returned by {@link BuildableType#builderType()} by applying {@code
   * mapper} to it and using the result.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mapper} is null or returns null
   * @throws IllegalStateException if the field has not been set
   */
  public BuildableType.Builder mapBuilderType(UnaryOperator<Type> mapper) {
    Objects.requireNonNull(mapper);
    return builderType(mapper.apply(builderType()));
  }

  /**
   * Returns the value that will be returned by {@link BuildableType#builderType()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public Type builderType() {
    Preconditions.checkState(
        !_unsetProperties.contains(Property.BUILDER_TYPE), "builderType not set");
    return builderType;
  }

  /**
   * Sets the value to be returned by {@link BuildableType#typeClass()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code typeClass} is null
   */
  public BuildableType.Builder typeClass(TypeClass typeClass) {
    this.typeClass = Objects.requireNonNull(typeClass);
    _unsetProperties.remove(Property.TYPE_CLASS);
    return (BuildableType.Builder) this;
  }

  /**
   * Replaces the value to be returned by {@link BuildableType#typeClass()} by applying {@code
   * mapper} to it and using the result.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mapper} is null or returns null
   * @throws IllegalStateException if the field has not been set
   */
  public BuildableType.Builder mapTypeClass(UnaryOperator<TypeClass> mapper) {
    Objects.requireNonNull(mapper);
    return typeClass(mapper.apply(typeClass()));
  }

  /**
   * Returns the value that will be returned by {@link BuildableType#typeClass()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public TypeClass typeClass() {
    Preconditions.checkState(!_unsetProperties.contains(Property.TYPE_CLASS), "typeClass not set");
    return typeClass;
  }

  /**
   * Sets the value to be returned by {@link BuildableType#typeClassBuilder()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code typeClassBuilder} is null
   */
  public BuildableType.Builder typeClassBuilder(Type typeClassBuilder) {
    this.typeClassBuilder = Objects.requireNonNull(typeClassBuilder);
    _unsetProperties.remove(Property.TYPE_CLASS_BUILDER);
    return (BuildableType.Builder) this;
  }

  /**
   * Replaces the value to be returned by {@link BuildableType#typeClassBuilder()} by applying
   * {@code mapper} to it and using the result.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mapper} is null or returns null
   * @throws IllegalStateException if the field has not been set
   */
  public BuildableType.Builder mapTypeClassBuilder(UnaryOperator<Type> mapper) {
    Objects.requireNonNull(mapper);
    return typeClassBuilder(mapper.apply(typeClassBuilder()));
  }

  /**
   * Returns the value that will be returned by {@link BuildableType#typeClassBuilder()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public Type typeClassBuilder() {
    Preconditions.checkState(
        !_unsetProperties.contains(Property.TYPE_CLASS_BUILDER), "typeClassBuilder not set");
    return typeClassBuilder;
  }

  /**
   * Sets the value to be returned by {@link BuildableType#mergeBuilder()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mergeBuilder} is null
   */
  public BuildableType.Builder mergeBuilder(BuildableType.MergeBuilderMethod mergeBuilder) {
    this.mergeBuilder = Objects.requireNonNull(mergeBuilder);
    _unsetProperties.remove(Property.MERGE_BUILDER);
    return (BuildableType.Builder) this;
  }

  /**
   * Replaces the value to be returned by {@link BuildableType#mergeBuilder()} by applying {@code
   * mapper} to it and using the result.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mapper} is null or returns null
   * @throws IllegalStateException if the field has not been set
   */
  public BuildableType.Builder mapMergeBuilder(
      UnaryOperator<BuildableType.MergeBuilderMethod> mapper) {
    Objects.requireNonNull(mapper);
    return mergeBuilder(mapper.apply(mergeBuilder()));
  }

  /**
   * Returns the value that will be returned by {@link BuildableType#mergeBuilder()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public BuildableType.MergeBuilderMethod mergeBuilder() {
    Preconditions.checkState(
        !_unsetProperties.contains(Property.MERGE_BUILDER), "mergeBuilder not set");
    return mergeBuilder;
  }

  /**
   * Sets the value to be returned by {@link BuildableType#partialToBuilder()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code partialToBuilder} is null
   */
  public BuildableType.Builder partialToBuilder(
      BuildableType.PartialToBuilderMethod partialToBuilder) {
    this.partialToBuilder = Objects.requireNonNull(partialToBuilder);
    _unsetProperties.remove(Property.PARTIAL_TO_BUILDER);
    return (BuildableType.Builder) this;
  }

  /**
   * Replaces the value to be returned by {@link BuildableType#partialToBuilder()} by applying
   * {@code mapper} to it and using the result.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mapper} is null or returns null
   * @throws IllegalStateException if the field has not been set
   */
  public BuildableType.Builder mapPartialToBuilder(
      UnaryOperator<BuildableType.PartialToBuilderMethod> mapper) {
    Objects.requireNonNull(mapper);
    return partialToBuilder(mapper.apply(partialToBuilder()));
  }

  /**
   * Returns the value that will be returned by {@link BuildableType#partialToBuilder()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public BuildableType.PartialToBuilderMethod partialToBuilder() {
    Preconditions.checkState(
        !_unsetProperties.contains(Property.PARTIAL_TO_BUILDER), "partialToBuilder not set");
    return partialToBuilder;
  }

  /**
   * Sets the value to be returned by {@link BuildableType#builderFactory()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code builderFactory} is null
   */
  public BuildableType.Builder builderFactory(BuilderFactory builderFactory) {
    this.builderFactory = Objects.requireNonNull(builderFactory);
    _unsetProperties.remove(Property.BUILDER_FACTORY);
    return (BuildableType.Builder) this;
  }

  /**
   * Replaces the value to be returned by {@link BuildableType#builderFactory()} by applying {@code
   * mapper} to it and using the result.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mapper} is null or returns null
   * @throws IllegalStateException if the field has not been set
   */
  public BuildableType.Builder mapBuilderFactory(UnaryOperator<BuilderFactory> mapper) {
    Objects.requireNonNull(mapper);
    return builderFactory(mapper.apply(builderFactory()));
  }

  /**
   * Returns the value that will be returned by {@link BuildableType#builderFactory()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public BuilderFactory builderFactory() {
    Preconditions.checkState(
        !_unsetProperties.contains(Property.BUILDER_FACTORY), "builderFactory not set");
    return builderFactory;
  }

  /**
   * Sets the value to be returned by {@link BuildableType#suppressUnchecked()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code suppressUnchecked} is null
   */
  public BuildableType.Builder suppressUnchecked(Excerpt suppressUnchecked) {
    this.suppressUnchecked = Objects.requireNonNull(suppressUnchecked);
    _unsetProperties.remove(Property.SUPPRESS_UNCHECKED);
    return (BuildableType.Builder) this;
  }

  /**
   * Replaces the value to be returned by {@link BuildableType#suppressUnchecked()} by applying
   * {@code mapper} to it and using the result.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mapper} is null or returns null
   * @throws IllegalStateException if the field has not been set
   */
  public BuildableType.Builder mapSuppressUnchecked(UnaryOperator<Excerpt> mapper) {
    Objects.requireNonNull(mapper);
    return suppressUnchecked(mapper.apply(suppressUnchecked()));
  }

  /**
   * Returns the value that will be returned by {@link BuildableType#suppressUnchecked()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public Excerpt suppressUnchecked() {
    Preconditions.checkState(
        !_unsetProperties.contains(Property.SUPPRESS_UNCHECKED), "suppressUnchecked not set");
    return suppressUnchecked;
  }

  /** Sets all property values using the given {@code BuildableType} as a template. */
  public BuildableType.Builder mergeFrom(BuildableType value) {
    BuildableType_Builder _defaults = new BuildableType.Builder();
    if (_defaults._unsetProperties.contains(Property.TYPE)
        || !Objects.equals(value.type(), _defaults.type())) {
      type(value.type());
    }
    if (_defaults._unsetProperties.contains(Property.BUILDER_TYPE)
        || !Objects.equals(value.builderType(), _defaults.builderType())) {
      builderType(value.builderType());
    }
    if (_defaults._unsetProperties.contains(Property.TYPE_CLASS)
        || !Objects.equals(value.typeClass(), _defaults.typeClass())) {
      typeClass(value.typeClass());
    }
    if (_defaults._unsetProperties.contains(Property.TYPE_CLASS_BUILDER)
        || !Objects.equals(value.typeClassBuilder(), _defaults.typeClassBuilder())) {
      typeClassBuilder(value.typeClassBuilder());
    }
    if (_defaults._unsetProperties.contains(Property.MERGE_BUILDER)
        || !Objects.equals(value.mergeBuilder(), _defaults.mergeBuilder())) {
      mergeBuilder(value.mergeBuilder());
    }
    if (_defaults._unsetProperties.contains(Property.PARTIAL_TO_BUILDER)
        || !Objects.equals(value.partialToBuilder(), _defaults.partialToBuilder())) {
      partialToBuilder(value.partialToBuilder());
    }
    if (_defaults._unsetProperties.contains(Property.BUILDER_FACTORY)
        || !Objects.equals(value.builderFactory(), _defaults.builderFactory())) {
      builderFactory(value.builderFactory());
    }
    if (_defaults._unsetProperties.contains(Property.SUPPRESS_UNCHECKED)
        || !Objects.equals(value.suppressUnchecked(), _defaults.suppressUnchecked())) {
      suppressUnchecked(value.suppressUnchecked());
    }
    return (BuildableType.Builder) this;
  }

  /**
   * Copies values from the given {@code Builder}. Does not affect any properties not set on the
   * input.
   */
  public BuildableType.Builder mergeFrom(BuildableType.Builder template) {
    // Upcast to access private fields; otherwise, oddly, we get an access violation.
    BuildableType_Builder base = template;
    BuildableType_Builder _defaults = new BuildableType.Builder();
    if (!base._unsetProperties.contains(Property.TYPE)
        && (_defaults._unsetProperties.contains(Property.TYPE)
            || !Objects.equals(template.type(), _defaults.type()))) {
      type(template.type());
    }
    if (!base._unsetProperties.contains(Property.BUILDER_TYPE)
        && (_defaults._unsetProperties.contains(Property.BUILDER_TYPE)
            || !Objects.equals(template.builderType(), _defaults.builderType()))) {
      builderType(template.builderType());
    }
    if (!base._unsetProperties.contains(Property.TYPE_CLASS)
        && (_defaults._unsetProperties.contains(Property.TYPE_CLASS)
            || !Objects.equals(template.typeClass(), _defaults.typeClass()))) {
      typeClass(template.typeClass());
    }
    if (!base._unsetProperties.contains(Property.TYPE_CLASS_BUILDER)
        && (_defaults._unsetProperties.contains(Property.TYPE_CLASS_BUILDER)
            || !Objects.equals(template.typeClassBuilder(), _defaults.typeClassBuilder()))) {
      typeClassBuilder(template.typeClassBuilder());
    }
    if (!base._unsetProperties.contains(Property.MERGE_BUILDER)
        && (_defaults._unsetProperties.contains(Property.MERGE_BUILDER)
            || !Objects.equals(template.mergeBuilder(), _defaults.mergeBuilder()))) {
      mergeBuilder(template.mergeBuilder());
    }
    if (!base._unsetProperties.contains(Property.PARTIAL_TO_BUILDER)
        && (_defaults._unsetProperties.contains(Property.PARTIAL_TO_BUILDER)
            || !Objects.equals(template.partialToBuilder(), _defaults.partialToBuilder()))) {
      partialToBuilder(template.partialToBuilder());
    }
    if (!base._unsetProperties.contains(Property.BUILDER_FACTORY)
        && (_defaults._unsetProperties.contains(Property.BUILDER_FACTORY)
            || !Objects.equals(template.builderFactory(), _defaults.builderFactory()))) {
      builderFactory(template.builderFactory());
    }
    if (!base._unsetProperties.contains(Property.SUPPRESS_UNCHECKED)
        && (_defaults._unsetProperties.contains(Property.SUPPRESS_UNCHECKED)
            || !Objects.equals(template.suppressUnchecked(), _defaults.suppressUnchecked()))) {
      suppressUnchecked(template.suppressUnchecked());
    }
    return (BuildableType.Builder) this;
  }

  /** Resets the state of this builder. */
  public BuildableType.Builder clear() {
    BuildableType_Builder _defaults = new BuildableType.Builder();
    type = _defaults.type;
    builderType = _defaults.builderType;
    typeClass = _defaults.typeClass;
    typeClassBuilder = _defaults.typeClassBuilder;
    mergeBuilder = _defaults.mergeBuilder;
    partialToBuilder = _defaults.partialToBuilder;
    builderFactory = _defaults.builderFactory;
    suppressUnchecked = _defaults.suppressUnchecked;
    _unsetProperties.clear();
    _unsetProperties.addAll(_defaults._unsetProperties);
    return (BuildableType.Builder) this;
  }

  /**
   * Returns a newly-created {@link BuildableType} based on the contents of the {@code Builder}.
   *
   * @throws IllegalStateException if any field has not been set
   */
  public BuildableType build() {
    Preconditions.checkState(_unsetProperties.isEmpty(), "Not set: %s", _unsetProperties);
    return new Value(this);
  }

  /**
   * Returns a newly-created partial {@link BuildableType} for use in unit tests. State checking
   * will not be performed. Unset properties will throw an {@link UnsupportedOperationException}
   * when accessed via the partial object.
   *
   * <p>Partials should only ever be used in tests. They permit writing robust test cases that won't
   * fail if this type gains more application-level constraints (e.g. new required fields) in
   * future. If you require partially complete values in production code, consider using a Builder.
   */
  @VisibleForTesting()
  public BuildableType buildPartial() {
    return new Partial(this);
  }

  private static final class Value extends BuildableType {
    private final Type type;
    private final Type builderType;
    private final TypeClass typeClass;
    private final Type typeClassBuilder;
    private final BuildableType.MergeBuilderMethod mergeBuilder;
    private final BuildableType.PartialToBuilderMethod partialToBuilder;
    private final BuilderFactory builderFactory;
    private final Excerpt suppressUnchecked;

    private Value(BuildableType_Builder builder) {
      this.type = builder.type;
      this.builderType = builder.builderType;
      this.typeClass = builder.typeClass;
      this.typeClassBuilder = builder.typeClassBuilder;
      this.mergeBuilder = builder.mergeBuilder;
      this.partialToBuilder = builder.partialToBuilder;
      this.builderFactory = builder.builderFactory;
      this.suppressUnchecked = builder.suppressUnchecked;
    }

    @Override
    public Type type() {
      return type;
    }

    @Override
    public Type builderType() {
      return builderType;
    }

    @Override
    public TypeClass typeClass() {
      return typeClass;
    }

    @Override
    public Type typeClassBuilder() {
      return typeClassBuilder;
    }

    @Override
    public BuildableType.MergeBuilderMethod mergeBuilder() {
      return mergeBuilder;
    }

    @Override
    public BuildableType.PartialToBuilderMethod partialToBuilder() {
      return partialToBuilder;
    }

    @Override
    public BuilderFactory builderFactory() {
      return builderFactory;
    }

    @Override
    public Excerpt suppressUnchecked() {
      return suppressUnchecked;
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof Value)) {
        return false;
      }
      Value other = (Value) obj;
      return Objects.equals(type, other.type)
          && Objects.equals(builderType, other.builderType)
          && Objects.equals(typeClass, other.typeClass)
          && Objects.equals(typeClassBuilder, other.typeClassBuilder)
          && Objects.equals(mergeBuilder, other.mergeBuilder)
          && Objects.equals(partialToBuilder, other.partialToBuilder)
          && Objects.equals(builderFactory, other.builderFactory)
          && Objects.equals(suppressUnchecked, other.suppressUnchecked);
    }

    @Override
    public int hashCode() {
      return Objects.hash(
          type,
          builderType,
          typeClass,
          typeClassBuilder,
          mergeBuilder,
          partialToBuilder,
          builderFactory,
          suppressUnchecked);
    }

    @Override
    public String toString() {
      return "BuildableType{type="
          + type
          + ", builderType="
          + builderType
          + ", typeClass="
          + typeClass
          + ", typeClassBuilder="
          + typeClassBuilder
          + ", mergeBuilder="
          + mergeBuilder
          + ", partialToBuilder="
          + partialToBuilder
          + ", builderFactory="
          + builderFactory
          + ", suppressUnchecked="
          + suppressUnchecked
          + "}";
    }
  }

  private static final class Partial extends BuildableType {
    private final Type type;
    private final Type builderType;
    private final TypeClass typeClass;
    private final Type typeClassBuilder;
    private final BuildableType.MergeBuilderMethod mergeBuilder;
    private final BuildableType.PartialToBuilderMethod partialToBuilder;
    private final BuilderFactory builderFactory;
    private final Excerpt suppressUnchecked;
    private final EnumSet<Property> _unsetProperties;

    Partial(BuildableType_Builder builder) {
      this.type = builder.type;
      this.builderType = builder.builderType;
      this.typeClass = builder.typeClass;
      this.typeClassBuilder = builder.typeClassBuilder;
      this.mergeBuilder = builder.mergeBuilder;
      this.partialToBuilder = builder.partialToBuilder;
      this.builderFactory = builder.builderFactory;
      this.suppressUnchecked = builder.suppressUnchecked;
      this._unsetProperties = builder._unsetProperties.clone();
    }

    @Override
    public Type type() {
      if (_unsetProperties.contains(Property.TYPE)) {
        throw new UnsupportedOperationException("type not set");
      }
      return type;
    }

    @Override
    public Type builderType() {
      if (_unsetProperties.contains(Property.BUILDER_TYPE)) {
        throw new UnsupportedOperationException("builderType not set");
      }
      return builderType;
    }

    @Override
    public TypeClass typeClass() {
      if (_unsetProperties.contains(Property.TYPE_CLASS)) {
        throw new UnsupportedOperationException("typeClass not set");
      }
      return typeClass;
    }

    @Override
    public Type typeClassBuilder() {
      if (_unsetProperties.contains(Property.TYPE_CLASS_BUILDER)) {
        throw new UnsupportedOperationException("typeClassBuilder not set");
      }
      return typeClassBuilder;
    }

    @Override
    public BuildableType.MergeBuilderMethod mergeBuilder() {
      if (_unsetProperties.contains(Property.MERGE_BUILDER)) {
        throw new UnsupportedOperationException("mergeBuilder not set");
      }
      return mergeBuilder;
    }

    @Override
    public BuildableType.PartialToBuilderMethod partialToBuilder() {
      if (_unsetProperties.contains(Property.PARTIAL_TO_BUILDER)) {
        throw new UnsupportedOperationException("partialToBuilder not set");
      }
      return partialToBuilder;
    }

    @Override
    public BuilderFactory builderFactory() {
      if (_unsetProperties.contains(Property.BUILDER_FACTORY)) {
        throw new UnsupportedOperationException("builderFactory not set");
      }
      return builderFactory;
    }

    @Override
    public Excerpt suppressUnchecked() {
      if (_unsetProperties.contains(Property.SUPPRESS_UNCHECKED)) {
        throw new UnsupportedOperationException("suppressUnchecked not set");
      }
      return suppressUnchecked;
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof Partial)) {
        return false;
      }
      Partial other = (Partial) obj;
      return Objects.equals(type, other.type)
          && Objects.equals(builderType, other.builderType)
          && Objects.equals(typeClass, other.typeClass)
          && Objects.equals(typeClassBuilder, other.typeClassBuilder)
          && Objects.equals(mergeBuilder, other.mergeBuilder)
          && Objects.equals(partialToBuilder, other.partialToBuilder)
          && Objects.equals(builderFactory, other.builderFactory)
          && Objects.equals(suppressUnchecked, other.suppressUnchecked)
          && Objects.equals(_unsetProperties, other._unsetProperties);
    }

    @Override
    public int hashCode() {
      return Objects.hash(
          type,
          builderType,
          typeClass,
          typeClassBuilder,
          mergeBuilder,
          partialToBuilder,
          builderFactory,
          suppressUnchecked,
          _unsetProperties);
    }

    @Override
    public String toString() {
      StringBuilder result = new StringBuilder("partial BuildableType{");
      String separator = "";
      if (!_unsetProperties.contains(Property.TYPE)) {
        result.append("type=").append(type);
        separator = ", ";
      }
      if (!_unsetProperties.contains(Property.BUILDER_TYPE)) {
        result.append(separator).append("builderType=").append(builderType);
        separator = ", ";
      }
      if (!_unsetProperties.contains(Property.TYPE_CLASS)) {
        result.append(separator).append("typeClass=").append(typeClass);
        separator = ", ";
      }
      if (!_unsetProperties.contains(Property.TYPE_CLASS_BUILDER)) {
        result.append(separator).append("typeClassBuilder=").append(typeClassBuilder);
        separator = ", ";
      }
      if (!_unsetProperties.contains(Property.MERGE_BUILDER)) {
        result.append(separator).append("mergeBuilder=").append(mergeBuilder);
        separator = ", ";
      }
      if (!_unsetProperties.contains(Property.PARTIAL_TO_BUILDER)) {
        result.append(separator).append("partialToBuilder=").append(partialToBuilder);
        separator = ", ";
      }
      if (!_unsetProperties.contains(Property.BUILDER_FACTORY)) {
        result.append(separator).append("builderFactory=").append(builderFactory);
        separator = ", ";
      }
      if (!_unsetProperties.contains(Property.SUPPRESS_UNCHECKED)) {
        result.append(separator).append("suppressUnchecked=").append(suppressUnchecked);
      }
      return result.append("}").toString();
    }
  }
}
