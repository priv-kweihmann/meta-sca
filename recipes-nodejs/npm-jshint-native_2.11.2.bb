SUMMARY = "NPM: jshint"
DESCRIPTION = "Static analysis tool for JavaScript"
HOMEPAGE = "http://jshint.com/"

LICENSE = "MIT & JSON"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4e19041df56fbb7a49fb87c4322d5849"

DEPENDS = "npm-cli-native \
           npm-console-browserify-native \
           npm-exit-native \
           npm-htmlparser2-native \
           npm-lodash-native \
           npm-minimatch-native \
           npm-shelljs-native \
           npm-strip-json-comments-native"

SRC_URI = "https://registry.npmjs.org/jshint/-/jshint-2.11.2.tgz"
SRC_URI[md5sum] = "957accb39c0c7cddac1887825a46d2d8"
SRC_URI[sha256sum] = "c5307216f6be483b329b6192021dda6282f1a17e1013c5a578b41f8530f6b884"

NPM_PKGNAME = "jshint"

inherit npmhelper
inherit native
