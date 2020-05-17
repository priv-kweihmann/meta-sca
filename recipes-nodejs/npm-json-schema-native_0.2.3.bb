SUMMARY = "NPM: json-schema"
DESCRIPTION = "JSON Schema validation and specifications"
HOMEPAGE = "https://github.com/kriszyp/json-schema#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://lib/validate.js;beginline=5;endline=6;md5=c4b92d62bbcc995ecd7e69fe58a43304"

SRC_URI = "https://registry.npmjs.org/json-schema/-/json-schema-0.2.3.tgz"
SRC_URI[md5sum] = "40a6db88dc58bf0778335c058b9754bf"
SRC_URI[sha256sum] = "e3163c53fbc030cb6ac9bd9652f20a62d3d0580e4eeafe9cb36571ca2bee933f"

S = "${WORKDIR}/package"

NPM_PKGNAME = "json-schema"

inherit npmhelper
inherit native
