SUMMARY = "NPM: cspell-dict-rust"
DESCRIPTION = "Rust dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/rust#readme"

DEPENDS = "npm-configstore-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3f976511d263c976a8466a2a4bd5fa2"

SRC_URI = "https://registry.npmjs.org/cspell-dict-rust/-/cspell-dict-rust-1.0.12.tgz"
SRC_URI[md5sum] = "b1aef14ba0a00871ac3f72fe4b888141"
SRC_URI[sha256sum] = "5953bae8f7bf2c5d76b32d6be92898f8dcfcfb0e283ffba0a286982d95787ef0"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cspell-dict-rust"

inherit npmhelper
inherit native
