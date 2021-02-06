SUMMARY = "NPM: @textlint/textlint-plugin-text"
DESCRIPTION = "plain text plugin for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-plugin-text/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-text-to-ast-native"

SRC_URI = "https://registry.npmjs.org/@textlint/textlint-plugin-text/-/textlint-plugin-text-4.3.2.tgz"
SRC_URI[md5sum] = "37db444f3a995e1682e9992cf6c5fbb3"
SRC_URI[sha256sum] = "08b92cace74fd4685d4f0dee4228eeaf66f0cfd6efa432932c8db0643b2336c2"

NPM_PKGNAME = "@textlint/textlint-plugin-text"

inherit npmhelper
inherit native
