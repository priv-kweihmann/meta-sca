SUMMARY = "NPM: @secretlint/secretlint-rule-filter-comments"
DESCRIPTION = "secretlint-disable comment directive."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-filter-comments/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feaa9e77067014c95af709fcb652c2ca"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-filter-comments/-/secretlint-rule-filter-comments-5.0.1.tgz"
SRC_URI[md5sum] = "ed6de870644a0cc5884749f1cd4d9cfb"
SRC_URI[sha256sum] = "01513fbfa811672e440cc2b838190af23a9eb36a3ec6d575642aad4a9a9d494b"

NPM_PKGNAME = "@secretlint/secretlint-rule-filter-comments"

inherit npmhelper
inherit native
