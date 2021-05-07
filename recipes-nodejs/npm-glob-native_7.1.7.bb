SUMMARY = "NPM: glob"
DESCRIPTION = "a little globber"
HOMEPAGE = "https://github.com/isaacs/node-glob#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c727d36f28f2762b1011dd483aa1a191"

DEPENDS = "npm-fs.realpath-native \
           npm-inflight-native \
           npm-inherits-native \
           npm-minimatch-native \
           npm-once-native \
           npm-path-is-absolute-native"

SRC_URI = "https://registry.npmjs.org/glob/-/glob-7.1.7.tgz"
SRC_URI[md5sum] = "b76e2faffe41be9df3f1ff4605ee1a63"
SRC_URI[sha256sum] = "0504b3ddde68d1a93b4b9ef150cdff61e033df5f17cf7858c0d9fe1b412e9bee"

NPM_PKGNAME = "glob"

inherit npmhelper
inherit native
