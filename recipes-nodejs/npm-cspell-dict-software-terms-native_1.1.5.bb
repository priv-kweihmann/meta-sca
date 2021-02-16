SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.5.tgz"
SRC_URI[md5sum] = "c4208a144028cbda5079bdfa19db0f02"
SRC_URI[sha256sum] = "ea456015b810666c1795bc91d70961b455cc3ff4560db84c80ea4c51ca8409b4"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
