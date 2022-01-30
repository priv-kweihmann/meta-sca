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
           npm-strip-json-comments-native"

SRC_URI = "https://registry.npmjs.org/jshint/-/jshint-2.13.4.tgz"
SRC_URI[md5sum] = "8aef74c7926860be69b6944a2a618e50"
SRC_URI[sha256sum] = "1290b3d1b34f4c317b962a014441a2a406e7f3be1f6ddfad31bf8465f3e31293"

NPM_PKGNAME = "jshint"

inherit npmhelper
inherit native
