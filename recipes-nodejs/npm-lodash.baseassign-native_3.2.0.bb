SUMMARY = "NPM: lodash._baseassign"
DESCRIPTION = "The modern build of lodash’s internal `baseAssign` as a module."
HOMEPAGE = "https://lodash.com/"

DEPENDS = "npm-lodash.basecopy-native npm-lodash.keys-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f519f8cb155e30cece6b0e75aa6a3a53"

SRC_URI = "https://registry.npmjs.org/lodash._baseassign/-/lodash._baseassign-3.2.0.tgz"
SRC_URI[md5sum] = "2438792bc711256968416ae0164b5dd9"
SRC_URI[sha256sum] = "f513588149ee66607a65beb30c582a2fbb37eea9c6454915c9a7726aa9322c81"

NPM_PKGNAME = "lodash._baseassign"

inherit npmhelper
inherit native
