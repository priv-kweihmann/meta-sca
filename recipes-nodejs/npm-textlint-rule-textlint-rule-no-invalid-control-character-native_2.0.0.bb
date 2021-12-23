SUMMARY = "NPM: @textlint-rule/textlint-rule-no-invalid-control-character"
DESCRIPTION = "textlint rule check unnessary control character in the document."
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-no-invalid-control-character"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-execall-native"

SRC_URI = "https://registry.npmjs.org/@textlint-rule/textlint-rule-no-invalid-control-character/-/textlint-rule-no-invalid-control-character-2.0.0.tgz"
SRC_URI[md5sum] = "b540438c24d049cb2024dfa4fab1d4f9"
SRC_URI[sha256sum] = "39d30ef0de170d8ca5f29ed820c308675556bac062324c71f1d3d5e2c613c41f"

NPM_PKGNAME = "@textlint-rule/textlint-rule-no-invalid-control-character"

inherit npmhelper
inherit native
