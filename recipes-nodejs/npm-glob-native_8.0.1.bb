SUMMARY = "NPM: glob"
DESCRIPTION = "a little globber"
HOMEPAGE = "https://github.com/isaacs/node-glob#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c66b78639358cd3f497d598618aa7c93"

DEPENDS = "npm-fs.realpath-native \
           npm-inflight-native \
           npm-inherits-native \
           npm-minimatch-native \
           npm-once-native \
           npm-path-is-absolute-native"

SRC_URI = "https://registry.npmjs.org/glob/-/glob-8.0.1.tgz"
SRC_URI[md5sum] = "5e46de0435199a5ed335f0f148900337"
SRC_URI[sha256sum] = "cc9e7f3d0cc1547c3a1553f303b9227a8fe87060005b4953e785d2044796a68d"

NPM_PKGNAME = "glob"

inherit npmhelper
inherit native
