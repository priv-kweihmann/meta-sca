SUMMARY = "NPM: map-obj"
DESCRIPTION = "Map object keys and values into a new object"
HOMEPAGE = "https://github.com/sindresorhus/map-obj#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/map-obj/-/map-obj-4.2.1.tgz"
SRC_URI[md5sum] = "e5129f902d307921fc43ff4716979f03"
SRC_URI[sha256sum] = "4d5adc251485a9102b7c581b6f0ae75adea37213f655d32191b4ffd1678923a5"

NPM_PKGNAME = "map-obj"

inherit npmhelper
inherit native
