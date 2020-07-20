SUMMARY = "NPM: remark"
DESCRIPTION = "Markdown processor powered by plugins part of the unified collective"
HOMEPAGE = "https://remark.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=189;endline=190;md5=f7cd6e61bbbca39fe0e60b4899302d5a"

DEPENDS = "npm-remark-parse-native \
           npm-remark-stringify-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/remark/-/remark-12.0.1.tgz"
SRC_URI[md5sum] = "ced1904bc4b2cb93b8917ca32ed4574c"
SRC_URI[sha256sum] = "4f1ecce60d7576861f9d5d709ad2a67278aa2146cda108320bc1e49cf15194b0"

NPM_PKGNAME = "remark"

inherit npmhelper
inherit native
