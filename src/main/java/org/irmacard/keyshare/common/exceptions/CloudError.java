package org.irmacard.keyshare.common.exceptions;

/**
 * Errors that can occur in usage of the API, along with their HTTP status code
 * and human-readable descriptions. For use in {@link ApiErrorMessage} and {@link ApiException}.
 */
public enum CloudError {
	// IdP-specific errors
	// MALFORMED_ISSUER_REQUEST(400, "Malformed issuer request"),

	// SP-specific errors
	MALFORMED_VERIFIER_REQUEST(400, "Malformed verification request"),

	// SP, IdP, or token errors
	MALFORMED_INPUT(400, "Input could not be parsed"),

	// Token errors
	UNEXPECTED_REQUEST(403, "Unexpected request in this state"),
	UNKNOWN_PUBLIC_KEY(403, "Attributes were not valid against a known public key"),

	// User related exceptions
	USER_NOT_FOUND(404, "Cannot find user"),

	// Any other exception
	EXCEPTION(500, "Encountered unexpected problem");


	private int statusCode;
	private String description;

	CloudError(int statusCode, String description) {
		this.statusCode = statusCode;
		this.description = description;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getDescription() {
		return description;
	}
}
