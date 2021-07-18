SUMMARY = "NPM: retext-english"
DESCRIPTION = "retext plugin to parse English prose"
HOMEPAGE = "https://github.com/retextjs/retext"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=119;endline=120;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-parse-english-native \
           npm-unherit-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/retext-english/-/retext-english-4.0.0.tgz"
SRC_URI[md5sum] = "4c6c9e8e69e5e1d553b3f7557bb7320a"
SRC_URI[sha256sum] = "668cc2ea61d94bc9f4c89de6e79376a96f4ec0705a811f794d3b6fabdd9a785a"

NPM_PKGNAME = "retext-english"

inherit npmhelper
inherit native
