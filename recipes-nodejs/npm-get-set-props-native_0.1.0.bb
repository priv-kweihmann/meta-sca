SUMMARY = "NPM: get-set-props"
DESCRIPTION = "List of getter/setter properties for JavaScript types"
HOMEPAGE = "https://github.com/dustinspecker/get-set-props#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d8beadf9a6499a20c088624cd844e547"

SRC_URI = "https://registry.npmjs.org/get-set-props/-/get-set-props-0.1.0.tgz"
SRC_URI[md5sum] = "ae71d26ef14801348a804a1b2e987ed9"
SRC_URI[sha256sum] = "8e1a3ec9df573d0a097c889037a63f7f01164fcc097f7dd0cf5c87cd4418a3be"

NPM_PKGNAME = "get-set-props"

inherit npmhelper
inherit native
