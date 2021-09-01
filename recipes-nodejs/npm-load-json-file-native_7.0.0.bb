SUMMARY = "NPM: load-json-file"
DESCRIPTION = "Read and parse a JSON file"
HOMEPAGE = "https://github.com/sindresorhus/load-json-file#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/load-json-file/-/load-json-file-7.0.0.tgz"
SRC_URI[md5sum] = "b7311a53deddc4fd351a98e8e14d3fa9"
SRC_URI[sha256sum] = "0d37708bb0ee71dace8ea5480c560a11c0894459f17b04e5958c56cb2585b169"

NPM_PKGNAME = "load-json-file"

inherit npmhelper
inherit native
