SUMMARY = "NPM: nlcst-normalize"
DESCRIPTION = "nlcst utility to normalize a word for easier comparison"
HOMEPAGE = "https://github.com/syntax-tree/nlcst-normalize#readme"

DEPENDS = "npm-nlcst-to-string-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/nlcst-normalize/-/nlcst-normalize-2.1.4.tgz"
SRC_URI[md5sum] = "1ef7a584f88292bc3056da69bb5442d1"
SRC_URI[sha256sum] = "ac0330352b46d6d048f9fa6dbca8d8be4b17fafaa577c92c0558a7f3396bbe8b"

NPM_PKGNAME = "nlcst-normalize"

inherit npmhelper
inherit native
