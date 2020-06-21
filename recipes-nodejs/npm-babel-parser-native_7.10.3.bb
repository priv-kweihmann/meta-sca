SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.10.3.tgz"
SRC_URI[md5sum] = "89c2f11d403be3c72613b82300603b39"
SRC_URI[sha256sum] = "4cd2eb0acb5dc2df01d73fff1189544c6c28290f778a6f6d04bcdc7e02b53744"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
