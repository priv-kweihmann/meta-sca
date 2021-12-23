SUMMARY = "NPM: cspell-dict-rust"
DESCRIPTION = "Rust dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/rust#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3cad1179829e6879699c59c2800d38b"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-rust/-/cspell-dict-rust-1.1.3.tgz"
SRC_URI[md5sum] = "882ccb97f5f8fb25d3ed035712de4d46"
SRC_URI[sha256sum] = "003b0e20138c328c1a90fa4b59ea97d854549ed9751e4c45ae9b43fb8b101b60"

NPM_PKGNAME = "cspell-dict-rust"

inherit npmhelper
inherit native
