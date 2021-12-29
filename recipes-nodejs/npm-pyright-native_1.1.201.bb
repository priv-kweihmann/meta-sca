SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.201.tgz"
SRC_URI[md5sum] = "60492f8bf964195ed623261b2579a0fd"
SRC_URI[sha256sum] = "39e62ac594463fef1d5265871584bc2a3a92a62ae594a4c00e71e4330ea7abcd"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
