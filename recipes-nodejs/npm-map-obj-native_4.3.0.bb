SUMMARY = "NPM: map-obj"
DESCRIPTION = "Map object keys and values into a new object"
HOMEPAGE = "https://github.com/sindresorhus/map-obj#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/map-obj/-/map-obj-4.3.0.tgz"
SRC_URI[md5sum] = "82f7b45508107d760a1e386135996d80"
SRC_URI[sha256sum] = "2ccabecf48bf09bb017850126176215e29102bbdee05c6d5adc06fd98c78414b"

NPM_PKGNAME = "map-obj"

inherit npmhelper
inherit native
