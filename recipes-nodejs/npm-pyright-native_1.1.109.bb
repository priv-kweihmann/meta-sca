SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.109.tgz"
SRC_URI[md5sum] = "d5d3df8386a4f4f084c6a0d458260c26"
SRC_URI[sha256sum] = "643f9576855d0e9948763ad8718175c3ace6a61cd960cf766906a20919e5e64c"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
