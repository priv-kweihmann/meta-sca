SUMMARY = "NPM: textlint-rule-abbr-within-parentheses"
DESCRIPTION = "textlint rule check that abbreviations within parentheses."
HOMEPAGE = "https://github.com/azu/textlint-rule-abbr-within-parentheses"

DEPENDS = "npm-match-index-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

SRC_URI = "https://registry.npmjs.org/textlint-rule-abbr-within-parentheses/-/textlint-rule-abbr-within-parentheses-1.0.2.tgz"
SRC_URI[md5sum] = "2446c0204df03305b9c766145b0dab80"
SRC_URI[sha256sum] = "206435a67e88c2d10018a88d479538eecb9e8f2497f66d6e25f18bd5a6342e06"

NPM_PKGNAME = "textlint-rule-abbr-within-parentheses"

inherit npmhelper
inherit native
