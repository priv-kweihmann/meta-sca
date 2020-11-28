SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.0.22.tgz"
SRC_URI[md5sum] = "6ca62a84dfbfb415bbfcc4e5bedbd9a9"
SRC_URI[sha256sum] = "d80a418d29a3b332a4932f9b8cb2f50b9cd7b9680c48df5b2018c4b9c0f19a78"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
