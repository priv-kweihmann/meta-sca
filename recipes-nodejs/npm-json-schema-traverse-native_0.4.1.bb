SUMMARY = "NPM: json-schema-traverse"
DESCRIPTION = "Traverse JSON Schema passing each schema object to callback"
HOMEPAGE = "https://github.com/epoberezkin/json-schema-traverse#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b"

SRC_URI = "https://registry.npmjs.org/json-schema-traverse/-/json-schema-traverse-0.4.1.tgz"
SRC_URI[md5sum] = "6f749381b67dce4faab5b02aa6c9db55"
SRC_URI[sha256sum] = "f735add93641842e13096c8b3239f54e9b0b10e8ffd8a377400f4d61eabec065"

S = "${WORKDIR}/package"

NPM_PKGNAME = "json-schema-traverse"

inherit npmhelper
inherit native
