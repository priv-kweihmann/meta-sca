SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.129.tgz"
SRC_URI[md5sum] = "aa516f9362d2b063ba325dc8a0100b93"
SRC_URI[sha256sum] = "ea625e09f6772e85cff389596f11bb8fda46f969deda47799c5da331a7689e70"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
