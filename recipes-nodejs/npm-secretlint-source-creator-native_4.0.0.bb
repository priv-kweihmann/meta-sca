SUMMARY = "NPM: @secretlint/source-creator"
DESCRIPTION = "Create SecretLintRawSource from content."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/source-creator/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-istextorbinary-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/source-creator/-/source-creator-4.0.0.tgz"
SRC_URI[md5sum] = "3f9a9ec98edec67f7da08be4ba6ef59f"
SRC_URI[sha256sum] = "8567d4f19f8aee53b5064d2deb13949095c7e511488cb8b46aa2cd788634a51c"

NPM_PKGNAME = "@secretlint/source-creator"

inherit npmhelper
inherit native
