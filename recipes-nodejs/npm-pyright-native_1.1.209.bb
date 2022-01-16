SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.209.tgz"
SRC_URI[md5sum] = "d21f11fbbb679b34a641b1664a3a314f"
SRC_URI[sha256sum] = "bc4b1c325f7c9f80b586af30a178a16c537df7545c58f86690c6f3d144de8df7"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
