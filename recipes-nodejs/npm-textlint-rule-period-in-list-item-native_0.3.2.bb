SUMMARY = "NPM: textlint-rule-period-in-list-item"
DESCRIPTION = "textlint rule that check with or without period in list item."
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-period-in-list-item"

DEPENDS = "npm-check-ends-with-period-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

SRC_URI = "https://registry.npmjs.org/textlint-rule-period-in-list-item/-/textlint-rule-period-in-list-item-0.3.2.tgz"
SRC_URI[md5sum] = "e8c4d16d6cd9f652bd5c16f7758303bf"
SRC_URI[sha256sum] = "cf06386658c08c63e05f9f4b23ba6ff66a1a33db6a88c625b0f494ddc96ae830"

NPM_PKGNAME = "textlint-rule-period-in-list-item"

inherit npmhelper
inherit native
