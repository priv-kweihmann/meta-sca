SUMMARY = "NPM: is-negative-zero"
DESCRIPTION = "Is this value negative zero? === will lie to you"
HOMEPAGE = "https://github.com/ljharb/is-negative-zero"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-negative-zero/-/is-negative-zero-2.0.0.tgz"
SRC_URI[md5sum] = "7d7a22069f115d29753abc3ba8eda3aa"
SRC_URI[sha256sum] = "897ab0637d6ed811552c44476567b1164e8df70ea33a0f0f46939fe031226c7e"

NPM_PKGNAME = "is-negative-zero"

inherit npmhelper
inherit native
