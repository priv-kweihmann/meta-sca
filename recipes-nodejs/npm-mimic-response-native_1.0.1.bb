SUMMARY = "NPM: mimic-response"
DESCRIPTION = "Mimic a Node.js HTTP response stream"
HOMEPAGE = "https://github.com/sindresorhus/mimic-response#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mimic-response/-/mimic-response-1.0.1.tgz"
SRC_URI[md5sum] = "2816656e809c73986dd2dc4e24b3351a"
SRC_URI[sha256sum] = "42f1002c0eac7badf544c0e8cb876744a4fe9454a698d9e98a991100acca8ce8"

NPM_PKGNAME = "mimic-response"

inherit npmhelper
inherit native
