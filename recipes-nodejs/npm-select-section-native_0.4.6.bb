SUMMARY = "NPM: select-section"
DESCRIPTION = "Cut out sections from TxtAST."
HOMEPAGE = "https://github.com/azu/text-testing"

DEPENDS = "npm-map-like-native npm-txt-ast-traverse-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

SRC_URI = "https://registry.npmjs.org/select-section/-/select-section-0.4.6.tgz"
SRC_URI[md5sum] = "cdd4640ce0b14deb5168e0afb88a62db"
SRC_URI[sha256sum] = "c7b788cb1ed8ac8f530fbadb1e6d2ed68bd12b51f5c3172d2b281670c0d1728f"

NPM_PKGNAME = "select-section"

inherit npmhelper
inherit native
