SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.183.tgz"
SRC_URI[md5sum] = "fb4cd06e832847d6d3b7c8ff957ae712"
SRC_URI[sha256sum] = "aae5161a88db993ef9739de4954ee8571ea2db8c3e67cd1cba46b34210ccf898"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
