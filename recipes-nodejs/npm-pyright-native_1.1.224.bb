SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.224.tgz"
SRC_URI[md5sum] = "48d94310bfc3739e68b32d9f580d1b65"
SRC_URI[sha256sum] = "8cf9a49005dae899e313fac20d5cf1260bcea8117d220b65f66b2e95b19e78be"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
