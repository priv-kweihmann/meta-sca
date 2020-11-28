SUMMARY = "NPM: cspell-dict-npm"
DESCRIPTION = "Dictionary of common NPM packages for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/npm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-npm/-/cspell-dict-npm-1.0.9.tgz"
SRC_URI[md5sum] = "587699e33a6b7177b1e2de255c4ca169"
SRC_URI[sha256sum] = "c051654794c8507c8f7c96e00f5ed5bf409075c5e7d220dc598fb371fc99b7f8"

NPM_PKGNAME = "cspell-dict-npm"

inherit npmhelper
inherit native
