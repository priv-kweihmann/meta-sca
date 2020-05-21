SUMMARY = "NPM: @types/http-cache-semantics"
DESCRIPTION = "TypeScript definitions for http-cache-semantics"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27e94c0280987ab296b0b8dd02ab9fe5"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/http-cache-semantics/-/http-cache-semantics-4.0.0.tgz"
SRC_URI[md5sum] = "47cacd1961d3f410a1239959239265fc"
SRC_URI[sha256sum] = "83c400778ef5f66d523bc9b36a5859fea8b10ea55cb50403ab10b95638ac3d94"

NPM_PKGNAME = "@types/http-cache-semantics"

inherit npmhelper
inherit native

S = "${WORKDIR}/http-cache-semantics"
