SUMMARY = "NPM: json-schema-traverse"
DESCRIPTION = "Traverse JSON Schema passing each schema object to callback"
HOMEPAGE = "https://github.com/epoberezkin/json-schema-traverse#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/json-schema-traverse/-/json-schema-traverse-0.5.0.tgz"
SRC_URI[md5sum] = "1ead0c5f36e388786ef5e1d229795461"
SRC_URI[sha256sum] = "653966e93601c6425028d3ecdffd092d23354b3a1bb4c40a602f04a424de0b6b"

NPM_PKGNAME = "json-schema-traverse"

inherit npmhelper
inherit native
