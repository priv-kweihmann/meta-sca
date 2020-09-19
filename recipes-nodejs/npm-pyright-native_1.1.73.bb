SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.73.tgz"
SRC_URI[md5sum] = "cb62c9f1c0d200131cfc25d5006d6628"
SRC_URI[sha256sum] = "6b2e157313031b7fe83511730d8330b6a9f417993e470cde899a2f8aae648147"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
