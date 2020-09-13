SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.70.tgz"
SRC_URI[md5sum] = "3824333a957d7d5e46c70eccfc642491"
SRC_URI[sha256sum] = "aab0bc1efa655757d575cb28599cf3b05562228d65c2f4ef654c49eddbbffeea"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
