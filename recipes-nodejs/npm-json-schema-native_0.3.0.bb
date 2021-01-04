SUMMARY = "NPM: json-schema"
DESCRIPTION = "JSON Schema validation and specifications"
HOMEPAGE = "https://github.com/kriszyp/json-schema#readme"

LICENSE = "AFL-2.1 | BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cd1c1e0d7bf9f0594f023e0e3a62838b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/json-schema/-/json-schema-0.3.0.tgz"
SRC_URI[md5sum] = "18848c2bccbf952564f28a8280f5f9e4"
SRC_URI[sha256sum] = "f13dd5cb555d242ccf23c3df0b3557bf4d1087acf50fc188e4db7708769fba7e"

NPM_PKGNAME = "json-schema"

inherit npmhelper
inherit native
