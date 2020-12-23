SUMMARY = "NPM: fraction.js"
DESCRIPTION = "A rational number library"
HOMEPAGE = "http://www.xarg.org/2014/03/rational-numbers-in-javascript/"

LICENSE = "MIT | GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c16ed6b50ba08352732580775575796f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/fraction.js/-/fraction.js-4.0.13.tgz"
SRC_URI[md5sum] = "11cf67b1de0d7927ad1e54a809367576"
SRC_URI[sha256sum] = "a0f4883da2f1d63635707d2087fc7d9971fa8e2b253ab5288afc369272bbc89a"

NPM_PKGNAME = "fraction.js"

inherit npmhelper
inherit native
