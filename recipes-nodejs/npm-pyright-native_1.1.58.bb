SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.58.tgz"
SRC_URI[md5sum] = "a9f7e79e1bec01a97ab6230cc9676c1d"
SRC_URI[sha256sum] = "0639a841991988fcbe0943c52a80e00f87fe47e233316e99e158331d15abaa55"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
