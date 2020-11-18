SUMMARY = "NPM: cspell"
DESCRIPTION = "A Spelling Checker for Code!"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-chalk-native \
           npm-commander-native \
           npm-comment-json-native \
           npm-cspell-glob-native \
           npm-cspell-lib-native \
           npm-fs-extra-native \
           npm-gensequence-native \
           npm-get-stdin-native \
           npm-glob-native \
           npm-minimatch-native"

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-4.2.2.tgz"
SRC_URI[md5sum] = "17f05d94abaf31b590e5021848d0a768"
SRC_URI[sha256sum] = "59ecd4ea2b5160b70c8a06ea0817513e49ad67da143dcf043d39f9ff86aa13eb"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native
