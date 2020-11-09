SUMMARY = "NPM: cspell-dict-rust"
DESCRIPTION = "Rust dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/rust#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3f976511d263c976a8466a2a4bd5fa2"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-rust/-/cspell-dict-rust-1.0.18.tgz"
SRC_URI[md5sum] = "d0e2c42dda326bd8c08b675a815352e9"
SRC_URI[sha256sum] = "ba279ac5d49786c6d54c58a6724ec24d8c07740c983aa61a7f5e3f1c1469e9a8"

NPM_PKGNAME = "cspell-dict-rust"

inherit npmhelper
inherit native
