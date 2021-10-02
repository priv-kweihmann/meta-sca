SUMMARY = "NPM: ansi-align"
DESCRIPTION = "align-text with ANSI support for CLIs"
HOMEPAGE = "https://github.com/nexdrew/ansi-align#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42624e59bd3dabedcca59e1b54e3af50"

DEPENDS = "npm-string-width-native"

SRC_URI = "https://registry.npmjs.org/ansi-align/-/ansi-align-3.0.1.tgz"
SRC_URI[md5sum] = "f1692d7f8fa785d336105d366f4e241b"
SRC_URI[sha256sum] = "1caec5847bc1cfce57303170ac0db37f71d80c5c055ef006b8a50245a4a0f082"

NPM_PKGNAME = "ansi-align"

inherit npmhelper
inherit native
