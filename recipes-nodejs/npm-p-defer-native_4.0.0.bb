SUMMARY = "NPM: p-defer"
DESCRIPTION = "Create a deferred promise"
HOMEPAGE = "https://github.com/sindresorhus/p-defer#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/p-defer/-/p-defer-4.0.0.tgz"
SRC_URI[md5sum] = "d320100307396f63ff2fab2fe241efc7"
SRC_URI[sha256sum] = "4b1a7415552d14e508b9cfa28b96817717890abd26015f8da94ea3bf17cd8229"

NPM_PKGNAME = "p-defer"

inherit npmhelper
inherit native
