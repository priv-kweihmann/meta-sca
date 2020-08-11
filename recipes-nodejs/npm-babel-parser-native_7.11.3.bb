SUMMARY = "NPM: @babel/parser"
DESCRIPTION = "A JavaScript parser"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b324af8e79986f4a5621efa85dd1292"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/parser/-/parser-7.11.3.tgz"
SRC_URI[md5sum] = "f264bce5dbef5e1c4bc5ce64498128f0"
SRC_URI[sha256sum] = "435b3d78c267a0cda53ee731239bc298c465ff71a0b855061abf941628ca4081"

NPM_PKGNAME = "@babel/parser"

inherit npmhelper
inherit native
