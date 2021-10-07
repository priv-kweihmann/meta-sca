SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.26.tgz"
SRC_URI[md5sum] = "d1ac1aa03ec1cae5410d0e09adf17f07"
SRC_URI[sha256sum] = "a4a477661c1d7d069aa52c8ce5843473d2bd9fd033d9dc9234b26683be791596"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
