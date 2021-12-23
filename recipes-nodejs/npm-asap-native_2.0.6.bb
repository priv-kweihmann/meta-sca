SUMMARY = "NPM: asap"
DESCRIPTION = "High-priority task queue for Node.js and browsers"
HOMEPAGE = "https://github.com/kriskowal/asap#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=6ef000dc4ca2360ae9216d401862c653"

SRC_URI = "https://registry.npmjs.org/asap/-/asap-2.0.6.tgz"
SRC_URI[md5sum] = "a188629def8596b69af038f700204ee2"
SRC_URI[sha256sum] = "5ab440764cf46d8d4783d3f1173c0269e4bf9ebf013ae5a9d4bc0197cd89ccde"

NPM_PKGNAME = "asap"

inherit npmhelper
inherit native
