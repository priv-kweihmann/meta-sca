SUMMARY = "NPM: @cspell/dict-rust"
DESCRIPTION = "Rust dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/rust#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3cad1179829e6879699c59c2800d38b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-rust/-/dict-rust-2.0.0.tgz"
SRC_URI[md5sum] = "9ead88903ffabbfcc10961ac68eb0462"
SRC_URI[sha256sum] = "fc4e9822754880ca06d35dc6f62a9660f007aa94091777bb7becc069ffa804a8"

NPM_PKGNAME = "@cspell/dict-rust"

inherit npmhelper
inherit native
