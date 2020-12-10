SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.94.tgz"
SRC_URI[md5sum] = "50812d1a711514cdee4d5dc5c9dd32fc"
SRC_URI[sha256sum] = "82c7352498399bb6529a3a64b2e6e57cf3cc7185defb4e8555ffc0c63f8b0502"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
