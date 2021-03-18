SUMMARY = "NPM: is-unicode-supported"
DESCRIPTION = "Detect whether the terminal supports Unicode"
HOMEPAGE = "https://github.com/sindresorhus/is-unicode-supported#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-unicode-supported/-/is-unicode-supported-0.1.0.tgz"
SRC_URI[md5sum] = "5fa12001af4a22129166b9c7262d5fb2"
SRC_URI[sha256sum] = "7c15fefe222c2ec445ebf1d1b7c9ceb6e9513ce6195b002b7b8c3280ca9ecabe"

NPM_PKGNAME = "is-unicode-supported"

inherit npmhelper
inherit native
