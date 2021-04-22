SUMMARY = "NPM: nlcst-normalize"
DESCRIPTION = "nlcst utility to normalize a word for easier comparison"
HOMEPAGE = "https://github.com/syntax-tree/nlcst-normalize#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-nlcst-to-string-native \
           npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/nlcst-normalize/-/nlcst-normalize-3.0.0.tgz"
SRC_URI[md5sum] = "e55fab9aae4d317de83d592dc81e06ba"
SRC_URI[sha256sum] = "c268db28c129153c664582df9a0c399e2c9233fc60381174fd102a7fe509dce0"

NPM_PKGNAME = "nlcst-normalize"

inherit npmhelper
inherit native
