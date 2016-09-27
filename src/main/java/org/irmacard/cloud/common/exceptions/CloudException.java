package org.irmacard.cloud.common.exceptions;

/**
 * Exception occuring during usage of the API. Mainly a wrapper around an {@link ApiError}.
 */
public class CloudException extends RuntimeException {
	private static final long serialVersionUID = 5763289075477918475L;

	private CloudError error;

	public CloudException(CloudError error) {
		this.error = error;
	}

	public CloudException(CloudError error, String message) {
		super(message);
		this.error = error;
	}

	public CloudError getError() {
		return error;
	}
}
