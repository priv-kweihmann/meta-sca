SUMMARY = "NPM: stringifier"
DESCRIPTION = "Yet another stringify function"
HOMEPAGE = "https://github.com/twada/stringifier"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=517;endline=518;md5=58df9e83004f606114445c6289cc4b73"

DEPENDS = "npm-traverse-native \
           npm-type-name-native"

SRC_URI = "https://registry.npmjs.org/stringifier/-/stringifier-2.1.0.tgz"
SRC_URI[md5sum] = "d8da7b36c2eb203d1c60207d29d63a9d"
SRC_URI[sha256sum] = "97a57449c3d122ee297f2bec19ae1c71351306b000cde0578264cb2c6d8a3d62"

NPM_PKGNAME = "stringifier"

inherit npmhelper
inherit native
