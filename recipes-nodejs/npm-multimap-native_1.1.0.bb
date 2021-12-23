SUMMARY = "NPM: multimap"
DESCRIPTION = "multi-map which allow multiple values for the same key"
HOMEPAGE = "https://github.com/villadora/multi-map#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=135;md5=14d091e50ba87d8225d90a4c2b678064"

SRC_URI = "https://registry.npmjs.org/multimap/-/multimap-1.1.0.tgz"
SRC_URI[md5sum] = "bd928e37e031fff225792bab473d682c"
SRC_URI[sha256sum] = "202f19d979b146e57339a862b3e3d3c424fb4ebf4d7bb4f19cc24908c8b708d8"

NPM_PKGNAME = "multimap"

inherit npmhelper
inherit native
