SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.8.tgz"
SRC_URI[md5sum] = "de98589a476a8dd5a3ccf906381dbe34"
SRC_URI[sha256sum] = "5d5ab1991ea62e7e980a68e18df54722bd85e75b1eb6170141a8403f1a951a62"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
