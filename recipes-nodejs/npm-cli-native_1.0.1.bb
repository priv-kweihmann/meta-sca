SUMMARY = "NPM: cli"
DESCRIPTION = "A tool for rapidly building command line apps"
HOMEPAGE = "http://github.com/node-js-libs/cli"

DEPENDS = "npm-exit-native npm-glob-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=180;md5=aae8a435482962c8f785f79ef63db481"

SRC_URI = "https://registry.npmjs.org/cli/-/cli-1.0.1.tgz"
SRC_URI[md5sum] = "c1078b1c98f937924a2e59b200a713fe"
SRC_URI[sha256sum] = "d77a20902d0405a2070009c0e2165568fe91ecbcfe9ce40bd488f3067c3fceb6"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cli"

inherit npmhelper
inherit native
