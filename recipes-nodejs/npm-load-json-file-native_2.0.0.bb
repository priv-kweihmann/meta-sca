SUMMARY = "NPM: load-json-file"
DESCRIPTION = "Read and parse a JSON file"
HOMEPAGE = "https://github.com/sindresorhus/load-json-file#readme"

DEPENDS = "npm-graceful-fs-native npm-parse-json-native npm-pify-native npm-strip-bom-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/load-json-file/-/load-json-file-2.0.0.tgz"
SRC_URI[md5sum] = "b73eceaca55279b20e8bd4b89d133ef9"
SRC_URI[sha256sum] = "ed7ac54e0816129ca5d3b92bda83d0b2cb2522fa4a5939faaf65c8f5953a4566"

NPM_PKGNAME = "load-json-file"

inherit npmhelper
inherit native
