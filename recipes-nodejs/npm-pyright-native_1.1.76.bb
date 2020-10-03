SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.76.tgz"
SRC_URI[md5sum] = "ec0157b16e88eed9d321958dafca72c4"
SRC_URI[sha256sum] = "54ab603c73fcfa4bdd2036a50eb8ee8a80a4c3e6d7f0e581d4d4b2399a3c75ff"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
