SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.83.tgz"
SRC_URI[md5sum] = "3ee46f4bd5209fd4156b8f9eff2162b5"
SRC_URI[sha256sum] = "eb83b1ed6401d098b9797e62a53d5e69efa77b312b52062f36e30643840baaf8"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
