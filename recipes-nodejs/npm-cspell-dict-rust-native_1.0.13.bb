SUMMARY = "NPM: cspell-dict-rust"
DESCRIPTION = "Rust dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/rust#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3f976511d263c976a8466a2a4bd5fa2"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-rust/-/cspell-dict-rust-1.0.13.tgz"
SRC_URI[md5sum] = "335a10c600e48c5264b7a7c61e48678c"
SRC_URI[sha256sum] = "8e666138e0035316a8f79f99a8bdc4a8580c8dc9f76102724e69c9f039e873f9"

NPM_PKGNAME = "cspell-dict-rust"

inherit npmhelper
inherit native
