SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.169.tgz"
SRC_URI[md5sum] = "0eb257c1eb4195b0e91f10e46f984525"
SRC_URI[sha256sum] = "64047988a3a8d015ce940d00e917ac5a593373784a53f3645f8353cde80023ac"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
