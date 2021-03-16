SUMMARY = "NPM: cspell-dict-css"
DESCRIPTION = "CSS dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/css#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-css/-/cspell-dict-css-1.1.3.tgz"
SRC_URI[md5sum] = "8bf8f449d4e6b4019b9e96d13e5cb40e"
SRC_URI[sha256sum] = "02bd92b0146ae233dcddc160de3fc92a149d1fad073b19407d05efafe0cd2783"

NPM_PKGNAME = "cspell-dict-css"

inherit npmhelper
inherit native
