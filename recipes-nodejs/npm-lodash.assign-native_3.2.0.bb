SUMMARY = "NPM: lodash.assign"
DESCRIPTION = "The modern build of lodash’s `_.assign` as a module."
HOMEPAGE = "https://lodash.com/"

DEPENDS = "npm-lodash.baseassign-native npm-lodash.createassigner-native npm-lodash.keys-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f519f8cb155e30cece6b0e75aa6a3a53"

SRC_URI = "https://registry.npmjs.org/lodash.assign/-/lodash.assign-3.2.0.tgz"
SRC_URI[md5sum] = "069a33820c6b6d585514ff9aa325587d"
SRC_URI[sha256sum] = "a16e67223e62181e75495d21aa65178ea4207bee667c591610415936e128683d"

NPM_PKGNAME = "lodash.assign"

inherit npmhelper
inherit native
