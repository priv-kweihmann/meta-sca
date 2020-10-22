SUMMARY = "NPM: cspell-dict-rust"
DESCRIPTION = "Rust dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/rust#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3f976511d263c976a8466a2a4bd5fa2"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-rust/-/cspell-dict-rust-1.0.14.tgz"
SRC_URI[md5sum] = "49e7619da6a25fb3044a54cb20764b7f"
SRC_URI[sha256sum] = "f024da720953cc4db3720c9b40b2f29b37244a59ae32f20cd0733f9f4d0824d5"

NPM_PKGNAME = "cspell-dict-rust"

inherit npmhelper
inherit native
