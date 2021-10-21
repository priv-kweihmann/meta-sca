SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.180.tgz"
SRC_URI[md5sum] = "7c60b20aa5a7d84edf8cfae05542b101"
SRC_URI[sha256sum] = "7e6f0cdc5a23b9cc08651e2e40611757cdbbc46e96ea31fe5e735f07a9078203"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
