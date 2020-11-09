SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.84.tgz"
SRC_URI[md5sum] = "b95b5143290f87e176473dbe6863256b"
SRC_URI[sha256sum] = "736afcd52850ea66ea582c4053ce3d2acaf88d98dca37660c3f9459fd5a7b94a"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
