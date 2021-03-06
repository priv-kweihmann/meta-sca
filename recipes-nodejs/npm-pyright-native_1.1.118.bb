SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.118.tgz"
SRC_URI[md5sum] = "377e29b871dae6271d3be7917003d2c2"
SRC_URI[sha256sum] = "e33d358a94309915ee55340104779e8bfc68e6ca4ccbeb459b8941225ff57649"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
