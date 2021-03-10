SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.120.tgz"
SRC_URI[md5sum] = "72f6a447d590949b089cbaa0d91fc51c"
SRC_URI[sha256sum] = "990a7924d04a4aa57ebd1956b6887b655488aea1843d12aed79cc2fe76cc8bec"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
