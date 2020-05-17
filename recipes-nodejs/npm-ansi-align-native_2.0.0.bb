SUMMARY = "NPM: ansi-align"
DESCRIPTION = "align-text with ANSI support for CLIs"
HOMEPAGE = "https://github.com/nexdrew/ansi-align#readme"

DEPENDS = "npm-string-width-native"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42624e59bd3dabedcca59e1b54e3af50"

SRC_URI = "https://registry.npmjs.org/ansi-align/-/ansi-align-2.0.0.tgz"
SRC_URI[md5sum] = "ff25664d95eda4d34b9afb10fc41a495"
SRC_URI[sha256sum] = "d69a57f402413d5bf29097d27d2f340c8c82b1670d777885ca51be85478361da"

NPM_PKGNAME = "ansi-align"

inherit npmhelper
inherit native
