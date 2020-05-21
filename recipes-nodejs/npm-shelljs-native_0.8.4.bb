SUMMARY = "NPM: shelljs"
DESCRIPTION = "Portable Unix shell commands for Node.js"
HOMEPAGE = "http://github.com/shelljs/shelljs"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=984c31fdd47cf012f52739542dd857c4"

DEPENDS = "npm-glob-native \
           npm-interpret-native \
           npm-rechoir-native"

SRC_URI = "https://registry.npmjs.org/shelljs/-/shelljs-0.8.4.tgz"
SRC_URI[md5sum] = "01e771275b5e5c5dd2665dc6ef222929"
SRC_URI[sha256sum] = "5e433d1a875ab2ccf749fe1c3d776427b42203e65c9201914eb5051f505159c9"

NPM_PKGNAME = "shelljs"

inherit npmhelper
inherit native
