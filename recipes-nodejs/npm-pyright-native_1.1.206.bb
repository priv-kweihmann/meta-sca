SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.206.tgz"
SRC_URI[md5sum] = "228265c8338174a143b2e04d6704ce53"
SRC_URI[sha256sum] = "17a804cb1022face3d1d29a21ca48f029991f2c1f43ed72e55edf0b4022fc96b"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
