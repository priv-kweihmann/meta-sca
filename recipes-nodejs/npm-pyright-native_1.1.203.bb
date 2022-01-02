SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.203.tgz"
SRC_URI[md5sum] = "ec96d86716d324415136336a5a69d487"
SRC_URI[sha256sum] = "ccf2619b5e222545ec7cd2481d7fc0fea37260ae0537fcbb0228980c860fc32d"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
