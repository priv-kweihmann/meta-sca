SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.11.4.tgz"
SRC_URI[md5sum] = "3ad9ae88f0e7a8aced32fa57721185bd"
SRC_URI[sha256sum] = "d8157f71edfe9c756cdbe0c976ddc4d632e352414863126955063e7d03b2a83d"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
