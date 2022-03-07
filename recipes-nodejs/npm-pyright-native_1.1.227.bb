SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.227.tgz"
SRC_URI[md5sum] = "0cd2bc33c219ba4f9fa680a3994542ff"
SRC_URI[sha256sum] = "e0663ac230caa7842d0a4d1e856ec3b6ff7bae3f90e174dbe4d52cc5fdaa558a"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
