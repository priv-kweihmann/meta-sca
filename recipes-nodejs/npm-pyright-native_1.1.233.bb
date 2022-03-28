SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.233.tgz"
SRC_URI[md5sum] = "21c285f3d0881e7de56aa4f5475b779a"
SRC_URI[sha256sum] = "9f00cea6dbf714d44437b6d7ff2706819a39f1aa229b693fd021f800c0d0c7cc"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
