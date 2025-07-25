def caesar_encrypt(text, key):
    encrypted = ""
    for char in text:
        if char.isalpha():
            offset = 65 if char.isupper() else 97
            encrypted += chr((ord(char) - offset + key) % 26 + offset)
        else:
            encrypted += char
    return encrypted

# Test with a sample text and key
plaintext = "abc XYZ!"
key = 2
print("Plaintext:", plaintext)
print("Encrypted:", caesar_encrypt(plaintext, key))
