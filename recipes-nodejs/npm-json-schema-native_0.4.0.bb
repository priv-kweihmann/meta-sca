SUMMARY = "NPM: json-schema"
DESCRIPTION = "JSON Schema validation and specifications"
HOMEPAGE = "https://github.com/kriszyp/json-schema#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "AFL-2.1 | BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cd1c1e0d7bf9f0594f023e0e3a62838b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/json-schema/-/json-schema-0.4.0.tgz"
SRC_URI[md5sum] = "a717cdacb987a4234abefa71ab4b831e"
SRC_URI[sha256sum] = "2b28fff2ff3ac4907c78c0012b43a93dd46395b43f3a55084c119f62e375b349"

NPM_PKGNAME = "json-schema"

inherit npmhelper
inherit native
