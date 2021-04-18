SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.132.tgz"
SRC_URI[md5sum] = "21d699869691191c0ef9767bb91168c2"
SRC_URI[sha256sum] = "0cd8355c16fbf14ebd75906ae6b9631599a718db07f46b3e994e1d55f81a5e24"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
