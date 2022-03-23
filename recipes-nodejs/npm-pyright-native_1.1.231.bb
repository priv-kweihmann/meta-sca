SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.231.tgz"
SRC_URI[md5sum] = "53952d9e95110c3c185ff87150b537bd"
SRC_URI[sha256sum] = "5ff6335f22cda6195a5c267c00370a96546cc44cea49c780f0cc1d0ae5ec406b"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
