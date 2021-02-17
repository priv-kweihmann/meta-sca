SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.112.tgz"
SRC_URI[md5sum] = "41dd02ea568b781f5e8bba90f3608789"
SRC_URI[sha256sum] = "63acb746464848edbd020536b72b0aed2595c06cb2e82ff255a937631f0e0ec3"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
