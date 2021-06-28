SUMMARY = "NPM: fast-glob"
DESCRIPTION = "It's a very fast and efficient glob library for Node.js"
HOMEPAGE = "https://github.com/mrmlnc/fast-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=580f1c3c6765fecfdb93bdf4e068d952"

DEPENDS = "npm-glob-parent-native \
           npm-merge2-native \
           npm-micromatch-native \
           npm-nodelib-fs.stat-native \
           npm-nodelib-fs.walk-native"

SRC_URI = "https://registry.npmjs.org/fast-glob/-/fast-glob-3.2.6.tgz"
SRC_URI[md5sum] = "a8c4a390afe036474013d632f7f35986"
SRC_URI[sha256sum] = "3a02563d98585e8f0bf7e7805091f76d9f397988d0d143761846b081293c750b"

NPM_PKGNAME = "fast-glob"

inherit npmhelper
inherit native
