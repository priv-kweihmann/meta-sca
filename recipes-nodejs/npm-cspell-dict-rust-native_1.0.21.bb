SUMMARY = "NPM: cspell-dict-rust"
DESCRIPTION = "Rust dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/rust#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3cad1179829e6879699c59c2800d38b"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-rust/-/cspell-dict-rust-1.0.21.tgz"
SRC_URI[md5sum] = "68e7b98a2c5c93ab6167d4ec5314ac3c"
SRC_URI[sha256sum] = "ed4410c9a4b0c612a15d0cc51bd47052daa220e63d5be21c21b9c16b81ec2f2b"

NPM_PKGNAME = "cspell-dict-rust"

inherit npmhelper
inherit native
