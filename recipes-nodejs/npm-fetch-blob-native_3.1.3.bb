SUMMARY = "NPM: fetch-blob"
DESCRIPTION = "Blob & File implementation in Node.js, originally from node-fetch."
HOMEPAGE = "https://github.com/node-fetch/fetch-blob#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db6bf2cba86c6207f4c83860e373aba1"

DEPENDS = "npm-web-streams-polyfill-native"

SRC_URI = "https://registry.npmjs.org/fetch-blob/-/fetch-blob-3.1.3.tgz"
SRC_URI[md5sum] = "b90bd16135d0774e0974b800d43223f9"
SRC_URI[sha256sum] = "81e97fbb35e149fc177e67e1450c0909892f4714d34eb066ec1cbee55fe52dba"

NPM_PKGNAME = "fetch-blob"

inherit npmhelper
inherit native
