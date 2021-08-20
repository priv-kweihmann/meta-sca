SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.20.tgz"
SRC_URI[md5sum] = "61515ce010847e8c13fa62ecd3bf5251"
SRC_URI[sha256sum] = "abeb3cf7648450f88f05c91d02c9b3d51ba860a8902052feb046191e28d27c82"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
