SUMMARY = "NPM: @secretlint/secretlint-rule-no-dotenv"
DESCRIPTION = "A secretlint rule for dotenv"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-no-dotenv/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b4e96f84d6d9f19f8529455faa018754"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-no-dotenv/-/secretlint-rule-no-dotenv-2.1.1.tgz"
SRC_URI[md5sum] = "05997ae0cd755736491862e0d8423934"
SRC_URI[sha256sum] = "f4a265095d2fa4e6a18f3f1f3457523d8e75e87f4397a9323ee3ad58696cf9e6"

NPM_PKGNAME = "@secretlint/secretlint-rule-no-dotenv"

inherit npmhelper
inherit native
