SUMMARY = "NPM: @cspell/dict-npm"
DESCRIPTION = "Dictionary of common NPM packages for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/npm#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-npm/-/dict-npm-2.0.1.tgz"
SRC_URI[md5sum] = "fd483a4d9c3e329629edc578770ec3c1"
SRC_URI[sha256sum] = "27686f21a0b7fcdb0b100a5b8a1e0477ab5404af1ff658f1baaa36630b63700d"

NPM_PKGNAME = "@cspell/dict-npm"

inherit npmhelper
inherit native
