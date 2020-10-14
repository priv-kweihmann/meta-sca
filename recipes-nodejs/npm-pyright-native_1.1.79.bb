SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.79.tgz"
SRC_URI[md5sum] = "a7bddec8b81fe67a7deae759b7ae45b9"
SRC_URI[sha256sum] = "2224048aef7caa5976c6ae37739d42f8e47e017554955e2de0587e98e55ad2c1"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
