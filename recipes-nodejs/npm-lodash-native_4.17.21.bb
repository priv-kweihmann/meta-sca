SUMMARY = "NPM: lodash"
DESCRIPTION = "Lodash modular utilities."
HOMEPAGE = "https://lodash.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8e2fca844c70b3833d7228885447c026"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lodash/-/lodash-4.17.21.tgz"
SRC_URI[md5sum] = "25247d3dd7029d08a6ac99adab09086b"
SRC_URI[sha256sum] = "6a087ac9e5702a0c9d60fbcd48696012646ec8df1491dea472b150e79fcaf804"

NPM_PKGNAME = "lodash"

inherit npmhelper
inherit native
