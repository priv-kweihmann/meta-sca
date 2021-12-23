SUMMARY = "NPM: path-is-absolute"
DESCRIPTION = "Node.js 0.12 path.isAbsolute() ponyfill"
HOMEPAGE = "https://github.com/sindresorhus/path-is-absolute#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/path-is-absolute/-/path-is-absolute-1.0.1.tgz"
SRC_URI[md5sum] = "18bfccb10294ae19e7eb616ed1c05176"
SRC_URI[sha256sum] = "6e6d709f1a56942514e4e2c2709b30c7b1ffa46fbed70e714904a3d63b01f75c"

S = "${WORKDIR}/package"

NPM_PKGNAME = "path-is-absolute"

inherit npmhelper
inherit native
