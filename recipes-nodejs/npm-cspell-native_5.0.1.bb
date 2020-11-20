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
           npm-get-stdin-native \
           npm-glob-native \
           npm-minimatch-native"

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-5.0.1.tgz"
SRC_URI[md5sum] = "7b909da8f4bbf60f8fa12ea89a0e740f"
SRC_URI[sha256sum] = "2d35af9b17613b6d3d6cc973846c163a44226b6816fcc01f49b94e79caad616e"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native
