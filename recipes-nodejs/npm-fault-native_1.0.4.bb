SUMMARY = "NPM: fault"
DESCRIPTION = "Functional errors with formatted output"
HOMEPAGE = "https://github.com/wooorm/fault#readme"

DEPENDS = "npm-format-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

SRC_URI = "https://registry.npmjs.org/fault/-/fault-1.0.4.tgz"
SRC_URI[md5sum] = "eb7264a4faf3e60d7a5989b56fe7fbc6"
SRC_URI[sha256sum] = "e20c9449b908a8efc55678ed43fdde7c99e922107811b534b043a614148930c8"

NPM_PKGNAME = "fault"

inherit npmhelper
inherit native
