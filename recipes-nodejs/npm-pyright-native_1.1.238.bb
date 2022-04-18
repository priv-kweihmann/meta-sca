SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.238.tgz"
SRC_URI[md5sum] = "272a346c32ae9b49876a1ee0d0b5e5d5"
SRC_URI[sha256sum] = "1359e59b16821fb5126fd1645ee47de0b6ad4cde3c137c25f03a6a4a41e48cc7"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
