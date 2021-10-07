SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.176.tgz"
SRC_URI[md5sum] = "855e126c6a7cc0e4d8841e520665deb4"
SRC_URI[sha256sum] = "6b8dc5e73b6af1fcb158ce2e70046c9aa5d7e9771fddd603558de3994d958c30"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
