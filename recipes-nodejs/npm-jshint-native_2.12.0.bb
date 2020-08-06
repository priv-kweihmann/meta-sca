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

SRC_URI = "https://registry.npmjs.org/jshint/-/jshint-2.12.0.tgz"
SRC_URI[md5sum] = "f7f2dba5e4197a66e6a28f9ce629d540"
SRC_URI[sha256sum] = "82a255d6580c17682f35da20bfa424299b3f9d7c734f02e97a0a32e8e1242f69"

NPM_PKGNAME = "jshint"

inherit npmhelper
inherit native
