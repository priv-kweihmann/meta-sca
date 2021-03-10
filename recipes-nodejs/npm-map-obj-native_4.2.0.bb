SUMMARY = "NPM: map-obj"
DESCRIPTION = "Map object keys and values into a new object"
HOMEPAGE = "https://github.com/sindresorhus/map-obj#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/map-obj/-/map-obj-4.2.0.tgz"
SRC_URI[md5sum] = "84799d707088ce1b4b0ed864e8a1c3af"
SRC_URI[sha256sum] = "5d909aba875012a749175b3402390c48688de4e112b38b4a508e7afecf488f80"

NPM_PKGNAME = "map-obj"

inherit npmhelper
inherit native
