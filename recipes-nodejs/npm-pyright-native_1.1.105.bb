SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.105.tgz"
SRC_URI[md5sum] = "b23d6409b2508667449928fdd324efe1"
SRC_URI[sha256sum] = "be1450eb462cde401b4f98a021ba346a2174f075543d07c3023f7a6878dec1e1"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
