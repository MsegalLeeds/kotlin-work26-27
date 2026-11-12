# Creates signing and encryption keys for session protection

import secrets

with open("session_keys.txt", "wt") as outfile:
    encrypt_key = secrets.token_hex(16)
    sign_key = secrets.token_hex(16)
    outfile.write(encrypt_key + "\n")
    outfile.write(sign_key + "\n")
