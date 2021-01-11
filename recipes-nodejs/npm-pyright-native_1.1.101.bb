SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.101.tgz"
SRC_URI[md5sum] = "8644407ed57112c7d9797004c6beb189"
SRC_URI[sha256sum] = "c44b9e8b864d6e15398265a96b9a7f22e9437fd4f96ce35296d277e9fa11c3c5"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
