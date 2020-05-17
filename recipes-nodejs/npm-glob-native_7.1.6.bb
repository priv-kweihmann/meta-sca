SUMMARY = "NPM: glob"
DESCRIPTION = "a little globber"
HOMEPAGE = "https://github.com/isaacs/node-glob#readme"

DEPENDS = "npm-fs.realpath-native npm-inflight-native npm-inherits-native npm-minimatch-native npm-once-native npm-path-is-absolute-native"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c727d36f28f2762b1011dd483aa1a191"

SRC_URI = "https://registry.npmjs.org/glob/-/glob-7.1.6.tgz"
SRC_URI[md5sum] = "17216e880b3d04a14f051cbab05b0ce8"
SRC_URI[sha256sum] = "54b05170b446eced68494509bb23892d0b17fd2a2bf1596609bdf322c415a6c2"

S = "${WORKDIR}/package"

NPM_PKGNAME = "glob"

inherit npmhelper
inherit native
