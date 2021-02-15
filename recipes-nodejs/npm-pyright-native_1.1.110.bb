SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.110.tgz"
SRC_URI[md5sum] = "43a147d3c7745367630eda4de4101b8d"
SRC_URI[sha256sum] = "d05f785e044f4395d55bc83be5d0aeba930040ff5c904d1d0fced713bc1ef213"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
