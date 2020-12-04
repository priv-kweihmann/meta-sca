SUMMARY = "NPM: ansi-styles"
DESCRIPTION = "ANSI escape codes for styling strings in the terminal"
HOMEPAGE = "https://github.com/chalk/ansi-styles#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ansi-styles/-/ansi-styles-5.0.0.tgz"
SRC_URI[md5sum] = "9a7efb164d38a0ab229aa001242cfed4"
SRC_URI[sha256sum] = "87422d076b715e811542336862611dde3dae52567e2036c31431791b15ea222e"

NPM_PKGNAME = "ansi-styles"

inherit npmhelper
inherit native
