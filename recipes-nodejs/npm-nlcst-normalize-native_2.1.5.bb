SUMMARY = "NPM: nlcst-normalize"
DESCRIPTION = "nlcst utility to normalize a word for easier comparison"
HOMEPAGE = "https://github.com/syntax-tree/nlcst-normalize#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-nlcst-to-string-native"

SRC_URI = "https://registry.npmjs.org/nlcst-normalize/-/nlcst-normalize-2.1.5.tgz"
SRC_URI[md5sum] = "f5cf67e0f20b76eb4cc05c1876869754"
SRC_URI[sha256sum] = "67b01b7eadd212109344865b2ce8db67357d0cb08e22001e278f709f2d14a353"

NPM_PKGNAME = "nlcst-normalize"

inherit npmhelper
inherit native
