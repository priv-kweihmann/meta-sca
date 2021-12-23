SUMMARY = "NPM: debuglog"
DESCRIPTION = "backport of util.debuglog from node v0.11"
HOMEPAGE = "https://github.com/sam-github/node-debuglog"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=40a8cc092438d1ad43c1146547c36218"

SRC_URI = "https://registry.npmjs.org/debuglog/-/debuglog-1.0.1.tgz"
SRC_URI[md5sum] = "56d1022cc3d1b91811849b39afadeb8a"
SRC_URI[sha256sum] = "c85ad6f84a62a44098a3b94ccbba7dc64ed7a35b6bbc63bc99bbb436f62be00e"

NPM_PKGNAME = "debuglog"

inherit npmhelper
inherit native
