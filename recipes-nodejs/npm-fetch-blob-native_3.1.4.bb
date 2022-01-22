SUMMARY = "NPM: fetch-blob"
DESCRIPTION = "Blob & File implementation in Node.js, originally from node-fetch."
HOMEPAGE = "https://github.com/node-fetch/fetch-blob#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db6bf2cba86c6207f4c83860e373aba1"

DEPENDS = "npm-node-domexception-native \
           npm-web-streams-polyfill-native"

SRC_URI = "https://registry.npmjs.org/fetch-blob/-/fetch-blob-3.1.4.tgz"
SRC_URI[md5sum] = "40468d8d04b6723790c5cfc7108cd38f"
SRC_URI[sha256sum] = "a37675d5cf8755ac5a2cdad7d50e8af6d3395e97dc81b22d11a6256c4a561925"

NPM_PKGNAME = "fetch-blob"

inherit npmhelper
inherit native
