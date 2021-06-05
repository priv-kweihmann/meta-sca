SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.13.tgz"
SRC_URI[md5sum] = "d3605dd88ded9da06d8c13152c146ab7"
SRC_URI[sha256sum] = "f0bb63eba7bdc5b6e2e075688e5a46fcd871e5b3efd207c9c3971edc5076b722"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
