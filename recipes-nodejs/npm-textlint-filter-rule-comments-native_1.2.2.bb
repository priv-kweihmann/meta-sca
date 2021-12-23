SUMMARY = "NPM: textlint-filter-rule-comments"
DESCRIPTION = "textlint rule that ignore texts using comments directive."
HOMEPAGE = "https://github.com/textlint/textlint-filter-rule-comments"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

SRC_URI = "https://registry.npmjs.org/textlint-filter-rule-comments/-/textlint-filter-rule-comments-1.2.2.tgz"
SRC_URI[md5sum] = "4aa0f2a0c0c724e9eae39fed31dc1b3c"
SRC_URI[sha256sum] = "810060f756e05c53c19598e1b4ce7ff75c8564bf39d5ab6694b22851091de41d"

NPM_PKGNAME = "textlint-filter-rule-comments"

inherit npmhelper
inherit native
