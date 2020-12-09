SUMMARY = "NPM: fraction.js"
DESCRIPTION = "A rational number library"
HOMEPAGE = "http://www.xarg.org/2014/03/rational-numbers-in-javascript/"

LICENSE = "MIT | GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c16ed6b50ba08352732580775575796f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/fraction.js/-/fraction.js-4.0.12.tgz"
SRC_URI[md5sum] = "457d962058f636fdd1cc979de4c13671"
SRC_URI[sha256sum] = "2d180dc1f910e44b5ddf2c4f99165fe12d49ac4de5fd0c7ee755198250584bde"

NPM_PKGNAME = "fraction.js"

inherit npmhelper
inherit native
