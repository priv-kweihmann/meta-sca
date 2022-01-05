SUMMARY = "NPM: @cspell/dict-html"
DESCRIPTION = "HTML dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/html#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-html/-/dict-html-2.0.3.tgz"
SRC_URI[md5sum] = "61a7da88b4a4464303359a9252686a44"
SRC_URI[sha256sum] = "4a4ea8c9045a9ce2120c21cfe23b2c80b01a8dfd7948e4bcb444434d1e01de1d"

NPM_PKGNAME = "@cspell/dict-html"

inherit npmhelper
inherit native
