SUMMARY = "NPM: ansi-styles"
DESCRIPTION = "ANSI escape codes for styling strings in the terminal"
HOMEPAGE = "https://github.com/chalk/ansi-styles#readme"

DEPENDS = "npm-color-convert-native npm-types-color-name-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/ansi-styles/-/ansi-styles-4.2.1.tgz"
SRC_URI[md5sum] = "060df7e9d20ecf7760bbcbcc21f108ed"
SRC_URI[sha256sum] = "d19f43cc0e836ac517bea0908188fe7f654e80287c1b470a02b14b8b787d9bb0"

NPM_PKGNAME = "ansi-styles"

inherit npmhelper
inherit native
