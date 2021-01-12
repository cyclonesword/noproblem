package org.javando.http.problem

class MissingImplementationException : RuntimeException {
    constructor(message: String?) : super(message) {}
    constructor(message: String?, cause: Throwable?) : super(message, cause) {}
}

class MalformedImplementationException : RuntimeException {
    constructor(message: String?) : super(message) {}
    constructor(message: String?, cause: Throwable?) : super(message, cause) {}
}

class ProblemBuilderException(
    override val message: String?,
    override val cause: Throwable? = null
) : RuntimeException(message, cause)

class JsonProviderNotSetException @JvmOverloads constructor(
    override val message: String?,
    override val cause: Throwable? = null
) : RuntimeException(message, cause)