SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.163.tgz"
SRC_URI[md5sum] = "4185f76b7d4768b928fa8b12d3b19c13"
SRC_URI[sha256sum] = "80d589d53e40c72a76e8f835e8a634ab2ee00a2b1a7ade3181eaa34e49b724ee"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
