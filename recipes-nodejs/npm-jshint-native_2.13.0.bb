SUMMARY = "NPM: jshint"
DESCRIPTION = "Static analysis tool for JavaScript"
HOMEPAGE = "http://jshint.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4e19041df56fbb7a49fb87c4322d5849"

DEPENDS = "npm-cli-native \
           npm-console-browserify-native \
           npm-exit-native \
           npm-htmlparser2-native \
           npm-lodash-native \
           npm-minimatch-native \
           npm-shelljs-native \
           npm-strip-json-comments-native"

SRC_URI = "https://registry.npmjs.org/jshint/-/jshint-2.13.0.tgz"
SRC_URI[md5sum] = "9981c2f8800280376cdd24b626ebe4cd"
SRC_URI[sha256sum] = "94c400d53a7247b6408bf26e22a809496f3677cce2b6a9c40528a5639e535c2d"

NPM_PKGNAME = "jshint"

inherit npmhelper
inherit native
