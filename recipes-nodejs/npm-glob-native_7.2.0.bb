SUMMARY = "NPM: glob"
DESCRIPTION = "a little globber"
HOMEPAGE = "https://github.com/isaacs/node-glob#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c727d36f28f2762b1011dd483aa1a191"

DEPENDS = "npm-fs.realpath-native \
           npm-inflight-native \
           npm-inherits-native \
           npm-minimatch-native \
           npm-once-native \
           npm-path-is-absolute-native"

SRC_URI = "https://registry.npmjs.org/glob/-/glob-7.2.0.tgz"
SRC_URI[md5sum] = "05f5ea4a12aecafd90fe04c32385ce80"
SRC_URI[sha256sum] = "f6ee73de2fedc6931cbe3df9f8a7d8fd34e8a869ca2e8c8b624e9ea2647a051b"

NPM_PKGNAME = "glob"

inherit npmhelper
inherit native
