SUMMARY = "NPM: array-iterate"
DESCRIPTION = "forEach with the possibility to change the next position"
HOMEPAGE = "https://github.com/wooorm/array-iterate#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/array-iterate/-/array-iterate-2.0.0.tgz"
SRC_URI[md5sum] = "29bda458256272c3bdf4a2d5fb94e895"
SRC_URI[sha256sum] = "8fe88bf0a219a218b394a32f995fe0440ee7fab35324323fe737053f9f896499"

NPM_PKGNAME = "array-iterate"

inherit npmhelper
inherit native
