SUMMARY = "NPM: nlcst-normalize"
DESCRIPTION = "nlcst utility to normalize a word for easier comparison"
HOMEPAGE = "https://github.com/syntax-tree/nlcst-normalize#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-nlcst-to-string-native \
           npm-types-nlcst-native"

SRC_URI = "https://registry.npmjs.org/nlcst-normalize/-/nlcst-normalize-3.1.0.tgz"
SRC_URI[md5sum] = "8df043b02462b41a2af9f7e20a1c2d88"
SRC_URI[sha256sum] = "d9b873c974c81a9fc8e3e72ef3be93aac2bf90c6bf9e45c4f19973bf2f41b24e"

NPM_PKGNAME = "nlcst-normalize"

inherit npmhelper
inherit native
