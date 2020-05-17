SUMMARY = "NPM: rc"
DESCRIPTION = "hardwired configuration loader"
HOMEPAGE = "https://github.com/dominictarr/rc#readme"

DEPENDS = "npm-deep-extend-native npm-ini-native npm-minimist-native npm-strip-json-comments-native"

LICENSE = "BSD-2-Clause | MIT | Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1"

SRC_URI = "https://registry.npmjs.org/rc/-/rc-1.2.8.tgz"
SRC_URI[md5sum] = "75ce1d318eeaa7eea64afbe5e71cf7ca"
SRC_URI[sha256sum] = "03a5fae485203eb424dd3e9b1c4cf9ce3d04c03b154cb4fb6604497815cae93b"

NPM_PKGNAME = "rc"

inherit npmhelper
inherit native
