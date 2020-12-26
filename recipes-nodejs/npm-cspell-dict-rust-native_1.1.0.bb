SUMMARY = "NPM: cspell-dict-rust"
DESCRIPTION = "Rust dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/rust#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3cad1179829e6879699c59c2800d38b"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-rust/-/cspell-dict-rust-1.1.0.tgz"
SRC_URI[md5sum] = "db2fe224860ed3e0678ced136fdcd001"
SRC_URI[sha256sum] = "6a5f78d583ea632e175a0ab4dca4f647f424165802074acfb9d8ea10b33a040d"

NPM_PKGNAME = "cspell-dict-rust"

inherit npmhelper
inherit native
