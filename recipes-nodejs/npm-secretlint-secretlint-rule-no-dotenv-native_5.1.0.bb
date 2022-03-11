SUMMARY = "NPM: @secretlint/secretlint-rule-no-dotenv"
DESCRIPTION = "A secretlint rule for dotenv"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-no-dotenv/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b4e96f84d6d9f19f8529455faa018754"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-no-dotenv/-/secretlint-rule-no-dotenv-5.1.0.tgz"
SRC_URI[md5sum] = "d44065f5d90745c3bcf49e729a9e6e92"
SRC_URI[sha256sum] = "4ec7d0dc6e0d1f0d565aa2d22740dbed9bd5e9222843dca6be4651a130b23cd8"

NPM_PKGNAME = "@secretlint/secretlint-rule-no-dotenv"

inherit npmhelper
inherit native
