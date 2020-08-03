SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.59.tgz"
SRC_URI[md5sum] = "546f9bdf7405dfd9b911fe5bc749180f"
SRC_URI[sha256sum] = "6e341dff1acb4e2ad71c204678abbeb7000f3d9dfe52b155aefe3ec35a7f2865"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
