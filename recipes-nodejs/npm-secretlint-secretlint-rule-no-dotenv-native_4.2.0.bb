SUMMARY = "NPM: @secretlint/secretlint-rule-no-dotenv"
DESCRIPTION = "A secretlint rule for dotenv"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-no-dotenv/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b4e96f84d6d9f19f8529455faa018754"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-no-dotenv/-/secretlint-rule-no-dotenv-4.2.0.tgz"
SRC_URI[md5sum] = "0e3123fca7cea602f0e5e0dbd81ad02d"
SRC_URI[sha256sum] = "e210c4b3be95427953e4660b05209a309ee706fa30f7b9d3ce238c4c77786f13"

NPM_PKGNAME = "@secretlint/secretlint-rule-no-dotenv"

inherit npmhelper
inherit native
