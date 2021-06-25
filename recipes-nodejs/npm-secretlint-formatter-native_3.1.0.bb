SUMMARY = "NPM: @secretlint/formatter"
DESCRIPTION = "A formatter collection for Secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/formatter/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-debug-native \
           npm-secretlint-types-native \
           npm-terminal-link-native \
           npm-textlint-linter-formatter-native \
           npm-textlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/formatter/-/formatter-3.1.0.tgz"
SRC_URI[md5sum] = "79aa8c9e30b91bf9feed562e3f07d2a9"
SRC_URI[sha256sum] = "bb77de427029a26e9c2d3b76ed4262c9df4b1de0b51913d763e1880b0fa31f7b"

NPM_PKGNAME = "@secretlint/formatter"

inherit npmhelper
inherit native
