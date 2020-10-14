SUMMARY = "NPM: remark"
DESCRIPTION = "Markdown processor powered by plugins part of the unified collective"
HOMEPAGE = "https://remark.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=189;endline=190;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-remark-parse-native \
           npm-remark-stringify-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/remark/-/remark-13.0.0.tgz"
SRC_URI[md5sum] = "65544a1c3f0b9720f27393ed5a2320b0"
SRC_URI[sha256sum] = "95c9f387585e253606312ef7eb9de13c6dff22ca8723f045a96e766717dc3356"

NPM_PKGNAME = "remark"

inherit npmhelper
inherit native
