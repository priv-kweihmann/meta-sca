SUMMARY = "NPM: ansi-align"
DESCRIPTION = "align-text with ANSI support for CLIs"
HOMEPAGE = "https://github.com/nexdrew/ansi-align#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42624e59bd3dabedcca59e1b54e3af50"

DEPENDS = "npm-string-width-native"

SRC_URI = "https://registry.npmjs.org/ansi-align/-/ansi-align-3.0.0.tgz"
SRC_URI[md5sum] = "d4d1b67f836e78c4f30abe6d5ceac3eb"
SRC_URI[sha256sum] = "22707180cf22ff311efbe26996c8991d2daaab2fcc1463be01155886f67ddbed"

NPM_PKGNAME = "ansi-align"

inherit npmhelper
inherit native
