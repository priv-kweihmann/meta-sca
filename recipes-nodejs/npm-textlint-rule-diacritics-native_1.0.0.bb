SUMMARY = "NPM: textlint-rule-diacritics"
DESCRIPTION = "Textlint rule to check correct usage of diacritics"
HOMEPAGE = "https://github.com/sapegin/textlint-rule-diacritics"

DEPENDS = "npm-match-casing-native npm-strip-json-comments-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.md;md5=1c3c1ff2f08b4ec351c1fc7d50f3e724"

SRC_URI = "https://registry.npmjs.org/textlint-rule-diacritics/-/textlint-rule-diacritics-1.0.0.tgz"
SRC_URI[md5sum] = "a63dfc1a9e95d11ddbde8e7397439faf"
SRC_URI[sha256sum] = "6329b12e6d00e7b3c2c930b8458b7dd973f907b566123e1e932ff00afdd7a44f"

NPM_PKGNAME = "textlint-rule-diacritics"

inherit npmhelper
inherit native
