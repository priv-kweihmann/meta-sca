SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.2.0.tgz"
SRC_URI[md5sum] = "f5d2f3497d6189606fd19cef2e1a9a37"
SRC_URI[sha256sum] = "7235f77f330bc8651222ea0e20c4b63b57b32d784d5fb132ddeaf11866c8e8a6"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native
