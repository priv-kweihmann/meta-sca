SUMMARY = "NPM: textlint-rule-no-empty-section"
DESCRIPTION = "textlint rule not allow to create empty section."
HOMEPAGE = "https://github.com/azu/textlint-rule-no-empty-section"

DEPENDS = "npm-select-section-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

SRC_URI = "https://registry.npmjs.org/textlint-rule-no-empty-section/-/textlint-rule-no-empty-section-1.1.0.tgz"
SRC_URI[md5sum] = "f196c94c6126d6c187871f80419858f4"
SRC_URI[sha256sum] = "e6bc4e28990c9f1a45007172f4104a9021d459abab43ee8c34fbf4fcc66334d1"

NPM_PKGNAME = "textlint-rule-no-empty-section"

inherit npmhelper
inherit native
