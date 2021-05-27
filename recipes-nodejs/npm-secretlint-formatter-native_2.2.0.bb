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

SRC_URI = "https://registry.npmjs.org/@secretlint/formatter/-/formatter-2.2.0.tgz"
SRC_URI[md5sum] = "8328dbb5d087eed069f0649f9ed66fdf"
SRC_URI[sha256sum] = "7ec05eae9200007f114891a3133dd5ff608f772684e3b4806ec7056c41fa90ad"

NPM_PKGNAME = "@secretlint/formatter"

inherit npmhelper
inherit native
