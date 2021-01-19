SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.102.tgz"
SRC_URI[md5sum] = "e577b62503e9c48b24370f9bf9a85b30"
SRC_URI[sha256sum] = "e27280a3c62da7526705961c535731176cd6cdc640e37650d2bf815929043e4f"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
