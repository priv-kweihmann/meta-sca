SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.7.tgz"
SRC_URI[md5sum] = "56f517a3089e968ed82485cc47c54717"
SRC_URI[sha256sum] = "83f8d1174e96d41b3de32baed831119a50dab4c9427dcff615a20e246fef77fa"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
