SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.124.tgz"
SRC_URI[md5sum] = "9b86fd44e56256b7fb5e468aa7d1caf7"
SRC_URI[sha256sum] = "3fa4fb6501d5eb272bd94add80170b711dfa91d543f74559f1359c5f74668e9f"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
