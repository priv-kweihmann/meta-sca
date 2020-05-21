SUMMARY = "NPM: lodash.assign"
DESCRIPTION = "The lodash method `_.assign` exported as a module."
HOMEPAGE = "https://lodash.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3b2b7770df62392c164de4001b59f8f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lodash.assign/-/lodash.assign-4.2.0.tgz"
SRC_URI[md5sum] = "5a92447d4e8669abba120d5164892902"
SRC_URI[sha256sum] = "5585c7be7dbc6a194d759d913406444675a98c40e7e572848158631e2e89a743"

NPM_PKGNAME = "lodash.assign"

inherit npmhelper
inherit native
