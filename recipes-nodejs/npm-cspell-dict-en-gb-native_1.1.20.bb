SUMMARY = "NPM: cspell-dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/en_GB#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en-gb/-/cspell-dict-en-gb-1.1.20.tgz"
SRC_URI[md5sum] = "ef2cb50b4ac1f11c12e18cfed6ae4026"
SRC_URI[sha256sum] = "4396cdf064ce8c4b8e1a66f994837af789babb46734fe5776b92fc828fb3c8c5"

NPM_PKGNAME = "cspell-dict-en-gb"

inherit npmhelper
inherit native
