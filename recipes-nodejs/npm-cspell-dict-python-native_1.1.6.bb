SUMMARY = "NPM: cspell-dict-python"
DESCRIPTION = "Python dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/python#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-python/-/cspell-dict-python-1.1.6.tgz"
SRC_URI[md5sum] = "8ac233752d3c47443e44f1db5a2d343a"
SRC_URI[sha256sum] = "f2ec127d2dc0ab52144fa258d36d857b01d0b5617267eb3d1253d33522371a78"

NPM_PKGNAME = "cspell-dict-python"

inherit npmhelper
inherit native
