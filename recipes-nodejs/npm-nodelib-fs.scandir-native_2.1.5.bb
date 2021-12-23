SUMMARY = "NPM: @nodelib/fs.scandir"
DESCRIPTION = "List files and directories inside the specified directory"
HOMEPAGE = "{homepage}"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=580f1c3c6765fecfdb93bdf4e068d952"

DEPENDS = "npm-nodelib-fs.stat-native \
           npm-run-parallel-native"

SRC_URI = "https://registry.npmjs.org/@nodelib/fs.scandir/-/fs.scandir-2.1.5.tgz"
SRC_URI[md5sum] = "c9f11aab0960639af613b80dfaf5a981"
SRC_URI[sha256sum] = "a924bfa317c78e8bdbb0bd361522aba431fffe0878bf3699a8cb35a6e50cf94c"

NPM_PKGNAME = "@nodelib/fs.scandir"

inherit npmhelper
inherit native
