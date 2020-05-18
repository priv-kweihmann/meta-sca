SUMMARY = "NPM: console-browserify"
DESCRIPTION = "Emulate console for all the browsers"
HOMEPAGE = "https://github.com/browserify/console-browserify"

LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://LICENCE;md5=8966d3100f2d871ee216d056c0ea0160"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/console-browserify/-/console-browserify-1.2.0.tgz"
SRC_URI[md5sum] = "7464516f977cde8239bc47c31e005f81"
SRC_URI[sha256sum] = "2e6d867f73d5829174cf20868c80360c8ec434867ea68a8baf5cbb9d532c1040"

NPM_PKGNAME = "console-browserify"

inherit npmhelper
inherit native
