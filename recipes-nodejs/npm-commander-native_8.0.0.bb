SUMMARY = "NPM: commander"
DESCRIPTION = "the complete solution for node.js command-line programs"
HOMEPAGE = "https://github.com/tj/commander.js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=25851d4d10d6611a12d5571dab945a00"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/commander/-/commander-8.0.0.tgz"
SRC_URI[md5sum] = "c5386dcbb6d0974434b00a438c279997"
SRC_URI[sha256sum] = "d3851341fdf7edf747a090e7569ced64c221bda98894054d95ce3bd740c1abe9"

NPM_PKGNAME = "commander"

inherit npmhelper
inherit native
