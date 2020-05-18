SUMMARY = "NPM: json-schema"
DESCRIPTION = "JSON Schema validation and specifications"
HOMEPAGE = "https://github.com/kriszyp/json-schema#readme"

LICENSE = "AFL-2.1 | BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cd1c1e0d7bf9f0594f023e0e3a62838b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/json-schema/-/json-schema-0.2.5.tgz"
SRC_URI[md5sum] = "67003b59d0d3df571e1ffb4d06ef57bb"
SRC_URI[sha256sum] = "dba56d0ca8f9a27fc477985fdee2cec8ae7cfff4c74bd5fb5e2913104f925766"

NPM_PKGNAME = "json-schema"

inherit npmhelper
inherit native
