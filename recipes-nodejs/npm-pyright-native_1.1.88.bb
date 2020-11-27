SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.88.tgz"
SRC_URI[md5sum] = "dd67cb8c48baa7b2441bf6c22fab2c05"
SRC_URI[sha256sum] = "fcee1027376af64e2396945654b67299ec360e395b74a8d781c18c6dec98f59c"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
