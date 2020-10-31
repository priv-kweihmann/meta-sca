SUMMARY = "NPM: xregexp"
DESCRIPTION = "Extended regular expressions"
HOMEPAGE = "http://xregexp.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b6fd2ceea8d3872d310a97a375ed26f9"

DEPENDS = "npm-babel-runtime-corejs3-native"

SRC_URI = "https://registry.npmjs.org/xregexp/-/xregexp-4.4.0.tgz"
SRC_URI[md5sum] = "15ddb8cdb50721d9e59d78488eac7644"
SRC_URI[sha256sum] = "235a0e011b13582db664b119ed12112d347e8e26fcaeeb349d31f01fce73c59e"

NPM_PKGNAME = "xregexp"

inherit npmhelper
inherit native
