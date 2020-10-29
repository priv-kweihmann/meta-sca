SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.82.tgz"
SRC_URI[md5sum] = "92a75fa259882708931dfa0cba5e03b1"
SRC_URI[sha256sum] = "45fddec97139de935e98d2843cbf903e4f2e22333f6a1397ce49093c8325fb02"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
