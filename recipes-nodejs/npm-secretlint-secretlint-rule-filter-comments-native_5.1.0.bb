SUMMARY = "NPM: @secretlint/secretlint-rule-filter-comments"
DESCRIPTION = "secretlint-disable comment directive."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-filter-comments/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feaa9e77067014c95af709fcb652c2ca"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-filter-comments/-/secretlint-rule-filter-comments-5.1.0.tgz"
SRC_URI[md5sum] = "4dec3ffad983d4fa54dee7897f427418"
SRC_URI[sha256sum] = "e0a6f5f46e9f133fbbd1ec065c8e574d3a36dcf9af198bd361568ed6f4e8f82e"

NPM_PKGNAME = "@secretlint/secretlint-rule-filter-comments"

inherit npmhelper
inherit native
