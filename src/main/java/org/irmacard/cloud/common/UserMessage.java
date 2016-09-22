package org.irmacard.cloud.common;

public class UserMessage {
		private String username;
		private String sessionToken;
		private String ID;
		private boolean enrolled;
		private boolean enabled;

		public UserMessage() {};

		public UserMessage(String username, String sessionToken, String ID, boolean enrolled, boolean enabled) {
			this.username = username;
			this.sessionToken = sessionToken;
			this.ID = ID;
			this.enrolled = enrolled;
			this.setEnabled(enabled);
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getSessionToken() {
			return sessionToken;
		}

		public void setSessionToken(String sessionToken) {
			this.sessionToken = sessionToken;
		}

		public String getID() {
			return ID;
		}

		public void setID(String ID) {
			this.ID = ID;
		}

		public boolean isEnrolled() {
			return enrolled;
		}

		public void setEnrolled(boolean enrolled) {
			this.enrolled = enrolled;
		}

		public boolean isEnabled() {
			return enabled;
		}

		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}
}
