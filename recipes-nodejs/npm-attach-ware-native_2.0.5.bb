SUMMARY = "NPM: attach-ware"
DESCRIPTION = "Middleware with configuration"
HOMEPAGE = "https://github.com/wooorm/attach-ware#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

DEPENDS = "npm-unherit-native"

SRC_URI = "https://registry.npmjs.org/attach-ware/-/attach-ware-2.0.5.tgz"
SRC_URI[md5sum] = "b7f9494120f1d0bed19fc1386178d495"
SRC_URI[sha256sum] = "bf87134923ccfb9caabe82544903d8a5d2e5b83a3ea50d8a5d7d553d5efd3787"

NPM_PKGNAME = "attach-ware"

inherit npmhelper
inherit native
