SUMMARY = "NPM: @textlint-rule/textlint-rule-no-invalid-control-character"
DESCRIPTION = "textlint rule check unnessary control character in the document."
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-no-invalid-control-character"

DEPENDS = "npm-execall-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

SRC_URI = "https://registry.npmjs.org/@textlint-rule/textlint-rule-no-invalid-control-character/-/textlint-rule-no-invalid-control-character-1.2.0.tgz"
SRC_URI[md5sum] = "234bc779539a4b892786a39b5e0560fc"
SRC_URI[sha256sum] = "e97179e1dc064679673a2c64c92aa5071838a534eda5ec413bb2245bd0de832b"

NPM_PKGNAME = "@textlint-rule/textlint-rule-no-invalid-control-character"

inherit npmhelper
inherit native
