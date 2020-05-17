SUMMARY = "NPM: attach-ware"
DESCRIPTION = "Middleware with configuration"
HOMEPAGE = "https://github.com/wooorm/attach-ware#readme"

DEPENDS = "npm-unherit-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82fd7b0a70b89a370d3bcef312cfd54d"

SRC_URI = "https://registry.npmjs.org/attach-ware/-/attach-ware-1.1.1.tgz"
SRC_URI[md5sum] = "14b5a3e66ab7fe5fb4a47f177a06e6aa"
SRC_URI[sha256sum] = "cd1885ff685e8586d61acaf2c67e23d8168b6bd02e955677002a06aaf5e96dca"

NPM_PKGNAME = "attach-ware"

inherit npmhelper
inherit native
