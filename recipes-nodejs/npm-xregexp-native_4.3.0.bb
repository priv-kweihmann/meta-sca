SUMMARY = "NPM: xregexp"
DESCRIPTION = "Extended regular expressions"
HOMEPAGE = "http://xregexp.com/"

DEPENDS = "npm-babel-runtime-corejs3-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b6fd2ceea8d3872d310a97a375ed26f9"

SRC_URI = "https://registry.npmjs.org/xregexp/-/xregexp-4.3.0.tgz"
SRC_URI[md5sum] = "915fe1ec2e93f130a7cbacb99e87bca3"
SRC_URI[sha256sum] = "f7f9435aa137b596a898fc64701d8470e23d3719e3319074caca535a4d9fe754"

S = "${WORKDIR}/package"

NPM_PKGNAME = "xregexp"

inherit npmhelper
inherit native
