SUMMARY = "NPM: har-validator"
DESCRIPTION = "Extremely fast HTTP Archive (HAR) validator using JSON Schema"
HOMEPAGE = "https://github.com/ahmadnassri/node-har-validator"

DEPENDS = "npm-ajv-native npm-har-schema-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6f7daec5e5143ffeb21745646b425ab2"

SRC_URI = "https://registry.npmjs.org/har-validator/-/har-validator-5.1.3.tgz"
SRC_URI[md5sum] = "026332de4216b7f9111ecd6804a54b31"
SRC_URI[sha256sum] = "7a282cdeb62fa92eabcf07f7e1a1e37673b4212cf86b6eb1d7d396d330550f4d"

S = "${WORKDIR}/package"

NPM_PKGNAME = "har-validator"

inherit npmhelper
inherit native
