SUMMARY = "NPM: get-url-origin"
DESCRIPTION = "Get origin from url string in Node.js"
HOMEPAGE = "https://github.com/azu/node-get-url-origin"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46ad0c4fd3586dd75b2ed7a332e35acb"

SRC_URI = "https://registry.npmjs.org/get-url-origin/-/get-url-origin-1.0.1.tgz"
SRC_URI[md5sum] = "0d57ffcdf420e2b57095d53e911f2d91"
SRC_URI[sha256sum] = "41a6e4d2b6f3d38f387a2f15a363a69ca48c43450ff63f109e4044f5830f0d8f"

NPM_PKGNAME = "get-url-origin"

inherit npmhelper
inherit native
