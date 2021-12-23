SUMMARY = "NPM: jshint"
DESCRIPTION = "Static analysis tool for JavaScript"
HOMEPAGE = "http://jshint.com/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
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

SRC_URI = "https://registry.npmjs.org/jshint/-/jshint-2.13.1.tgz"
SRC_URI[md5sum] = "f7a429714e92c8ec8fb048499fc50531"
SRC_URI[sha256sum] = "ae1fc6b530186ae38d46f69d1c171d02616ab12fb0bf6986f50443ac1f5df12b"

NPM_PKGNAME = "jshint"

inherit npmhelper
inherit native
