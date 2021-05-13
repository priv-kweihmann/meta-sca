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

SRC_URI = "https://registry.npmjs.org/@secretlint/formatter/-/formatter-2.1.1.tgz"
SRC_URI[md5sum] = "749a6e0aed154c06c09bf6b04151a84f"
SRC_URI[sha256sum] = "7948f4e181497c09892e1a46d7d35516e2b8762cb427cb231c03e749ebae7382"

NPM_PKGNAME = "@secretlint/formatter"

inherit npmhelper
inherit native
