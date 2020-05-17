SUMMARY = "NPM: jshint"
DESCRIPTION = "Static analysis tool for JavaScript"
HOMEPAGE = "http://jshint.com/"

DEPENDS = "npm-cli-native npm-console-browserify-native npm-exit-native npm-htmlparser2-native npm-lodash-native npm-minimatch-native npm-shelljs-native npm-strip-json-comments-native"

LICENSE = "(MIT & JSON)"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4e19041df56fbb7a49fb87c4322d5849"

SRC_URI = "https://registry.npmjs.org/jshint/-/jshint-2.11.1.tgz"
SRC_URI[md5sum] = "55525149b5624b9c3f880ebd2f9c5cd7"
SRC_URI[sha256sum] = "4fe606547383c377e41314eee52f52dc22890ded8ff532dcb38bbb14bdd74b4f"

S = "${WORKDIR}/package"

NPM_PKGNAME = "jshint"

inherit npmhelper
inherit native
