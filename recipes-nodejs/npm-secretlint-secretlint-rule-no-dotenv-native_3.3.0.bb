SUMMARY = "NPM: @secretlint/secretlint-rule-no-dotenv"
DESCRIPTION = "A secretlint rule for dotenv"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-no-dotenv/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b4e96f84d6d9f19f8529455faa018754"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-no-dotenv/-/secretlint-rule-no-dotenv-3.3.0.tgz"
SRC_URI[md5sum] = "3eb574cad84e2ec54fdaa4ad0d9ba648"
SRC_URI[sha256sum] = "ee1a9c7344e05def3a397efacc3b171f031cd631116125509dabd121943dc8b2"

NPM_PKGNAME = "@secretlint/secretlint-rule-no-dotenv"

inherit npmhelper
inherit native
