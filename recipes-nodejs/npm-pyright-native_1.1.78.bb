SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.78.tgz"
SRC_URI[md5sum] = "a06f71c1f60d03578e52349c41a442e7"
SRC_URI[sha256sum] = "ccfd2c3bdedb786464912c0ceb0740bbf1b8877a61f76a7493702c5846ddb274"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
