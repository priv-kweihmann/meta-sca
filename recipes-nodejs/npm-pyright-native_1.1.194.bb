SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.194.tgz"
SRC_URI[md5sum] = "6f6dff92a6ab3ba0e6d675b41c640317"
SRC_URI[sha256sum] = "514bad4828a8d1b39651dec83ab447c25fe1dc8f2dc72c96bf18b539830784a1"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
