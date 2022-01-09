SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.205.tgz"
SRC_URI[md5sum] = "ec4afa6b1093a67e1495bedb5335be31"
SRC_URI[sha256sum] = "08473254a2c9037c12d38ec624383c284b294775fe4810ed8921578cd6ca2bd7"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
