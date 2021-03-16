SUMMARY = "NPM: cspell-dict-python"
DESCRIPTION = "Python dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/python#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-python/-/cspell-dict-python-1.1.4.tgz"
SRC_URI[md5sum] = "f265e7ccefdc91ef3057c25c7d99fb3c"
SRC_URI[sha256sum] = "207d42c97199cade39eb6575bab9803617f58526f5d84403ac6368d5f87a1a4d"

NPM_PKGNAME = "cspell-dict-python"

inherit npmhelper
inherit native
