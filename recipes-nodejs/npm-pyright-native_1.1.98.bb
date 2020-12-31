SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.98.tgz"
SRC_URI[md5sum] = "1384e82f70703cd356620676e20da406"
SRC_URI[sha256sum] = "fc73b6ff1951926764eb7e0cdcf1053e2f58f0b8ef2934b3fe19564cf46b9933"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
