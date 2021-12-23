SUMMARY = "NPM: load-json-file"
DESCRIPTION = "Read and parse a JSON file"
HOMEPAGE = "https://github.com/sindresorhus/load-json-file#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/load-json-file/-/load-json-file-7.0.1.tgz"
SRC_URI[md5sum] = "1379bdb610acf984f74a4469150358cf"
SRC_URI[sha256sum] = "b314e8dc84b31e0c36e8f1a2956dc3716cbbf2758e92db29cea8931c73296ab2"

NPM_PKGNAME = "load-json-file"

inherit npmhelper
inherit native
