SUMMARY = "NPM: textlint-rule-no-todo"
DESCRIPTION = "textlint rule: warn TODO text."
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-no-todo"

DEPENDS = "npm-textlint-rule-helper-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

SRC_URI = "https://registry.npmjs.org/textlint-rule-no-todo/-/textlint-rule-no-todo-2.0.1.tgz"
SRC_URI[md5sum] = "a641b85d4028f046e10725feacfe6a4e"
SRC_URI[sha256sum] = "f56426e82ca62fc7319fe693be1a819bf5af36420811263660fdb6a9c52b8a52"

NPM_PKGNAME = "textlint-rule-no-todo"

inherit npmhelper
inherit native
