SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.99.tgz"
SRC_URI[md5sum] = "848d9424c40ba7af34c0f6db2cac8ab9"
SRC_URI[sha256sum] = "d9d0a76345b7757ac336fed6110d907a10cc15fa95965fb2d5b8510d948cce78"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
