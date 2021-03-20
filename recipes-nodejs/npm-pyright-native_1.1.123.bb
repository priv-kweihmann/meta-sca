SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.123.tgz"
SRC_URI[md5sum] = "c1895b49495d1381face2420d3402ab2"
SRC_URI[sha256sum] = "66ea8857c691e4f99a371960bf48be8c00964d2a6fe8ecbf6671f0e28933e3a9"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
