SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.96.tgz"
SRC_URI[md5sum] = "c2b11d16c7ca37a637b8b20f9f509084"
SRC_URI[sha256sum] = "141bdebd133d8d22e1a64f9071e1ef311890d4470cb980af9b305a19dc1e2044"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
