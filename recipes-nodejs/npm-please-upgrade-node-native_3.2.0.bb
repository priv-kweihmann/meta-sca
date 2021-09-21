SUMMARY = "NPM: please-upgrade-node"
DESCRIPTION = "Displays a beginner-friendly message telling your user to upgrade their version of Node"
HOMEPAGE = "https://github.com/typicode/please-upgrade-node#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=17a1d3575545a1e1c7c7f835388beafe"

DEPENDS = "npm-semver-compare-native"

SRC_URI = "https://registry.npmjs.org/please-upgrade-node/-/please-upgrade-node-3.2.0.tgz"
SRC_URI[md5sum] = "1af10d54be22d2307e910d06cf5d7659"
SRC_URI[sha256sum] = "6795ad61f816e8ba4db340afab6dd30d3616b2924a234c1064ae01dcd3180c4c"

NPM_PKGNAME = "please-upgrade-node"

inherit npmhelper
inherit native
