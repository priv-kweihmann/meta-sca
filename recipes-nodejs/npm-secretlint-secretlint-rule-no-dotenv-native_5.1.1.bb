SUMMARY = "NPM: @secretlint/secretlint-rule-no-dotenv"
DESCRIPTION = "A secretlint rule for dotenv"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-no-dotenv/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b4e96f84d6d9f19f8529455faa018754"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-no-dotenv/-/secretlint-rule-no-dotenv-5.1.1.tgz"
SRC_URI[md5sum] = "f531d8a84789ac89800acf897d41e571"
SRC_URI[sha256sum] = "d495f3f6e9aca304eb7d70c8f2fd8b08f746e307d1f9e299333167c6326ee351"

NPM_PKGNAME = "@secretlint/secretlint-rule-no-dotenv"

inherit npmhelper
inherit native
