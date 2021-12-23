SUMMARY = "NPM: json-schema-traverse"
DESCRIPTION = "Traverse JSON Schema passing each schema object to callback"
HOMEPAGE = "https://github.com/epoberezkin/json-schema-traverse#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/json-schema-traverse/-/json-schema-traverse-1.0.0.tgz"
SRC_URI[md5sum] = "43285d29d54e81532440dc7482abf5b3"
SRC_URI[sha256sum] = "023222622df29fc274bde5d3590e47aa1d4a8e3c1d6e2aba029948ed79799b21"

NPM_PKGNAME = "json-schema-traverse"

inherit npmhelper
inherit native
